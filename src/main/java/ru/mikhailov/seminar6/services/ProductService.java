package ru.mikhailov.seminar6.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mikhailov.seminar6.model.Product;
import ru.mikhailov.seminar6.repositories.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Long id){
        return productRepository.findById(id).orElseThrow(null);
    }

    public Product updateProduct(Product product){
        Product productToUpdate = getProductById(product.getId());

        productToUpdate.setId(product.getId());
        productToUpdate.setName(product.getName());
        productToUpdate.setPrice(product.getPrice());
        productToUpdate.setQuantity(product.getQuantity());

        return productRepository.save(productToUpdate);
    }

    public Product createProduct (Product product){
        return productRepository.save(product);
    };

    public void deleteProduct(Long id){
        productRepository.delete(getProductById(id));
    }

}

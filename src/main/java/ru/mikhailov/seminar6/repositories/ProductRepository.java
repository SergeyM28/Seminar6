package ru.mikhailov.seminar6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mikhailov.seminar6.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

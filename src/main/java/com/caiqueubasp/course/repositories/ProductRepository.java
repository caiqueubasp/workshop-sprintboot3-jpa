package com.caiqueubasp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiqueubasp.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário

}

package com.caiqueubasp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiqueubasp.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário

}

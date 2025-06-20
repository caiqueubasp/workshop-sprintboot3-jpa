package com.caiqueubasp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiqueubasp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário

}

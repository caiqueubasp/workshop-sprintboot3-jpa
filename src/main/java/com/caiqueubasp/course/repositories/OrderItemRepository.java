package com.caiqueubasp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiqueubasp.course.entities.OrderItem;
import com.caiqueubasp.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
    // Aqui você pode adicionar métodos personalizados, se necessário

}

package com.caiqueubasp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiqueubasp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário

}

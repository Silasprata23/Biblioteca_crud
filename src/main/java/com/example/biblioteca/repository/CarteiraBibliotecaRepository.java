package com.example.biblioteca.repository;

import com.example.biblioteca.Entity.CarteiraBiblioteca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteiraBibliotecaRepository extends JpaRepository<CarteiraBiblioteca,Long> {
}

package com.example.msmenu.dao;
import com.example.msmenu.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto, Long>{
}

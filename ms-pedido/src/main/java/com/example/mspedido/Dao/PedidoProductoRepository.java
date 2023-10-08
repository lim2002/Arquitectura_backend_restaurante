package com.example.mspedido.Dao;

import com.example.mspedido.Entity.PedidoProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoProductoRepository extends JpaRepository<PedidoProducto, Long> {
}

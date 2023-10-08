package com.example.mspedido.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoDao {

    @Autowired
    private PedidoRepository pedidoRepository;
}

package com.example.msmenu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoDao {
    @Autowired
    private ProductoRepository productoRepository;
}

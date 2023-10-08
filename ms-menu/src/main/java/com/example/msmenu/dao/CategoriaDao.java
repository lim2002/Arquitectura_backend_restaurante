package com.example.msmenu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaDao {
    @Autowired
    private CategoriaRepository categoriaRepository;
}

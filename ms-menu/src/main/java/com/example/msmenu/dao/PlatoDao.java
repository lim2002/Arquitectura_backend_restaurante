package com.example.msmenu.dao;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatoDao {
    @Autowired
    private PlatoRepository platoRepository;
}

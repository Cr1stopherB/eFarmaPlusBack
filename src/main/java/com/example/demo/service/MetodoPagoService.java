package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.MetodoPago;
import com.example.demo.repository.MetodoPagoRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class MetodoPagoService {

    @Autowired
    private MetodoPagoRepository repository;

    public List<MetodoPago> findAll() {
        return repository.findAll();
    }

    @SuppressWarnings("null")
    public MetodoPago findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @SuppressWarnings("null")
    public MetodoPago save(MetodoPago metodo) {
        return repository.save(metodo);
    }
}
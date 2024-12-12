/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.semana6fanipinedo.service;

import com.example.semana6fanipinedo.model.Producto;
import com.example.semana6fanipinedo.repository.ProductoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */

@Service
public class ProductoService {
    
    
    @Autowired
     private ProductoRepository repository;

    public List<Producto> listarTodos() {
        return repository.findAll();
    }

    public void guardar(Producto producto) {
        repository.save(producto);
    }

    public Optional<Producto> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}

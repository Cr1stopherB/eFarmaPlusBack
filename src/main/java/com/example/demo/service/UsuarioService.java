package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository; // Inyección del repositorio

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    @SuppressWarnings("null")
    public Usuario findById(Integer id){
        return usuarioRepository.findById(id).orElse(null);
    }
    
    /**
     * Busca un usuario por su Email (Método personalizado si se necesita).
     * Requiere que el repositorio UsuarioRepository tenga definido: Usuario findByEmail(String email);
     */
    // public Usuario findByEmail(String email) {
    //     return usuarioRepository.findByEmail(email);
    // }

    @SuppressWarnings("null")
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @SuppressWarnings("null")
    public void deleteById(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
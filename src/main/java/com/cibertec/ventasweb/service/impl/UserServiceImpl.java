package com.cibertec.ventasweb.service.impl;

import com.cibertec.ventasweb.entities.User;
import com.cibertec.ventasweb.repository.UserRepository;
import com.cibertec.ventasweb.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> obtenerTodas() {
        return userRepository.findAll();
    }
    @Override
    public User obtenerPorId(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User crearUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User actualizarUser(Long id, User user) {
        User userBBDD = userRepository.findById(id).orElse(null);

        if(userBBDD != null){
            // Actualizar roles
            return userRepository.save(userBBDD);
        }
        return null;
    }

    @Override
    public void eliminarUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public long contarUsers() {
        return userRepository.count();
    }
}

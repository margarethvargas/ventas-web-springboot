package com.cibertec.ventasweb.service;

import com.cibertec.ventasweb.entities.User;

import java.util.List;

public interface UserService {
    List<User> obtenerTodas();

    User obtenerPorId(Long id);

    User crearUser(User user);

    User actualizarUser(Long id, User user);

    void eliminarUser(Long id);

    long contarUsers();

}

package com.cibertec.ventasweb.controller;

import com.cibertec.ventasweb.entities.User;
import com.cibertec.ventasweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping({"/user","/"})
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String listarUsuarios(Model model) {
        List<User> users = userService.obtenerTodas();
        model.addAttribute("listaUsers",users);
        return "user/listar";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioNuevoUsuario(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("accion","/user/nuevo");
        return "user/formulario";
    }

    @PostMapping("/nuevo")
    public String guardarNuevoUsuario(@ModelAttribute User user) {
        userService.crearUser(user);
        return "redirect:/user";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, @ModelAttribute User user, Model model) {
        model.addAttribute("user",user);
        model.addAttribute("accion","/user/editar/"+id);
        return "user/formulario";
    }

    @PostMapping("/editar/{id}")
    public String actualizarUsuario(@PathVariable Long id,@ModelAttribute User user){
        userService.actualizarUser(id,user);
        return "redirect:/user";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarUsuario(@PathVariable Long id){
        userService.eliminarUser(id);
        return "redirect:/user";
    }
}
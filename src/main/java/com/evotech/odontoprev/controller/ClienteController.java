package com.evotech.odontoprev.controller;

import com.evotech.odontoprev.model.Cliente;
import com.evotech.odontoprev.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("clientes", clienteService.listarTodos());
        return "clientes/list";
    }


    @GetMapping("/listar")
    public String listarClientes(Model model) {
        model.addAttribute("clientes", clienteService.listarTodos());
        return "clientes/list";
    }

    @GetMapping("/novo")
    public String mostrarForm(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "clientes/form";
    }

    @PostMapping("/salvar")
    public String salvarCliente(@ModelAttribute Cliente cliente) {
        clienteService.salvar(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/editar/{id}")
    public String editarCliente(@PathVariable("id") String id, Model model) {
        clienteService.buscarPorId(id).ifPresent(cliente -> model.addAttribute("cliente", cliente));
        return "clientes/form";
    }

    @GetMapping("/deletar/{id}")
    public String deletarCliente(@PathVariable("id") String id) {
        clienteService.deletar(id);
        return "redirect:/clientes";
    }
}
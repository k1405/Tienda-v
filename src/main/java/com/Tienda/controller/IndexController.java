package com.Tienda.controller;

import com.Tienda.domain.Articulo;
import lombok.extern.slf4j.Slf4j;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.Tienda.dao.ArticuloDao;
import com.Tienda.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    private ArticuloService articuloService;

    @GetMapping("/")
    public String inicio(Model model) {

        var articulos = articuloService.getArticulos(true);

        model.addAttribute("articulos", articulos);

        return "index";
    }
}

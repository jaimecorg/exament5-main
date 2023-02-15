package com.oretania.portal.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortalController {

    @RequestMapping(value = "/lengua")
    @PreAuthorize("hasAnyAuthority('Todas','Lengua')")
    public String lengua() {
        return "asignaturas/lengua";
    }

    @RequestMapping(value = "/matematicas")
    @PreAuthorize("hasAnyAuthority('Todas','Matemáticas')")
    public String matematicas() {
        return "asignaturas/matematicas";
    }

    @RequestMapping(value = "/fisica")
    @PreAuthorize("hasAnyAuthority('Todas','Física')")
    public String fisica() {
        return "asignaturas/fisica";
    }

    @RequestMapping(value = "/religion")
    @PreAuthorize("hasAnyAuthority('Todas','Religión')")
    public String religion() {
        return "asignaturas/religion";
    }

    @RequestMapping(value = "/quimica")
    @PreAuthorize("hasAnyAuthority('Todas','Química')")
    public String quimica() {
        return "asignaturas/quimica";
    }

    @RequestMapping(value = "/ingles")
    @PreAuthorize("hasAnyAuthority('Todas','Inglés')")
    public String ingles() {
        return "asignaturas/ingles";
    }
}
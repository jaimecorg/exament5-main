package com.oretania.portal.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/asignaturas")
@PreAuthorize("hasAnyAuthority('ADMIN','USER')")
public class PortalController {

    @RequestMapping(value = "/asignaturas")
    public String login() {
        return "login";
    }

    @GetMapping(value = { "/welcome" })
    public String welcome() {

        return "welcome";
    }
}
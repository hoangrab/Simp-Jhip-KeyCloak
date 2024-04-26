package com.hiphop.web.rest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api2/")
public class HomeController {

    @GetMapping("/ga")
    @PreAuthorize("hasRole('ADMIN')")
    public String ga() {
        return "ga";
    }
}

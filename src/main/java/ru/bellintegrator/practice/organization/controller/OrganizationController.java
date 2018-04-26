package ru.bellintegrator.practice.organization.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bellintegrator.practice.organization.views.OrganizationView;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/organization", produces = APPLICATION_JSON_VALUE)
public class OrganizationController {

    @GetMapping("/test")
    public OrganizationView test(){
        System.out.println("hey");
        OrganizationView view = new OrganizationView();

        view.setId(1);
        view.setName("Тест");

        return view;
    }
}

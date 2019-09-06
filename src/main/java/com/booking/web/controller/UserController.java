package com.booking.web.controller;

import com.utill.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @GetMapping("/registration")
    public String registration(Model model) {
        UserDto user = new UserDto();
        model.addAttribute("user",user);
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@Valid UserDto user) {
        return "redirect:/registration";
    }
}

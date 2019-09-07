package com.booking.web.controller;

import com.booking.utill.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @GetMapping("/registration")
    public String registration(Model model) {
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "registration";
    }

    @PostMapping("/registration")
    public String registrationConfirm(@ModelAttribute(name = "user") @Valid UserDto userDto, BindingResult result) {
        if (result.hasErrors()) {
            return "registration";
        }
        return "redirect:/login";
    }
}

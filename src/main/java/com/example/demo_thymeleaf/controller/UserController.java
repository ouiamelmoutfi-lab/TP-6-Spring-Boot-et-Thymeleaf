
package com.example.demo_thymeleaf.controller;

import com.example.demo_thymeleaf.entity.User;
import com.example.demo_thymeleaf.repository.UserRepository;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String listUsers(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }

    @GetMapping("/adduser")
    public String showAddForm(Model model) {
        model.addAttribute("user", new User());
        return "add-user";
    }

    @PostMapping("/adduser")
    public String addUser(
            @Valid @ModelAttribute User user,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            return "add-user";
        }

        userRepository.save(user);
        return "redirect:/";
    }
}

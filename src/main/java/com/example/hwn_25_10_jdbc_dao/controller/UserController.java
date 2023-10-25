package com.example.hwn_25_10_jdbc_dao.controller;

import com.example.hwn_25_10_jdbc_dao.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;


@RestController
@RequestMapping("products")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/fetch-product")
    public List<String> getAuthorities(@RequestParam("name") String name) throws SQLException {
        return userService.getProduct(name);
    }
}

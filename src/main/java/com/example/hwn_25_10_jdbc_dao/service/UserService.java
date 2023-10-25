package com.example.hwn_25_10_jdbc_dao.service;

import com.example.hwn_25_10_jdbc_dao.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserService {
    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<String> getProduct(String name) throws SQLException {
        return userRepository.getProductName(name);
    }
}

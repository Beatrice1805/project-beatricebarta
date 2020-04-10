package org.fastrackit.onlineshopbeatricebarta.service.impl;

import org.fastrackit.onlineshopbeatricebarta.domain.User;
import org.fastrackit.onlineshopbeatricebarta.persistance.RoleRepository;
import org.fastrackit.onlineshopbeatricebarta.persistance.UserRepository;
import org.fastrackit.onlineshopbeatricebarta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    private static final String USER_ROLE = "ROLE_USER";

    @Autowired
    public UserServiceImp(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public Optional<org.apache.catalina.User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Optional<org.apache.catalina.User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User saveUser(User user) {

        // Set Role to ROLE_USER
        user.setRoles(Collections.singletonList(roleRepository.findByRole(USER_ROLE)));
        return userRepository.saveAndFlush(user);
    }
}

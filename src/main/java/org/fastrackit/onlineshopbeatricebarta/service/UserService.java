package org.fastrackit.onlineshopbeatricebarta.service;

import org.apache.catalina.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    User saveUser(User user);

}

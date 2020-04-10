package org.fastrackit.onlineshopbeatricebarta.exception;

import org.fastrackit.onlineshopbeatricebarta.domain.Product;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Product message) {

        super(message);
    }
}
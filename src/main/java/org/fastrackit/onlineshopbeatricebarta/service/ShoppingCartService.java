package org.fastrackit.onlineshopbeatricebarta.service;

import org.fastrackit.onlineshopbeatricebarta.domain.Product;
import org.fastrackit.onlineshopbeatricebarta.exception.ResourceNotFoundException;

import java.math.BigDecimal;
import java.util.Map;

public interface ShoppingCartService {

    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    void checkout() throws ResourceNotFoundException;

    BigDecimal getTotal();
}
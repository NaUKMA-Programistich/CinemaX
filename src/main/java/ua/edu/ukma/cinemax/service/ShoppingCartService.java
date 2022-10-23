package ua.edu.ukma.cinemax.service;

import ua.edu.ukma.cinemax.model.Session;
import ua.edu.ukma.cinemax.model.ShoppingCart;
import ua.edu.ukma.cinemax.model.User;

public interface ShoppingCartService {
    void addSession(Session session, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clearShoppingCart(ShoppingCart shoppingCart);
}

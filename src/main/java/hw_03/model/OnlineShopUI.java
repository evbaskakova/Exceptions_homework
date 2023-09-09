package hw_03.model;

import hw_03.Exceptions.EmptyStoreException;
import hw_03.Exceptions.ProductNotFoundException;
import hw_03.Exceptions.WrongNameException;
import hw_03.Exceptions.ZeroPriceException;

public interface OnlineShopUI {
    void addProduct(String product, double price) throws WrongNameException, ZeroPriceException;
    void deleteProduct(String name) throws ProductNotFoundException, WrongNameException, EmptyStoreException;
    String getProduct(String name) throws ProductNotFoundException, WrongNameException, EmptyStoreException;
    void getAllProducts() throws EmptyStoreException;
}
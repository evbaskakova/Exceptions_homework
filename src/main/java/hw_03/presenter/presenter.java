package hw_03.presenter;

import hw_03.Exceptions.EmptyStoreException;
import hw_03.Exceptions.ProductNotFoundException;
import hw_03.Exceptions.WrongNameException;
import hw_03.Exceptions.ZeroPriceException;
import hw_03.model.Model;

public class presenter {

    private Model model;

    public presenter() {
        model = new Model();
    }

    public void addProduct(String name, double price) {
        try {
            model.addProduct(name, price);
        } catch (WrongNameException | ZeroPriceException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteProduct(String name) {
        try {
            model.deleteProduct(name);
        } catch (WrongNameException | ProductNotFoundException | EmptyStoreException e) {
            System.out.println(e.getMessage());
        }
    }


    public String getProduct(String name) {
        try {
            return model.getProduct(name);
        } catch (ProductNotFoundException | WrongNameException | EmptyStoreException e) {
            return e.getMessage();
        }

    }

    public void getAllProducts() {
        try {
            model.getAllProducts();
        } catch (EmptyStoreException e) {
            System.out.println(e.getMessage());
        }
    }
}
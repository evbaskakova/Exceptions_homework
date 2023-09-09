package hw_03.viewer;

import hw_03.Exceptions.EmptyStoreException;
import hw_03.Exceptions.ProductNotFoundException;
import hw_03.presenter.presenter;

import java.util.Scanner;

public class UserGUI {


    private presenter presenter;

    private Scanner in;


    public UserGUI() {
        presenter = new presenter();
        in = new Scanner(System.in);
    }

    public void show() throws EmptyStoreException {
        while (true) {
            System.out.println(Menu.MENUTITLE);
            System.out.print(Messages.CHOICE);
            String choice = in.next();
            switch (choice) {
                case "1" -> {
                    System.out.print(Messages.FIRSTINPUTMESSAGE);
                    presenter.getProduct(in.next());
                }
                case "2" -> {
                    System.out.print(Messages.FIRSTINPUTMESSAGE);
                    String product = in.next();
                    System.out.print(Messages.SECONDINPUTMESSAGE);
                    double price = in.nextDouble();
                    presenter.addProduct(product, price);
                    System.out.println(Messages.SUCCESSMESSAGE);
                }
                case "3" -> {
                    System.out.print(Messages.FIRSTINPUTMESSAGE);
                    presenter.deleteProduct(in.next());
                }
                case "4" -> presenter.getAllProducts();
                case "5" -> {
                    System.out.print(Messages.FIRSTINPUTMESSAGE);
                    System.out.print(presenter.getProduct(in.next()));
                }
                case "6" -> {
                    in.close();
                    return;
                }
            }
        }
    }
}
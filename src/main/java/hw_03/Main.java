package hw_03;

import hw_03.Exceptions.EmptyStoreException;
import hw_03.Exceptions.ProductNotFoundException;
import hw_03.viewer.UserGUI;

public class Main {

    public static void main(String[] args) throws ProductNotFoundException, EmptyStoreException {
        UserGUI gui = new UserGUI();
        gui.show();
    }


}

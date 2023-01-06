package patrones_estructurales.p_composite;

import patrones_estructurales.p_composite.leafs.*;

public class Demo {
    
    public static void main(String[] args) {

        Light l1 = new Light("Bombil", "2 años", "Ahorrador", 3000);
        Light l2 = new Light("Bombil", "4 años", "No ahorrador", 5000);

        Supermarket supermarLight = new Supermarket();
        supermarLight.addProducto(l1);
        supermarLight.addProducto(l2);

        Tap t1 = new Tap("Llavesitas", "6 años", "Metalica", 12000);
        Tap t2 = new Tap("Lla-vez", "5 años", "Metalica", 10000);

        Supermarket supermarTap = new Supermarket();
        supermarTap.addProducto(t1);
        supermarTap.addProducto(t2);

        
        Supermarket supermar = new Supermarket();
        supermar.addProducto(supermarLight);
        supermar.addProducto(supermarTap);
        supermar.showFeatures();
        
    }
}

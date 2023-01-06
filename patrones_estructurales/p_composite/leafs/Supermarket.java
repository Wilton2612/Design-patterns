package patrones_estructurales.p_composite.leafs;

import java.util.ArrayList;
import java.util.List;

public class Supermarket implements Producto {
    
    private List<Producto> products = new ArrayList<Producto>();

    @Override
    public void showFeatures()
    {
       for (Producto producto : products) {
        
        producto.showFeatures();
       }
    }
    
    public void addProducto(Producto pro)
    {
        products.add(pro);
    }

    public void removeProducto(Producto pro)
    {
        products.remove(pro);
    }

}

package patrones_estructurales.p_composite.leafs;

public class Light implements Producto{
    
    private String marca;
    private String vidaUtil;
    private String tipo;
    private double price;

    public Light(String marca, String vidaUtil, String tipo, double price) {
        this.marca = marca;
        this.vidaUtil = vidaUtil;
        this.tipo = tipo;
        this.price = price;
    }

    @Override
    public void showFeatures()
    {
        System.out.println("Las caracteristicas son las siguientes:\n marca: "+marca+"\nvida util: "+vidaUtil+"\ntipo bombillo: "+tipo+"\nPrecio: "+price);
    }


   
}

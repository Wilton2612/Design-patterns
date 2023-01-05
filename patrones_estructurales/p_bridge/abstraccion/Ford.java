package patrones_estructurales.p_bridge.abstraccion;
import patrones_estructurales.p_bridge.implementacion.Motor;

public class Ford extends Vehiculo{
    
    private String tipoPuertas;
    private String baul;

    public Ford(Motor motor, String tipoLlantas, String color)
    
    {
        super(motor);
        this.tipoPuertas = tipoLlantas;
        this.baul= color;

    }

    @Override
    public void mostrarCaracteristicas()
    {
        System.out.println("Las características del vehiculo Ford son:");
        System.out.println("Tipo de llantas: "+ tipoPuertas);
        System.out.println("Color: "+baul);
    }
}

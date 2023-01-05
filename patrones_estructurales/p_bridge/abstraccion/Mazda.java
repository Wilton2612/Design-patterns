package patrones_estructurales.p_bridge.abstraccion;
import patrones_estructurales.p_bridge.implementacion.Motor;

public class Mazda extends Vehiculo {
    
    private String tipoLlantas;
    private String color;

    public Mazda(Motor motor, String tipoLlantas, String color)
    
    {
        super(motor);
        this.tipoLlantas = tipoLlantas;
        this.color= color;

    }

    @Override
    public void mostrarCaracteristicas()
    {
        System.out.println("Las características del vehiculo Mazda son:");
        System.out.println("Tipo de llantas: "+ tipoLlantas);
        System.out.println("Color: "+color);
    }
}

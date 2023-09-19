package patrones_estructurales.p_bridge;


import patrones_estructurales.p_bridge.implementacion.*;
import patrones_estructurales.p_bridge.abstraccion.*;

public class Demo {
    
    public static void main(String[] args) {
        
        Motor motorGasolina = new Gasolina();
        Vehiculo ford = new Ford(motorGasolina);
        ford.acelerar(2.7);
        ford.frenar();


        System.out.println("############################");
        Motor motorDiesel = new Diesel();
        Vehiculo mazda = new Mazda(motorDiesel);
        mazda.acelerar(2.9);
        mazda.frenar();
    }
}

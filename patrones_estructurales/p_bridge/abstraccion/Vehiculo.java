package patrones_estructurales.p_bridge.abstraccion;

import patrones_estructurales.p_bridge.implementacion.Motor;

public abstract class Vehiculo {
    
    protected Motor motor;

    public Vehiculo(Motor motor)
    {

        this.motor = motor;
    }



    public abstract void acelerar(double combustible);
       
    

    public abstract void frenar();
}

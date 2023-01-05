package patrones_estructurales.p_bridge.abstraccion;

import patrones_estructurales.p_bridge.implementacion.Motor;

public abstract class Vehiculo {
    
    private Motor motor;

    public Vehiculo(Motor motor)
    {

        this.motor = motor;
    }

    public void acelerar(double combustible){

        motor.sumunistrarCombustible(combustible);
        motor.consumirCombustible();
    }

    public void frenar(){
        System.out.println("El vehiculo está frenando");
    }


    public abstract void mostrarCaracteristicas();
}

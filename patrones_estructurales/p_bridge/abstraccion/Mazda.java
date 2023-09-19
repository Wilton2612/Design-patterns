package patrones_estructurales.p_bridge.abstraccion;
import patrones_estructurales.p_bridge.implementacion.Motor;

public class Mazda extends Vehiculo {
    

    public Mazda(Motor motor)
    
    {
        super(motor);
        

    }

    @Override
    public void acelerar(double combustible){

        motor.sumunistrarCombustible(combustible);
        motor.consumirCombustible();
    }

    @Override
    public void frenar(){
        System.out.println("El vehiculo está frenando");
    }
}

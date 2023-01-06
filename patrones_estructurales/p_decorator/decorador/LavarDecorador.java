package patrones_estructurales.p_decorator.decorador;

import patrones_estructurales.p_decorator.interfaz.IRobot;
import patrones_estructurales.p_decorator.model.Robot;


public class LavarDecorador extends DecoradorRobot {
    
    public LavarDecorador(IRobot decorador)
    {
        super(decorador);  
    }

    @Override
    public void caminar(Robot r)
    {
        decorador.caminar(r);
    }

    @Override
    public void cocinar(Robot r)
    {
        decorador.cocinar(r);
        lavarPlatos(r);
    }

    public void lavarPlatos(Robot robot)
    {
        System.out.println("Agregando nueva funcionalidad al robot: "+robot.getName());
    }

    
}

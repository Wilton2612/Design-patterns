package patrones_estructurales.p_decorator.decorador;

import patrones_estructurales.p_decorator.interfaz.IRobot;
import patrones_estructurales.p_decorator.model.Robot;

public abstract class DecoradorRobot implements IRobot {
    
    protected IRobot decorador;
    
    public DecoradorRobot(IRobot decorador)
    {
        this.decorador=decorador;
    }

    @Override
    public void caminar(Robot r)
    {
        this.decorador.caminar(r);
    }

    @Override
    public void cocinar(Robot r)
    {
        this.decorador.cocinar(r);
    }

}

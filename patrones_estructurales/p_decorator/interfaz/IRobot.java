package patrones_estructurales.p_decorator.interfaz;

import patrones_estructurales.p_decorator.model.Robot;

public interface IRobot {
    
    void caminar(Robot robot);
    void cocinar(Robot robot);
}

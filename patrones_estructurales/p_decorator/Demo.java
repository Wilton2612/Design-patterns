package patrones_estructurales.p_decorator;

import patrones_estructurales.p_decorator.decorador.LavarDecorador;
import patrones_estructurales.p_decorator.interfaz.IRobot;
import patrones_estructurales.p_decorator.interfaz.RobotPasteleria;
import patrones_estructurales.p_decorator.model.*;

public class Demo {
    
    public static void main(String[] args) {
        
        Robot robot1 = new Robot("A1", 1);

        IRobot tipoRobot = new RobotPasteleria();
        IRobot robotLavador = new LavarDecorador(tipoRobot);

        robotLavador.caminar(robot1);
        robotLavador.cocinar(robot1);


    }
}

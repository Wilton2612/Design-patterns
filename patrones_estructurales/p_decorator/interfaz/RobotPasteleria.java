package patrones_estructurales.p_decorator.interfaz;

import patrones_estructurales.p_decorator.model.Robot;

public class RobotPasteleria implements IRobot {
    
    public RobotPasteleria()
    {

    }

    @Override
    public void caminar(Robot robot)
    {
        System.out.println("El robot " +robot.getName()+" está caminando");
    }

    @Override
    public void cocinar(Robot robot)
    {
        System.out.println("El robot "+robot.getName()+" está cocinando");
    }
}

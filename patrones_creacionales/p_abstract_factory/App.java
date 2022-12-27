package patrones_creacionales.p_abstract_factory;

import patrones_creacionales.p_abstract_factory.abstract_factory.GUIFactory;
import patrones_creacionales.p_abstract_factory.car.Icar;
import patrones_creacionales.p_abstract_factory.motorbike.Imotor;

public class App {
    
    private Icar car;
    private Imotor motor;

    public App(GUIFactory factory)
    {
        car = factory.createCar();
        motor = factory.createMotor();
    }

    public void execute()
    {
        car.encender();
        car.desplazarse();

        motor.encender();
        motor.desplazarse();

    }
}


package patrones_creacionales.p_abstract_factory.abstract_factory;

import patrones_creacionales.p_abstract_factory.car.ElectricCar;
import patrones_creacionales.p_abstract_factory.car.Icar;
import patrones_creacionales.p_abstract_factory.motorbike.ElectricMotor;
import patrones_creacionales.p_abstract_factory.motorbike.Imotor;

public class ElectricFactory implements GUIFactory {
    
    
    @Override
    public Icar createCar()
    {
        return new ElectricCar();
    }

    @Override
    public Imotor createMotor()
    {
        return new ElectricMotor();
    }

}

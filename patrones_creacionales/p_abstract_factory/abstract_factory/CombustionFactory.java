package patrones_creacionales.p_abstract_factory.abstract_factory;

import patrones_creacionales.p_abstract_factory.car.CombustionCar;
import patrones_creacionales.p_abstract_factory.car.Icar;
import patrones_creacionales.p_abstract_factory.motorbike.CombustionMotor;
import patrones_creacionales.p_abstract_factory.motorbike.Imotor;

public class CombustionFactory implements GUIFactory {
    
    @Override
    public Icar createCar()
    {
        return new CombustionCar();
    }

    @Override
    public Imotor createMotor()
    {
        return new CombustionMotor();
    }

}

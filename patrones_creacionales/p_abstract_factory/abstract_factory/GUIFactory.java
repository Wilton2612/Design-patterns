package patrones_creacionales.p_abstract_factory.abstract_factory;

import patrones_creacionales.p_abstract_factory.car.Icar;
import patrones_creacionales.p_abstract_factory.motorbike.Imotor;

public interface GUIFactory {
    
    Icar createCar();
    Imotor createMotor();

}

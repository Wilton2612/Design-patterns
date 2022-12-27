package patrones_creacionales.p_abstract_factory.car;

public class CombustionCar implements Icar {
    
    public void encender()
    {
        System.out.println("Encendiendo el auto de combustion");

    }

      
    public void desplazarse()
    {
        System.out.println("El auto de combustion se está desplazando");

    }
}

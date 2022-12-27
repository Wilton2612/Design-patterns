package patrones_creacionales.p_abstract_factory.motorbike;

public class CombustionMotor implements Imotor{
 
    
    public void encender()
    {
        System.out.println("Encendiendo la motocicleta de combustion");

    }

      
    public void desplazarse()
    {
        System.out.println("La motocicleta de combustion se está desplazando");

    }
}

package patrones_creacionales.p_abstract_factory.motorbike;

public class ElectricMotor implements Imotor{
    
    public void encender()
    {
        System.out.println("Encendiendo la motocicleta eléctrica");

    }

      
    public void desplazarse()
    {
        System.out.println("La motocicleta eléctrica se está desplazando");

    }
}

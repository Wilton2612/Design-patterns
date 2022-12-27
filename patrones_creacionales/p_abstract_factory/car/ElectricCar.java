package patrones_creacionales.p_abstract_factory.car;



public class ElectricCar implements Icar {
   
    public void encender()
    {
        System.out.println("Encendiendo el auto eléctrico");

    }

      
    public void desplazarse()
    {
        System.out.println("El auto eléctrico se está desplazando");

    }
}


package patrones_estructurales.p_bridge.implementacion;

public class Diesel implements Motor {
    

    public Diesel()
    {

    }

    @Override
    public void sumunistrarCombustible(double cantidad)
    {
        System.out.println("Inyectando " + cantidad + " L de diesel");
    }

    @Override
    public void consumirCombustible()
    {
        realizandoCombustion();
    }

    public void realizandoCombustion()
    {
        System.out.println("Consumiendo combustible");
    }
}

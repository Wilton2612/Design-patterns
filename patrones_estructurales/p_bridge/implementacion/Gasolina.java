package patrones_estructurales.p_bridge.implementacion;

public class Gasolina implements Motor{
    
    public Gasolina()
    {

    }

    @Override
    public void sumunistrarCombustible(double cantidad)
    {
        System.out.println("Inyectando " + cantidad + " L de gasolina");
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

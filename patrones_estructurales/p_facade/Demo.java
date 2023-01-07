package patrones_estructurales.p_facade;


import patrones_estructurales.p_facade.fachada.Interfaz;
import patrones_estructurales.p_facade.subsistema.Documento;

public class Demo {
    public static void main(String[] args) {
        
        Interfaz procesoConversion = new Interfaz();
        Documento newDocumento = procesoConversion.convertDocumento("Lectura español", ".Pdf");

        newDocumento.toString();
    }
}

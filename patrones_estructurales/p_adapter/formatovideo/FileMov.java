package patrones_estructurales.p_adapter.formatovideo;


public class FileMov implements FileVideo {
 
    public FileMov()
    {

    }

    public void reproducir()
    {
        System.out.println("Reproduciendo archivo Mov");
    }

    public void pausar()
    {
        System.out.println("Pausando archivo Mov");
    }
}

package patrones_estructurales.p_adapter.formatovideo;

public class FileMp4 implements FileVideo {
    
    public FileMp4()
    {

    }

    public void reproducir()
    {
        System.out.println("Reproduciendo archivo mp4");
    }

    public void pausar()
    {
        System.out.println("Pausando archivo mp4");
    }
}

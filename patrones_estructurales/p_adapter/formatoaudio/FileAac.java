package patrones_estructurales.p_adapter.formatoaudio;

public class FileAac implements FileAudio{
    
    public FileAac()
    {

    }

    public void reproducirAudio()
    {
        System.out.println("Reproduciendo archivo Aac");
    }

    public void pausarAudio()
    {
        System.out.println("Pausando archivo Aac");
    }
}

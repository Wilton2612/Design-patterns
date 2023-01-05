package patrones_estructurales.p_adapter.formatoaudio;

public class FileMp3 implements FileAudio{
 
    public FileMp3()
    {

    }

    public void reproducirAudio()
    {
        System.out.println("Reproduciendo archivo mp3");
    }

    public void pausarAudio()
    {
        System.out.println("Pausando archivo mp3");
    }
}


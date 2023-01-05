package patrones_estructurales.p_adapter.adapter;

import patrones_estructurales.p_adapter.formatoaudio.FileAudio;
import patrones_estructurales.p_adapter.formatovideo.FileVideo;

public class AdapterReproductor implements FileVideo {

    private FileAudio fileaudio;


    public AdapterReproductor(FileAudio fileAudio)
    {
        this.fileaudio = fileAudio;
    }

    public void reproducir()
    {
        this.fileaudio.reproducirAudio();
    }

    public void pausar()
    {
        this.fileaudio.pausarAudio();
    }
}

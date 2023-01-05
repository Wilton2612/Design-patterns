package patrones_estructurales.p_adapter;

import patrones_estructurales.p_adapter.adapter.AdapterReproductor;
import patrones_estructurales.p_adapter.formatoaudio.FileAac;
import patrones_estructurales.p_adapter.formatoaudio.FileMp3;
import patrones_estructurales.p_adapter.formatovideo.FileVideo;

public class Demo {
    
    public static void main(String[] args) {
        
        FileVideo iniciar = new AdapterReproductor(new FileAac());
        iniciar.reproducir();
        iniciar.pausar();

        FileVideo iniciar1 = new AdapterReproductor(new FileMp3());
        iniciar1.reproducir();
        iniciar1.pausar();
    }
}

package patrones_estructurales.p_facade.subsistema;

import java.io.File;

public class Lectura {

    public static Documento reader(Documento documento, Codificar code)
    {
        System.out.println("Leyendo el archivo "+documento.getName());
        return documento;
    }

    public static Documento writer(File documento, Documento code)
    {
        System.out.println("Escribiendo el archivo "+code.getName());
        return new Documento(code.getName(), documento.getName());
    }
}

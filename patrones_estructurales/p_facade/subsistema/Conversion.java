package patrones_estructurales.p_facade.subsistema;

import java.io.File;

public class Conversion {
    
    public static File convert(Documento documento, Codificar code)
    {

        String type = documento.getFormatType();
        
        if (type.equalsIgnoreCase(".Doc"))
        {
            System.out.println("Convirtiendo archivo..."+documento.getName());
            return new File(".Pdf");
        }
        else
        {
            System.out.println("Conviertiendo archivo..."+documento.getName());
            return new File(".Doc");
        }
    }
}

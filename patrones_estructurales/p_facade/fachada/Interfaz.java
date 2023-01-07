package patrones_estructurales.p_facade.fachada;

import java.io.File;
import patrones_estructurales.p_facade.subsistema.*;


public class Interfaz {
    
    public Documento convertDocumento(String file, String formato)
    {
        System.out.println("Iniciando proceso de conversión..");

        Documento doc = new Documento(file, formato);

        Codificar codi = CodecFactory.choose(doc);

        Codificar seleccionado;
        if (formato.equalsIgnoreCase(".Doc"))
        {
            seleccionado = new WordCompressionCodec();
        }
        else
        {
            seleccionado = new PdfCompressionCodec();
        }

        Documento leido = Lectura.reader(doc, codi);
        File conve = Conversion.convert(leido, seleccionado);
        Documento newFile = Lectura.writer(conve, doc);
        System.out.println(newFile.toString());
        return newFile;
    }
   
}

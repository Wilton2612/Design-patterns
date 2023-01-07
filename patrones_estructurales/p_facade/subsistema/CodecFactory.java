package patrones_estructurales.p_facade.subsistema;

public class CodecFactory {
    
    public static Codificar choose(Documento documento)
    {
        String type = documento.getFormatType();

        if (type.equalsIgnoreCase(".Doc"))
        {
            System.out.println("Extrayendo archivo..."+documento.getName());
            return new WordCompressionCodec();
        }
        else
        {
            System.out.println("Extrayendo archivo..."+documento.getName());
            return new PdfCompressionCodec();
        }

    }
}

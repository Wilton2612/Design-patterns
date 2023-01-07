package patrones_estructurales.p_facade.subsistema;

public class Documento {
    
    private String name;
    private String formatType;
    
    public Documento(String name, String formatType) {
        this.name = name;
        this.formatType = formatType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFormatType() {
        return formatType;
    }
    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }
    @Override
    public String toString() {
        return "Documento [name=" + name + ", formatType=" + formatType + "]";
    }

    
}

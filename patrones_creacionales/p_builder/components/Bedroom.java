package patrones_creacionales.p_builder.components;

public class Bedroom {

    private String bed;
    private String blind;

    public Bedroom(String bed, String blind) {
        this.bed = bed;
        this.blind = blind;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBlind() {
        return blind;
    }

    public void setBlind(String blind) {
        this.blind = blind;
    }

    @Override
    public String toString() {
        return "Bedroom [bed=" + bed + ", blind=" + blind + "]";
    }

}

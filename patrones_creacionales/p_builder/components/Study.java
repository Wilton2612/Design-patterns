package patrones_creacionales.p_builder.components;

public class Study {

    private String chair;
    private String desk;

    public Study(String chair, String desk) {
        this.chair = chair;
        this.desk = desk;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        this.desk = desk;
    }

    @Override
    public String toString() {
        return "Study [chair=" + chair + ", desk=" + desk + "]";
    }


    
}

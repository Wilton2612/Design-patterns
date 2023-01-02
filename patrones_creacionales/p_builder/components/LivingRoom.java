package patrones_creacionales.p_builder.components;

public class LivingRoom {

    private String carpet;
    private String sofa;

    public LivingRoom(String carpet, String sofa) {
        this.carpet = carpet;
        this.sofa = sofa;
    }

    public String getCarpet() {
        return carpet;
    }

    public void setCarpet(String carpet) {
        this.carpet = carpet;
    }

    public String getSofa() {
        return sofa;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    @Override
    public String toString() {
        return "LivingRoom [carpet=" + carpet + ", sofa=" + sofa + "]";
    }

    
}

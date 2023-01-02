package patrones_creacionales.p_builder.components;

public class Bathroom {

    private String mirror;
    private String sink;

    public Bathroom(String mirror, String sink) {
        this.mirror = mirror;
        this.sink = sink;
    }

    public String getMirror() {
        return mirror;
    }

    public void setMirror(String mirror) {
        this.mirror = mirror;
    }

    public String getSink() {
        return sink;
    }

    public void setSink(String sink) {
        this.sink = sink;
    }

    @Override
    public String toString() {
        return "Bathroom [mirror=" + mirror + ", sink=" + sink + "]";
    }

    
}

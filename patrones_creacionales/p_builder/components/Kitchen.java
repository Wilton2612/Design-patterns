package patrones_creacionales.p_builder.components;

public class Kitchen {
    
    private String stove;
    private String oven;
    private String fridge;

    public Kitchen(String stove, String oven, String fridge)
    {
        this.stove = stove;
        this.oven = oven;
        this.fridge = fridge;

    }

    public void setStove(String stove)
    {
        this.stove = stove;

    }

    public String getStove()
    {
        return stove;
    }

    public void setOven(String oven)
    {
        this.oven = oven;
        
    }

    public String getOven()
    {
        return oven;
    }

    public void setFridge(String fridge)
    {
        this.fridge = fridge;
        
    }
    public String getFridge()
    {
        return fridge;
    }

    @Override
    public String toString() {
        return "Kitchen [stove=" + stove + ", oven=" + oven + ", fridge=" + fridge + "]";
    }




}

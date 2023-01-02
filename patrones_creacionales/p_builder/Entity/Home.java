package patrones_creacionales.p_builder.Entity;

import patrones_creacionales.p_builder.components.*;

public class Home {
    
    private final Bathroom bathroom;
    private final Bedroom bedroom;
    private final HomeType homeType;
    private final Kitchen kitchen;
    private final LivingRoom livingRoom;
    private final Study study;


    public Home(Bathroom bathroom, Bedroom bedroom, HomeType homeType, Kitchen kitchen, LivingRoom livingRoom,
            Study study) {
        this.bathroom = bathroom;
        this.bedroom = bedroom;
        this.homeType = homeType;
        this.kitchen = kitchen;
        this.livingRoom = livingRoom;
        this.study = study;
    }


    public Bathroom getBathroom() {
        return bathroom;
    }


    public Bedroom getBedroom() {
        return bedroom;
    }


    public HomeType getHomeType() {
        return homeType;
    }


    public Kitchen getKitchen() {
        return kitchen;
    }


    public LivingRoom getLivingRoom() {
        return livingRoom;
    }


    public Study getStudy() {
        return study;
    }


    @Override
    public String toString() {
        return "Home [bathroom=" + bathroom + ", bedroom=" + bedroom + ", homeType=" + homeType + ", kitchen=" + kitchen
                + ", livingRoom=" + livingRoom + ", study=" + study + "]";
    }

    

}

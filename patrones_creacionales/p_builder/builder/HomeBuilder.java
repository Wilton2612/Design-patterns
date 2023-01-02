package patrones_creacionales.p_builder.builder;

import patrones_creacionales.p_builder.Entity.Home;
import patrones_creacionales.p_builder.components.Bathroom;
import patrones_creacionales.p_builder.components.Bedroom;
import patrones_creacionales.p_builder.components.HomeType;
import patrones_creacionales.p_builder.components.Kitchen;
import patrones_creacionales.p_builder.components.LivingRoom;
import patrones_creacionales.p_builder.components.Study;

public class HomeBuilder implements Builder {
    
    private  Bathroom bathroom;
    private  Bedroom bedroom;
    private  HomeType homeType;
    private  Kitchen kitchen;
    private  LivingRoom livingRoom;
    private  Study study;

    @Override
    public void setBathroom(Bathroom bathroom)
    {
        this.bathroom = bathroom;
    }

    @Override
    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    @Override
    public void setHomeType(HomeType homeType) {
        this.homeType = homeType;
    }

    @Override
    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    @Override
    public void setStudy(Study study) {
        this.study = study;
    }

    public Home getHome()
    {
        return new Home(bathroom, bedroom, homeType, kitchen, livingRoom, study);
    }   

    
}

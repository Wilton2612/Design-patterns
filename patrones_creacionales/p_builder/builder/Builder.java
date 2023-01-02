package patrones_creacionales.p_builder.builder;

/*
 * Bedroom
 * Bathroom
 * Study
 * living room
 * kitchen
 * Home type
 * 
*/

import patrones_creacionales.p_builder.components.Bathroom;
import patrones_creacionales.p_builder.components.Bedroom;
import patrones_creacionales.p_builder.components.HomeType;
import patrones_creacionales.p_builder.components.Kitchen;
import patrones_creacionales.p_builder.components.LivingRoom;
import patrones_creacionales.p_builder.components.Study;

public interface Builder {
    
    void setBathroom(Bathroom bathroom);
    void setBedroom(Bedroom bedroom);
    void setStudy(Study study);
    void setLivingRoom(LivingRoom livingRoom);
    void setKitchen(Kitchen kitchen);
    void setHomeType(HomeType homeType);

}

package patrones_creacionales.p_builder.director;
import patrones_creacionales.p_builder.builder.*;
import patrones_creacionales.p_builder.components.Bathroom;
import patrones_creacionales.p_builder.components.Bedroom;
import patrones_creacionales.p_builder.components.HomeType;
import patrones_creacionales.p_builder.components.Kitchen;
import patrones_creacionales.p_builder.components.LivingRoom;
import patrones_creacionales.p_builder.components.Study;

public class Director {
    
    public void  constructFirstHome(Builder builder)
    {
        System.out.println("primera entidad");
        builder.setBathroom(new Bathroom("Espejo", "Lavadero"));
        builder.setBedroom(new Bedroom("Cama", "Persiana"));
        builder.setHomeType(HomeType.CASTLE);
        builder.setKitchen(new Kitchen("Estufa", "Horno", "Nevera"));
        builder.setLivingRoom(new LivingRoom("Alfombra", "Sillón"));
        builder.setStudy(new Study("Silla", "Escritorio"));
    }

    public void  constructSecondHome(Builder builder)
    {
        System.out.println("segunda entidad");
        //builder.setBathroom(new Bathroom("Espejo", "Lavadero"));
        builder.setBedroom(new Bedroom("Cama", "Persiana"));
        builder.setHomeType(HomeType.CASTLE);
        builder.setKitchen(new Kitchen("Estufa", "Horno", "Nevera"));
        builder.setLivingRoom(new LivingRoom("Alfombra", "Sillón"));
        builder.setStudy(new Study("Silla", "Escritorio"));
    }
}

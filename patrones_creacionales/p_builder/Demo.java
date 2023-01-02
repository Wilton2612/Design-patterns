package patrones_creacionales.p_builder;

import patrones_creacionales.p_builder.builder.HomeBuilder;
import patrones_creacionales.p_builder.director.Director;
import patrones_creacionales.p_builder.Entity.Home;

public class Demo {
    
    public static void main(String[] args) {

        Director director  = new Director();

        HomeBuilder builder = new HomeBuilder();
        director.constructFirstHome(builder);

        HomeBuilder builder1 = new HomeBuilder();
        director.constructSecondHome(builder1);

        Home home = builder.getHome();
        System.out.println("Primera casa:\n" + home.toString());

        Home home1 = builder1.getHome();
        System.out.println("Segunda casa:\n" + home1.toString());


    }
}

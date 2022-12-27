package patrones_creacionales.p_abstract_factory;

import patrones_creacionales.p_abstract_factory.abstract_factory.CombustionFactory;
import patrones_creacionales.p_abstract_factory.abstract_factory.ElectricFactory;
import patrones_creacionales.p_abstract_factory.abstract_factory.GUIFactory;

public class Demo {
    
    public static void main(String[] args) {
        App app = runApp("Electric");
        app.execute();
    }

    private static App runApp(String tipo)
    {
        App app;
        GUIFactory factory;
        if (tipo.equalsIgnoreCase("Combustion"))
        {
            factory = new CombustionFactory();
        }

        else{
            factory = new ElectricFactory();
        }
        
        app = new App(factory);
        return app;

    }
}

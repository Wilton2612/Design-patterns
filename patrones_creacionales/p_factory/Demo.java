package patrones_creacionales.p_factory;

import patrones_creacionales.p_factory.factory.Creator;
import patrones_creacionales.p_factory.factory.CreatorSamsung;
import patrones_creacionales.p_factory.factory.CreatorHuawei;

public class Demo {

    private static Creator creator;

    public static void main(String[] args) {

        crearPhone("Samsung");

        runProgram();

    }

    static void crearPhone(String tipo_telefono)

    {
        if (tipo_telefono == null || tipo_telefono.isEmpty())
            creator = null;
        else if (tipo_telefono.equalsIgnoreCase("Samsung"))
        {
            creator = new CreatorSamsung();
        }
        else{
            creator = new CreatorHuawei();
        }                
           

    }

    static void runProgram() {
        creator.executeTelefono();

    }

}

package patrones_creacionales.p_factory.factory;

import patrones_creacionales.p_factory.product.Huawei;
import patrones_creacionales.p_factory.product.Telefono;

public class CreatorHuawei extends Creator {
    

    @Override
    public Telefono createTelefono(){
        return new Huawei();

    }
}

package patrones_creacionales.p_factory.factory;

import patrones_creacionales.p_factory.product.Telefono;
import patrones_creacionales.p_factory.product.Samsung;


public class CreatorSamsung extends Creator {
    
    @Override
    public Telefono createTelefono(){
        return new Samsung();

    }
}

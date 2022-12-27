package patrones_creacionales.p_factory.factory;

import patrones_creacionales.p_factory.product.Telefono;

public abstract class Creator {
    

    public abstract Telefono createTelefono();

    public void executeTelefono(){

        Telefono phone = createTelefono();
        phone.click();
        phone.execute();
    }




}

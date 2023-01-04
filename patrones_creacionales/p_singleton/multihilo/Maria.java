package patrones_creacionales.p_singleton.multihilo;

import patrones_creacionales.p_singleton.multihilo.database.Conexion;

public class Maria implements Runnable {
    
    @Override
    public void run() {
        Conexion conexionMaria = Conexion.getConexion("Maria DB");
        System.out.println(conexionMaria.getNameDatabase());
        conexionMaria.conectar();
        conexionMaria.desconectar();
        
        
    }
}

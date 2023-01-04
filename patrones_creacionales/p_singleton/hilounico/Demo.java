package patrones_creacionales.p_singleton.hilounico;

import patrones_creacionales.p_singleton.hilounico.database.Conexion;

public class Demo {
    
    public static void main(String[] args) {
        
        Conexion database = Conexion.getConexion("MySQL");
        System.out.println(database.getNameDatabase());
        database.conectar();
        database.desconectar();

        Conexion database1 = Conexion.getConexion("MariaDB");
        System.out.println(database1.getNameDatabase());
        database1.conectar();
        database1.desconectar();
        
    }
}

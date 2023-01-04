package patrones_creacionales.p_singleton.multihilo;
import patrones_creacionales.p_singleton.multihilo.database.Conexion;

public class Mysql implements Runnable{
    
    @Override
    public void run() {
        Conexion conexionMysql = Conexion.getConexion("Mysql");
        System.out.println(conexionMysql.getNameDatabase());
        conexionMysql.conectar();
        conexionMysql.desconectar(); 
    }
}

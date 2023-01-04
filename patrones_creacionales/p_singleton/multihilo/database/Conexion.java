package patrones_creacionales.p_singleton.multihilo.database;

public class Conexion {

    private static volatile Conexion conexion;

    private String nameDatabase;

    private Conexion(String nameDatabase) {
        this.nameDatabase = nameDatabase;

    }

    public synchronized static Conexion getConexion(String nameDatabase) {

        if (conexion == null) {
            conexion = new Conexion(nameDatabase);
        }
        return conexion;

    }

    public String getNameDatabase() {
        return nameDatabase;
    }

    public void conectar() {
        System.out.println("conectado a la base de datos");
    }

    public void desconectar() {
        System.out.println("desconectado de la base de datos");
    }
}

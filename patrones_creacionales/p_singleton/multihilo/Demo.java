package patrones_creacionales.p_singleton.multihilo;

public class Demo {
    
    public static void main(String[] args) {
        
        Thread conexion1= new Thread(new Maria());
        Thread conexion2 = new Thread(new Mysql());

        conexion1.start();
        conexion2.start();
    }
}

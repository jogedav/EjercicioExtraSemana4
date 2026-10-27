public class Aplicacion {
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;
    private static int totalAplicaciones = 0;

    public Aplicacion(String nombre, String version) {
        totalAplicaciones++;
        this.id=totalAplicaciones;
        this.nombre=nombre;
        this.version=version;
        this.ejecutando=false;
    }

    public void iniciar() {
        this.ejecutando = true;
        System.out.println(">> Acción: La aplicación '" + nombre + "' (v" + version + ") ha INICIADO.");
    }

    public void cerrar() {
        this.ejecutando = false;
        System.out.println(">> Acción: La aplicación '" + nombre + "' (v" + version + ") se ha CERRADO.");
    }

    public static int getTotalAplicaciones(){
        return totalAplicaciones;
    }
    public int getid (){
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version){
        this.version=version;
    }

    public boolean isEjecutando() {
        return ejecutando;
    }
}

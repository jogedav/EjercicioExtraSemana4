//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("GESTOR DE APLICAICONES");
        Aplicacion app1=new Aplicacion("Claude", "Opus5.5");
        Aplicacion app2=new Aplicacion("Gemini", "4.Argon");
        Aplicacion app3=new Aplicacion("Codex", "Astra");

        app1.iniciar();
        app2.iniciar();
        app1.cerrar();
        System.out.println("ESTADO DE LAS APLICACIONES");

        System.out.println(app1.getNombre() + " | ¿Ejecutando?: " + app1.isEjecutando());
        System.out.println(app2.getNombre() + " | ¿Ejecutando?: " + app2.isEjecutando());
        System.out.println(app3.getNombre() + " | ¿Ejecutando?: " + app3.isEjecutando());
        System.out.println("\n--- REPORTE FINAL ---");
        System.out.println("Total de aplicaciones instaladas: " + Aplicacion.getTotalAplicaciones());
    }
}
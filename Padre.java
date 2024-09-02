public class Padre {
    private String apellido;
    private String nombreHijo;
    private String apellidoReal;

    // Constructor de la clase Padre
    public Padre(String apellido, String nombreHijo, String apellidoReal) {
        this.apellido = apellido;
        this.nombreHijo = nombreHijo;
        this.apellidoReal = apellidoReal;
    }

    // Método test que crea instancias de Hijo y EspirituSanto
    public Boolean test() {
        Hijo hijo = new Hijo(apellido, nombreHijo);
        EspirituSanto es = new EspirituSanto(apellido, nombreHijo, apellidoReal);
        return es.pruebaPaternidad();
    }

    public static void main(String[] args) {
        // Crear instancia de Padre con los valores necesarios
        Padre padre = new Padre("Lopez", "Juan", "Lopez");
        // Llamar al método test y mostrar el resultado
        System.out.println(padre.test());
    }
}

public class Alumno {
    private float cualificacion;

    // Constructor de la clase Alumno
    public Alumno(float cualificacion) {
        this.cualificacion = cualificacion;
    }

    // Método reprobar que muestra un mensaje basado en la cualificación
    public void reprobar() {
        if (cualificacion < 6) {
            System.out.println(":(");
        } else {
            System.out.println(":)");
        }
    }

    public static void main(String[] args) {
        // Crear instancias de Alumno con diferentes cualificaciones para probar
        Alumno alumno1 = new Alumno(5.5f);  // Cualificación menor a 6
        Alumno alumno2 = new Alumno(7.0f);  // Cualificación mayor o igual a 6

        // Llamar al método reprobar y mostrar los resultados
        alumno1.reprobar();  // Debería mostrar ":("
        alumno2.reprobar();  // Debería mostrar ":)"
    }
}

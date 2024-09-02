package Exercises;

public class DataTypes {
    public String cadena;
    public int entero;
    public float flotante;
    public char caracter;
    public boolean boleano;

    // Constructor que inicializa los atributos
    public DataTypes() {
        this.cadena = "Hola Mundo";
        this.entero = 10;
        this.flotante = 5.9f;  // Nota: el sufijo 'f' indica que es un valor flotante (float)
        this.caracter = 'A';
        this.boleano = true;
    }

    // Método para mostrar los valores de los atributos (opcional, para pruebas)
    public void mostrarDatos() {
        System.out.println("cadena: " + cadena);
        System.out.println("entero: " + entero);
        System.out.println("flotante: " + flotante);
        System.out.println("caracter: " + caracter);
        System.out.println("boleano: " + boleano);
    }

    public static void main(String[] args) {
        // Crear una instancia de DataTypes
        DataTypes datos = new DataTypes();
        // Mostrar los valores de los atributos
        datos.mostrarDatos();
    }
}

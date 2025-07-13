public class Persona {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor por defecto (sin parámetros)
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        System.out.println("Constructor por defecto ejecutado.");
    }

    // Constructor con parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Constructor con nombre y edad ejecutado.");
    }

    // Sobrecarga de constructor: solo recibe el nombre
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 18;  // edad por defecto
        System.out.println("Constructor solo con nombre ejecutado.");
    }

    // Método para mostrar los datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre + ", Edad: " + this.edad);
    }
}

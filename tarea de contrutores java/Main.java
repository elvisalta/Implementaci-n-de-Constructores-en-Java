public class Main {
    public static void main(String[] args) {
        // Crear una persona con constructor por defecto
        Persona persona1 = new Persona();
        persona1.mostrarDatos();

        // Crear una persona con nombre y edad
        Persona persona2 = new Persona("Elvis", 28);
        persona2.mostrarDatos();

        // Crear una persona con solo el nombre
        Persona persona3 = new Persona("Rufida");
        persona3.mostrarDatos();
    }
}

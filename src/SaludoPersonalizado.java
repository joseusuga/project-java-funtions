public class SaludoPersonalizado {

    public static void mostrarSaludo(String nombre, int edad) {
        System.out.println("¡Hola, " + nombre + "!");
        System.out.println("Tienes " + edad + " años.");
    }

    public static void main(String[] args) {
        mostrarSaludo("maria isavel", 20);
        mostrarSaludo("jose usuga", 25);
    }
}

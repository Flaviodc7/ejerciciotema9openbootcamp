public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Jorge";
        cliente.telefono = "5237-2535";
        cliente.edad = 45;
        cliente.credito = 124255;
        System.out.println(cliente.nombre + cliente.telefono + cliente.edad + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Juan";
        trabajador.telefono = "5233-2725";
        trabajador.edad = 51;
        trabajador.salario = 12425;
        System.out.println(trabajador.nombre + trabajador.telefono + trabajador.edad + trabajador.salario);
    }
}
    class Persona{
        String nombre;
        int edad;
        String telefono;
    }

    class Cliente extends Persona {
        int credito;
    }

    class Trabajador extends Persona {
        int salario;
    }
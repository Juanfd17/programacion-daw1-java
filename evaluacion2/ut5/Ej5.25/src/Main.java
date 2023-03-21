public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.addCuenta("luis",12345, -60);
        banco.addCuenta("carlos", 12346, 60);

        System.out.println(banco.getCuenta("luis"));
        banco.listarClientes();
    }
}
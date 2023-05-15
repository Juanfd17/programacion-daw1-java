import java.io.IOException;
import java.util.Scanner;

public class Calculadora {
    double operando1;
    double operando2;
    String operador;
    double resultado;

    boolean continuar = true;

    public void bucle(){
        while (continuar) {
            try {
                leerOperandos();
                if (continuar) {
                    leerOperador();
                    realizarOperacion();
                    mostrarResultado();
                }
            } catch (ExcepcionOperadorInvalido | DivisionPorCeroException e) {
                System.out.println(e);
            } catch (NumberFormatException | IOException e) {
                System.out.println("Error debe introducir un numero entero");
            }
        }
    }

    public void realizarOperacion() throws DivisionPorCeroException {
        switch (operador){
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                if (operando2 != 0){
                    resultado = (double) operando1 / operando2;
                } else {
                    throw new DivisionPorCeroException();
                }
                break;
        }
    }

    private void mostrarResultado(){
        System.out.println(resultado);
    }

    public String tecladoString(){
        Scanner sc = new Scanner(System.in);
        String palabra = sc.next();
        return palabra;
    }

    public void leerOperandos() throws NumberFormatException, IOException {
        System.out.println("Primer operando o escriba \"Salir\"");
        String texto = tecladoString();
        if (!(texto.toUpperCase().equals("SALIR"))){
            operando1 = Double.parseDouble(texto);
            System.out.println("Segudo operando");
            operando2 = Double.parseDouble(tecladoString());
        } else {
            continuar = false;
        }
    }

    public void leerOperador() throws ExcepcionOperadorInvalido{
        System.out.println("Operador");
        operador = tecladoString();

        if (!(operador.equals("+")) && !(operador.equals("-")) &&!(operador.equals("*")) &&!(operador.equals("/"))){
            throw new ExcepcionOperadorInvalido(operador);
        }
    }
}
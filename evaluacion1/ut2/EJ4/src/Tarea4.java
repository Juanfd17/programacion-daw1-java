
/**
 * Esta clase contiene algunos metodos con usos de la sentencia condicional if y
 * switch
 */
public class Tarea4 {

    /**
     * Punto de entrada de la ejecucion.
     */
    public static void main(String[] args) {
        Tarea4 ej = new Tarea4();
        ej.printDescripcion(54, "Ramiro");
        ej.printDescripcionOtraVersion(17, "Jonathan");
        ej.printDescripcion(12, "Marco");

        System.out.println(ej.esPositivoPar(3));
        System.out.println(ej.esPositivoPar(34));

        System.out.println(ej.metodoMisterioV1(34));
        System.out.println(ej.metodoMisterioV2(-34));
        System.out.println(ej.metodoMisterioV3(-4));

        System.out.println(ej.demoSwitch(4));

        ej.repartirCaramelos(5, 3);
        ej.repartirCaramelos(1, 3);
        ej.repartirCaramelos(5, 5);

        System.out.println(ej.obtenerValorAbsoluto(54));
        System.out.println(ej.obtenerValorAbsoluto(-754));

        ej.mostrarNumeroEnLetra(45);
        ej.mostrarNumeroEnLetra(450);

        System.out.println(ej.esImparUltimaCifra(683));
        System.out.println(ej.esImparUltimaCifra(872));
        System.out.println(ej.esImparUltimaCifra(333333330));

        ej.hacerFct('p', true);
        ej.hacerFct('P', false);
        ej.hacerFct('s', true);
        ej.hacerFct('S', false);

        ej.mostrarNumero(43);
        ej.mostrarNumero(-68);
        ej.mostrarNumero(-57);

        ej.demoSwitch2("Lunes");
        ej.demoSwitch2("Domingo");

        System.out.println(ej.esVocalV1('a'));
        System.out.println(ej.esVocalV1('I'));
        System.out.println(ej.esVocalV1('J'));

        System.out.println(ej.calcularDiasMes(2, 2004));
        System.out.println(ej.calcularDiasMes(2, 2006));
        System.out.println(ej.calcularDiasMes(8, 2000));
        System.out.println(ej.calcularDiasMes(9, 2001));

        ej.detectarTipoLetra('a');
        ej.detectarTipoLetra('*');
        ej.detectarTipoLetra('O');
        ej.detectarTipoLetra('p');
        ej.detectarTipoLetra('W');
        ej.detectarTipoLetra('@');
    }

    /**
     * if con else completo (if anidado)
     */
    public void printDescripcion(int edad, String nombre) {

        if (edad < 13) {
            System.out.println(nombre + " es un nino");
        } else {
            if (edad < 18) {
                System.out.println(nombre + " es un adolescente ");
            } else {
                System.out.println(nombre + "es un adulto");
            }
        }

    }

    /**
     * if anidado, if ... else if
     */
    public void printDescripcionOtraVersion(int edad, String nombre) {

        if (edad < 13)
            System.out.println(nombre + " es un nino");
        else if (edad < 18)
            System.out.println(nombre + " es un adolescente ");
        else
            System.out.println(nombre + " es un adulto");
    }

    /**
     *
     */
    public boolean esPositivoPar(int numero) {
        System.out.println("Numero par y positivo " + numero);
        if (numero > 0 && numero % 2 == 0) {
            return true;
        }
        return false;
    }

    /**
     *
     */
    public boolean metodoMisterioV1(int valor) {
        if (valor >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Uso de una variable local para devolver el valor despues con return
     */
    public boolean metodoMisterioV2(int valor) {
        boolean resultado = false;

        if (valor >= 0) {
            resultado = true;
        }

        return resultado;
    }

    /**
     * El metodo anterior con expresion booleana
     */
    public boolean metodoMisterioV3(int valor) {

        return (valor >= 0);
    }

    /**
     * Demo de la sentencia switch
     */
    public String demoSwitch(int dia) {
        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Incorrecto";
                break;
        }
        return nombreDia;
    }

    /**
     * Mostrar uno de estos tres mensaje: " xxxx personas sin caramelos" " cada
     * persona con un caramelo" " xxxx personas con mas de un caramelo"
     */
    public void repartirCaramelos(int personas, int caramelos) {
        System.out.println("repartir caramelos perosnas " + personas + " caramelos " + caramelos);
        int caramelosPerso = caramelos - personas;


        if (personas == caramelos) {
            System.out.println("cada pesona con un caramelo");
        } else if (caramelos > personas) {
            if (caramelosPerso >= personas) {
                System.out.println(personas + " pesonas con mas de un caramelo");
            } else {
                System.out.println(caramelosPerso + " pesonas con mas de un caramelo");
            }
        } else {
            System.out.println(personas - caramelos + " pesonas sin caramelos");
        }


    }

    /**
     * Calcula y devuelve el valor absoluto de numero
     */
    public int obtenerValorAbsoluto(int numero) {
        System.out.println("Obtener valos absoluto");
        if (numero < 0) {
            numero *= -1;
        }
        return numero;
    }

    /**
     * Muestra como letra el valor de numero Para practicar if ... elseif ....
     * Comprobar que el numero esta dentro del rango de los codigos que contienen
     * letras.
     */
    public void mostrarNumeroEnLetra(int numero) {
        char minusculas[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char mayusculas[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int letra = 0;
        System.out.println("mostar numero en letra " + numero);
        if (numero >= 65 && numero <= 90) {
            letra = numero - 65;
            System.out.println(numero + " es la letra " + mayusculas[letra]);
        } else if (numero >= 97 && numero <= 122) {
            letra = numero - 97;
            System.out.println(numero + " es la letra " + minusculas[letra]);
        } else {
            System.out.println(numero + " no es una letra");
        }


        System.out.println("mostar numero en letra v2 " + numero);
        if ((numero >= 65 && numero <= 90) || (numero >= 97 && numero <= 122)) {
            System.out.println(numero + " es la letra " + (char) numero);
        } else {
            System.out.println("ERROR " + (char) numero + " no es una letra");
        }
    }

    /**
     * Devuelve true si es impar la ultima cifra de numero
     */
    public boolean esImparUltimaCifra(int numero) {
        System.out.println("impar la ultima cifra de " + numero);
        int ultimoNumero = numero % 10;

        if (ultimoNumero % 2 != 0) {
            return true;
        }
        return false;
    }

    /**
     * Escribir "El alumno hara la FCT" si es del curso segundo 'S' / 's' y ha
     * aprobado todo En cualquier caso mostrar el mensjae "Final de este m�todo"
     */
    public void hacerFct(char curso, boolean haAprobado) {
        System.out.println("FCR curso " + curso + " aprobado " + haAprobado);
        if ((curso == 's' || curso == 'S') && haAprobado)
            System.out.println("vas a FCT");
        else {
            System.out.println("no vas a FCT");
        }
    }

    /**
     * Si numero es positivo se decrementa su valor, se multiplica por 2 y se
     * escribe Si es negativo se incrementa, se divide entre 2 y se escribe tambien
     */
    public void mostrarNumero(int numero) {
        System.out.println("Mostrar Numero");
        double resultado = numero;
        if (numero >= 0) {
            resultado--;
            resultado *= 2;
        } else {
            resultado++;
            resultado /= 2;
        }
        System.out.println(resultado);
    }

    /**
     * Demo de la sentencia switch Escribe dia laborable/ No laborable
     */
    public void demoSwitch2(String dia) {
        System.out.println("Dia swich " + dia);
        switch (dia) {
            case "Lunes", "Martes", "Miercoles", "Jueves", "Viernes":
                System.out.println(dia + " es un dia laborable");
                break;

            case "Sabado", "Domingo":
                System.out.println(dia + " no es un dia laborable");
        }
    }

    /**
     * Demo de la sentencia switch devuelve true si es vocal / false en otro caso
     */
    public boolean esVocalV1(char letra) {
        System.out.println("bocal " + letra);
        switch (letra) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U':
                return true;
        }
        return false;
    }

    /**
     * Calcula y devuelve los dias del mes indicado Para el mes febrero habra que
     * tener en cueta si anio es o no bisiesto (multiplo de 4) Si el mes es
     * incorrecto devolver -1
     */
    public int calcularDiasMes(int mes, int anio) {
        System.out.println("calcular dias mes " + mes + " " + anio);
        int dias = 0;
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                dias = 31;
                break;

            case 4, 6, 9, 11:
                dias = 30;
                break;
            case 2:
                if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                    dias = 29;
                    break;
                } else {
                    dias = 28;
                    break;
                }
            default:
                return -1;

        }

        return dias;
    }

    /**
     * si no es una letra mensaje error si letra vocal mayuscula escribir vocal
     * mayuscula si letra vocal minuscula escribir minuscula escribir consonante en
     * otro caso
     */
    public void detectarTipoLetra(char letra) {
        System.out.println("detectar tipo letra " + letra);
        int numero = letra;

        if (numero == 65 || numero == 69 || numero == 73 || numero == 79 || numero == 85) {
            System.out.println(letra + " mayuscula");
        } else if (numero == 97 || numero == 101 || numero == 105 || numero == 111 || numero == 117){
            System.out.println(letra + " minuscula");
        } else if ((numero >= 65 && numero <= 90) || (numero >= 97 && numero <= 120)){
            System.out.println("constante");
        }else {
            System.out.println("error");
        }
    }

}

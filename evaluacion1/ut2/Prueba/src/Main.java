public class Main {
    public static void main(String[] args) {
        boolean algo = 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1;
        System.out.println(algo);


        int numero = 15;

        if (numero >= 0) {
            System.out.println(numero + " es positivo");
        } else {
            System.out.println(numero + " es negativo");
        }

        if (numero % 2 == 0) {
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " no es par");
        }

        //si un nuemro es multiplo 5 o de 3 y no es multiplo lo diga
        if (numero % 5 == 0 && numero % 3 == 0) {
            System.out.println(numero + " es multiplo de 5 y de 3");
        } else if (numero % 5 == 0) {
            System.out.println(numero + " es multiplo de 5");
        } else if (numero % 3 == 0) {
            System.out.println(numero + " es multiplo de 3");
        } else {
            System.out.println(numero + " no es multiplo ni de 5 ni de 3");
        }
        System.out.println("ej2");

        if (numero % 5 == 0) {
            System.out.println(numero + " es multiplo de 5");
        }
        if (numero % 3 == 0) {
            System.out.println(numero + " es multiplo de 3");
        }
        if (numero % 5 != 0 && numero % 3 != 0) {
            System.out.println(numero + " no es multiplo ni de 5 ni de 3");
        }

        //si gana menos de 15000(inc), no paga inpuestos
        //si gana entre 15000 (excluido) y 20000 (inc) paga 10% de su salario
        //si gana entre 20000 (excluido) y 40000 (inc) paga 20% de su salario
        //a partir de 40000(inc) paga 50% de su salario

        float salario = 48641.5f;

        if (salario >= 40000) {
            System.out.println("el salario es de " + salario + "€ y paga " + Math.round(salario * 0.50f * 100.0) / 100.0 + "€ de impuestos" + " se queda con " + (salario - Math.round(salario * 0.50f * 100.0) / 100.0));
        } else if (salario > 20000) {
            System.out.println("el salario es de " + salario + "€ y paga " + Math.round(salario * 0.20f * 100.0) / 100.0 + "€ de impuestos" + " se queda con " + (salario - Math.round(salario * 0.20f * 100.0) / 100.0));
        } else if (salario > 15000) {
            System.out.println("el salario es de " + salario + "€ y paga " + Math.round(salario * 0.10f * 100.0) / 100.0 + "€ de impuestos" + " se queda con " + (salario - Math.round(salario * 0.10f * 100.0) / 100.0));
        } else {
            System.out.println("el salario es de " + salario + "€ y no paga impuestos");
        }


        int nota = 10;

        if (nota == 1) {
            System.out.println("NP");
        } else if (nota == 2 || nota == 3 || nota == 4) {
            System.out.println("INS");
        } else if (nota == 5) {
            System.out.println("SUF");
        } else if (nota == 6) {
            System.out.println("B");
        } else if (nota == 7 || nota == 8) {
            System.out.println("NOT");
        } else if (nota == 9 || nota == 10) {
            System.out.println("SB");
        }

        switch (nota) {
            case 1:
                System.out.println("NP");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("INS");
                break;
            case 5:
                System.out.println("SUF");
                break;
            case 6:
                System.out.println("B");
                break;
            case 7:
            case 8:
                System.out.println("NOT");
                break;
            case 9:
            case 10:
                System.out.println("SB");
                break;
        }

        int mes = 1;
        int diaMes = 0;
        int year = 2022;
        switch (mes) {
            case 1:
                diaMes = 31;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
                    diaMes = 29;
                    break;
                } else {
                    diaMes = 28;
                    break;
                }
            case 3:
                diaMes = 31;
                break;
            case 4:
                diaMes = 30;
                break;
            case 5:
                diaMes = 31;
                break;
            case 6:
                diaMes = 30;
                break;
            case 7:
                diaMes = 31;
                break;
            case 8:
                diaMes = 31;
                break;
            case 9:
                diaMes = 30;
                break;
            case 10:
                diaMes = 31;
                break;
            case 11:
                diaMes = 30;
                break;
            case 12:
                diaMes = 31;
                break;
        }
        System.out.println(diaMes);
    }
}

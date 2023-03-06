public class Palabra {
    private String palabra;
    public Palabra(String palabra){
        this.palabra = palabra;
    }

    public String guionizar(){
        StringBuilder giomnizado = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            giomnizado.append(palabra.charAt(i));
            if (i < palabra.length() - 1){
                giomnizado.append("-");
            }
        }
        return giomnizado.toString();
    }

    public int contarVocales(){
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (esVocal(palabra.charAt(i))){
                contador ++;
            }
        }

        return contador;
    }

    private boolean esVocal(char car){
        return  (car == 'A' || car == 'a' || car == 'E' || car == 'e' || car == 'I' || car == 'i' || car == 'O' || car == 'o' || car == 'U' || car == 'u');
    }

    public boolean mayorQue(String palabra){
        if (this.palabra.compareTo(palabra) == 0 || this.palabra.compareTo(palabra) < 0){
            return false;
        } else {
            return true;
        }
    }

    public String borrarAparacionesDe(String str){
        String palabraSin = palabra;
        int fuera = palabraSin.indexOf(str);
        while (fuera != -1){
            String primeraParte = palabraSin.substring(0, fuera);
            String segundaParte = palabraSin.substring(fuera + str.length());
            palabraSin = primeraParte + segundaParte;
            fuera = palabraSin.indexOf(str);
        }
        return palabraSin;
    }

    public char[][] toArray2D(){
        char [][] array = new char[palabra.length()][palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < palabra.length(); j++) {
                if (j >= i){
                    array[i][j] = palabra.charAt(j);
                } else {
                    array[i][j] = '*';
                }
            }
        }

        return array;
    }

    public char[] toArray(){
        char[] array = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            array[i] = palabra.charAt(i);
        }

        return array;
    }
}

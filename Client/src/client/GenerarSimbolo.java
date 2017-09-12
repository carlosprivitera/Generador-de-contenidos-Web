package client;

import java.util.Random;

public class GenerarSimbolo {
    private String simbolo = "";
    private String simbolos = "ABCDEFGHI";
    private String numeros  = "123456789";
    private String numerosXY  = "123456789xxyy";
    private String operador1 = "+-";
    private String operador2 = "+-*/";
    public GenerarSimbolo() {
        super();
    }
    public String enteroALetra(String numero) {
        String letra = "";
        int x=Integer.parseInt(numero)-1;
        letra = simbolos.substring(x, x+1);
        return letra;
    }
    public String s(int tipo) {
        Random rnd = new Random();
        int x = 0;
        simbolo="";
        switch(tipo){
            case 1: x=rnd.nextInt(numeros.length());
              simbolo = numeros.substring(x, x+1);
              break;
            case 2: x=rnd.nextInt(operador2.length()); 
              simbolo = operador2.substring(x, x+1);
              break;
            case 3: x=rnd.nextInt(operador1.length()); 
              simbolo = operador1.substring(x, x+1);
              break;
            case 4: x=rnd.nextInt(numerosXY.length());
              simbolo = numerosXY.substring(x, x+1);
              break;
            default: 
        }
        return simbolo;
    }
}

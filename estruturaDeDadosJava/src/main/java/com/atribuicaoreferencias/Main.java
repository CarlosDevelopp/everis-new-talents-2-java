package com.atribuicaoreferencias;

public class Main {
    public static void main (String[] args){
        int a = 1;
        int b = a;

        System.out.println("Valor de A = " + a + " Valor de B = " + b);

        a = 10;

        System.out.println("Valor de A = " + a + " Valor de B = " + b);
        /*
        * O Valor B não tem alteração de valor, pois o mesmo não encontra-se setado via objeto. No exemplo o mesmo
        * so vai referenciar aos valores que foi setado inicialmente, alterações posteriores não sofre alterações.
        * */

        System.out.println("-----------------------------------------");

        Objeto objA = new Objeto(10);
        Objeto objB = objA;

        System.out.println("Objeto A = " + objA + " Objeto B = " + objB);

        objA.setValor(100);
        System.out.println("Objeto A = " + objA + " Objeto B = " + objB);

        /*
        * No exemplo acima foi criado uma classe Objeto para manipular os dados, alterando os valores
        * utilizando o metodo "setValor" criado na classe objeto, logo os valores alterados no "objA"
        * deverá replicar o mesmo resultado no "objB".
        * */
    }
}

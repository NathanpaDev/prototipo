
public class OperadoresUnarios {

    public static void main(String[] args) {
        int numero = 5;
        System.out.println(-numero); // -5
        System.out.println(+numero); // 5
        System.out.println(++numero); // 6
        System.out.println(--numero); // 5
        System.out.println(numero++); // 5 (depois incrementa)
        System.out.println(numero--); // 6 (depois decrementa)

        numero = -numero;
        System.out.println(numero); // -5

        numero = +numero;
        System.out.println(numero); // -5

        numero = numero * -1;
        System.out.println(numero); // 5 
        //x repetição

        //numero = numero + 1;
        System.out.println(++numero); // 5 (antes incrementa)
        System.out.println(numero); // 6    (depois incrementa)

        System.out.println(numero++); // 6 (depois incrementa)
        System.out.println(numero); // 7 (depois incrementa)

        System.out.println(--numero); // 6 (antes decrementa)
        System.out.println(numero); // 6 (depois decrementa)
        System.out.println(numero--); // 6 (depois decrementa)
        System.out.println(numero); // 5 (depois decrementa)   

        boolean variavel = false;

        System.out.println(!variavel); // true (inverte o valor)

        variavel = !variavel; // inverte o valor

        System.out.println(variavel); // false (não inverte o valor)

    }

}

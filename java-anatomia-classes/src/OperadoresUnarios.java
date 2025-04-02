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

    }
    
}

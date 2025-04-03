
public class OperadorTernario {

    public static void main(String[] args) {

        int a, b;

        a = 5;
        b = 6;
        /*EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE */

        String resultado;
        if (a == b) {
            resultado = "Verdadeiro"; 
        }else {
            resultado = "Falso"; // Se a for igual a b, resultado recebe "Verdadeiro", senão "Falso"    
        }

        System.out.println(resultado);

        /*CONDICIONAL SIMPLIFICADA */
        int c, d;

        c = 10;
        d = 10;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO OPERADOR TERNÁRIO */
        String resultado_1 = (c == d) ? "Correto" : "Incorreto"; // Se c for igual a d, resultado recebe "Correto", senão "Incorreto"

        System.out.println(resultado_1);

    }

}

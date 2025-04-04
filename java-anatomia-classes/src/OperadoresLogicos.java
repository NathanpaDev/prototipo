public class OperadoresLogicos {
    public static void main(String[] args) {
        // Operadores lógicos
        boolean condicao1= true;
        boolean condicao2= false;

        if (condicao1 && condicao2) { // E lógico
            System.out.println("Ambas as condições são verdadeiras.");
        } else {
            System.out.println("Pelo menos uma condição é falsa.");

        }

        if (condicao1 || condicao2) { // Ou lógico
            System.out.println("Pelo menos uma condição é verdadeira.");
        } else {
            System.out.println("Ambas as condições são falsas.");
        }

     
    }
    
}

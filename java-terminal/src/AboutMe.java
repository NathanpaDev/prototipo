public class AboutMe {
    public static void main(String[] args) {
       // os argumentos são passados pelo terminal
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);
        // imprime os dados na tela
        System.out.println("Ola, me chamo " + nome + "  " + sobrenome + ".");
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("E minha altura e  " + altura + " cm");  


         }
                 
}
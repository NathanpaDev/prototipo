
public class MinhaClasse {

    public static void main(String[] args) {

        String meuNome = "Nathan";
        String meuSobrenome = "Uckerman";

        String nomeCompleto = nomeCompleto(meuNome, meuSobrenome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String meuNome, String meuSobrenome) {
        return "Resultado do metodo " + meuNome.concat(" ").concat(meuSobrenome);
    }

}

public class SmartTv {
    // Atributos da classe SmartTv
    boolean ligada = false; // Atributo para verificar se a TV está ligada ou não
    int canal = 1; // Atributo para armazenar o canal atual da TV
    int volume = 25; // Atributo para armazenar o volume atual da TV

    public void aumentarVolume() { // Método para aumentar o volume da TV
        volume++; // Aumenta o volume em 1 unidade
        System.out.println("Aumentando o volume para : " + volume); // Exibe o volume atual após o aumento
    }   

    public void diminuirVolume() { // Método para diminuir o volume da TV
        volume--; // Diminui o volume em 1 unidade
        System.out.println("Diminuindo o volume para : " + volume); // Exibe o volume atual após a diminuição   
    }   

    public void ligar() { // Método para ligar a TV
        ligada = true; // Define o atributo ligada como verdadeiro
    }   

    public void desligar() { // Método para desligar a TV
        ligada = false; // Define o atributo ligada como falso
    }

    public void aumentarCanal() { // Método para aumentar o canal da TV
        canal++; // Aumenta o canal em 1 unidade
    }       
    
    public void diminuirCanal() { // Método para diminuir o canal da TV
        canal--; // Diminui o canal em 1 unidade
    }
    
    public void mudarCanal(int novoCanal) { // Método para mudar o canal da TV
        canal = novoCanal; // Define o canal atual como o novo canal fornecido
    }   
    
}

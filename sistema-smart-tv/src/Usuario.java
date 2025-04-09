


public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv(); // Cria uma nova instância da classe SmartTv

       
        System.out.println("Volume atual : " + smartTv.volume); // Verifica o volume atual após as operações
        System.out.println("TV ligada ? " + smartTv.ligada); // Verifica se a TV está ligada
        System.out.println("Canal atual : " + smartTv.canal); // Verifica o canal atual da TV 
        

        smartTv.ligar(); // Liga a TV
        System.out.println("Novo status TV : " + smartTv.ligada); // Verifica o novo status da TV após ligar

        smartTv.desligar(); // Desliga a TV
        System.out.println("Novo status TV : " + smartTv.ligada); // Verifica o novo status da TV após desligar

        smartTv.diminuirVolume(); // Diminui o volume da TV 
        smartTv.diminuirVolume(); // Diminui o volume da TV novamente
        smartTv.diminuirVolume(); // Aumenta o volume da TV
        smartTv.aumentarVolume(); // Aumenta o volume da TV novamente
        System.out.println("Volume atual : " + smartTv.volume); // Verifica o volume atual após as operações
        
        smartTv.mudarCanal(13); // Muda o canal da TV para 13
        System.out.println("Canal atual : " + smartTv.canal); // Verifica o canal atual após a mudança
    }       

}

      



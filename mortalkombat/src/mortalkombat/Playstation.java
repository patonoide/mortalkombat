package mortalkombat;

public class Playstation {

    public static void main(String[] args) {
        Reptile personagem = new Reptile();
        
        personagem.setSocoforte(" triangulo ");
        
        personagem.setSocofraco(" quadrado ");
        
        personagem.setChuteforte(" X ");    
        
        personagem.setChutefraco(" bolinha ");
         
        personagem.setDefesa(" L2 e R2 ");
        
        personagem.setEspecial("L1 e R1 ");     
      
        System.out.println("playstation");
        System.out.println("\n Configurações de botões ");
        
        System.out.println(" soco Forte: " + personagem.getSocoforte());
        
        System.out.println(" soco Fraco: " + personagem.getSocofraco());
        
        System.out.println(" chute Forte: " + personagem.getChuteforte() );
        
        System.out.println(" chute Fraco: "  + personagem.getChutefraco());
        
        System.out.println(" defesa: " + personagem.getDefesa());
        
        System.out.println(" especial: " + personagem.getEspecial() );
        
        System.out.println(" todos os herois começam com a vida em " + personagem.getVida() + " % ");
        
        System.out.println("\nComandos especiais");
        
        System.out.println("invisivel: "  +  personagem.invisivel());
        
        System.out.println("acido: " + personagem.acido());
        
        System.out.println("bola Rápida: " + personagem.bolarapida());
        
        System.out.println("bola Lenta: " + personagem.bolalenta());
        
            System.out.println("combo 1: " + personagem.combo1());
        System.out.println("combo 2: " + personagem.combo2() );
        
        System.out.println("fatalyty 1: " + personagem.fatality());
        
        System.out.println("fatality 2: " + personagem.fatality1());
    
    
    
    }

}

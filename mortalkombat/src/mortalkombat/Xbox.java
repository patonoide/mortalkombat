package mortalkombat;

public class Xbox {

    public static void main(String[] args) {
        Reptile boneco1 = new Reptile();
        
        boneco1.setSocoforte(" Y ");
        boneco1.setSocofraco(" X ");
        boneco1.setChuteforte(" A ");
        boneco1.setChutefraco(" B ");
        boneco1.setDefesa("LT e RT");
        boneco1.setEspecial("LB eRB");
  
        System.out.println("xbox");
        System.out.println("\nConfigurações de botões reptile");
        System.out.println("soco forte" + boneco1.getSocoforte());
        System.out.println("soco fraco" + boneco1.getSocofraco());
        System.out.println("chute forte" + boneco1.getChuteforte() );
        
        System.out.println("chute fraco"  + boneco1.getChutefraco());
        
        
        System.out.println("defesa" + boneco1.getDefesa());
        
        System.out.println("especial" + boneco1.getEspecial() );
        
        System.out.println("todos os personagens começam com a vida em " + boneco1.getVida() + " % ");
        
        System.out.println("\ncomandos especiais");
        
        System.out.println("invisivel"  +  boneco1.invisivel());
        
        System.out.println("acido: " + boneco1.acido());
        
        System.out.println("bola rápida: " + boneco1.bolarapida());
        System.out.println("bola lenta: " + boneco1.bolalenta());
        
        System.out.println("combo 1" + boneco1.combo1());
        
        System.out.println("combo 2" + boneco1.combo2() );
        
        System.out.println("fatalyty 1" + boneco1.fatality());
        
        System.out.println("fatality 2" + boneco1.fatality1());
        
        
        Scorpion p = new Scorpion();
        
        p.setSocoforte(" Y ");
        p.setSocofraco(" X ");
        p.setChuteforte(" A ");
        p.setChutefraco(" B ");
        p.setDefesa("LT e RT");
        p.setEspecial("LB e RB");
        
         System.out.println("xbox");
         
        System.out.println("\nconfigurações de botões");
        
        System.out.println("soco forte" + p.getSocoforte());
        
        System.out.println("soco fraco" + p.getSocofraco());
        
        
        
        System.out.println("chute forte" + p.getChuteforte() );
        
        System.out.println("chute fraco"  + p.getChutefraco());
        
        System.out.println("fefesa" + p.getDefesa());
        
        System.out.println("especial" + p.getEspecial() );
        
        System.out.println("todos os personagens começam com a vida em " + p.getVida() + " % ");
        
        System.out.println("\nComandos especiais");
        
        System.out.println("invisivel"  + p.spear() );
        
        System.out.println("acido: " + p.takedown() );
        
        System.out.println("bola rápida: " + p.teleport());
        
        System.out.println("combo 1" + p.combo1());
        
        System.out.println("combo 2" + p.combo2());
        
        System.out.println("fatalyty 1" + p.fatality());
        
        System.out.println("fatality 2: " + p.fatality1());
    
        
    
    }

}

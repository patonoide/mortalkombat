package mortalkombat;

public class Reptile {

  private  String socoforte;
  private  String socofraco;
  private  String chuteforte;
  private  String chutefraco;
  private  String defesa;
  private  String agarra;
  private  String especial;
  private Integer vida;
  
  public Reptile(){
      
  
      this.socoforte = null;
  this.socofraco = null;
    this.chuteforte = null;
  this.chutefraco = null;
  this.defesa = null;
    this.agarra = null;
  this.especial = null;
    this.vida = 100;
  }

    public Integer getVida() {
        return this.vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }
 
  public String getSocoforte() {
        return this.socoforte;
    }

    public void setSocoforte(String socoforte) {
        this.socoforte = socoforte;
    }

    public String getSocofraco() {
        return this.chutefraco;
    }

    public void setSocofraco(String socofraco) {
        this.socofraco = socofraco;
    }

    public String getChuteforte() {
        return this.chuteforte;
    }

    public void setChuteforte(String chuteforte) {
        this.chuteforte = chuteforte;
    }

    public String getChutefraco() {
        return this.chutefraco;
    }

    public void setChutefraco(String chutefraco) {
        this.chutefraco = chutefraco;
    }

    public String getDefesa() {
        return this.defesa;
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }

    public String getAgarra() {
        return this.agarra;
    }

    public void setAgarra(String agarra) {
        this.agarra = agarra;
    }

    public String getEspecial() {
        return this.especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }
 

   
    
    
    
    
    public String invisivel() {

        return "baixo, cima, " + socoforte;

    }

    public String acido() {
        return "baixo, esquerda, " + socofraco;
    }

    public String bolarapida() {
        return "esquerda, direita, " + chuteforte;
    }

    public String bolalenta() {
        return "baixo, trás, " + chutefraco;
    }

    public String combo1() {
        return "baixo, cima, " + socofraco + " , " + socofraco + " , " + socoforte;
    }

    public String combo2() {
        return chutefraco + " , " + chutefraco + " , " + chuteforte;
    }

    public String fatality1() {
        return "atrás, atrás, Baixo, Cima, " + chuteforte + " Distância de uma rasteira. ";
    }

    public String fatality() {
        return "baixo, baixo, frete, atrás,  " + socofraco + " Distância de uma rasteira. ";
    }

    

}

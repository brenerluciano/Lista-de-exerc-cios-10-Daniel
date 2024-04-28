package Classes;

public class Plantas {
   private String especie;
   private String nome;
   private String regiao;
   private double altura;
   private String cor;

   public Plantas(String especie, String nome, String regiao, double altura, String cor){
    this.especie = especie;
    this.nome = nome;
    this.regiao = regiao;
    this.altura = altura;
    this.cor = cor;
   }

   public String getEspecie(){
    return especie;
   }

   public void setEspecie(String especie){
    this.especie = especie;
   }
   
   public String getNome(){
    return nome;
   }

   public void setNome(String nome){
    this.nome = nome;
   }
   
   public String getRegiao(){
    return regiao;
   }

   public void setRegiao(String regiao){
    this.regiao = regiao;
   }

   public double getAltura(){
    return altura;
   }

   public void setAltura(double altura){
    this.altura = altura;
   }

   public String getCor(){
    return cor;
   }

   public void setCor(String cor){
    this.cor = cor;
   }

   public void Fotossintese(){
    System.out.println("Fazendo fotossíntese..!");
   }
   public void Crescer(){
    System.out.println("Sua planta cresceu...!");
   }
   public void Cair(){
    System.out.println("Caiu....!");
   }
   public void darFrutos(){
    System.out.println("Sua planta deu frutos...!");
   }
    
}

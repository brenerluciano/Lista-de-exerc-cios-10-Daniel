package Classes;

public class Avião {

   private String nome;
   private double tamanho;
   private String cor;
   private double altura;
   

   public Avião(String nome, double tamanho, String cor, double altura){
    this.nome = nome;
    this.tamanho = tamanho;
    this.cor = cor;
    this.altura = altura;
   }

   public String getNome(){
    return nome;
   }

   public void setNome(String nome){
    this.nome = nome;
   }
   
   public double getTamanho(){
    return tamanho;
   }

   public void setTamanho(double tamanho){
    this.tamanho = tamanho;
   }
   
   public String getCor(){
    return cor;
   }

   public void setCor(String cor){
    this.cor = cor;
   }

   public double getAltura(){
    return altura;
   }

   public void setAltura(double altura){
    this.altura = altura;
   }

   public void Subir(){
    System.out.println("Está subindo...!");
   }
   public void Descer(){
    System.out.println("Está descendo...!");
   }
   public void Planar(){
    System.out.println("Avião está planando...!");
   }
   public void Frear(){
    System.out.println("Está parando...!");
   }
}

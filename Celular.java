package Classes;

public class Celular {
   private String cor;
   private String marca;
   private String ano;
   private String nome;
   private double tamanho;

   public Celular(String cor, String marca, String ano, String nome, double tamanho){
    this.cor = cor;
    this.marca = marca;
    this.ano = ano;
    this.nome = nome;
    this.tamanho = tamanho;
   }

   public String getCor(){
    return cor;
   }

   public void setCor(String cor){
    this.cor = cor;
   }
   
   public String getMarca(){
    return marca;
   }

   public void setMarca(String marca){
    this.marca = marca;
   }
   
   public String getAno(){
    return ano;
   }

   public void setAno(String ano){
    this.ano = ano;
   }

   public String getnome(){
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

   public void Processar(){
    System.out.println("O sistema está processando...!");
   }
   public void Armazenando(){
    System.out.println("Armazenando informações...!");
   }
   public void Carregando(){
    System.out.println("Carregando celular...!");
   }
}

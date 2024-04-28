package Classes;

public class Notebook {
   private String ano;
   private String nome;
   private double tamanho;
   private String cor;

   public Notebook(String ano, String nome, double tamanho, String cor){
    this.ano = ano;
    this.nome = nome;
    this.tamanho = tamanho;
    this.cor = cor;
   }

   public String getAno(){
    return ano;
   }

   public void setAno(String ano){
    this.ano = ano;
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

   public void Ligar(){
    System.out.println("Ligado..!");
   }
   public void Desligar(){
    System.out.println("Desligado...!");
   }
   public void Carregar(){
    System.out.println("Carregando...!");
   }
   public void Processar(){
    System.out.println("Processando informações...!");
   }
   public void Armazenar(){
    System.out.println("Armazenando informações..!");
   }
}

package Classes;

public class Animal {
    private String cor;
    private String especie;
    private String nome;
    private double altura;


    public Animal(String cor, String especie, String nome, double altura){
        this.cor = cor;
        this.especie = especie;
        this.nome = nome;
        this.altura = altura;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
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

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void voar(){
        System.out.println("Voando alto...!");
    }
    public void comer(){
        System.out.println("Comendo algo...!");
    }
    public void caçar(){
        System.out.println("Caçando.....!");
    }
    public void andar(){
        System.out.println("Andando....!");
    }
    public void pular(){
        System.out.println("Ele está pulando...!");
    }
}

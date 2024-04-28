package Classes;

public class Carro {

    private String cor;
    private String modeloCarro;
    private int ano;
    private String numeroChassi;
    private String nome;

    public Carro(String cor, String modeloCarro, int ano, String numeroChassi, String nome){
        this.cor = cor;
        this.modeloCarro = modeloCarro;
        this.ano = ano;
        this.numeroChassi = numeroChassi;
        this.nome = nome;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getModeloCarro(){
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro){
        this.modeloCarro = modeloCarro;
    }

    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }

    public String getNumeroChassi(){
        return numeroChassi;
    }
    public void setNumeroChassi(String numerochassi){
        this.numeroChassi = numerochassi;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void acelerar(){
        System.out.println("A velocidade está muito alta...!");
    }
    public void virar(){
        System.out.println("Ele está virando...!");
    }
    public void freiar(){
        System.out.println("Parado...!");
    }
    public void ligarFarol(){
        System.out.println("Farol Ligado");
    }
}

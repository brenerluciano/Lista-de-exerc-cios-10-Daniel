package Classes;

public class Trem {
    private String cor;
    private String ano;
    private String modelo;
    private String nome;
    private double tamanho;

    public Trem(String cor, String ano, String modelo, String nome, double tamanho){
        this.cor = cor;
        this.ano = ano;
        this.modelo = modelo;
        this.nome = nome;
        this.tamanho = tamanho;
    }
    
    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getAno(){
        return ano;
    }

    public void setAno(String ano){
        this.ano = ano;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
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

    public void fecharPorta(){
        System.out.println("Portas fechadas...!");
    }
    public void Andar(){
        System.out.println("O trem está andando...!");
    }
    public void Freiar(){
        System.out.println("Parado..!");
    }
    public void acenderLuz(){
        System.out.println("Luzes acesas");
    }
}

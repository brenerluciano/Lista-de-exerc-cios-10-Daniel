package Classes;

public class Foqueira {
    private int fogo;
    private String madeira;
    private String carvao;
    
    public Foqueira(int fogo, String madeira, String carvao){
        this.fogo = fogo;
        this.madeira = madeira;
        this. carvao = carvao;
    }

    public int getFogo(){
        return fogo;
    }

    public void setFogo(int fogo){
        this.fogo = fogo;
    }

    public String getMadeira(){
        return madeira;
    }
    
    public void setMadeira(String madeira){
        this.madeira = madeira;
    }

    public String getCarvao(){
        return carvao;
    }

    public void setCarvao(String carvao){
        this.carvao = carvao;
    }

    public void Esquentar(){
        System.out.println(" ° graus...!");
    }
    public void Queimar(){
        System.out.println("Queimou, está muito quente....!");
    }
    public void Assar(){
        System.out.println("Já está assado...!");
    }
    public void Apagar(){
        System.out.println("Fogo apagado...!");
    }
}

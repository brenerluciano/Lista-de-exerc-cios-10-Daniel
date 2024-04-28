package Classes;

public class Casa {
    private String cor;
    private String telhado;
    private String terreno;
    private int altura;

    public Casa(String cor, String telhado, String terreno, int altura){
        this.cor = cor;
        this.telhado = telhado;
        this.terreno = terreno;
        this.altura = altura;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getTelhado(){
        return telhado;
    }

    public void setTelhado(String telhado){
        this.telhado = telhado;
    }

    public String getTerreno(){
        return terreno;
    }

    public void setTerreno(String terreno){
        this.terreno = terreno;
    }
    
    public int getAltura(){
        return altura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public void sombra(){
        System.out.println("Sombra...!");
    }
    public void protecao(){
        System.out.println("Protegendo...!");
    }
    public void barulho(){
        System.out.println("Sons estranhos...!");
    }
}

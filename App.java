import java.util.Scanner;

import Classes.Animal;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Istanciando a classe e seus valores.
        Animal animal = new Animal("Branco", "Pitangus sulphuratus", "Bem-te-vi", 0.40);

        //chamando a função Nome é Cor.
        System.out.println(animal.getNome()+ " está ferido");
        System.out.println(animal.getNome() + " está " + animal.getCor());
        scanner.close();
        
    }
    
}


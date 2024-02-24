import java.util.Scanner;

//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a coordenada x: ");
        int x = scanner.nextInt();
        System.out.print("Digite a coordenada y: ");
        int y = scanner.nextInt();
        while(x != 0 && y != 0){
            if(x > 0 && y > 0)
                System.out.println("Primeiro quadrante");
            else if(x < 0 && y > 0)
                System.out.println("Segundo quadrante");
            else if(x < 0 && y < 0)
                System.out.println("Terceiro quadrante");
            else
                System.out.println("Quarto quadrante");
            System.out.print("Digite a coordenada x: ");
            x = scanner.nextInt();
            System.out.print("Digite a coordenada y: ");
            y = scanner.nextInt();
        }
        scanner.close();
    }
}
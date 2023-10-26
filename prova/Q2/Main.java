package Q2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        double area;
        int populacao;

        System.out.println("Digite o nome, area, e população do primeiro País, um em cada linha");
        nome = input.next();
        area = input.nextDouble();
        populacao = input.nextInt();
        Pais pais1 = new Pais(nome, area, populacao);

        System.out.println("Digite o nome, area, e população do segundo País, um em cada linha");
        nome = input.next();
        area = input.nextDouble();
        populacao = input.nextInt();
        Pais pais2 = new Pais(nome, area, populacao);

        if (pais1.densidade() > pais2.densidade()) {
            System.out.println(pais1.toString());
        }else{
            System.out.println(pais2.toString());
        }
    }
}

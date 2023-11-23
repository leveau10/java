package Construtora;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Construtora Const = new Construtora();

        Motorista moto1 = new Motorista("Leo", "leo@gmail.com", "1293821931", "23891232");
        Const.Inserir(moto1);
        Motorista moto2 = new Motorista("Bruno", "bruno@gmail.com", "34324143223", "1234234");
        Const.Inserir(moto2);

        Engenheiro eng1 = new Engenheiro("Gabi", "gabi@gmail.com", "1244124123", "2145342423");
        Const.Inserir(eng1);
        Engenheiro eng2 = new Engenheiro("Flavia", "flavia@gmail.com", "654523524", "5464563");
        Const.Inserir(eng2);

        

        System.out.println(Const.Engenheiros());
        System.out.println(Const.Motoristas());
        System.out.println(Const.Funcionarios());
        input.close();
    }
}
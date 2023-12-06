package Orcamento;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Orcamento orcamentoOne = new Orcamento("Fulana", LocalDate.now() );
        Servico servicoOne = new Servico("Troca de lâmpada", 2, 10);
        Material materialOne = new Material("Lâmpada",2, 10, 6);
        orcamentoOne.inserirItem(servicoOne);
        orcamentoOne.inserirItem(materialOne);
        input.close();
        System.out.println(orcamentoOne.getTotal());
    }
} 

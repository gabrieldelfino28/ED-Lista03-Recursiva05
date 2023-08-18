package view;

import java.util.Scanner;

import controller.FibonacciController;

public class Principal {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        FibonacciController f = new FibonacciController();
        int Num;
        do {
            System.out.println("Informe um n'nésimo termo de Fibonacci (até 20): ");
            Num = s.nextInt();
            if (Num < 0 || Num > 20) {
                System.out.println("Num inválido, tente novamente");
            }
        } while (Num < 0 || Num > 20);
        int res = f.FuncFib(Num);

        System.out.println(res);
    }

}

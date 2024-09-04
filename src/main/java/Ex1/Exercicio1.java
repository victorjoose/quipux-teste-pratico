// 1. Dado um número inteiro, cumpra as seguintes condições: 

// Se for estranho, imprima “Quipux” 
// Se for par e estiver no intervalo inclusivo de 2 e 5, imprima “No Quipux” 
// Se for par e estiver no intervalo inclusivo de 6 e 20, imprima “Quipux” 
// Se for par e for maior que 20, imprima “Não Quipux”.

// Formato de entrada:
// Uma única linha contendo um número inteiro positivo. 

// Restrições 
// 1 ≤  x   ≤ 100 

// Formato de saída 
// Imprimir “Quipux” ou “No Quipux” com base nas restrições  
// anterior

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = -1;

        while (x != 0) {
            System.out.println("\nDigite um número entre 1 e 100. Para parar a execução digite 0");

            try {
                x = scanner.nextInt();

                if (x < 0 || x > 100) {
                    System.out.println("\nNúmero fora do intervalo permitido. Tente novamente.");
                } else if (x % 2 != 0) {
                    System.out.println("Quipux");
                } else {
                    if (x >= 2 && x <= 5) {
                        System.out.println("No Quipux");
                    } else if (x >= 6 && x <= 20) {
                        System.out.println("Quipux");
                    } else if (x > 20) {
                        System.out.println("Não Quipux");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("\nEntrada inválida. Por favor, digite um número.");
                scanner.next();
            }
        }
        scanner.close();
    }
}


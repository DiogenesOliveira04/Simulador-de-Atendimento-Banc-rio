/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;
    import java.util.Scanner;
/**
 *
 * @author Plugify
 */
public class Banco {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.00; // saldo fictício inicial

        System.out.println("Menu de atendimento:");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Sacar dinheiro");
        System.out.println("3 - Depositar dinheiro");
        System.out.println("4 - Encerrar atendimento");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.printf("Seu saldo é: R$ %.2f%n", saldo);
                break;
            case 2:
                System.out.print("Digite o valor do saque: ");
                double saque = sc.nextDouble();
                if (saque > saldo) {
                    System.out.println("Erro: saldo insuficiente!");
                } else {
                    saldo -= saque;
                    System.out.printf("Saque realizado. Novo saldo: R$ %.2f%n", saldo);
                }
                break;
            case 3:
                System.out.print("Digite o valor do depósito: ");
                double deposito = sc.nextDouble();
                saldo += deposito;
                System.out.printf("Depósito realizado. Novo saldo: R$ %.2f%n", saldo);
                break;
            case 4:
                System.out.println("Atendimento encerrado.");
                break;
            default:
                System.out.println("Opção inválida!");
        }
        sc.close();
    }
}

    


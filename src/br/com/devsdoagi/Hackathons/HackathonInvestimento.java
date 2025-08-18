/**
 * Sistema de Simulação de Investimentos
 *
 * Este programa permite que o usuário cadastre investimentos em:
 * - Poupança
 * - CDB
 * - Tesouro Direto
 *
 * O usuário informa seu saldo inicial e escolhe onde deseja investir.
 * O sistema valida se há saldo suficiente para cada operação e,
 * ao final, gera um relatório com o rendimento de cada aplicação
 * e o saldo restante.
 *
 * Autor: Henrique Gonçalves Mourão
 * Data: 05/08/2025
 */

package br.com.devsdoagi.Hackathons;
import java.util.Scanner;

public class HackathonInvestimento {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String nome;
            double saldo, poupanca = 0.005, cdb = 0.012, tesouroDireto = 0.008;
            double invesPoupanca = 0, invesCdb = 0, invesTesouro = 0;
            double poupancaFinal = 0, cdbFinal = 0, tesouroFinal = 0;
            int meses, numero, contador = 0;

            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();

            System.out.print("Digite seu saldo disponível: ");
            saldo = sc.nextDouble();

            while (true) {
                System.out.println("\n1 - Poupança\n2 - CDB\n3 - Tesouro Direto\n0 - Encerrar");
                System.out.print("Digite uma opção de investimento: ");
                numero = sc.nextInt();

                if (numero == 1) {
                    System.out.print("Digite o valor a investir: ");
                    double valor = sc.nextDouble();  // usa variável temporária
                    System.out.print("Digite o prazo em meses: ");
                    meses = sc.nextInt();

                    if (saldo >= valor) {
                        invesPoupanca = valor;
                        poupancaFinal = invesPoupanca * Math.pow((1 + poupanca), meses);
                        saldo -= invesPoupanca;
                        System.out.println("Seu investimento em Poupança foi registrado!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }

                } else if (numero == 2) {
                    System.out.print("Digite o valor a investir: ");
                    double valor = sc.nextDouble();
                    System.out.print("Digite o prazo em meses: ");
                    meses = sc.nextInt();

                    if (saldo >= valor) {
                        invesCdb = valor;
                        cdbFinal = invesCdb * Math.pow((1 + cdb), meses);
                        saldo -= invesCdb;
                        System.out.println("Seu investimento em CDB foi registrado!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }

                } else if (numero == 3) {
                    System.out.print("Digite o valor a investir: ");
                    double valor = sc.nextDouble();
                    System.out.print("Digite o prazo em meses: ");
                    meses = sc.nextInt();

                    if (saldo >= valor) {
                        invesTesouro = valor;
                        tesouroFinal = invesTesouro * Math.pow((1 + tesouroDireto), meses);
                        saldo -= invesTesouro;
                        System.out.println("Seu investimento em Tesouro Direto foi registrado!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }

                } else if (numero == 0) {
                    System.out.println("\n--- RELATÓRIO FINAL ---\n");

                    if (invesPoupanca > 0) {
                        contador++;
                        System.out.printf("Investimento %d: Poupança: R$ %.2f --> R$ %.2f%n",
                                contador, invesPoupanca, poupancaFinal);
                    }
                    if (invesCdb > 0) {
                        contador++;
                        System.out.printf("Investimento %d: CDB: R$ %.2f --> R$ %.2f%n",
                                contador, invesCdb, cdbFinal);
                    }
                    if (invesTesouro > 0) {
                        contador++;
                        System.out.printf("Investimento %d: Tesouro Direto: R$ %.2f --> R$ %.2f%n",
                                contador, invesTesouro, tesouroFinal);
                    }

                    System.out.printf("Saldo restante: R$ %.2f%n", saldo);
                    break;
                } else {
                    System.out.println("Opção inválida!");
                }
            }

            sc.close();
        }
    }


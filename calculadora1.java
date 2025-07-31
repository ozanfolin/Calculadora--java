
import java.util.Scanner;

public class calculadora1 {
    public static void main(String[] args) {
        double [] numeros = new double[3];
        int resposta; 
        int indice = 0;
        Scanner entrada = new Scanner(System.in);

        do { 
            System.out.println("(1) Digitar um numero\n(2) Continuar");
            System.out.print("Selecione: ");
            resposta = entrada.nextInt();
            System.out.println("");

            switch (resposta) {
                case 1:
                    if (indice < numeros.length) {
                        System.out.print("Digite um numero: ");
                        numeros [indice] = entrada.nextDouble();
                        System.out.println("");
                        indice++;
                    } else{
                        System.out.println("Já atingiu a quantidade máxima de números\nVolte para o menu e selecione continuar.\n");
                    }
                    break;

                case 2:
                    if (indice < 2) {
                        System.out.println("Nenhum valor registrado!\nVolte para o menu e selecione '(1) Digitar um numero'.\n");
                    } else {
                        int opcao = 0;
                        do { 
                            System.out.println("Operações: \n(1) Somar\n(2) Subtrair\n(3) Multiplicar\n(4) Dividir\n(5) Media\n(0) Sair");
                            System.out.print("Selecione: ");
                            opcao = entrada.nextInt();
                            System.out.println("");
                            
                            switch (opcao) {
                                case 1: //soma
                                    double soma = 0;
                                    for (int i = 0; i < indice; i++) {
                                        soma += numeros[i];
                                    }
                                    System.out.println("Resultado --> " + soma + "\n");
                                    break;
                                
                                case 2: //subtrair
                                    double subtracao = numeros[0];
                                    for (int i = 1; i < indice; i++) {
                                        subtracao -= numeros[i];
                                    }
                                    System.out.println("Resultado --> " + subtracao);
                                    break;

                                case 3: //multiplicar
                                    double multiplicar = 1;
                                        for (int i = 0; i < indice; i++) {
                                            multiplicar *= numeros[i];
                                        }
                                    System.out.println("Resultado --> " + multiplicar);
                                    break;

                                case 4: //divisão
                                    double divisao = numeros[0];
                                    boolean erro = false;

                                        for (int i = 1; i < indice; i++) {
                                            if (numeros[i] == 0) {
                                                System.out.println("Erro: número 0 detectado. Divisão impossível!");
                                                erro = true;
                                                break;
                                            }
                                            divisao /= numeros[i];

                                        }
                                        if (!erro) {
                                            System.out.println("Resultado --> " + divisao);
                                        }
                                        break;
                                case 5:
                                        double total = 0;
                                        for (int i = 0; i < indice; i++) {
                                            total += numeros[i];
                                        }
                                        double media = total / indice;
                                        System.out.println("Resultado --> " + media);
                                        break;
                                
                                case 0:
                                        System.out.println("Saindo do menu de operações...");
                                        break;

                            }
                        } while (opcao != 0);
                        System.exit(0);

                    }
                    break;

                default:
                    System.out.println("Opção invalida\n");
                    break;
            }
            
        } while (true);
    }
}

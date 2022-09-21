import java.util.Objects;
import java.util.Scanner;

public class QuizQuestions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pontos = 0;

        System.out.println("====== QUIZ DO NINO V.1.0 ======");
        System.out.println("1. Iniciar o jogo | 2. Regras | 3. Desenvolvedor | 4. Sair");
        int escolha = sc.nextInt();

        switch (escolha) { // Aqui o programa faz com o que o usuario escolha um caso de 1 a 4.
            case 1 -> {


                String restart;
                do {

                    System.out.println("===== Quiz do Nino V.1.0 =====");
                    System.out.println("Questão 1");
                    System.out.println("Quantos são 2 + 2 ?");
                    System.out.println("A - 2");
                    System.out.println("B - 1");
                    System.out.println("C - 4");
                    System.out.println("D - 8");
                    String resp1 = sc.next();

                    if (resp1.equals("c")) { // if usado para somar os pontos do usuario em uma variavel, para posteriormente printar a soma na tela.
                        pontos += 10;
                    }

                    System.out.println("Questão 2");
                    System.out.println("Quantos são 4 + 2 ?");
                    System.out.println("A - 2");
                    System.out.println("B - 1");
                    System.out.println("C - 6");
                    System.out.println("D - 8");
                    String resp2 = sc.next();

                    if (resp2.equals("c")) {
                        pontos += 10;
                    }

                    System.out.println("Questão 3");
                    System.out.println("Quantos são 8 + 2 ?");
                    System.out.println("A - 2");
                    System.out.println("B - 1");
                    System.out.println("C - 0");
                    System.out.println("D - 10");
                    String resp3 = sc.next();

                    if (resp3.equals("d")) {
                        pontos += 10;
                    }

                    System.out.println("Sua pontuação total: " + pontos);
                    System.out.print("Deseja jogar novamente ? (s/n): ");
                    restart = sc.next();

                } while (restart.equals("s"));

            }
            case 2 -> {
                System.out.println("Regras do jogo");
                System.out.println("É um quiz de 3 questões com cada questão valendo 10pts");
                System.out.println("Voce tera alternativas de [a] a [d] e terá que escolher uma dentre elas para prosseguir no jogo");
                System.out.println("No término do quiz, voce tera uma visão da sua pontuação total");
            }
            case 3 -> {
                System.out.println("Meu nome é Gabriel, sou o desenvolvedor desse Quiz, tenho como objetivo colocar em prático o que estou aprendendo em programação. Por isso, proponho esse quiz simples de estruturas if else e switch case.");
                System.out.println("Version 1.0.0");
            }
            case 4 -> System.out.println("Até a próxima");
            default -> System.out.println("Insira um valor válido para jogar");
        }
        System.out.println("Obrigado por jogar :)");
        sc.close();
    }
}
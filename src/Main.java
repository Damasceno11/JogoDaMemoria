import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Lista de palavras para sortear
        ArrayList<String> bancoDePalavras = new ArrayList<>(
                Arrays.asList("café", "janela", "carro", "livro", "chave",
                        "pintura", "telefone", "porta", "cachorro", "viagem",
                        "computador", "teclado", "mochila", "planta", "cadeira", "comida", "fernanda")
        );

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Iniciar o jogo da memoria");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    // Embaralhar e pegar 5 palavras aleatórias
                    Collections.shuffle(bancoDePalavras);
                    ArrayList<String> palavrasSorteadas = new ArrayList<>(bancoDePalavras.subList(0,5));

                    //Mostrar palavras por 5seg
                    System.out.println("\nMemorize estas palavras: ");
                    for (String palavra : palavrasSorteadas) {
                        System.out.println(palavra + "  ");
                    }

                    Thread.sleep(5000);

                    // Limpar a tela com quebra de linhas
                    for (int i = 0; i < 50; i++) {
                        System.out.println();
                    }

                    // Pedir palavras lembradas
                    ArrayList<String> digitadas = new ArrayList<>();
                    System.out.println("Digite as palavras que vc lembra. (Uma por linha):");
                    for (int i = 0; i < 5; i++){
                        System.out.println("Palavra " + (i + 1) + ": ");
                        String entrada = scanner.nextLine().toLowerCase();
                        digitadas.add(entrada);
                    }

                    // Verificar acertos
                    int acertos = 0;
                    for (String palavra : digitadas) {
                        if (palavrasSorteadas.contains(palavra)){
                            acertos++;
                        }
                    }

                    System.out.println("\nVocê acertou " + acertos + " palavra(s)!");
                    System.out.println("Palavras sorteadas eram: " + palavrasSorteadas);
                    break;

                default:
                    System.out.println("Opção invalida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
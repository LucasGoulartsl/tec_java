import java.util.ArrayList;
import java.util.Scanner;

public class listaContatos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nome = new ArrayList<>();

        for (int i = 0; i <=2; i++) {
            System.out.println("Digite um contato");
            String contato = sc.next();
            nome.add(contato);
        }

        for (int x = 1; x <= 1; x++) {
            System.out.println("Deseja remover algum contato?  True = (Sim) ou False = (Não)");
            boolean SimouNao = sc.nextBoolean();

            if (SimouNao == true) {
                System.out.println("Quais nomes deseja tirar?");
                String remove = sc.next();
                nome.remove(remove);
                System.out.println("Nome: " + remove + " foi removido.");
                System.out.println("Sua lista atualizada " + nome);
            }
            else {
                System.out.println("Sua lista não foi atualizada");
                break;
            }
        }

    }
}
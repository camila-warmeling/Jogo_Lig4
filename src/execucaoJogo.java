import java.util.Scanner;

public class execucaoJogo {
    public Scanner teclado = new Scanner(System.in);
    char corUsuario, corComputador;

    private void escolherCorPecaUsuarioComputador() {
        System.out.println("Cores disponíveis para jogar:");
        System.out.println("V - Vermelho");
        System.out.println("A - Azul");

        System.out.println("Qual cor deseja?");
        corUsuario = teclado.next().toUpperCase().charAt(0);
        if (corUsuario == 'V') {
            corComputador = 'A';
        } else {
            corComputador = 'V';
        }
    }

    private void sortearJogadorQueComeca(){
        int num;
        System.out.println("O jogador que começa jogando é:");
        num = (int)(Math.random());
        if(num == 0){
            System.out.println("Usuário");
            iniciarJogadaUsuario();
        }else(num == 1){
            System.out.println("Computador");
            sortearColunaParaJogadaComputador();
        }
    }

    public static void main(String[] args) {

    }

}

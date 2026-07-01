public class Tabuleiro {
    private char[][] tabuleiro = new char[6][7]; //[linha][coluna]
    private int linhaVazia, colunaVazia, quantPecasPosicionadas = 0;
    
    public Tabuleiro(){
        zerarTabuleiro();
    }

    private void zerarTabuleiro(){
        for(int linha=0; linha<6; linha++){
            for(int coluna=0; coluna<7; coluna++){
                tabuleiro[linha][coluna] = 'B';
            }
        }
    }

    public void mostrarTabuleiro(){
        int numColuna = 0;
        for(int linha=-1; linha<6; linha++){
            for(int coluna=0; coluna<7; coluna++){
                if(linha != -1){
                    System.out.printf(tabuleiro[linha][coluna] + " ");    
                }else{
                    System.out.printf(numColuna + " ");
                    numColuna ++;
                }
            }
            System.out.println();
        }
    }

    public boolean verificarColunaExiste(int coluna){
        boolean colunaExiste = coluna >=0 && coluna <=6; //retorna verdadeiro ou falso
        return colunaExiste;
    }
        
    public boolean verificarEspacoDisponivelNaColuna(int coluna){        
        boolean colunaDisponivel = false;
        
        for(int linha=5; linha>=0; linha--){
            colunaDisponivel = tabuleiro[linha][coluna] == 'B';
            if(colunaDisponivel){//quando encontra a coluna disponível acaba o for
                linhaVazia = linha;
                colunaVazia = coluna;
                break;
            }
        }
        return colunaDisponivel;
    }

    public void posicionarPecaNoTabuleiro(char corPosicionar){
        quantPecasPosicionadas ++;
        tabuleiro[linhaVazia][colunaVazia] = corPosicionar;
    }

    public String verificarVitoria(int coluna, boolean jogadorAtual){
        String vencedor = "null";
        boolean vertical = false, vitoria;
        char corJogador = tabuleiro[linhaVazia][coluna];

        if(linhaVazia <= 2){
            vertical = verificarVitoriaVertical(coluna, corJogador);
        }

        if(vertical){
            vitoria = true;
        }else if(verificarVitoriaHorizontal(coluna, corJogador)){
            vitoria = true;
        }else if(verificarVitoriaDiagonalDireta(coluna, corJogador)){
            vitoria = true;
        }else if(verificarVitoriaDiagonalEsquerda(coluna, corJogador)){
            vitoria = true;
        }else{
            vitoria = false;
        }

        if(vitoria){
            if(jogadorAtual){
                vencedor = "Usuário";
            }else{
                vencedor = "Computador";
            }
        }
        return vencedor;
    }

    private boolean verificarVitoriaVertical(int coluna, char cor){
        int contadorPontos = 1;

        for(int linha = linhaVazia+1; linha < 6; linha ++){
            if(tabuleiro[linha][coluna] == cor){
                contadorPontos ++;
            }else{//peça de baixo pertence ao adversário
                contadorPontos = 0;
                break;
            }

            if(contadorPontos == 4){
            return true;
            }
        }
        return false;
    }

    private boolean verificarVitoriaHorizontal(int coluna, char cor){
        int contadorPontos = 0;
        int posicoes = 0; //quantidade de posições que devem ser subtraídas.
        if(coluna >= 3){
            posicoes = 3;
        }else{
            posicoes = coluna;
        }

        //não vai testar além da sexta coluna nem testar desnessariamente colunas a mais.
        for(int colunaAtual=coluna-posicoes; colunaAtual<coluna+4 && colunaAtual<7 ; colunaAtual ++){
            if(tabuleiro[linhaVazia][colunaAtual] == cor){
                contadorPontos ++;
            }else{
                contadorPontos = 0;
            }

            if(contadorPontos == 4){
                return true;
            }
        }

        return false;
    }

    private boolean verificarVitoriaDiagonalDireta(int coluna, char cor){
        int contadorPontos = 0;
        int linhaInicial = linhaVazia;
        int colunaInicial = coluna;
        int contPecasParaTras = 0;

        //linha e coluna do ponto mais baixo possível para fazer uma diagonal com a peça selecionada por último.
        while(linhaInicial < 5 && colunaInicial > 0 && contPecasParaTras < 3){
            colunaInicial --;
            linhaInicial ++;
            contPecasParaTras ++;
        }

        for(int linha=linhaInicial; linha >= 0 && colunaInicial<7; linha--){
            if(tabuleiro[linha][colunaInicial] == cor){
                contadorPontos ++;
            }else{  
                contadorPontos = 0;
            }
            if(contadorPontos == 4){
                return true;
            }
            colunaInicial ++;
        }
        return false;
    }

    private boolean verificarVitoriaDiagonalEsquerda(int coluna, char cor){
        int contadorPontos = 0;
       int linhaInicial = linhaVazia;
       int colunaInicial = coluna;
       int contPecasDiagEsq = 0;

        while(linhaInicial < 5 && colunaInicial < 6 && contPecasDiagEsq < 3){
            colunaInicial ++;
            linhaInicial ++;
            contPecasDiagEsq ++;
        }

        for(int linha=linhaInicial; linha >= 0 && colunaInicial>0; linha--){
            if(tabuleiro[linha][colunaInicial] == cor){
                contadorPontos ++;
            }else{  
                contadorPontos = 0;
            }
            if(contadorPontos == 4){
                return true;
            }
            colunaInicial --;
        }
        return false;         
    }

    public boolean verificacaoEmpate(){
        boolean empate = (quantPecasPosicionadas == 42); 
        return empate;
    }
}

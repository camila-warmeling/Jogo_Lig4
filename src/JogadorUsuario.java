public class JogadorUsuario {
    private char cor;

    public JogadorUsuario(char corNaoEscolhida){
        this.cor = corNaoEscolhida;
    }
    
    public char obterCor(){
        return this.cor;
    }
}

# 🎮 Trabalho Prático: Jogo Liga-4 (Java)

Repositório destinado ao desenvolvimento do jogo **Liga-4**, solicitado para a disciplina de Programação. O projeto deve ser desenvolvido e apresentado utilizando a IDE **VS Code**.

---

## 📋 Regras de Desenvolvimento (Restrições Críticas)

> ⚠️ *Atenção: O não cumprimento de qualquer um dos pontos abaixo resultará no desconto de **0,5 pontos por item**.*

* **Único Import Permitido:** Apenas `java.util.Scanner` pode ser importado.
* **Leitura de Dados:** O construtor da classe deve declarar a *única* ocorrência do objeto `teclado` da classe `Scanner`.
* **Método `main`:** Deve apenas instanciar o construtor da classe principal.
* **Estrutura de Dados:** O construtor deve declarar a matriz do tipo `char` que representa o tabuleiro.
* **Dimensões do Tabuleiro:** A matriz do tabuleiro deve ter obrigatoriamente o tamanho **6 linhas por 7 colunas**.
* **Modo de Jogo:** Deve ser jogado entre **um jogador humano e o computador**.
* **Modularização:** Devem ser implementados métodos (à sua escolha em termos de retorno e parâmetros) que serão chamados dentro do construtor.
* **Atributos:** **Não poderá** declarar atributos de classe (variáveis globais fora dos métodos/construtor).

---

## ⚙️ Requisitos Funcionais (RF)

O sistema deve seguir fielmente os seguintes requisitos para a pontuação:

- [ ] **RF01 (0,5 pts):** O tabuleiro deve começar com todas as casas em branco, representadas pelo caractere `"B"`.
- [ ] **RF02 (0,5 pts):** O jogador deve escolher a sua cor/peça entre **V** (Vermelho) ou **A** (Azul).
- [ ] **RF03 (1,0 pt):** Na sua vez, o jogador deve informar a coluna para jogar. A peça deve cair na primeira linha disponível dessa coluna (considerando a linha mais abaixo possível).
- [ ] **RF04 (1,0 pt):** O computador deve jogar de forma aleatória ou inteligente (em colunas válidas e livres).
- [ ] **RF05 (1,0 pt):** O programa deve exibir o tabuleiro atualizado após cada jogada.
- [ ] **RF06 (1,0 pt):** O programa deve validar as jogadas. Não permitir jogar numa coluna cheia ou inexistente (pedir nova posição até ser válida).
- [ ] **RF07 (2,0 pts):** O programa deve verificar após cada jogada se houve um vencedor (4 peças em linha na horizontal, vertical, diagonal direita ou diagonal esquerda).
- [ ] **RF08 (1,0 pt):** O programa deve verificar se houve empate (tabuleiro cheio sem vencedor).
- [ ] **RF09 (1,5 pts):** Ao finalizar o jogo (com vitória ou empate), o programa deve perguntar se os jogadores desejam jogar novamente. Se sim, reiniciar o tabuleiro mantendo as regras.

---

## 📝 Regras do Jogo Original
O Liga-4 é um jogo de estratégia em grade vertical (6x7). O objetivo é ser o primeiro a formar uma linha contínua de **quatro discos da mesma cor/letra**, seja na horizontal, vertical ou diagonal, enquanto bloqueia os movimentos do adversário.

---

## 📅 Informações de Entrega e Avaliação

* **Formato:** Postar os ficheiros fontes (`.java`) no **AVA3** antes da apresentação.
* **Execução:** O código **não pode conter erros de compilação/execução** (use comentários para isolar possíveis erros se necessário).
* **Defesa/Apresentação:**
  * O aviso para a apresentação deve ser feito assim que a equipa terminar.
  * O código deverá ser mostrado e executado na IDE (VS Code).
  * O professor poderá pedir para editar ou rodar partes do código no momento.
  * O trabalho pode ser feito em equipa, mas a **avaliação é individual** (as notas dos integrantes podem ser diferentes).
  * Uma vez apresentado, o trabalho **não poderá ser reapresentado**.

---

## 🚀 Como Executar no VS Code

1. Certifique-se de que tem o **Java Extension Pack** instalado no VS Code.
2. Abra a pasta do projeto.
3. Clique em **Run** no método `main` ou utilize o terminal:
   ```bash
   javac NomeDoArquivo.java
   java NomeDoArquivo
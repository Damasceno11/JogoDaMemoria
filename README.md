# 🧠 Jogo da Memória com Palavras - Java com Menu Interativo

Este projeto é um jogo simples em Java onde o usuário deve memorizar uma lista de palavras mostradas na tela por 5 segundos e depois tentar digitar corretamente as que lembrar. O programa verifica e exibe quantas palavras foram lembradas corretamente. A cada execução, as palavras são sorteadas aleatoriamente a partir de um banco.

---

## 🎮 Funcionalidades

- Exibe 5 palavras aleatórias por 5 segundos usando `Thread.sleep()`
- “Limpa” a tela para esconder as palavras
- Usuário digita as 5 palavras que lembra
- Conta e mostra quantas palavras ele acertou
- Menu interativo com:
  - `1 - Iniciar o jogo`
  - `0 - Sair`

---

## 🛠️ Tecnologias Utilizadas

- Java 8+
- `ArrayList`, `Scanner`, `Collections.shuffle()`, `Arrays.asList()`
- IDE recomendada: IntelliJ IDEA ou VS Code

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/Damasceno11/SistemaProdutos.git
````

2. Abra o projeto em sua IDE Java

3. Compile e execute o arquivo `JogoDaMemoria.java`

---

## 📷 Exemplo de Execução

```
--- MENU ---
1 - Iniciar o jogo da memória
0 - Sair
Escolha uma opção: 1

Memorize estas palavras:
porta  planta  cachorro  mochila  livro

(aguarda 5 segundos e "limpa" a tela)

Digite as palavras que você lembra (uma por linha):
Palavra 1: cachorro
Palavra 2: café
Palavra 3: livro
Palavra 4: planta
Palavra 5: janela

Você acertou 3 palavra(s)!
Palavras sorteadas eram: [porta, planta, cachorro, mochila, livro]
```

---

## 👨‍💻 Autor

**Pedro Paulo Damasceno Muniz**
Estudante de Análise e Desenvolvimento de Sistemas – Uniasselvi – Blumenau
Participante do treinamento intensivo **+Devs2Blu** – Blumenau
GitHub: [@Damasceno11](https://github.com/Damasceno11)


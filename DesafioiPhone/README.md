# 📱 Desafio POO - Modelagem iPhone

Projeto de modelagem e implementação de um componente iPhone utilizando Programação Orientada a Objetos (POO) em Java, desenvolvido como parte do **Santander Bootcamp 2023 - Fullstack Java+Angular** da [Digital Innovation One](https://www.dio.me/).

---

## 🎯 Sobre o Desafio

Este desafio consiste em modelar e implementar a representação UML do componente iPhone, abrangendo suas funcionalidades como **Reprodutor Musical**, **Aparelho Telefônico** e **Navegador na Internet**, conforme apresentado no lançamento histórico do iPhone em 2007.

**Referência:** [Lançamento iPhone 2007 (Minutos 00:15 até 00:55)](https://www.youtube.com/watch?v=9ou608QQRq8)

---

## 🚀 Funcionalidades Implementadas

### 1️⃣ Reprodutor Musical
- `tocar()` - Inicia a reprodução da música selecionada
- `pausar()` - Pausa a música em reprodução
- `selecionarMusica(String musica)` - Seleciona uma música para reprodução

### 2️⃣ Aparelho Telefônico
- `ligar(String numero)` - Realiza uma ligação telefônica
- `atender()` - Atende uma chamada recebida
- `iniciarCorreioVoz()` - Inicia o sistema de correio de voz

### 3️⃣ Navegador na Internet
- `exibirPagina(String url)` - Exibe uma página web
- `adicionarNovaAba()` - Adiciona uma nova aba ao navegador
- `atualizarPagina()` - Atualiza a página atual

---

## 📊 Diagrama UML

classDiagram
class ReprodutorMusical {
<<interface>>
+tocar()
+pausar()
+selecionarMusica(String musica)
}

class AparelhoTelefonico {
    <<interface>>
    +ligar(String numero)
    +atender()
    +iniciarCorreioVoz()
}

class NavegadorInternet {
    <<interface>>
    +exibirPagina(String url)
    +adicionarNovaAba()
    +atualizarPagina()
}

class iPhone {
    -String modelo
    -String musicaAtual
    -String paginaAtual
    -boolean tocando
    +iPhone(String modelo)
    +getModelo() String
    +tocar()
    +pausar()
    +selecionarMusica(String)
    +ligar(String)
    +atender()
    +iniciarCorreioVoz()
    +exibirPagina(String)
    +adicionarNovaAba()
    +atualizarPagina()
}

ReprodutorMusical <|.. iPhone
AparelhoTelefonico <|.. iPhone
NavegadorInternet <|.. iPhone

## 🛠️ Tecnologias Utilizadas

- **Java 17+** (ou versão compatível)
- **Paradigma:** Programação Orientada a Objetos (POO)
- **Conceitos:** Interfaces, Implementação Múltipla, Encapsulamento
- **Diagramação:** UML (Unified Modeling Language)

---

## 💻 Como Executar o Projeto

### Pré-requisitos

- JDK 17 ou superior instalado
- Terminal/CMD ou IDE Java (Eclipse, IntelliJ IDEA, VS Code)

### Passo 1: Clone o Repositório

git clone https://github.com/AlineMirian/DesafioiPhone.git
cd DesafioiPhone/src


### Passo 2: Compilar o Projeto

**Windows (PowerShell):**
javac interfaces/ReprodutorMusical.java interfaces/AparelhoTelefonico.java interfaces/NavegadorInternet.java
javac modelo/iPhone.java
javac Main.java


### Passo 3: Executar

java Main

## 📋 Exemplo de Saída

==================================================
TESTANDO: iPhone 15 Pro
=== REPRODUTOR MUSICAL ===
♪ Musica selecionada: Bohemian Rhapsody - Queen

Reproduzindo musica: Bohemian Rhapsody - Queen
|| Musica pausada

=== APARELHO TELEFONICO ===
Ligando para: (11) 98765-4321...
Chamada em andamento...
Atendendo chamada...
Alo!
Iniciando correio de voz...
Grave sua mensagem apos o sinal.

=== NAVEGADOR INTERNET ===
Exibindo pagina: https://www.apple.com
Pagina carregada com sucesso!
[+] Nova aba adicionada
Agora voce tem multiplas abas abertas
Atualizando pagina: https://www.apple.com
Pagina atualizada!

==================================================
Todos os testes concluidos com sucesso!


---

## 🎓 Conceitos de POO Aplicados

| Conceito | Implementação | Descrição |
|----------|---------------|-----------|
| **Abstração** | Interfaces (ReprodutorMusical, AparelhoTelefonico, NavegadorInternet) | Define contratos de comportamento sem implementação |
| **Encapsulamento** | Atributos privados (`private`) com métodos públicos (`public`) | Protege os dados internos da classe |
| **Herança de Interface** | `implements` | iPhone herda comportamentos de múltiplas interfaces |
| **Polimorfismo** | Implementação múltipla | iPhone pode ser tratado como qualquer uma das interfaces |
| **Implementação Múltipla** | `implements Interface1, Interface2, Interface3` | Uma classe implementando várias interfaces |



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


---

## 📦 Estrutura do Projeto

DesafioiPhone/
│
├── src/
│ ├── interfaces/
│ │ ├── ReprodutorMusical.java # Interface para funções de música
│ │ ├── AparelhoTelefonico.java # Interface para funções telefônicas
│ │ └── NavegadorInternet.java # Interface para navegação web
│ │
│ ├── modelo/
│ │ └── iPhone.java # Classe que implementa todas as interfaces
│ │
│ └── Main.java # Classe principal para testes
│
├── README.md # Documentação do projeto
└── diagrama-uml.md # Diagrama UML em Mermaid


---

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


---

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

---

## 🧩 Estrutura das Classes

### Interfaces (Contratos)

**ReprodutorMusical.java**
public interface ReprodutorMusical {
void tocar();
void pausar();
void selecionarMusica(String musica);
}


**AparelhoTelefonico.java**
public interface AparelhoTelefonico {
void ligar(String numero);
void atender();
void iniciarCorreioVoz();
}


**NavegadorInternet.java**
public interface NavegadorInternet {
void exibirPagina(String url);
void adicionarNovaAba();
void atualizarPagina();
}


### Classe Concreta

**iPhone.java** - Implementa todas as três interfaces:
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
// Implementação de todos os métodos das interfaces
}


---

## 🧪 Testes Realizados

- ✅ Teste de seleção e reprodução de música
- ✅ Teste de pausa de música
- ✅ Teste de ligação telefônica
- ✅ Teste de atendimento de chamada
- ✅ Teste de correio de voz
- ✅ Teste de navegação web
- ✅ Teste de adição de nova aba
- ✅ Teste de atualização de página
- ✅ Validação de estados internos (música tocando, página atual)

---

## 🤝 Contribuindo

Contribuições são bem-vindas! Para contribuir:

1. Faça um **fork** do projeto
2. Crie uma **branch** para sua feature (`git checkout -b feature/MinhaFeature`)
3. **Commit** suas mudanças (`git commit -m 'Adiciona MinhaFeature'`)
4. **Push** para a branch (`git push origin feature/MinhaFeature`)
5. Abra um **Pull Request**

---

## 📜 Licença

Este projeto foi desenvolvido para fins educacionais como parte do **Santander Bootcamp 2023 - Fullstack Java+Angular**.

---

## 👨‍💻 Autor

**Aline Mirian**

- GitHub: [@AlineMirian](https://github.com/AlineMirian)
- LinkedIn: [Seu LinkedIn Aqui]
- Bootcamp: Santander Bootcamp 2023 - DIO

---

## 🎓 Bootcamp

**Santander Bootcamp 2023 - Fullstack Java+Angular**

- 🏢 Organização: [Digital Innovation One (DIO)](https://www.dio.me/)
- 🏦 Patrocinador: Santander
- 📚 Módulo: Programação Orientada a Objetos (POO)
- 🎯 Desafio: Modelagem e Diagramação de um Componente iPhone

---

## 📚 Referências

- [Documentação Java - Interfaces](https://docs.oracle.com/javase/tutorial/java/concepts/interface.html)
- [Lançamento do iPhone 2007 - Steve Jobs](https://www.youtube.com/watch?v=9ou608QQRq8)
- [Digital Innovation One - Trilha Java Básico](https://github.com/digitalinnovationone/trilha-java-basico)
- [UML Class Diagrams](https://www.uml-diagrams.org/class-diagrams-overview.html)

---

<div align="center">

**Desenvolvido com ☕ e dedicação durante o Santander Bootcamp 2023**

⭐ Se este projeto foi útil, considere dar uma estrela!

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![POO](https://img.shields.io/badge/POO-Concepts-blue?style=for-the-badge)
![DIO](https://img.shields.io/badge/DIO-Bootcamp-orange?style=for-the-badge)

</div>



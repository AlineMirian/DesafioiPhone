# Diagrama UML - iPhone

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
}

ReprodutorMusical <|.. iPhone
AparelhoTelefonico <|.. iPhone
NavegadorInternet <|.. iPhone

undefined
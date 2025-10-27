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
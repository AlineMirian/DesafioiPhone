package modelo;

import interfaces.ReprodutorMusical;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    // Atributos
    private String modelo;
    private String musicaAtual;
    private String paginaAtual;
    private boolean tocando;
    
    // Construtor
    public iPhone(String modelo) {
        this.modelo = modelo;
        this.tocando = false;
        this.musicaAtual = "";
        this.paginaAtual = "";
    }
    
    // ========== IMPLEMENTAÇÃO: ReprodutorMusical ==========
    
    @Override
    public void tocar() {
        if (!musicaAtual.isEmpty()) {
            tocando = true;
            System.out.println(">> Reproduzindo musica: " + musicaAtual);
        } else {
            System.out.println("AVISO: Nenhuma musica selecionada!");
        }
    }
    
    @Override
    public void pausar() {
        if (tocando) {
            tocando = false;
            System.out.println("|| Musica pausada");
        } else {
            System.out.println("AVISO: Nenhuma musica tocando!");
        }
    }
    
    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("♪ Musica selecionada: " + musica);
    }
    
    // ========== IMPLEMENTAÇÃO: AparelhoTelefonico ==========
    
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero + "...");
        System.out.println("Chamada em andamento...");
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
        System.out.println("Alo!");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
        System.out.println("Grave sua mensagem apos o sinal.");
    }
    
    // ========== IMPLEMENTAÇÃO: NavegadorInternet ==========
    
    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("Exibindo pagina: " + url);
        System.out.println("Pagina carregada com sucesso!");
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("[+] Nova aba adicionada");
        System.out.println("Agora voce tem multiplas abas abertas");
    }
    
    @Override
    public void atualizarPagina() {
        if (!paginaAtual.isEmpty()) {
            System.out.println("Atualizando pagina: " + paginaAtual);
            System.out.println("Pagina atualizada!");
        } else {
            System.out.println("AVISO: Nenhuma pagina aberta!");
        }
    }
    
    // Getters
    public String getModelo() {
        return modelo;
    }
}

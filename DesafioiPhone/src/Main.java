import modelo.iPhone;

public class Main {
    public static void main(String[] args) {
        // Criar um iPhone
        iPhone meuIPhone = new iPhone("iPhone 15 Pro");
        
        System.out.println("==================================================");
        System.out.println("TESTANDO: " + meuIPhone.getModelo());
        System.out.println("==================================================");
        
        // ========== TESTE: Reprodutor Musical ==========
        System.out.println("\n=== REPRODUTOR MUSICAL ===");
        meuIPhone.selecionarMusica("Bohemian Rhapsody - Queen");
        meuIPhone.tocar();
        meuIPhone.pausar();
        
        // ========== TESTE: Aparelho Telefônico ==========
        System.out.println("\n=== APARELHO TELEFONICO ===");
        meuIPhone.ligar("(11) 98765-4321");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        
        // ========== TESTE: Navegador Internet ==========
        System.out.println("\n=== NAVEGADOR INTERNET ===");
        meuIPhone.exibirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
        
        System.out.println("\n==================================================");
        System.out.println("Todos os testes concluidos com sucesso!");
        System.out.println("==================================================");
    }
}

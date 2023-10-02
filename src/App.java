import java.util.Optional;

public class App {
    public static void main(String[] args) {
        // Criar um Optional com um valor presente
        Optional<String> optionalNome = Optional.of("Alice");

        // Verificar se o valor está presente e imprimi-lo
        if (optionalNome.isPresent()) {
            System.out.println("Nome: " + optionalNome.get());
        }

        // Criar um Optional vazio
        Optional<String> optionalVazio = Optional.empty();

        // Usar orElse para fornecer um valor padrão se ausente
        String nomePadrao = optionalVazio.orElse("Desconhecido");
        System.out.println("Nome: " + nomePadrao);
    }
}

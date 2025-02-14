class Pessoa {
    String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }

    void exibirNome() {
        System.out.printf("Nome: %s", nome);
    }
}

// Os construtores servem para definir o estado inicial de um objeto no momento da criação.
// Ele obriga a insersão de dados específicos

public class Constructor {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gabriel");
        p1.exibirNome();
    }
}
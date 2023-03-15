package revisaopoo;

class Paciente extends Pessoa {
    public Paciente(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    @Override
    public String getInformacao() {
        return String.format("Paciente [Nome: %s, email: %s, telefone: %s]", getNome(), getEmail(), getTelefone());
    }
}

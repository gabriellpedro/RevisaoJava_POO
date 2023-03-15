package revisaopoo;

import java.time.LocalDate;

public class Programador extends Funcionario {

    private String gitHub;

    public Programador(String nome, 
            String email, 
            String telefone, 
            Long matricula, 
            LocalDate dataAdmissao, 
            String gitHub) {
        super(nome, email, telefone, matricula, dataAdmissao);
        this.gitHub = gitHub;
    }

    public String getGitHub() {
        return gitHub;
    }

    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }   


    @Override
    public String getInformacao() {
        return String.format("Nome: %s\nE-mail: %s\nTelefone: %s\nMatricula: %s\nDataAdmissao: %s\nGitHub: %s\n\n", 
                getNome(), 
                getEmail(), 
                getTelefone(),
                getMatricula(),
                getDataAdmissao(),
                getGitHub()
        ); 
    }    
        
    
}
    


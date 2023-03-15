package revisaopoo;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa{

    private Long matricula;
    private LocalDate dataAdmissao;
    
    public Funcionario(String nome, String email, String telefone, Long matricula, LocalDate dataAdmissao){
        super(nome, email, telefone);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }  

    
}

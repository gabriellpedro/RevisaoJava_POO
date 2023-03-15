
package revisaopoo;

import java.time.LocalDate;
import java.util.Random;


public class Pediatra extends Medico implements ContratoVacina {
    
    private String hospital;
    
    public Pediatra(String nome, String email, String telefone, Long matricula, LocalDate dataAdmissao, Integer crm, String hospital) {
        super(nome, email, telefone, matricula, dataAdmissao, crm);
        this.hospital = hospital;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    @Override
    public String getInformacao() {
        return String.format("Nome: %s\nE-mail: %s\nTelefone: %s\nMatricula: %s\nDataAdmissao: %s\nCRM: %s\nHospital: %s\n\n", 
                getNome(), 
                getEmail(), 
                getTelefone(),
                getMatricula(),
                getDataAdmissao(),
                getHospital()
        ); 
    }    

    @Override
    public void executarProcedimento(Paciente paciente) throws Exception {
        System.out.printf("Atendendo %s, no hospital: %s",paciente.getNome(), getHospital());
        System.out.println("\nMedindo a temperatura...");
        Thread.sleep(3000L);
        System.out.printf("Temperatura %s graus\n", new Random().nextInt(33,40));
        vacinar(paciente);
        Thread.sleep(3000L);
        System.out.printf("Finalizou o atendimento de %s", paciente.getNome());
        System.out.println("\n=)");
    }

    @Override
    public void vacinar(Paciente paciente) {
        System.out.printf("Aplicada a vacina em %s",paciente.getNome());
        System.out.println("\n");
    }
    
    
    
    
}

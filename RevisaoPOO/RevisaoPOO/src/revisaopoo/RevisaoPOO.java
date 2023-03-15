package revisaopoo;

import java.time.LocalDate;

public class RevisaoPOO {

    public static void main(String[] args) throws Exception {
        
        Pediatra pediatra = new Pediatra("Gabriel", "gabriel@gmail", "999-888", 122L, LocalDate.of(2016, 11, 11), 154426,"Sta. Casa");
        Paciente paciente = new Paciente("Thaina", "tata@gmail.com", "8888-9999");
        
        Programador programador = new Programador ("Gabriel", "Teste@", "1589-9898", 2020L, LocalDate.of(2015, 11, 20), "Ga101");
        
        //System.out.println(programador.getInformacao());
        
        pediatra.executarProcedimento(paciente);
    }    
}

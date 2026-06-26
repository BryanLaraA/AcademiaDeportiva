package participantes;
import persona.Persona;
import java.time.LocalDate;
import disciplinas.Disciplina;

public class Participantes extends Persona {
    
    
    private Disciplina diciplina;

    
    public Disciplina getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(Disciplina diciplina) {
        this.diciplina = diciplina;
    }
    
    public Participantes(int identificacion, String nombrecompleto, LocalDate fechadenacimiento, int telefono) {
        super(identificacion, nombrecompleto, fechadenacimiento, telefono);
    }

    @Override
    public String toString() {
        return "Participantes{" + "diciplina=" + diciplina + '}';
    }
    
    
    
}

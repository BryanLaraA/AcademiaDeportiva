package participantes;
import persona.Persona;
import java.time.LocalDate;
import disciplinas.Disciplina;

public class Participantes extends Persona {
    
    private int identificacion;
    private String nombrecompleto;
    private LocalDate fechadenacimiento;
    private int telefono;
    private Disciplina diciplina;

    public int getIdentificacion() {
        return identificacion;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public LocalDate getFechadenacimiento() {
        return fechadenacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public Disciplina getDiciplina() {
        return diciplina;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDiciplina(Disciplina diciplina) {
        this.diciplina = diciplina;
    }
    
    public Participantes(int identificacion, String nombrecompleto, LocalDate fechadenacimiento, int telefono) {
        super(identificacion, nombrecompleto, fechadenacimiento, telefono);
    }
    
}

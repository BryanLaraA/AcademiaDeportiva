package participantes;
import persona.Persona;
import java.time.LocalDate;

public class Participantes extends Persona {
    
    private int identificacion;
    private String nombrecompleto;
    private LocalDate fechadenacimiento;
    private int telefono;
    private Diciplina diciplina;

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

    public Diciplina getDiciplina() {
        return diciplina;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDiciplina(Diciplina diciplina) {
        this.diciplina = diciplina;
    }
    
    
    
}


package persona;
import java.time.LocalDate;


public class Persona {
    
    private int identificacion;
    private String nombrecompleto;
    private LocalDate fechadenacimiento;
    private int telefono;

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

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
     
    
}

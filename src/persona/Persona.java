
package persona;
import java.time.LocalDate;


public abstract class Persona {
    
    protected int identificacion;
    protected String nombrecompleto;
    protected LocalDate fechadenacimiento;
    protected int telefono;

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

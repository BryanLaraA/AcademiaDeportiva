
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

    public Persona(int identificacion, String nombrecompleto, LocalDate fechadenacimiento, int telefono) {
        this.identificacion = identificacion;
        this.nombrecompleto = nombrecompleto;
        this.fechadenacimiento = fechadenacimiento;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "identificacion=" 
                + identificacion + ", nombrecompleto=" 
                + nombrecompleto + ", fechadenacimiento=" 
                + fechadenacimiento + ", telefono=" 
                + telefono + '}';
    }
     
    
    
}

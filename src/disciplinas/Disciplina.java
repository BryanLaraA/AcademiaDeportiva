/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disciplinas;

<<<<<<< HEAD
import participantes.Participantes;
=======
import java.time.LocalDate;
import participantes.Participantes;

>>>>>>> 4884ef2 (Se agrega la clase completa de disciplina)


/**
 *
 * @author Student
 */
public class Disciplina extends Participantes {
    private Categoria categoria;
    private int capMaxima;

    public double getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setNombre(double nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Disciplina(Categoria categoria, int capMaxima) {
        this.categoria = categoria;
        this.capMaxima = capMaxima;
    }

    
    
    private Categoria categoria;
    private int capMax; 


    public Categoria getCategoria() {
        return categoria;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    
    
    public Disciplina(int identificacion, String nombrecompleto, LocalDate fechadenacimiento, int telefono) {
        super(identificacion, nombrecompleto, fechadenacimiento, telefono);
    }

    @Override
    public String toString() {
        return "Disciplina{" + "categoria=" + categoria + ", capMax=" + capMax + '}';
    }
    
   

   
    
}

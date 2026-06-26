/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disciplinas;

import java.time.LocalDate;
import participantes.Participantes;



/**
 *
 * @author Student
 */
public class Disciplina extends Participantes {
    
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

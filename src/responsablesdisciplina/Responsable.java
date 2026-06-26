/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsablesdisciplina;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Responsable {
    private String especialidad;
    private int experiencia;

    public Responsable(String especialidad, int experiencia,int identificacion, String nombrecompleto, LocalDate fechadenacimiento, int telefono, Diciplina diciplina) {
        super(identificacion, nombrecompleto, fechadenacimiento, telefono, diciplina);
        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }
    
    public void Infromacion(){
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Experiencia: " + experiencia);
    }

}

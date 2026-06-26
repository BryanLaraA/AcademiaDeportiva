/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsablesdisciplina;

/**
 *
 * @author Student
 */
public class Responsable {
    private String especialidad;
    private int experiencia;

    public Responsable(String especialidad, int experiencia) {
        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }
    
    public void Infromacion(){
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Experiencia: " + experiencia);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disciplinas;

import participantes.Participantes;


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

    
    
}

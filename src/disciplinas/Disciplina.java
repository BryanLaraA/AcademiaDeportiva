/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disciplinas;

/**
 *
 * @author Student
 */
public class Disciplina {
    private double nombre; 
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

    public Disciplina(double nombre, Categoria categoria, int capMaxima) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.capMaxima = capMaxima;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "nombre=" + nombre + ", categoria=" + categoria + ", capMaxima=" + capMaxima + '}';
    }
    
    
    
}

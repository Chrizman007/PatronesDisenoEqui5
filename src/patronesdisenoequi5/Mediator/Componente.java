/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdisenoequi5.Mediator;

/**
 *
 * @author chris
 */
public abstract class Componente {
    protected DirectorDialogo director;

    public Componente(DirectorDialogo director) {
        this.director = director;
    }

    public void notificarCambio() {
        director.componenteModificado(this);
    }
}

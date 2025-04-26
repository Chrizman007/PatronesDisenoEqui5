/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdisenoequi5.Mediator;

/**
 *
 * @author chris
 */
public class CampoTexto extends Componente {
    private String texto;

    public CampoTexto(DirectorDialogo director) {
        super(director);
    }

    public void setTexto(String texto) {
        this.texto = texto;
        System.out.println("CampoTexto actualizado: " + texto);
    }
}

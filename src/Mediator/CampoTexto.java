/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;

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
        System.out.println("\n[Campo de texto actualizado]: '" + texto + "'");
    }
}

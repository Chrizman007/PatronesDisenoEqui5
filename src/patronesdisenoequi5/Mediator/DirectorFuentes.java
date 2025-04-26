/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdisenoequi5.Mediator;

/**
 *
 * @author chris
 */
public class DirectorFuentes implements DirectorDialogo {
    private ListaDesplegable lista;
    private CampoTexto campoTexto;

    public DirectorFuentes() {
        this.lista = new ListaDesplegable(this);
        this.campoTexto = new CampoTexto(this);
        
        lista.agregarElemento("Arial");
        lista.agregarElemento("Times New Roman");
    }

    @Override
    public void componenteModificado(Componente componente) {
        if (componente == lista) {
            campoTexto.setTexto(lista.getElementoSeleccionado());
        }
    }

    public void simularInteraccionUsuario() {
        lista.seleccionarElemento(1); // Simula selección de "Times New Roman"
    }
}

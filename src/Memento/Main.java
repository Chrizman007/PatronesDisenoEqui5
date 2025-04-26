package Memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hola, ");
        history.saveState(editor); // Guardar estado

        editor.write("mundo!");
        history.saveState(editor); // Guardar estado

        System.out.println("Contenido actual: " + editor.getContent());

        // Deshacer dos veces
        history.undo(editor);
        System.out.println("Después de deshacer una vez: " + editor.getContent());

        history.undo(editor);
        System.out.println("Después de deshacer dos veces: " + editor.getContent());
    }
}

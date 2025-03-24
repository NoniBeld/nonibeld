package algoritmos;


public class Main {
   public static void main(String[] args) {
        // Creando un árbol de comportamiento
        SelectorNode root = new SelectorNode();

        // Crear una secuencia de acciones
        SequenceNode sequence = new SequenceNode();
        sequence.addChild(new ActionNode("Patrullar"));
        sequence.addChild(new ActionNode("Ver enemigo"));

        // Añadir la secuencia al nodo selector
        root.addChild(sequence);
        root.addChild(new ActionNode("Atacar"));

        // Ejecutar el árbol de comportamiento
        root.run();
    }
}
package algoritmos;

import java.util.ArrayList;
import java.util.List;

// Clase base para los nodos
abstract class Node {
    protected List<Node> children = new ArrayList<>();

    public void addChild(Node child) {
        children.add(child);
    }

    public abstract boolean run();  // Método abstracto que deben implementar las clases hijas
}

// Nodo de acción (realiza una acción concreta)
class ActionNode extends Node {
    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public boolean run() {
        System.out.println("Ejecutando acción: " + action);
        return true;  // Siempre tiene éxito en este ejemplo
    }
}

// Nodo selector (elige el primer hijo que tenga éxito)
class SelectorNode extends Node {
    @Override
    public boolean run() {
        for (Node child : children) {
            if (child.run()) {  // Si uno de los hijos tiene éxito, el nodo tiene éxito
                return true;
            }
        }
        return false;  // Si ninguno de los hijos tiene éxito, falla
    }
}

// Nodo secuencia (ejecuta los hijos en orden y falla si alguno falla)
class SequenceNode extends Node {
    @Override
    public boolean run() {
        for (Node child : children) {
            if (!child.run()) {  // Si un hijo falla, todo el nodo falla
                return false;
            }
        }
        return true;  // Si todos los hijos tienen éxito, el nodo tiene éxito
    }
}

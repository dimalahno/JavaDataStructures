package part2._01_tree;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value); // Создаём новую новую ноду

        if(root == null){ // Если нет корневого элемента
            root = node;
            return;
        }

        var current = root;
        while(true){
            // Ищем ветвь левую или правую в зависимости от значения и вставляем элемент
            if(value < current.value) {
                if(current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if(current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current != null){
            if(value < current.value){
                current = current.leftChild;
            } else if (value > current.value){
                current = current.rightChild;
            } else {
                return true;
            }
        }
        return false;
    }
}

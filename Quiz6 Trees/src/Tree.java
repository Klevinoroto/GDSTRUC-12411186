public class Tree {
    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        else {
            root.insert(value);
        }
    }

    public void inOrderTraverse() {
        if (root != null) {
            root.inOrderTraverse();
        }
    }

    public void inReverseOrderTraverse() {
        Node maxValue = getMax();
        if (root != null) {
            root.inReverseOrderTraverse();
        }
    }

    public Node getMin() {
        if (root != null) {

            Node minValue = root;
            while (minValue.getLeftChild() != null) {
                minValue = minValue.getLeftChild();
            }
            return minValue;
        }
        return root;
    }

    public Node getMax() {
        if (root != null) {

            Node maxValue = root;
            while (maxValue.getRightChild() != null) {
                maxValue = maxValue.getRightChild();
            }
            return maxValue;
        }
        return root;
    }

    public Node get(int value) {
        if (root == null) {
            return  null;
        }

        return  root.get(value);
    }
}
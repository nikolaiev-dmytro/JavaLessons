package lesson10;

public class TreeIMap implements IMap {
    private Node root = null;
    private int count;

    public TreeIMap(Node root) {
        this.root = root;
    }

    public TreeIMap() {
    }

    @Override
    public void add(Node element) {
        Node x = root, y = null;
        while (x != null) {
            if (element.getKey() == x.getKey()) {
                x.setValue(element.getValue());
                return;
            } else {
                y = x;
                if (element.getKey() < x.getKey()) {
                    x = x.getLeft();
                } else {
                    x = x.getRight();
                }
            }
        }
        Node newNode = new Node(element.getKey(), element.getValue());
        if (y == null) {
            root = newNode;
        } else {
            if (element.getKey() < y.getKey()) {
                y.setLeft(newNode);
            } else {
                y.setRight(newNode);
            }
        }
        count++;
    }

    @Override
    public int get(int index) {
        Node x = root;
        while (x != null) {
            if (index == x.getKey()) {
                return x.getValue();
            } else if (index < x.getKey()) {
                x = x.getLeft();
            } else {
                x = x.getRight();
            }
        }
        return Integer.parseInt(null);
    }

    @Override
    public void clear() {
        this.root = null;
        count=0;
    }

    @Override
    public void remove(int index) {
        Node x = root, y = null;
        while (x != null) {
            if (index == x.getKey()) {
                break;
            } else {
                y = x;
                if (index < x.getKey()) {
                    x = x.getLeft();
                } else {
                    x = x.getRight();
                }
            }
        }
        if (x == null) {
            return;
        }
        if (x.getRight() == null) {
            if (y == null) {
                root = x.getLeft();
            } else {
                if (x == y.getLeft()) {
                    y.setLeft(x.getLeft());
                } else {
                    y.setRight(x.getLeft());
                }
            }
        } else {
            Node leftMost = x.getRight();
            y = null;
            while (leftMost.getLeft() != null) {
                y = leftMost;
                leftMost = leftMost.getLeft();
            }
            if (y != null) {
                y.setLeft(leftMost.getRight());
            } else {
                x.setRight(leftMost.getRight());
            }
            x.setKey(leftMost.getKey());
            x.setValue(leftMost.getValue());
        }
        count--;
    }

    @Override
    public int size() {

        return count;
    }
}

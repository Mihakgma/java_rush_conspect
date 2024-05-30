public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        node.value = value;
        if (last.prev == null) {
            first.next = node;
            node.prev = first;
            node.next = last;
            last.prev = node;
        }
        last.prev.next = node;
        node.prev = last.prev;
        last.prev = node;
        node.next = last;
    }
    public String get(int index) {
        //напишите тут ваш код
        int currentIndex = 0;
        Node currentElement = first.next;
        while ((currentElement) != null) {
            if (currentIndex == index) {
                return currentElement.value;
            }
            currentElement = currentElement.next;
            currentIndex++;
        }
        return null;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}

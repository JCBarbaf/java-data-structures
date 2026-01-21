public class LinkedListManipulation {
    public static void main(String[] args) {
        Node linkedList1 = new Node(1);
        linkedList1.next = new Node(2);
        linkedList1.next.next = new Node(3);
        linkedList1.next.next.next = new Node(4);
        linkedList1.next.next.next.next = new Node(5);
        System.out.println("--Original--");
        System.out.println(linkedListToString(linkedList1));
        System.out.println("--Only odd numbers--");
        Node ll1Odds = removeEvenNumbers(linkedList1);
        System.out.println(linkedListToString(ll1Odds));

        Node linkedList2 = null;
        System.out.println("--Original--");
        System.out.println(linkedListToString(linkedList2));
        System.out.println("--Only odd numbers--");
        Node ll2Odds = removeEvenNumbers(linkedList2);
        System.out.println(linkedListToString(ll2Odds));
        
        Node linkedList3 = new Node(2);
        linkedList3.next = new Node(3);
        linkedList3.next.next = new Node(4);
        linkedList3.next.next.next = new Node(6);
        linkedList3.next.next.next.next = new Node(31);
        System.out.println("--Original--");
        System.out.println(linkedListToString(linkedList3));
        System.out.println("--Only odd numbers--");
        Node ll3Odds = removeEvenNumbers(linkedList3);
        System.out.println(linkedListToString(ll3Odds));

        Node linkedList4 = new Node(2);
        linkedList4.next = new Node(4);
        linkedList4.next.next = new Node(6);
        System.out.println("--Original--");
        System.out.println(linkedListToString(linkedList4));
        System.out.println("--Only odd numbers--");
        Node ll4Odds = removeEvenNumbers(linkedList4);
        System.out.println(linkedListToString(ll4Odds));
    }

    public static Node removeEvenNumbers(Node top) {
        while (top != null && top.data % 2 == 0) {
            top = top.next;
        }

        Node current = top;

        while (current != null && current.next != null) {
            if (current.next.data % 2 == 0) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return top;
    }

    public static String linkedListToString(Node top) {
        if (top == null) {
            return "null";
        }
        String finalString = Integer.toString(top.data);
        Node currentNode = top.next;
        while(currentNode != null) {
            finalString += " -> " + Integer.toString(currentNode.data);
            currentNode = currentNode.next;
        }
        return finalString;
    }
}

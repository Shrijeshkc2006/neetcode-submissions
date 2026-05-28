class LinkedList {
    Node head;

    class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
            this.next = null;
        }
    }

    public LinkedList() {
        Node head = null;
    }

    public int get(int index) {
        Node temp = head;
        int i = 0;
        int ans = -1;
        while(temp != null) {
            if(i == index) ans = temp.val;
            i++;
            temp = temp.next;
        }
        return ans;
    }

    public void insertHead(int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
    }

    public void insertTail(int val) {
        Node tail = new Node(val);
        if(head == null) {
            head = tail;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = tail;
    }

    public boolean remove(int index) {
        if(head == null) {
            return false;
        }
        if(index == 0) {
            head = head.next;
            return true;
        }
        Node temp = head;
        int i = 0;
        while(temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }
        if(temp == null || temp.next == null) {
            return false;
        }
        temp.next = temp.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> nums = new ArrayList<>();
        Node temp = head;
        while(temp != null) {
            nums.add(temp.val);
            temp = temp.next;
        }
        return nums;
    }
}

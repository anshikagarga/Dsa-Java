package LinkedList;
import java.util.*;



public class basics {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;


    public void addFirst(int data){
        //        step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

//        step2 = newMode next = head
        newNode.next = head; //link
//         step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail= newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data){
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        if(idx == 0){
            addFirst(data);
            return;
        }
        while(i < idx-1){
            temp = temp.next;
            i++;

        }
        newNode .next = temp.next;
        temp.next = newNode;
    }


    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
         int val = head.data;
         head = tail = null;
         size = 0;
         return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    public void print(){ //o(n)
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node  temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

//  slow -fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is my midNode
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

//        step1 - find mid
        Node midNode = findMid(head);


//        step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;// right half head
        Node left = head;
//        step3- check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true; // cycle exists
            }
        }
        return false; // cycle does not exist
    }

    public static void removeCycle(){
//        detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow =  slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }

        }
        if(cycle == false){
            return;
        }
//        find meeting point
        slow = head;
        Node prev = null; // last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

//        remove cycle -> last.next = null
        prev.next = null;
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;//mid
    }

    private Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
//        find mid
        Node mid = getMid(head);
//        left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

//        merge
        return merge(newLeft, newRight);
    }

public void zigZag(Node head){
//         find mid
    Node slow = head;
    Node fast = head.next;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    Node mid = slow;
//    reverse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node left = head;
    Node right = prev;
    Node nextL, nextR;

    // alt merge - zig ag merge
    while(left != null && right != null){
        nextL = left.next;
        left.next = right;
        nextR = right.next;
        right.next = nextL;
        left = nextL;
        right = nextR;
    }
}

    public static void main(String[] args) {
//         basics ll = new basics();
//         ll.print();
////         ll.head = new Node(1);
////         ll.head.next = new Node(2);
//        ll.addLast(1);
//        ll.addLast(2);
//        ll.addLast(2);
////        ll.addLast(1);
//        ll.print();
//        System.out.println(ll.checkPalindrome());
////        ll.add(2,7);
//        ll.removeFirst();
//        ll.print();
//        System.out.println(ll.size);

//        head = new Node(1);
//        Node temp = new Node(2);
//        head.next = temp;
//        head.next.next = new Node(3);
//        head.next.next.next = temp;
//        // 1->2->3->1
//        System.out.println(isCycle());
//        removeCycle();
//        System.out.println(isCycle());

        basics ll = new basics();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.zigZag(ll.head);
        ll.print();
//        ll.head = ll.mergeSort(ll.head);
//        ll.print();

    }
}

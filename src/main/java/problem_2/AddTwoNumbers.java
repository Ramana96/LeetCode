package problem_2;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l = new ListNode(2);
//        l.next = new ListNode(4);
//        l.next.next=new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next=new ListNode(4);
        new LinkedLis().print(l);
        System.out.println("------------------------");
        new LinkedLis().print(l2);

        ListNode lll=addTwoNumbers.addTwoNumbers(l, l2);
//        System.out.println(l.val+"   "+ l.next.val+"   "+l.next.next.val);
//        System.out.println(l2.val+"   "+ l2.next.val+"   "+l2.next.next.val);
        System.out.println();

        new LinkedLis().print(lll);



    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int result = number(l1) + number(l2);
        System.out.println("result "+result);
        return sumList(result);
    }

    public ListNode sumList(int result) {
        LinkedLis linkedLis = new LinkedLis();
        if (result==0){
            linkedLis.insertAtEnd(0);
            return linkedLis.head;
        }
        int n = result;

        while (n != 0) {
            int number = (int) (n % 10);
            linkedLis.insertAtEnd(number);
            n = n / 10;
        }
        return linkedLis.head;
    }


    public int number(ListNode n) {

        int i = 0;
        int sum = 0;
        while (n != null) {
            sum = (int) (sum + n.val * Math.pow(10, i++));
            n = n.next;
        }
        System.out.println("number is ::"+sum);
        return sum;
    }


}

class LinkedLis {
    ListNode head ;

    LinkedLis() {
        this.head=null;

    }

    public void insertAtEnd(int val) {
        if (this.head == null) {
            head = new ListNode(val);
            return;
        } else {
            ListNode p = head, q;
            while ((q = p.next) != null) {
                p = q;
            }
            p.next = new ListNode(val);
            return;
        }

    }

    public void print(ListNode node){
        ListNode l=node;
        while (l!=null){
            System.out.println(l.val);
            l=l.next;
        }
    }
}

package easy;

public class DeleteNodeInLinkedList_237 {
    public static void main(String[] args) {
        ListNode head = ListNode.buildList();
        ListNode.show(head);
        deleteNode(head);
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

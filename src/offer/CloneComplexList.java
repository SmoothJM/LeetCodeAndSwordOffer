package offer;
import java.util.HashMap;
import java.util.Map;

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}


public class CloneComplexList {
    public static void main(String[] args) {
        RandomListNode a = new RandomListNode(1);
        RandomListNode b = new RandomListNode(2);
        RandomListNode c = new RandomListNode(3);
        RandomListNode d = new RandomListNode(4);
        RandomListNode e = new RandomListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        a.random = c;
        b.random = e;
        d.random = b;
        RandomListNode result = clone2(a);
        while(result!=null){
            System.out.println(result.label);
            result = result.next;
        }
    }

    public static RandomListNode clone(RandomListNode pHead) {
        if(pHead == null) return pHead;
        RandomListNode ori = pHead;
        Map<RandomListNode,RandomListNode> map = new HashMap<>();
        int len=0;
        while(pHead!=null){
            len++;
            pHead = pHead.next;
        }
        pHead = ori;
        RandomListNode[] rs = new RandomListNode[len];
        for (int i = 0; i < len; i++) {
            rs[i] = new RandomListNode(pHead.label);
            map.put(pHead,rs[i]);
            pHead = pHead.next;
        }
        pHead = ori;
        for (int i = 0; i < len-1; i++) {
            rs[i].next = rs[i+1];
        }
        while(pHead!=null){
            if(pHead.random!=null){
                map.get(pHead).random = map.get(pHead.random);
            }
            pHead = pHead.next;
        }
        return rs[0];
    }

    public static RandomListNode clone2(RandomListNode pHead){
        if(pHead==null) return pHead;
        duplicate(pHead);
        sibling(pHead);
        return divide(pHead);
    }

    public static void duplicate(RandomListNode head){
        RandomListNode pHead = head;
        while(pHead!=null){
            RandomListNode cloneNode = new RandomListNode(pHead.label);
            cloneNode.next=pHead.next;
            pHead.next = cloneNode;
            pHead = cloneNode.next;
        }
    }

    public static void sibling(RandomListNode head){
        RandomListNode pHead = head;
        while (pHead!=null){
            if(pHead.random!=null){
                pHead.next.random = pHead.random.next;
            }
            pHead = pHead.next.next;
        }
    }

    public static RandomListNode divide(RandomListNode pHead){
        RandomListNode pNode = pHead;
        RandomListNode pClone = pNode.next;
        RandomListNode cloneNode = pClone;
        pNode.next = cloneNode.next;
        pNode = pNode.next;
        while(pNode!=null){
            cloneNode.next = pNode.next;
            cloneNode = cloneNode.next;
            pNode.next = cloneNode.next;
            pNode = pNode.next;
        }
        return pClone;
    }

}

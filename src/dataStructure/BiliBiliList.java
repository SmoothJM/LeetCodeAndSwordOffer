package dataStructure;

import java.util.Arrays;
import java.util.Scanner;

class ListNode{
    int value;
    ListNode next;
    ListNode(int value){
        this.value = value;
        this.next = null;
    }
    public void setNext(ListNode next){
        this.next = next;
    }
}
public class BiliBiliList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nodes = sc.nextLine().split(" ");
        int gap = sc.nextInt()-1;
        int[] node = new int[nodes.length-1];
        for(int i=0; i<nodes.length-1;i++){
            node[i] = Integer.parseInt(nodes[i]);
        }
        int index = 0;
        int temp =0;
        int dis = gap;
        while(index+gap<node.length){
            temp = node[index];
            node[index] = node[dis];
            node[dis] = temp;
            index+=gap+1;
            dis+=dis+1;
        }
        for (int i = 0; i < node.length; i++) {
            if(i==node.length-1){
                System.out.print(node[i]);
            }else{
                System.out.print(node[i]+"->");
            }

        }

        
    }
}

package datastructure.LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

 class ListNode {
     int val;
     ListNode next;
      ListNode(int x) {
          val = x;
         next = null;
      }
 }
public class Solution {
    public boolean hasCycle(ListNode head) {

        Map<Integer,Integer> nodeMap=new HashMap<Integer,Integer>();


        while(head!=null){
            if(nodeMap.get(head.val)==null){
                nodeMap.put(head.val,1);
                head=head.next;
            }
            else{
                return true;
            }
        }
        return false;

    }
}
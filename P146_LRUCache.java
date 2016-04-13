/*
    https://leetcode.com/problems/lru-cache/

    Design and implement a data structure for Least Recently Used (LRU) cache. 
    It should support the following operations: get and set.

    get(key) - Get the value (will always be positive) of the key if the key 
    exists in the cache, otherwise return -1.
    set(key, value) - Set or insert the value if the key is not already present. 
    When the cache reached its capacity, it should invalidate the least recently 
    used item before inserting a new item.

    @tags: Design
*/

public class P146_LRUCache{
    class LRUCache {

        private HashMap<Integer,ListNode> hashMap;
        private ListNode head;
        private ListNode tail;
        private int capacity;

        public LRUCache(int capacity) {
            this.head = null;
            this.tail = null;
            this.capacity = capacity;
            this.hashMap = new HashMap();
        }

        public int get(int key) {
            ListNode target = removeNode(key);
            if(target==null){
                return -1;
            }else{
                // exist;

                // add node to tail
                this.addNode(target);
                return target.value;
            }
        }

        public void set(int key, int value) {
            ListNode target = removeNode(key);
            if(target==null){
                if(hashMap.size()==this.capacity){
                    //remove head one
                    ListNode toRemove = head;
                    head = head.next;
                    if(head!=null){
                        head.prev = null;
                    }
                    this.hashMap.remove(toRemove.key);
                }
                target = new ListNode(key,value);
                this.hashMap.put(key,target);
                this.addNode(target);
            }else{
                // exist;

                target.value = value;
                // add node to tail
                this.addNode(target);
            }
        }

        private void addNode(ListNode target){
            target.prev = tail;
            if(tail != null){
                tail.next = target;
            }
            tail = target;
            if(head==null){
                head = target;
            }
        }

        private ListNode removeNode(int key){
            ListNode target = hashMap.get(key);
            if(target!=null){

                if(target.prev==null){
                    //first element
                    head = target.next;
                    if(head !=null ){
                        head.prev = null;
                    }
                }else if(target.next==null){
                    //last element
                    tail = target.prev;
                    if(tail != null){
                        tail.next = null;
                    }
                }else{
                    target.prev.next = target.next;
                    target.next.prev = target.prev;
                }

                target.prev= null;
                target.next= null;
                return target;
            }
            return null;
        }

        class ListNode{
            int key;
            int value;
            ListNode prev;
            ListNode next;
            ListNode(int key,int value){
                this.key = key;
                this.value = value;
                this.prev = null;
                this.next = null;
            }
        }
    }
}

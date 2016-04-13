/*
    https://leetcode.com/problems/find-median-from-data-stream/

    Median is the middle value in an ordered integer list. If the size of the 
    list is even, there is no middle value. So the median is the mean of the 
    two middle value.

    Examples: 
    [2,3,4] , the median is 3

    [2,3], the median is (2 + 3) / 2 = 2.5

    Design a data structure that supports the following two operations:

    void addNum(int num) - Add a integer number from the data stream to the 
    data structure.
    double findMedian() - Return the median of all elements so far.
    
    For example:

    add(1)
    add(2)
    findMedian() -> 1.5
    add(3) 
    findMedian() -> 2

    @tags: Heap, Design
*/

public class P295_FindMedianFromDataStream{
    Queue<Integer> small = new PriorityQueue(new Comparator<Integer>(){
        public int compare(Integer i1,Integer i2){
            return i2-i1;
        }
    });
    Queue<Integer> large = new PriorityQueue();

    // Adds a number into the data structure.
    public void addNum(int num) {
        small.add(num);
        large.add(small.poll());

        if(large.size()>small.size()){
            small.add(large.poll());
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        if(small.size()-large.size()==1){
            return small.peek();
        }else{
            return (small.peek()+large.peek())/2.0;
        }
    }
}

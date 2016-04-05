
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

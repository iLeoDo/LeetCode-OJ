
public class P056_MergeIntervals{
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval a,Interval b){
                if(a.start>b.start){
                    return 1;
                }else if(a.start==b.start){
                    return a.end-b.end;
                }else{
                    return -1;
                }
            }
        });

        List<Interval> result  = new ArrayList();
        for(Interval interval : intervals){
            if(result.size()==0){
                result.add(interval);
            }else{
                Interval last = result.get(result.size()-1);
                if(interval.start>=last.start&&interval.end<=last.end){
                    continue;
                }else if(interval.start>=last.start&&interval.start<=last.end&&interval.end>last.end){
                    last.end = interval.end;
                }else if(interval.start>last.end){
                    result.add(interval);
                }
            }
        }
        return result;

    }
}

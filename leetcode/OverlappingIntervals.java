package com.parkinglot.design.ProblemSolving;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OverlappingIntervals {
   public static void main(String args[]) {
        ArrayList<interval> overlap = new ArrayList<interval>();
        /*overlap.add(new interval(6, 8));
       overlap.add(new interval(2, 4));
       overlap.add(new interval(4, 7));
       overlap.add(new interval(1, 9));*/
       overlap.add(new interval(1, 3));
       overlap.add(new interval(2, 4));
       overlap.add(new interval(6,8));
       overlap.add(new interval(9,10));
       for(int i=0;i<overlap.size();i++)
       {System.out.print(overlap.get(i).start+"  ");
       System.out.println(overlap.get(i).end);}
       overlap.sort(new Comparator<interval>(){
           public int compare(interval i1,interval i2)
           {
               return i1.start-i2.start;
           }
       });
       System.out.println("new");
       for(int i=0;i<overlap.size();i++)
       {System.out.print(overlap.get(i).start+"  ");
           System.out.println(overlap.get(i).end);}

       for(int i=0;i<overlap.size()-1;) {
           if (overlap.get(i).start <= overlap.get(i + 1).start && overlap.get(i).end >= overlap.get(i + 1).start) {
               if(overlap.get(i).end<=overlap.get(i+1).end)
                   overlap.get(i).end = overlap.get(i + 1).end;
               overlap.remove(i + 1);
           } else i++;
       }
       System.out.println("new non overlapped array ");
       for(int i=0;i<overlap.size();i++)
       {System.out.print(overlap.get(i).start+"  ");
           System.out.println(overlap.get(i).end);}
    }
}
@Data
class interval{
    int start; int end;
    interval(int start, int end)
    {
        this.start=start;
        this.end=end;
    }
}
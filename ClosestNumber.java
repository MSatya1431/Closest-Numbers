import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClosestNumbers
{
     public static List<Integer> closestNumbers(List<Integer> arr)
     {
        Collections.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        List<Integer> pairs=new ArrayList<>();
        for (int i=1;i<arr.size();i++) 
        {
            int diff=arr.get(i)-arr.get(i-1);
            if (diff<minDiff)
            {
                minDiff=diff;
                pairs.clear();
            }
            if (diff==minDiff) 
            {
                pairs.addAll(Arrays.asList(arr.get(i-1), arr.get(i)));
            }
        }
        return pairs;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> arr=new ArrayList<>(n);
        for (int i=0;i<n;i++) 
        {
            arr.add(sc.nextInt());
        }
        List<Integer> result=closestNumbers(arr);
        for (int i=0;i<result.size();i+=2) 
        {
            System.out.print(result.get(i)+" "+result.get(i+1)+ " ");
        }
        sc.close();
    }
}
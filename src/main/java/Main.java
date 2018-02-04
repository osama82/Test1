package main.java;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    final static Logger log=Logger.getLogger("hello");
    static File f = new File("hello.txt");
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Integer> lis=new ArrayList<>();
        lis.add(1);
        lis.add(2);
        lis.add(3);
        lis.add(1);
        canBalance(lis);
        for(Integer p:lis)
            System.out.println(p);
        if(f.exists())
            System.out.println("hello file");
        log.warning("last way");
    }
     boolean canBalance(List<Integer> nums) {
        //Lis<Integer>
        int leftSum = 0, rightSum = 0, i, j;
        if(nums.size() == 1)
            return false;
        for(i=0, j=nums.size()-1; i<=j ;){
            if(leftSum <= rightSum){
                leftSum+=nums.get(i);
                i++;
            }else{
                rightSum+=nums.get(j);
                j--;
            }
        }
        System.out.println(rightSum == leftSum);
        return (rightSum == leftSum);
    }
}

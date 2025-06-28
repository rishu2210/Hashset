//Given an unsorted array of integers nums,return the length of the longest consecutive elements sequence
import java.util.*;
public class Q1LongestConsecutive {
    public int longestConsecutive(int[] nums){
        HashSet<Integer> st = new HashSet<>();
        for(int num:nums) st.add(num);
        int maxStreak = 0;

        for(int num:st){
            if(!st.contains(num-1)){ //num is starting point of the sequence
                int currNum = num; // 1
                int currStreak = 1 ; //length 
                while(st.contains(currNum+1)){ //length of current consecutive sequence
                    currStreak++;
                    currNum++; 
                }
                maxStreak = Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;
    }
    public static void main(String args[]){
        
    }
}

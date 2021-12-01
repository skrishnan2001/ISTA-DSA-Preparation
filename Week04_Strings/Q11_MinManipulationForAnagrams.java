package Week04_Strings;

//TC: O(n) | SC: O(1)

public class Q11_MinManipulationForAnagrams {
    int minManipulation(int N, String S1, String S2) 
    {
        int freq[] = new int[26];
        
        for(int i = 0; i < N; i++)
        {
            freq[S1.charAt(i) - 'a']++;
            freq[S2.charAt(i) - 'a']--;
        }
        
        int ans = 0;
        
        for(int f : freq)
        {
            ans += (f > 0) ? f : 0;
        }
        
        return ans;
    }
}

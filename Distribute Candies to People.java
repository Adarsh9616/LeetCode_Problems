class Solution {
    public int[] distributeCandies(int candies, int num_people) 
    {
        int candyGiven=1;
        int i=0;
        int ar[]=new int[num_people];
        while(candies-candyGiven>0)
        {
            if(i==num_people)
            {
                i=0;
            }
            ar[i]+=candyGiven;
            candies-=candyGiven;
            i++;
            candyGiven++;
        }
        if(candies>0)
        {
            if(i==num_people)
            {
                i=0;
            }
            ar[i]+=candies;
        }
            
        return ar;
    }
}
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame 
{
    public int guessNumber(int n)
    {
        int lb=1;
        int ub=n;
        while(lb<=ub)
        {
            int mid=lb+(ub-lb)/2;
            int i=guess(mid);
            if(i==0)
            {
             return mid;
            }
            if(i>0)
            {
                lb=mid+1;
            }
            else
            {
                ub=mid-1;
            }
        }
        return -1;
    }
}
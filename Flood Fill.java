class Solution 
{
    int r;
    int c;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        if(image==null||image[sr][sc]==newColor)
        {
            return image;
        }
        r=image.length;
        c=image[0].length;
        solve(image,sr,sc,image[sr][sc],newColor);
        return image;
    }
    
    public void solve(int ar[][], int x,int y,int old, int now)
    {
        if(x<0||x>=r||y<0||y>=c)
        {
            return;
        }
        if(ar[x][y]==old)
        {
            ar[x][y]=now;
            solve(ar,x+1,y,old,now);
            solve(ar,x-1,y,old,now);
            solve(ar,x,y+1,old,now);
            solve(ar,x,y-1,old,now);
        }
    }
}
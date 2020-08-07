class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
        int i;
        double x,y,x1,y1,x2,y2,slope,m;
        x1=coordinates[0][0];
        y1=coordinates[0][1];
        x2=coordinates[1][0];
        y2=coordinates[1][1];
        if(x2!=x1)
        slope=(y2-y1)/(x2-x1);
        else
        slope=999.0;     
        
        for(i=2;i<coordinates.length;i++)
        {
            x = coordinates[i][0];
            y = coordinates[i][1];
            if(x!=x1)
            m = (y-y1)/(x-x1);
            else
            m = 999.0;    
            if(m!=slope)
             return false;
        }
        
        return true;
    }
}
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if(date1.compareTo(date2) > 0) {
            String temp = date1;
            date1 = date2;
            date2 = temp;
        }
        
        String[] first = date1.split("-");
        String[] second = date2.split("-");
        
        int yearDiff = getYear(first[0], second[0]);
        int monthDiff = getMonth(first[1], second[1], month, first[0], second[0]);
        int dayDiff = getDay(first[2], second[2], month, first[1]);
        // System.out.println(yearDiff + " "+monthDiff + " " + dayDiff);
        return yearDiff + monthDiff + dayDiff;
    }
    
    private int getYear(String y1, String y2) {
        int year1 = Integer.parseInt(y1) + 1;
        int year2 = Integer.parseInt(y2);
        
        int days = 365 * (year2 - year1);
        while(year1 < year2) {
            if(isLeap(year1)) {
                days++;
                year1 += 4;
            } else {
                year1++;
            }
        }
        return days;
    }
    
    private int getDay(String d1, String d2, int[] month, String m1) {
        int day1 = Integer.parseInt(d1);
        int day2 = Integer.parseInt(d2);
        
        int days = month[Integer.parseInt(m1)] - day1;
        days += day2;
        return days;
    }
    
    private int getMonth(String m1, String m2, int[] month, String y1, String y2) {
        // int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month1 = Integer.parseInt(m1);
        int month2 = Integer.parseInt(m2);
        int year1 = Integer.parseInt(y1);
        int year2 = Integer.parseInt(y2);
        
        int days = 0;
        int mCopy = month1;
        month1++;
        
        while(month1 < month.length) {
            days += month[month1];
            month1++;
        }
        
        int id = 1;
        while(id < month2) {
            days += month[id++];
        }
        
        if(mCopy <=2 && isLeap(year1)) {
            days++;
        }
        // System.out.println(days + " " + month1 + " " + year1);
        if(month2 > 2 && isLeap(year2)) {
            days++;
        }
        
        return days;
        
    }
    
    private boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
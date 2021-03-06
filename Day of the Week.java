class Solution {
    //   String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    // public String dayOfTheWeek(int d, int m, int y) {
    //     if (m < 3) {
    //         m += 12;
    //         y -= 1;
    //     }
    //     int c = y / 100;
    //     y = y % 100;
    //     int w = (c / 4 - 2 * c + y + y / 4 + 13 * (m + 1) / 5 + d - 1) % 7;
    //     return days[(w + 7) % 7];
    // }
    public String dayOfTheWeek(int day, int month, int year) {
        String[] daysInWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] DaysByMonthMod7 = {0,3,2,5,0,3,5,1,4,6,2,4}; // Jan: 0, Feb: 31%7=3, Mar: 58%7=2, Apr: 89%7=5, etc
        if(month < 3) year -= 1; // 3
        return daysInWeek[(year + (year/4 - year/100 + year/400) + DaysByMonthMod7[month-1] + day) % 7]; // (year*365)%7 = year. Add the leap year days. Add extra month days. Add day.
    }
}
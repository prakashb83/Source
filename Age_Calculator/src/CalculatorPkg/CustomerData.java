package CalculatorPkg;
public class CustomerData {
	public static int  Day;
    private static int Month;
    private static int Year;
    private static int  BDay;
    private static int BMonth;
    private static int BYear;
    private static int d,m,y;
    
    public static void setDay(int day)
    {
    	Day=day;
    }
    public static void setMonth(int month)
    {
    	Month=month;
    }
    public static void setYear(int year)
    {
    	Year=year;
    }
    public static void setbirthDay(int day)
    {
    	BDay=day;
    }
    public static void setbirthMonth(int month)
    {
    	BMonth=month;
    }

    public static void setbirthYear(int year)
    {
    	BYear=year;
    }
        
    public static int getDay()
    {
    	return Day;
    }
    public static int  getMonth()
    {
    	return Month;
    }
    public static int getYear()
    {
    	return Year;
    }
    public static int getbirthDay()
    {
    	return  BDay;
    }
    public static int getbirthMonth()
    {
        return	BMonth;
    }

    public static int  getbirthYear()
    {
    	return BYear;
    }

    public static int getd()
    {
    	return d;
    }
    public static int getm()
    {
    	return m;
    }
    public static int gety()
    {
    	return y;
    }
    public static void calculate()
    {
  	  int[] mo = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      int m3 = 0;
      int y3 = 0;
       d = 0;
       m = 0;
       y = 0;
      if ((Year % 4 == 0) && (Year % 400 == 0)) {

          mo[1] = 29;
      } else {
          mo[1] = 28;
      }
      for (int i = 0; i < mo.length; i++) {
          if (Day < BDay) {
              d = Day + mo[Month - 1] - BDay;
              m3 = Month - 1;
              if (m3 < BMonth) {
                  m = m3 + 12 - BMonth;
                  y3 = Year - 1;
                  y = y3 - BYear;
              } else {
                  m = Month - BMonth;
                  y = Year - BYear;
              }
          } else {
              d = Day - BDay;
              if (Month < BMonth) {
                  m = Month + 12 - BMonth;
                  y = Year - 1 - BYear;
              } else {
                  m = Month - BMonth;
                  y = Year - BYear;
              }
          }
      }


    }
    public static String calculate1(int day1,int month1,int year1,int Bday1,int Bmonth1,int Byear1)
    {
  	  int[] mo = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      int m3 = 0;
      int y3 = 0;
       d = 0;
       m = 0;
       y = 0;
      if ((year1 % 4 == 0) && (year1 % 400 == 0)) {
          mo[1] = 29;
      } else {
          mo[1] = 28;
      }
      for (int i = 0; i < mo.length; i++) {
          if (day1 < Bday1) {
              d = day1 + mo[month1 - 1] - Bday1;
              m3 = month1 - 1;
              if (m3 < Bmonth1) {
                  m = m3 + 12 - Bmonth1;
                  y3 = year1 - 1;
                  y = y3 - Byear1;
              } else {
                  m = month1 - Bmonth1;
                  y = year1 - Byear1;
              }
          } else {
              d = day1 - Bday1;
              if (month1 < Bmonth1) {
                  m = month1 + 12 - Bmonth1;
                  y = year1 - 1 - Byear1;
              } else {
                  m = month1 - Bmonth1;
                  y = year1 - Byear1;
              }
          }
      }

      return d+" "+m+" "+y;
    }
    
    
}

package TestRun;

public class TicketData {
	private static String name;
	private static String password;
	private static String MovieName;
	private static String TheatreName;
	private static String TicketType;
	private static int No_of_Tickets;
	private static int cost;
	public static void setName(String name1)
	{
		name=name1;
	}
	public static void setPassword(String password1)
	{
		password=password1;
	}
	public static void setMovieName(String mname)
	{
		MovieName=mname;
	}
	public static void setTheatreName(String tname)
	{
		TheatreName=tname;
	}
	public static void setTicketType(String Tickettype)
	{
		TicketType=Tickettype;
	}
	public static void setTicketNumber(int k){
		No_of_Tickets=k;
	}
	public static int  getTicketNumber()
	{
		return No_of_Tickets;
	}
	public static String getTicketType()
	{
		return TicketType;
	}
	public static String getTheatrename()
	{
		return TheatreName;
	}
	public static String getname()
	{
		return name;
	}
	public static String getMovieName()
	{
		return MovieName;
	}
	public static String getPassword()
	{
		return password;
	}
	public static int LoginNameComparision(String name1)
	{
		if(name.equals(name1))
				return 1;
		else
				return 0;
	}
	public static String LoginPasswordComparision(String password1)
	{
		if((password).equals(password1))
				return "true";
		else
				return "false";
	}
	public static int ticketAvailablity(int no_of_tickets)
	{
		if(no_of_tickets <20)
				return 1;
		else
				return 0;
	}
	public static int TotalCost(String Type,int ticket)
	{
		int verify=ticketAvailablity(ticket);
	if(verify==1)
	{
		if(Type.equals("Platinum"))
		{
		cost=ticket*200;	
		}
		if(Type.equals("Diamond"))
		{
			cost=ticket*180;
		}
		if(Type.equals("Gold"))
		{
			cost=ticket*150;
		}
	}
		return  cost;
	}
	
}

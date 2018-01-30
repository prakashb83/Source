package TestRun;
import java.io.*;



import static org.junit.Assert.*;
import junit.framework.*;
public class TestBooking extends TestCase {
private static String name="abc";
private static String password="edc";
private static String  MovieName="abcd";
private static String TheatreName="qqq";
private static String TicketType="Diamond";
private static int No_of_Tickets=10;
private TicketData td;
public void setup(){
 td= new TicketData();
}
public void testName() throws IOException
{
	
	td.setName(name);
	assertEquals("abc",td. getname());
}
public void testPassword() throws IOException
{
	
	td.setPassword(password);
	assertEquals("edc",td. getPassword());
}
public void testNameComparision()
{
	assertEquals(1,td.LoginNameComparision(name));
}
public void testPasswordNameComparision()
{
	td.setPassword(password);
	assertEquals("true",td.LoginPasswordComparision("edc"));
}
public void testmoviename() throws IOException
{
	td.setMovieName(MovieName);
	assertEquals("abcd",td.getMovieName());
}
public void testTheatreName()
{
	td.setTheatreName(TheatreName);
	assertEquals("qqq",td.getTheatrename());
}
public void testTicketType()
{
	td.setTicketType(TicketType);
	assertEquals("Diamond",td.getTicketType());
}
public void testTicketNumber()
{
	td.setTicketNumber(No_of_Tickets);
	assertEquals(10,td.getTicketNumber());
}
public void testTicketAvailablity()
{
		assertEquals(1, td.ticketAvailablity(No_of_Tickets));
}
public void testTotalCost()
{
	assertEquals(1800, td.TotalCost(TicketType, No_of_Tickets));
}
public static Test suite(){
	return new TestSuite(TestBooking.class);
}
}

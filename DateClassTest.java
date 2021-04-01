
public class DateClassTest{
public static void main(String[] args) {
     DateClass newDate = new DateClass( 7, 4, 2004 );

      System.out.println( "The initial date is: ");
      newDate.getMonth();
      newDate.getDay();
      newDate.getYear();
      newDate.displayDate();

     
     newDate.setMonth( 11 );
     newDate.setDay( 1 );
     newDate.setYear( 2003 );

      System.out.println( "Date with new values is: " );
      newDate.displayDate();

      System.out.println();          

	}
}

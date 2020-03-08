package prep.String.Questions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringDateToDay {

	public static void main(String[] args) {
		
		String dateString = "10/12/2008";
		try {
			Date dt  = new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
			Calendar day = Calendar.getInstance();
			day.setTime(dt);
			int dayOfDate = day.get(Calendar.DAY_OF_WEEK);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		}

}

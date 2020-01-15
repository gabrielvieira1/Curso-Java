package sessao11.DatasECalendario;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class SomaEObterTempo {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2020-01-11T02:40:26Z"));
		
		System.out.println(sdf.format(d));
		
	//	somando unidade de tempo
	 
		Calendar cal =Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d =cal.getTime();
		
		System.out.println(sdf.format(d));
		
		
	/*	 Obtendo uma unidade de tempo
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);

		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		*/
	}

}

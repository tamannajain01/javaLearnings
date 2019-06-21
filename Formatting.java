import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Formatting {
	private Formatting(){}
	
	public static String currencyFormat(BigDecimal bd) {
		Locale locale=new Locale("hi","IN");
		NumberFormat nf=NumberFormat.getCurrencyInstance(locale);
		return nf.format(bd.doubleValue());
	}
	public static String dateFormat() {
		Date date=new Date();
		Locale locale=new Locale("hi","IN");
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL, locale);
		return df.format(date);
	}
}

package GenerateCSV;

public class DataUtil {

	
	public static String mkData(MetaBean bean, String pattern) {
		
		String val = pattern;
		if (bean.getType().toUpperCase().equals("TEXT")) {
			while(val.length() <= bean.getLength()) {
				val += pattern;
			}
		}
		return val.substring(0, bean.getLength());
	}
}

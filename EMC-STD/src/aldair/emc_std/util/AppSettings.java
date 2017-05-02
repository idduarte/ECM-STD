package aldair.emc_std.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.core.net.server.JsonInputStreamLogEventBridge;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AppSettings {
	private String appLocale;
	private ArrayList<String> availableLocales = new ArrayList<>();
	JSONParser parser = new JSONParser();
	
	public AppSettings() {
		try {
			Object obj = parser.parse(new FileReader("cfg/settings.json"));
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray languajesArray = (JSONArray) jsonObject.get("LanguagesArray");
//			Iterator iterator = languajesArray.iterator();
//			while (iterator.hasNext()) {
//				System.out.println(iterator.next());
//			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	String getAppLocale(){
		return appLocale;
	}
	
	public static void main(String[] args) {
		AppSettings app = new AppSettings();
	}

}

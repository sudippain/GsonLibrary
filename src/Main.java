import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

public class Main {

	public static void main(String[] args) throws JsonIOException, IOException {
		Phone p = new Phone("Samsung M10", 4, 10000, "Android");
		Gson gs = new Gson();
		
		System.out.println(p.toString());
		/** Object To Json ***/
		System.out.println(gs.toJson(p));
		
		/** JSON String To Object ***/
		String string = "{\"name\": \"Samsung M10\", \"ram\": \"4\", \"price\": \"10000\",\"os\": \"Android\"}";
		System.out.println(gs.fromJson(string, Phone.class)); //First one is json string value Second one is Pojo class of Json data
	}

}

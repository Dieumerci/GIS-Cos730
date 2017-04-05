import com.opencsv.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		BufferedReader  reader = null;
		try {
			reader = new BufferedReader (new FileReader("db_csv/build.csv"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	      //Read CSV line by line and use the string array as you want
	      String nextLine;
	      List<String> buildingNames = new ArrayList<String>();
	      List<String> polygons = new ArrayList<String>();
	      try {
			while ((nextLine = reader.readLine()) != null) {
			     if (nextLine != null) {
			        //Verifying the read data here
			    	 
			    	 String[] oneSeparatedLine = nextLine.toString().split("\"");
			    	 buildingNames.add(oneSeparatedLine[2].replace(",", ""));
			    	 polygons.add(oneSeparatedLine[1]);
			     }
			   }
			for (int i = 0; i < buildingNames.size(); i++)
			{
				System.out.println("Building: " + buildingNames.get(i) + " Polygons: " + polygons.get(i));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

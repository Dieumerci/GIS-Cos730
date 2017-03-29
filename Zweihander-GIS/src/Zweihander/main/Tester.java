package Zweihander.main;


import zweihander.services.GISModuleMock;
import Zweihander.domainModel.GISDataObject;
import Zweihander.exceptions.GISObjectNotFound;
import Zweihander.exceptions.InvalidGISRequest;
import Zweihander.request.GISRequest;
import Zweihander.response.GISResponse;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import zweihander.services.GISModuleMock;

/**
 *
 * @author Zweihander-GIS
 */


public class Tester {
    
    
    public static void main(String [ ] args) throws GISObjectNotFound, InvalidGISRequest, IOException, URISyntaxException
    {
       GISModuleMock mock = new GISModuleMock();
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String buildingName = "";
       GISResponse results;
       GISDataObject locationOne = new GISDataObject(-25.755682 ,28.232734,"IT Building",null);
       GISRequest gisRequest = new GISRequest();
       gisRequest.setmGISDataObject(locationOne);
       mock.addGISDataObject(gisRequest);

   
       
       System.out.println();
       System.out.println();
      
       System.out.println("Enter the name of building for coordinates: ");
       buildingName = br.readLine();
       
       String newString = buildingName.trim();
       
       System.out.println();
       System.out.println();
       
       
       results =  mock.getGISDataObject(gisRequest,newString);
       System.out.println("Location Name: " +results.getmGISDataObject().getObjectName());
       System.out.println("Latitude: "+results.getmGISDataObject().getGPSCoord()[0]);
       System.out.println("Longitude: "+results.getmGISDataObject().getGPSCoord()[1]);
       
       Desktop desktop = java.awt.Desktop.getDesktop();
       URI oURL = new URI("https://www.google.com/maps/preview/@"+results.getmGISDataObject().getGPSCoord()[0]+","+results.getmGISDataObject().getGPSCoord()[1]+",21z");
       desktop.browse(oURL);
       
    }
}

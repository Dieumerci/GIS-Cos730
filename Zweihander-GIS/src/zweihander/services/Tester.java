package zweihander.services;


import zweihander.services.GISModuleMock;
import Zweihander.domainModel.GISDataObject;
import Zweihander.exceptions.GISObjectNotFound;
import Zweihander.exceptions.InvalidGISRequest;
import Zweihander.request.GISRequest;
import Zweihander.response.GISResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Zweihander-GIS
 */


public class Tester {
    
    public static void main(String [ ] args) throws GISObjectNotFound, InvalidGISRequest, IOException
    {
       GISModuleMock mock = new GISModuleMock();
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String buildingName = "";
       GISResponse results;
       GISDataObject locationOne = new GISDataObject(-25.755538,28.576344,"IT Building",null);
       GISDataObject locationTwo = new GISDataObject(-24.7345538,27.873144,"EMS Building",null);
       GISRequest gisRequest = new GISRequest();
       gisRequest.setmGISDataObject(locationOne);
       mock.addGISDataObject(gisRequest);
       gisRequest.setmGISDataObject(locationTwo);
       mock.addGISDataObject(gisRequest);
      
       
       System.out.println("Enter the name of building for coordinates: ");
       buildingName = br.readLine();
       
        results =  mock.getGISDataObject(gisRequest);
       
      
       System.out.println("Location Name: " +results.getmGISDataObject().getObjectName());
       System.out.println("Latitude: "+results.getmGISDataObject().getGPSCoord()[0]);
       System.out.println("Longitude: "+results.getmGISDataObject().getGPSCoord()[1]);
       
    }
}

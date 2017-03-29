package Zweihander.domainModel;

import Zweihander.request.GISRequest;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Zweihander-GIS
 */

public class GISDataStore 
{
   

    private List<GISDataObject> gisDataObjects = new LinkedList<>();
    
    public GISDataStore()
    {}
    
    public  GISDataStore(GISDataObject mGisDataObject)
    {
       addGISDataObject(mGisDataObject);
    }
    public void addGISDataObject(GISDataObject mGisDataObject)
    {
       gisDataObjects.add(mGisDataObject);
       System.out.println(mGisDataObject.getObjectName() + "was added to the database");
    }
    public GISDataObject getGISDataObject(GISRequest mGISRequest,String locationName)
    {
       String buildingName = "";
       
       for(int i=0;i<gisDataObjects.size();i++)
       {
          
           buildingName = gisDataObjects.get(i).getObjectName();
          
           if( buildingName == "IT Building")
           {
              return gisDataObjects.get(i);
           }
       }
       return null;
    }
    public GISDataObject modifyGISData(GISDataObject mGisDataObject)
    {
        double[] mGPSCoord = new double[2];
        
        for(int i = 0; i< gisDataObjects.size();i++)
        {
            if(gisDataObjects.get(i) == mGisDataObject )
            {
                mGPSCoord[0] = 38.898556;
                mGPSCoord[1] = -77.037852;
                gisDataObjects.get(i).setGPSCoord(mGPSCoord);
                gisDataObjects.get(i).addTag("Modified tag");
                return gisDataObjects.get(i);
            }
        }
        
        return null;
    }
}

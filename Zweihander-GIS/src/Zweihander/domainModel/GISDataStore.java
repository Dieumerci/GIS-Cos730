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
    }
    public GISDataObject getGISDataObject(GISRequest mGISRequest)
    {
       //Search for the GISDataObject from the list
       for(int i=0;i<gisDataObjects.size();i++)
       {
           if(gisDataObjects.get(i) == mGISRequest.getmGISDataObject())
           {
               return gisDataObjects.get(i);
           }
       }
       //GISDataObject not found
       return null;
    }
    public GISDataObject modifyGISData(GISDataObject mGisDataObject)
    {
        double[] mGPSCoord = new double[2];
        
        for(int i = 0; i< gisDataObjects.size();i++)
        {
            if(gisDataObjects.get(i) == mGisDataObject )
            {
                //modify GPS coordinates
                
                mGPSCoord[0] = 38.898556;
                mGPSCoord[1] = -77.037852;
                
                gisDataObjects.get(i).setGPSCoord(mGPSCoord);
                
                gisDataObjects.get(i).addTag("Modified tag");
                
                
                //Return modified object
                return gisDataObjects.get(i);
            }
        }
        //GISObject to modify not found
        return null;
    }
}

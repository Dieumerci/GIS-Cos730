package Zweihander.domainModel;

import Zweihander.request.GISRequest;
import com.sun.istack.internal.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zweihander-GIS
 */

public class GISDataStrore 
{
   
    @NotNull
    private List<GISDataObject> gisDataObject;
    
    public GISDataStrore()
    {}
    
    public  GISDataStrore(GISDataObject mGisDataObject)
    {
       addGISDataObject(mGisDataObject);
    }
   
    public void addGISDataObject(GISDataObject mGisDataObject)
    {
       gisDataObject.add(mGisDataObject);
    }
    public GISDataObject getGISDataObject(GISRequest mGISRequest)
    {
       //Search for the GISDataObject from the list
       for(int i=0;i<gisDataObject.size();i++)
       {
           if(gisDataObject.get(i) == mGISRequest.getmGISDataObject())
           {
               return gisDataObject.get(i);
           }
       }
       //GISDataObject not found
       return null;
    }
    public GISDataObject modifyGISData(GISDataObject mGisDataObject)
    {
        double[] mGPSCoord = new double[2];
        
        for(int i = 0; i< gisDataObject.size();i++)
        {
            if(gisDataObject.get(i) == mGisDataObject )
            {
                //modify GPS coordinates
                
                mGPSCoord[0] = 38.898556;
                mGPSCoord[1] = -77.037852;
                
                gisDataObject.get(i).setGPSCoord(mGPSCoord);
                
                gisDataObject.get(i).addTag("Modified tag");
                
                
                //Return modified object
                return gisDataObject.get(i);
            }
        }
        //GISObject to modify not found
        return null;
    }
}

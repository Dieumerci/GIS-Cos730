package Zweihander.domainModel;

import java.util.List;

/**
 *
 * @author Zweihander-GIS
 */

public class GISDataObject 
{
   private double[] GPSCoord = new double[2];
   private String objectName;
   private List<String> GPSTags;
   
   public GISDataObject()
   {
       GPSTags = null;
       
       for(int i = 0;i<GPSCoord.length;i++)
       {
           GPSCoord[i] = 0.0;
       }
   }
   public GISDataObject(double latitude,double longitude, String mObjectName,List<String> tags)
   {
       GPSCoord[0] = latitude;
       GPSCoord[1] = longitude;
       objectName = mObjectName ;
       GPSTags = tags;
   }

    /**
     * @return the GPSCoord
     */
    public double[] getGPSCoord() 
    {
        return GPSCoord;
    }

    /**
     * @param GPSCoord the GPSCoord to set
     */
    public void setGPSCoord(double[] GPSCoord)
    {
        this.GPSCoord = GPSCoord;
    }

    /**
     * @return the GPSTags
     */
    public List<String> getGPSTags() 
    {
        return GPSTags;
    }

    /**
     * @param GPSTags the GPSTags to set
     */
    public void setGPSTags(List<String> GPSTags)
    {
        this.GPSTags = GPSTags;
    }
     /**
     * @param tag the tag to set
     */
    public void addTag( String tag) 
    {
        this.GPSTags.add(tag);
    }

    /**
     * @return the objectName
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * @param objectName the objectName to set
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
}
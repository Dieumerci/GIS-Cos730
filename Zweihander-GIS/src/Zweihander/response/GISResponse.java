package Zweihander.response;

import Zweihander.domainModel.GISDataObject;

/**
 *
 * @author Zweihander-GIS
 */
public class GISResponse  
{
    private GISDataObject mGISDataObject;
    
    public GISResponse()
    {
        mGISDataObject = null;
    }
    public GISResponse(GISDataObject sGISDataObject)
    {
        mGISDataObject = sGISDataObject;
    }
    /**
     * @return the mGISDataObject
     */
    public GISDataObject getmGISDataObject() {
        return mGISDataObject;
    }

    /**
     * @param mGISDataObject the mGISDataObject to set
     */
    public void setmGISDataObject(GISDataObject mGISDataObject) {
        this.mGISDataObject = mGISDataObject;
    }
    
}

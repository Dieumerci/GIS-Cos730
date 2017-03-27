package Zweihander.request;

import Zweihander.domainModel.GISDataObject;


/**
 *
 * @author Zweihander-GIS
 */
public class GISRequest 
{
    private GISDataObject mGISDataObject;
    
    public GISRequest()
    {
        mGISDataObject = null;
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

package zweihander.services;

import Zweihander.domainModel.GISDataObject;
import Zweihander.domainModel.GISDataStore;
import Zweihander.exceptions.GISObjectNotFound;
import Zweihander.exceptions.InvalidGISRequest;
import Zweihander.request.GISRequest;
import Zweihander.response.GISResponse;

/**
 *
 * @author Zweihander-GIS
 */
public class GISModuleMock {
    
    private GISDataStore dataStore;
    
    public GISModuleMock()
    {
        dataStore = new GISDataStore();
    }
    public GISResponse addGISDataObject(GISRequest gisRequest)throws GISObjectNotFound,InvalidGISRequest
    {
        GISDataObject locationOne = gisRequest.getmGISDataObject();
        dataStore.addGISDataObject(locationOne);
        return new GISResponse(locationOne);
    }
    public GISResponse getGISDataObject(GISRequest gisRequest)throws GISObjectNotFound
    {
        GISDataObject mGISObject;
        if(dataStore.getGISDataObject(gisRequest)== null)
            throw new GISObjectNotFound("GIS object not found");
        else
        {
            mGISObject = dataStore.getGISDataObject(gisRequest);
            System.out.println(mGISObject.getObjectName());
        }
        return new GISResponse(mGISObject);
    }
}

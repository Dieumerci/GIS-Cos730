package zweihander.services;

import Zweihander.response.GISResponse;
import Zweihander.request.GISRequest;

/**
 *
 * @author Zweihander-GIS
 */
public interface GISModule 
{
   public GISResponse addGISDataObject(GISRequest gisRequest);
}

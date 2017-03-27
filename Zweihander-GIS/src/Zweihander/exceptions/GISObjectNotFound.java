package Zweihander.exceptions;

/**
 *
 * @author Zweihander-GIS
 */
public class GISObjectNotFound extends Exception
{
    
    
    public GISObjectNotFound(String massage)
    {
        super(massage);
    }
    public GISObjectNotFound(Throwable cause) 
    {
        super(cause);
    }
    public GISObjectNotFound(String message, Throwable cause) 
    {
        super(message, cause);
    }
}

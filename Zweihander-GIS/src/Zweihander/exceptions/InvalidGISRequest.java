package Zweihander.exceptions;

/**
 *
 * @author Zweihander-GIS
 */
public class InvalidGISRequest extends Exception
{
    public InvalidGISRequest(String massage)
    {
        super(massage);
    }
    public InvalidGISRequest(Throwable cause) 
    {
        super(cause);
    }
    public InvalidGISRequest(String message, Throwable cause) 
    {
        super(message, cause);
    }
    
}

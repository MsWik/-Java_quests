package by.les10.service;

public class ServiceException extends Exception {

    public  ServiceException (String message){
        super(message);
    }
    public ServiceException(Exception e){
        super(e);
    }

}

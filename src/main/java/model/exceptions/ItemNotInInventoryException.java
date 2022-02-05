package model.exceptions;

public class ItemNotInInventoryException extends RuntimeException{
    public ItemNotInInventoryException(String errorMessage) {
        super(errorMessage);
    }
}

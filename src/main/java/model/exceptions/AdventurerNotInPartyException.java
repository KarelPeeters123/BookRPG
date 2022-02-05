package model.exceptions;

public class AdventurerNotInPartyException extends RuntimeException{
    public AdventurerNotInPartyException(String errorMessage) {
        super(errorMessage);
    }
}

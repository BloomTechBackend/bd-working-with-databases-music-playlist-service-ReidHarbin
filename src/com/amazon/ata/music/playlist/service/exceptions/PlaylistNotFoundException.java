package com.amazon.ata.music.playlist.service.exceptions;

/**
 * E`xception to throw when a given playlist ID is not found in the database.`
 */
public class PlaylistNotFoundException extends InvalidAttributeValueException {

    private static final long serialVersionUID = -912326717789387971L;

    /**
     * Exception with no message or cause.
     */
    public PlaylistNotFoundException() {
        super();
    }

    /**
     * Exception with a message, but no cause.
     * @param message A descriptive message for this exception.
     */
    public PlaylistNotFoundException(String message) {
        super(message);
    }

    /**
     * Exception with no message, but with a cause.
     * @param cause The original throwable resulting in this exception.
     */
    public PlaylistNotFoundException(Throwable cause) {
        super(cause);
    }

    /**
     * Exception with message and cause.
     * @param message A descriptive message for this exception.
     * @param cause The original throwable resulting in this exception.
     */
    public PlaylistNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

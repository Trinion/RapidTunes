package me.oskarmendel.exception;

/**
 * Exception class for player state.
 * 
 * @author Jesper Bergstrom
 * @name PlayerStateException.java
 * @version 0.00.00
 */
public class PlayerStateException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Initiates the exception.
	 * 
	 * @param message
	 */
	public PlayerStateException(String message){
		super(message);
	}
}

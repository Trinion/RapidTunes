package me.oskarmendel.exception;

import me.oskarmendel.player.Player;

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
	private static final long serialVersionUID = -5656848693309679151L;

	/**
	 * Constructs the exception.
	 */
	public PlayerStateException(Player player){
		super("Time: " + player.getCurrentTime() +
				" Volume: " + player.getVolume() +
				" Player: " + player.toString());
	}
}

package com.programming.class3;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class CustomException {
	public static void main(String[] args) throws InvalidAgeException {
		validateAge(17);
	}
	static void validateAge(int age) throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("user cannot vote");
		else
			System.out.println("User can vote");
	}

}

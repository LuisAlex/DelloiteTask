package com.deloitte.exception;

/*
 * Luis Chacon 08-08-18
 * Deloitte Coding Assignment for Interview
 * Write a utility class that encrypts and decrypts names
 */

public class EncryptionException extends Exception
{
	public EncryptionException(String message)
	{
		super(message);
	}
}

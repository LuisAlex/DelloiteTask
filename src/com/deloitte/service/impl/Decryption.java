package com.deloitte.service.impl;

import com.deloitte.exception.DecryptionException;
import com.deloitte.exception.EncryptionException;
import com.deloitte.service.DecryptionRules;
import com.deloitte.service.EncryptionRules;

/*
 * Luis Chacon 08-08-18
 * Deloitte Coding Assignment for Interview
 * Write a utility class that encrypts and decrypts names
 */
public class Decryption implements DecryptionRules 
{


	private String part1 = "";

	@Override
	public String decryption(String name) throws DecryptionException 
	{
		//adding a # at the end of the name if it is an odd number
				int mid = ((int) Math.floor(name.length() / 2))-1;
				String check = Character.toString(name.charAt(mid));
				if(check.equals("#"))
				{
					part1 = name.substring(0, mid);
				}else
				{
					part1 = name.substring(0, mid+1);
				}
				//Split the name into two equal parts.
				String part2 = name.substring(mid+1, name.length());
				return part2+part1;
	}

}

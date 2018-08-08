package com.deloitte.service.impl;

import com.deloitte.exception.EncryptionException;
import com.deloitte.service.EncryptionRules;

/*
 * Split the name into two equal parts. if it is an odd number length, then add a # at the end of the name to make the length even.
 * Example: Amin -> “Am” “in”
 * Example: Vimal -> “Vim” “al#”
 * Reverse the parts and concatenate back into one string
 * Example: Amin -> Am in -> inAm
 * Example: Vimal -> Vim al# -> al#Vim
 */
public class Encryption implements EncryptionRules {

	@Override
	public String encryption(String name) throws EncryptionException 
	{
		 
		//adding a # at the end of the name if it is an odd number
		if(name.length()%2 != 0)
		{
			name = name+"#";
		}
		//Split the name into two equal parts.
		int mid = Math.round((float) name.length() / 2);
		String part1 = name.substring(0, mid);
		String part2 = name.substring(mid, name.length());
		return part2+part1;
	}

	

}

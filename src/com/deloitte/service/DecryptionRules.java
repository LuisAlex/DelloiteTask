package com.deloitte.service;

import com.deloitte.exception.DecryptionException;
import com.deloitte.exception.EncryptionException;

/*
 * Decryption would reverse this algorithm and remove the ‘#’ symbol if present.
 * 
 * Reverse the parts and concatenate back into one string
 * Example: Amin -> Am in -> inAm
 * Example: Vimal -> Vim al# -> al#Vim
 * 
 * Split the name into two equal parts. if it is an odd number length, then add a # at the end of the name to make the length even.
 * Example: Amin -> “Am” “in”
 * Example: Vimal -> “Vim” “al#”
 */
public interface DecryptionRules 
{
	public String decryption(String name) throws DecryptionException;

}

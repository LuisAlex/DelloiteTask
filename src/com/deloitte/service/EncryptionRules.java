package com.deloitte.service;

import com.deloitte.exception.EncryptionException;

public interface EncryptionRules 
{
	public String encryption(String name) throws EncryptionException;

}

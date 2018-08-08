package com.deloitte.model;

import java.util.HashMap;
import java.util.Map;

/*
 * Luis Chacon 08-08-18
 * Deloitte Coding Assignment for Interview
 * Write a utility class that encrypts and decrypts names
 */

public class Cache 
{
	Map<String, String> Cache = new HashMap<String, String>();

	/**
	 * @return the cache
	 */
	public Map<String, String> getCache() {
		return Cache;
	}

	/**
	 * @param cache the cache to set
	 */
	public void setCache(Map<String, String> cache) {
		Cache = cache;
	}

}

package com.deloitte.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.deloitte.exception.DecryptionException;
import com.deloitte.exception.EncryptionException;
import com.deloitte.service.impl.Decryption;
import com.deloitte.service.impl.Encryption;

/*
 * Luis Chacon 08-08-18
 * Deloitte Coding Assignment for Interview
 * Write a utility class that encrypts and decrypts names
 */

public class EncryptionUtility 
{

	private static Decryption decryption = new Decryption();
	private static Encryption encryption = new Encryption();
	private static Map<String, String> cache = new HashMap<String, String>();
	private static boolean cacheFlag =true;
	
	public static void main(String arg[]) throws EncryptionException, DecryptionException
	{
		
		//String[] names = {"Sridhar", "Sridhar", "Amin", "inAm", "ilA"};
		
		boolean flag = true;
		while(flag)
		{
			cacheFlag =true;
			System.out.println("Type the name: ");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			cache.forEach((k,v)->{
				if(name.equals(k))
				{
					System.out.println(name+" found in cache");
					System.out.println("result= "+ v);
					cacheFlag =false;
					
				} else if (name.equals(v))
				{
					System.out.println(name+" found in cache");
					System.out.println("result= "+ k);
					cacheFlag =false;
				}
			});

			if(cacheFlag)
			{
			
			
				System.out.println("want to encrypt or decrypt: E / D");
				try 
				{
					String toGo = sc.nextLine().toLowerCase().equals("e") ? "encrypting" : "decrypting";
					System.out.println(toGo + " "+name);
					System.out.println("adding to cache");
					if(toGo.equals("encrypting"))
					{

						String result = encryption.encryption(name);
						System.out.println("result= "+ result+"\n");
						cache.put(name, result);
						
					}else
					{
						String result = decryption.decryption(name);
						System.out.println("result= "+ result+"\n");
						cache.put(result, name);
					}
					
				} catch (EncryptionException e) {
					sc.close();
					 throw new EncryptionException("Error while encrypting name");
				} catch (DecryptionException e) {
					sc.close();
					 throw new DecryptionException("Error while decrypting name");
				}
			}
			
		System.out.println("want to try again: Y / N");
		if(sc.nextLine().toLowerCase().equals("n"))
		{
			sc.close();
			System.out.println("Bye bye =)... ");
			flag=false;
		}
		}
	}

}

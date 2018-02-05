package com.ys.pmyhost.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1Util {

	public static String getSHA1(byte[] message) throws NoSuchAlgorithmException{
		MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
		messageDigest.update(message);
		return new String(messageDigest.digest());
	}
	
}

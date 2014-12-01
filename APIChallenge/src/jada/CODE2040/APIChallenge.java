package jada.CODE2040;

import java.io.*;
import java.net.*;

import org.json.simple.*;




public class APIChallenge {

	public static void main(String[] args) {
		BufferedReader br; 
		JSONObject send; 
		JSONObject receive; 
		
		// Registering 
		String token = register(); 
		System.out.println("My token is " + token + ".");
		

	}

	private static String register() {
		JSONObject dic = new JSONObject();
		dic.put("email", "jah2234@barnard.edu");
		dic.put("github", "");
		
		// HTTP Request
		URL url = new URL("http://challenge.code2040.org/api/register");
		JSONObject data = getDate(dic, url);
		return (String) data.get("result");
	}
}

package com.example.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.example.rmi.contract.PoliticianService;

public class Main {
	
	public static void main(String[] args) {

		String name = "A Raja";
		
		if(args.length >= 1)
			name = args[0];
		
		try {
			PoliticianService politicianService = (PoliticianService) Naming.lookup("rmi://192.168.43.88:1099/politician-service");
			int rs = politicianService.fraudCount(name);
			System.out.printf("Frauds done so far : %s%n",rs);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
	}

}

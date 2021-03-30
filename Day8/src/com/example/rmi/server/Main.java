package com.example.rmi.server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) {

		try {
			PoliticianServiceImpl politicianServiceImpl = new PoliticianServiceImpl();
			Naming.rebind("rmi://192.168.43.88:1099/politician-service", politicianServiceImpl);
			System.out.println("RMI Server is ready and object is bound to RMI naming service!!!!");
		} catch (RemoteException e) {
			System.out.println("Error is RMI Server!!!!");
			e.printStackTrace();
		} catch (MalformedURLException e) {
			System.out.println("Error is RMI Server!!!!");
			e.printStackTrace();
		} 
	}

}

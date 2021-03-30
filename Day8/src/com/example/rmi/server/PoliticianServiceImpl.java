package com.example.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

import com.example.rmi.contract.PoliticianService;

public class PoliticianServiceImpl extends UnicastRemoteObject implements PoliticianService {

	Map<String, Integer> db = null;

	public PoliticianServiceImpl() throws RemoteException {
		super();
		db = new HashMap<>();
		db.put("Lalu Yadav", 450);
		db.put("Sharad Pawar", 900);
		db.put("A Raja", 230);
		db.put("Kalmadi", 200);
	}

	public int fraudCount(String name) {
		System.out.println("Inside fraudCount()!!!!!");
		return db.get(name);
	}

}

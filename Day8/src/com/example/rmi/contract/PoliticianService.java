package com.example.rmi.contract;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PoliticianService extends Remote {
	public int fraudCount(String name) throws RemoteException;
}

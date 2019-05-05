package servidor;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import comum.ServicoRemotoImpl;


public class Servico {
	public Servico() throws RemoteException{
		try {
			LocateRegistry.createRegistry(8282);
			System.out.println("Início");
			Naming.rebind("rmi://localhost:8282/pessoa", new ServicoRemotoImpl());
			System.out.println("Fim");
			} catch (Exception e) {
				e.printStackTrace();				
			}
		
	}
	
	public static void main(String[] args) throws RemoteException{
		new Servico();
	}
		
			
	}
	
	
	
	
	


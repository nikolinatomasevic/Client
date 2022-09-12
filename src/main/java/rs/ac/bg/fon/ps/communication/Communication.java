/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.communication;

import rs.ac.bg.fon.ps.communication.Sender;
import rs.ac.bg.fon.ps.communication.Receiver;
import rs.ac.bg.fon.ps.communication.Request;
import rs.ac.bg.fon.ps.communication.Response;
import java.net.Socket;

/**
 *
 * @author nikolinatomasevic
 */
public class Communication {

	private static Communication instance;
	private Socket socket;

	private Communication() {

	}

	public static Communication getInstance() {
		if (instance == null) {
			instance = new Communication();
		}
		return instance;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	public Response login(Request request) throws Exception {
		new Sender(socket).send(request);
		System.out.println("Zahtev za prijavom na sistem je poslat.");
		return (Response) new Receiver(socket).receive();
	}

	public Response ucitajListuMasinaIliAlata(Request request) throws Exception {
		new Sender(socket).send(request);
		System.out.println("Zahtev za listom svih masina ili alata je poslat.");
		return (Response) new Receiver(socket).receive();
	}

	public Response zapamtiMasinuIliAlat(Request request) throws Exception {
		new Sender(socket).send(request);
		System.out.println("Zahtev za cuvanjem masine ili alata je poslat.");
		return (Response) new Receiver(socket).receive();
	}

	public Response zapamtiRadnika(Request request) throws Exception {
		new Sender(socket).send(request);
		System.out.println("Zahtev za cuvanjem radnika je poslat.");
		return (Response) new Receiver(socket).receive();
	}

	public Response ucitajListuRadnihMesta(Request request) throws Exception {
		new Sender(socket).send(request);
		System.out.println("Zahtev za listom svih radnih mesta je poslat.");
		return (Response) new Receiver(socket).receive();
	}

	public Response ucitajListuRadnika(Request request) throws Exception {
		new Sender(socket).send(request);
		System.out.println("Zahtev za listom svih radnika je poslat.");
		return (Response) new Receiver(socket).receive();
	}

	public Response zapamtiRevers(Request request) throws Exception {
		new Sender(socket).send(request);
		System.out.println("Zahtev za cuvanjem reversa je poslat.");
		return (Response) new Receiver(socket).receive();
	}

	public Response promeniRadnika(Request request) throws Exception {
		new Sender(socket).send(request);
		System.out.println("Zahtev za promenom podataka radnika je poslat.");
		return (Response) new Receiver(socket).receive();
	}

	public Response promeniMasinuIliAlat(Request request) throws Exception {
		new Sender(socket).send(request);
		System.out.println("Zahtev za promenom masine ili alata je poslat.");
		return (Response) new Receiver(socket).receive();
	}

	public Response ucitajListuReversa(Request request) throws Exception {
		new Sender(socket).send(request);
		System.out.println("Zahtev za listom svih reversa je poslat.");
		return (Response) new Receiver(socket).receive();
	}

	public Response promeniStavkuReversa(Request request) throws Exception {
		new Sender(socket).send(request);
		System.out.println("Zahtev za promenom stavke reversa je poslat.");
		return (Response) new Receiver(socket).receive();
	}

	public Response nadjiRadnike(Request request) throws Exception {
		new Sender(socket).send(request);
		System.out.println("Zahtev za trazenim radnicima je poslat.");
		return (Response) new Receiver(socket).receive();
	}

	public Response nadjiMasineIliAlat(Request request) throws Exception {
		new Sender(socket).send(request);
		System.out.println("Zahtev za trazenim masinama ili alatom je poslat.");
		return (Response) new Receiver(socket).receive();
	}

	public Response nadjiStavkeReversa(Request request) throws Exception {
		new Sender(socket).send(request);
		System.out.println("Zahtev za trazenim stavkama reversa je poslat.");
		return (Response) new Receiver(socket).receive();
	}

}

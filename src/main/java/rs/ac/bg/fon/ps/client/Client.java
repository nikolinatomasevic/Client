/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.client;

import rs.ac.bg.fon.ps.communication.Communication;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import rs.ac.bg.fon.ps.view.FrmLogin;

/**
 *
 * @author ACER
 */
public class Client {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Client client = new Client();
		try {
			client.connect();
		} catch (IOException ex) {
			Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void connect() throws IOException {
		Socket socket = new Socket("localhost", 9000);
		System.out.println("Klijent se povezao");
		Communication.getInstance().setSocket(socket);
		FrmLogin frmLogin = new FrmLogin();
		frmLogin.setLocationRelativeTo(null);
		frmLogin.setVisible(true);
	}

}

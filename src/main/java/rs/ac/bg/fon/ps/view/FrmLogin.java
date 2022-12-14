/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view;

import rs.ac.bg.fon.ps.controller.Controller;
import rs.ac.bg.fon.ps.domain.Magacioner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;

/**
 *
 * @author nikolinatomasevic
 */
public class FrmLogin extends javax.swing.JFrame {

	/**
	 * Creates new form FrmLogin
	 */

	public FrmLogin() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		lblKorisnickoIme = new javax.swing.JLabel();
		txtKorisnickoIme = new javax.swing.JTextField();
		lblLozinka = new javax.swing.JLabel();
		pswdLozinka = new javax.swing.JPasswordField();
		btnLogin = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Prijavljivanje na sistem");
		setMinimumSize(new java.awt.Dimension(472, 342));

		lblKorisnickoIme.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lblKorisnickoIme.setText("Korisnicko ime:");

		txtKorisnickoIme.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		txtKorisnickoIme.setText("petar.milosevic@ps.fon.bg.ac.rs");

		lblLozinka.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lblLozinka.setText("Lozinka:");

		pswdLozinka.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		pswdLozinka.setText("pm12345");

		btnLogin.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		btnLogin.setText("Login");
		btnLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLoginActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout
				.createSequentialGroup().addContainerGap()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtKorisnickoIme, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE)
						.addComponent(pswdLozinka, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblKorisnickoIme, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLozinka, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(11, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(35)
						.addComponent(lblKorisnickoIme, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(txtKorisnickoIme, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(lblLozinka, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(pswdLozinka, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(39).addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(11, Short.MAX_VALUE)));
		jPanel1.setLayout(jPanel1Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLoginActionPerformed
		try {
			validateForm();
			Magacioner magacioner = Controller.getInstance().login(txtKorisnickoIme.getText().trim(),
					String.valueOf(pswdLozinka.getPassword()));
			JOptionPane.showMessageDialog(this, "Dobro dosli, " + magacioner.getIme() + ".", "Login",
					JOptionPane.INFORMATION_MESSAGE);
			this.dispose();
			FrmMain frmM = new FrmMain();
			frmM.setExtendedState(JFrame.MAXIMIZED_BOTH);
			frmM.setVisible(true);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage(), "Login error", JOptionPane.ERROR_MESSAGE);
		}
	}// GEN-LAST:event_btnLoginActionPerformed

	/**
	 * @param args the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnLogin;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel lblKorisnickoIme;
	private javax.swing.JLabel lblLozinka;
	private javax.swing.JPasswordField pswdLozinka;
	private javax.swing.JTextField txtKorisnickoIme;
	// End of variables declaration//GEN-END:variables

	private void validateForm() throws Exception {
		String errorMessage = "";
		if (txtKorisnickoIme.getText().isEmpty()) {
			errorMessage += "Polje za korisnicko ime ne sme biti prazno!\n";
		}
		if (String.valueOf(pswdLozinka.getPassword()).isEmpty()) {
			errorMessage += "Polje za lozinku ime ne sme biti prazno!\n";
		}
		if (!errorMessage.isEmpty()) {
			throw new Exception(errorMessage);
		}
	}

}

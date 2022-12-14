/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view;

import rs.ac.bg.fon.ps.controller.Controller;
import rs.ac.bg.fon.ps.domain.Radnik;
import rs.ac.bg.fon.ps.domain.RadnoMesto;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author nikolinatomasevic
 */
public class FrmNoviRadnik extends javax.swing.JDialog {

	/**
	 * Creates new form FrmNewRadnik
	 */
	public FrmNoviRadnik(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
		try {
			pripremiFormu();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
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
		lblIme = new javax.swing.JLabel();
		txtIme = new javax.swing.JTextField();
		lblPrezime = new javax.swing.JLabel();
		txtPrezime = new javax.swing.JTextField();
		lblBrojTelefona = new javax.swing.JLabel();
		txtBrojTelefona = new javax.swing.JTextField();
		lblMejl = new javax.swing.JLabel();
		txtMejl = new javax.swing.JTextField();
		lblRadnoMesto = new javax.swing.JLabel();
		cmbRadnoMesto = new javax.swing.JComboBox();
		btnSacuvaj = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Kreiranje Novog Radnika");
		setMinimumSize(new java.awt.Dimension(492, 442));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Radnik",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 0, 15))); // NOI18N

		lblIme.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lblIme.setText("* Ime:");

		txtIme.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		lblPrezime.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lblPrezime.setText("* Prezime:");

		txtPrezime.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		lblBrojTelefona.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lblBrojTelefona.setText("   Broj telefona:");

		txtBrojTelefona.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		lblMejl.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lblMejl.setText("* Mejl:");

		txtMejl.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		lblRadnoMesto.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lblRadnoMesto.setText("* Radno mesto:");

		cmbRadnoMesto.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		btnSacuvaj.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		btnSacuvaj.setText("Sacuvaj");
		btnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSacuvajActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(lblIme, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblPrezime, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18)
												.addComponent(txtPrezime))
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18)
												.addComponent(txtIme))))
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(lblBrojTelefona, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblMejl, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblRadnoMesto, javax.swing.GroupLayout.DEFAULT_SIZE, 109,
												Short.MAX_VALUE))
								.addGap(18, 18, 18)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(txtBrojTelefona).addComponent(txtMejl)
										.addComponent(cmbRadnoMesto, 0, 303, Short.MAX_VALUE))))
						.addContainerGap(13, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(btnSacuvaj,
								javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblIme, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblMejl, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtMejl, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblRadnoMesto, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(cmbRadnoMesto, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addComponent(btnSacuvaj, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		jLabel1.setText("Polja oznacena zvezdicom su obavezna.");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addComponent(jLabel1).addGap(0, 204, Short.MAX_VALUE))
						.addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSacuvajActionPerformed
		try {
			Radnik noviRadnik = new Radnik();
			noviRadnik.setIme(txtIme.getText().trim());
			noviRadnik.setPrezime(txtPrezime.getText().trim());
			if (!txtBrojTelefona.getText().trim().isEmpty()) {
				noviRadnik.setBrojTelefona(txtBrojTelefona.getText().trim());
			}
			noviRadnik.setMejl(txtMejl.getText().trim());
			noviRadnik.setRadnoMesto((RadnoMesto) cmbRadnoMesto.getSelectedItem());
			Controller.getInstance().zapamtiRadnika(noviRadnik);
			JOptionPane.showMessageDialog(this, "Sistem je zapamtio radnika.", "Info", JOptionPane.INFORMATION_MESSAGE);
			this.dispose();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
	}// GEN-LAST:event_btnSacuvajActionPerformed

	/**
	 * @param args the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnSacuvaj;
	private javax.swing.JComboBox cmbRadnoMesto;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel lblBrojTelefona;
	private javax.swing.JLabel lblIme;
	private javax.swing.JLabel lblMejl;
	private javax.swing.JLabel lblPrezime;
	private javax.swing.JLabel lblRadnoMesto;
	private javax.swing.JTextField txtBrojTelefona;
	private javax.swing.JTextField txtIme;
	private javax.swing.JTextField txtMejl;
	private javax.swing.JTextField txtPrezime;
	// End of variables declaration//GEN-END:variables

	private void pripremiFormu() throws Exception {
		cmbRadnoMesto.removeAllItems();
		List<RadnoMesto> radnaMesta = Controller.getInstance().ucitajListuRadnihMesta();
		radnaMesta.remove(0);
		for (RadnoMesto radnoMesto : radnaMesta) {
			cmbRadnoMesto.addItem(radnoMesto);
		}
	}

}

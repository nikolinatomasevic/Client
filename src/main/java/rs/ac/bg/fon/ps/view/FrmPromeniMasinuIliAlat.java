/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view;

import rs.ac.bg.fon.ps.controller.Controller;
import rs.ac.bg.fon.ps.domain.MasinaIliAlat;
import javax.swing.JOptionPane;

/**
 *
 * @author nikolinatomasevic
 */
public class FrmPromeniMasinuIliAlat extends javax.swing.JDialog {

	/**
	 * Creates new form FrmNewMasinaIliAlat
	 */

	private MasinaIliAlat masinaIliAlat;

	public FrmPromeniMasinuIliAlat(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
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
		lbl2 = new javax.swing.JLabel();
		txtNaziv = new javax.swing.JTextField();
		lbl3 = new javax.swing.JLabel();
		lbl5 = new javax.swing.JLabel();
		btnSacuvajPromene = new javax.swing.JButton();
		lbl1 = new javax.swing.JLabel();
		lblID = new javax.swing.JLabel();
		lbl4 = new javax.swing.JLabel();
		txtDodaj = new javax.swing.JTextField();
		lblKolicinaNaZaduzenju = new javax.swing.JLabel();
		lblKolicinaUMagacinu = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Promena Podataka Masine Ili Alata");
		setLocation(new java.awt.Point(0, 0));
		setMinimumSize(new java.awt.Dimension(472, 432));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Masina ili Alat",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 0, 15))); // NOI18N

		lbl2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lbl2.setText("* Naziv:");

		txtNaziv.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		lbl3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lbl3.setText("  Kolicina u magacinu:");

		lbl5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lbl5.setText("  Kolicina na zaduzenju:");

		btnSacuvajPromene.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		btnSacuvajPromene.setText("Sacuvaj promene");
		btnSacuvajPromene.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSacuvajPromeneActionPerformed(evt);
			}
		});

		lbl1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lbl1.setText("  ID:");

		lblID.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		lbl4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lbl4.setText("  Dodaj:");

		txtDodaj.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		lblKolicinaNaZaduzenju.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		lblKolicinaUMagacinu.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(lbl2, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(lbl5, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
								.addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(lblID, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(btnSacuvajPromene, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
								.addComponent(txtNaziv, javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(txtDodaj, javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblKolicinaNaZaduzenju, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(lblKolicinaUMagacinu, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblKolicinaUMagacinu, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(txtDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18).addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE,
												32, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(lblKolicinaNaZaduzenju, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addComponent(btnSacuvajPromene, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		jLabel1.setText("Polja oznacena zvezdicom su obavezna.");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup().addComponent(jLabel1).addGap(0, 185, Short.MAX_VALUE)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(17, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnSacuvajPromeneActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSacuvajPromeneActionPerformed
		try {
			proveraUnetihVrednosti();
			masinaIliAlat.setNaziv(txtNaziv.getText().trim());
			if (!txtDodaj.getText().trim().isEmpty()) {
				int dodaj = Integer.parseInt(txtDodaj.getText().trim());
				int trenutnaKolicina = Integer.parseInt(lblKolicinaUMagacinu.getText().trim());
				masinaIliAlat.setKolicinaUMagacinu(trenutnaKolicina + dodaj);
			}
			Controller.getInstance().promeniMasinuIliAlat(masinaIliAlat);
			JOptionPane.showMessageDialog(this, "Sistem je zapamtio masinu ili alat.", "Info",
					JOptionPane.INFORMATION_MESSAGE);
			this.dispose();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
	}// GEN-LAST:event_btnSacuvajPromeneActionPerformed

	/**
	 * @param args the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnSacuvajPromene;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JLabel lbl1;
	private javax.swing.JLabel lbl2;
	private javax.swing.JLabel lbl3;
	private javax.swing.JLabel lbl4;
	private javax.swing.JLabel lbl5;
	private javax.swing.JLabel lblID;
	private javax.swing.JLabel lblKolicinaNaZaduzenju;
	private javax.swing.JLabel lblKolicinaUMagacinu;
	private javax.swing.JTextField txtDodaj;
	private javax.swing.JTextField txtNaziv;
	// End of variables declaration//GEN-END:variables

	private void proveraUnetihVrednosti() throws Exception {
		String message = "";
		if (!txtDodaj.getText().trim().isEmpty() && Integer.parseInt(txtDodaj.getText().trim()) < 0) {
			message += "Polje dodaj mora sadrzati vrednost koja je >=0!\n";
		}
		if (!message.equals("")) {
			throw new Exception(message);
		}
	}

	public void setMasinaIliAlat(MasinaIliAlat masinaIliAlat) {
		this.masinaIliAlat = masinaIliAlat;
		lblID.setText(String.valueOf(masinaIliAlat.getMasinaIliAlatID()));
		txtNaziv.setText(masinaIliAlat.getNaziv());
		lblKolicinaUMagacinu.setText(String.valueOf(masinaIliAlat.getKolicinaUMagacinu()));
		lblKolicinaNaZaduzenju.setText(String.valueOf(masinaIliAlat.getKolicinaNaZaduzenju()));
	}

}

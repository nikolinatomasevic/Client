/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view;

import rs.ac.bg.fon.ps.controller.Controller;
import rs.ac.bg.fon.ps.domain.StavkaReversa;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author nikolinatomasevic
 */
public class FrmPromeniRevers extends javax.swing.JDialog {

	/**
	 * Creates new form FrmRevers
	 */

	private StavkaReversa stavka;
	SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy.");

	public FrmPromeniRevers(java.awt.Frame parent, boolean modal) {
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
		lbl3 = new javax.swing.JLabel();
		lbl1 = new javax.swing.JLabel();
		lblBrojReversa = new javax.swing.JLabel();
		lblDatumIzdavanja = new javax.swing.JLabel();
		lblRadnik = new javax.swing.JLabel();
		btnSacuvajPromene = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		lbl4 = new javax.swing.JLabel();
		lblRB = new javax.swing.JLabel();
		lbl5 = new javax.swing.JLabel();
		lblZaduzenaKolicina = new javax.swing.JLabel();
		lbl6 = new javax.swing.JLabel();
		lblDatumRazduzenja = new javax.swing.JLabel();
		lbl7 = new javax.swing.JLabel();
		lblRazduzenaKolicina = new javax.swing.JLabel();
		lbl9 = new javax.swing.JLabel();
		lblMasinaIliAlat = new javax.swing.JLabel();
		lbl8 = new javax.swing.JLabel();
		txtRazduzi = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Promena Podataka Reversa");
		setMinimumSize(new java.awt.Dimension(522, 572));

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Revers",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 0, 15))); // NOI18N

		lbl2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lbl2.setText("Datum izdavanja:");

		lbl3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lbl3.setText("Radnik:");

		lbl1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lbl1.setText("Broj reversa:");

		lblBrojReversa.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		lblDatumIzdavanja.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		lblRadnik.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 177,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(
												lblBrojReversa, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 177,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 177,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(lblRadnik, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lblDatumIzdavanja, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(lblBrojReversa, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(lbl2,
										javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(lblDatumIzdavanja, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblRadnik, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		btnSacuvajPromene.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		btnSacuvajPromene.setText("Sacuvaj promene");
		btnSacuvajPromene.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSacuvajPromeneActionPerformed(evt);
			}
		});

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stavka reversa",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 0, 15))); // NOI18N

		lbl4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lbl4.setText("RB:");

		lblRB.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		lbl5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lbl5.setText("Zaduzena kolicina:");

		lblZaduzenaKolicina.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		lbl6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lbl6.setText("Datum razduzenja:");

		lblDatumRazduzenja.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		lbl7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lbl7.setText("Razduzena kolicina:");

		lblRazduzenaKolicina.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		lbl9.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lbl9.setText("Masina ili alat:");

		lblMasinaIliAlat.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		lbl8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		lbl8.setText("Razduzi:");

		txtRazduzi.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 173,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(lblRB, javax.swing.GroupLayout.PREFERRED_SIZE,
												243, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 173,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(lblZaduzenaKolicina,
												javax.swing.GroupLayout.PREFERRED_SIZE, 243,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 173,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(lblDatumRazduzenja,
												javax.swing.GroupLayout.PREFERRED_SIZE, 243,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 173,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(lblRazduzenaKolicina,
												javax.swing.GroupLayout.PREFERRED_SIZE, 243,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 173,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(lblMasinaIliAlat, javax.swing.GroupLayout.PREFERRED_SIZE, 243,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 173,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(txtRazduzi)))
						.addContainerGap(34, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblRB, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblZaduzenaKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblDatumRazduzenja, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(lblRazduzenaKolicina, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lbl7, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(lbl8, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(txtRazduzi, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblMasinaIliAlat, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup().addContainerGap()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btnSacuvajPromene, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(btnSacuvajPromene, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnSacuvajPromeneActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSacuvajPromeneActionPerformed
		try {
			proveraUnetihVrednosti();
			int zaduzenaKolicina = Integer.parseInt(lblZaduzenaKolicina.getText());
			int razduzenaKolicina = Integer.parseInt(lblRazduzenaKolicina.getText());
			int razduzi = Integer.parseInt(txtRazduzi.getText());
			if (zaduzenaKolicina == razduzenaKolicina + razduzi) {
				stavka.setDatumRazduzenja(new Date());
				stavka.setRazduzenaKolicina(stavka.getZaduzenaKolicina());
			} else {
				stavka.setRazduzenaKolicina(stavka.getRazduzenaKolicina() + razduzi);
			}
			Controller.getInstance().promeniStavkuReversa(stavka);
			JOptionPane.showMessageDialog(this, "Sistem je zapamtio revers.");
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
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JLabel lbl1;
	private javax.swing.JLabel lbl2;
	private javax.swing.JLabel lbl3;
	private javax.swing.JLabel lbl4;
	private javax.swing.JLabel lbl5;
	private javax.swing.JLabel lbl6;
	private javax.swing.JLabel lbl7;
	private javax.swing.JLabel lbl8;
	private javax.swing.JLabel lbl9;
	private javax.swing.JLabel lblBrojReversa;
	private javax.swing.JLabel lblDatumIzdavanja;
	private javax.swing.JLabel lblDatumRazduzenja;
	private javax.swing.JLabel lblMasinaIliAlat;
	private javax.swing.JLabel lblRB;
	private javax.swing.JLabel lblRadnik;
	private javax.swing.JLabel lblRazduzenaKolicina;
	private javax.swing.JLabel lblZaduzenaKolicina;
	private javax.swing.JTextField txtRazduzi;
	// End of variables declaration//GEN-END:variables

	private void proveraUnetihVrednosti() throws Exception {
		String message = "";
		if (!txtRazduzi.getText().isEmpty() && Integer.parseInt(txtRazduzi.getText()) <= 0) {
			message += "Polje razduzi mora sadrzati vrednost koja je >0!\n";
		}
		if (!message.equals("")) {
			throw new Exception(message);
		}
	}

	void setStavka(StavkaReversa stavka) {
		this.stavka = stavka;
		lblBrojReversa.setText(String.valueOf(stavka.getRevers().getBrojReversa()));
		lblDatumIzdavanja.setText(sdf.format(stavka.getRevers().getDatumIzdavanja()));
		lblRadnik.setText(String.valueOf(stavka.getRevers().getRadnik()));
		lblRB.setText(String.valueOf(stavka.getRb()));
		lblZaduzenaKolicina.setText(String.valueOf(stavka.getZaduzenaKolicina()));
		if (stavka.getDatumRazduzenja() != null) {
			lblDatumRazduzenja.setText(sdf.format(stavka.getDatumRazduzenja()));
			lbl8.setVisible(false);
			txtRazduzi.setVisible(false);
			btnSacuvajPromene.setVisible(false);
		}
		lblRazduzenaKolicina.setText(String.valueOf(stavka.getRazduzenaKolicina()));
		lblMasinaIliAlat.setText(String.valueOf(stavka.getMasinaIliAlat()));
	}

}

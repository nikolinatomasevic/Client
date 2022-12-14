/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view;

import rs.ac.bg.fon.ps.controller.Controller;
import rs.ac.bg.fon.ps.domain.MasinaIliAlat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import rs.ac.bg.fon.ps.view.components.TableModelMasineIliAlat;

/**
 *
 * @author nikolinatomasevic
 */
public class FrmMasineIliAlat extends javax.swing.JDialog {

	/**
	 * Creates new form FrmMasineIliAlat
	 */

	public FrmMasineIliAlat(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
		try {
			pripremiTabeluMasinaIliAlata();
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

		jScrollPane1 = new javax.swing.JScrollPane();
		tblMasineIliAlat = new javax.swing.JTable();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		txtNaziv = new javax.swing.JTextField();
		btnPretrazi = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		btnDetaljnije = new javax.swing.JButton();
		btnKreirajNovuMasinuIliAlat = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Masine Ili Alat");
		setMinimumSize(new java.awt.Dimension(902, 502));
		addWindowFocusListener(new java.awt.event.WindowFocusListener() {
			public void windowGainedFocus(java.awt.event.WindowEvent evt) {
				formWindowGainedFocus(evt);
			}

			public void windowLostFocus(java.awt.event.WindowEvent evt) {
			}
		});

		tblMasineIliAlat.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Naziv", "Kolicina u magacinu" }));
		jScrollPane1.setViewportView(tblMasineIliAlat);

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
		jLabel1.setText("Pretrazi masine ili alat po nazivu:");

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		jLabel2.setText("naziv:");

		txtNaziv.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		btnPretrazi.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		btnPretrazi.setText("Pretrazi");
		btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnPretraziActionPerformed(evt);
			}
		});

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		jLabel4.setText("Masine i alat:");

		btnDetaljnije.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		btnDetaljnije.setText("Detaljnije");
		btnDetaljnije.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDetaljnijeActionPerformed(evt);
			}
		});

		btnKreirajNovuMasinuIliAlat.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		btnKreirajNovuMasinuIliAlat.setText("Kreiraj novu masinu ili alat");
		btnKreirajNovuMasinuIliAlat.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnKreirajNovuMasinuIliAlatActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
						.addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 88,
												Short.MAX_VALUE)
										.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(btnPretrazi, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(txtNaziv))))
						.addGroup(layout.createSequentialGroup()
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(btnKreirajNovuMasinuIliAlat, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnDetaljnije, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
				.addContainerGap(20, Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addContainerGap()
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(14, 14, 14)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addComponent(btnPretrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(
												jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(
																jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
																Short.MAX_VALUE)
														.addContainerGap())
												.addGroup(layout.createSequentialGroup().addGap(34, 34, 34)
														.addComponent(btnDetaljnije,
																javax.swing.GroupLayout.PREFERRED_SIZE, 32,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(btnKreirajNovuMasinuIliAlat,
																javax.swing.GroupLayout.PREFERRED_SIZE, 32,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addContainerGap(187, Short.MAX_VALUE)))));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPretraziActionPerformed
		TableModelMasineIliAlat model = (TableModelMasineIliAlat) tblMasineIliAlat.getModel();
		String naziv = txtNaziv.getText().trim().toLowerCase();
		MasinaIliAlat m = new MasinaIliAlat();
		m.setNaziv(naziv);
		List<MasinaIliAlat> trazeneMasineIliAlat = new ArrayList<>();
		try {
			trazeneMasineIliAlat = Controller.getInstance().nadjiMasineIliAlat(m);
			JOptionPane.showMessageDialog(this, "Sistem je nasao masine ili alat po zadatoj vrednosti.", "Info",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
		model.setMasineIliAlat(trazeneMasineIliAlat);
		btnPretrazi.setSelected(true);
	}// GEN-LAST:event_btnPretraziActionPerformed

	private void btnDetaljnijeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDetaljnijeActionPerformed
		TableModelMasineIliAlat model = (TableModelMasineIliAlat) tblMasineIliAlat.getModel();
		int row = tblMasineIliAlat.getSelectedRow();
		if (row != -1) {
			MasinaIliAlat masinaIliAlat = model.getSelectedMasinaIliALat(row);
			FrmPromeniMasinuIliAlat frmPromeni = new FrmPromeniMasinuIliAlat((FrmMain) this.getParent(), true);
			frmPromeni.setMasinaIliAlat(masinaIliAlat);
			frmPromeni.setLocationRelativeTo(null);
			JOptionPane.showMessageDialog(this, "Sistem je ucitao masinu ili alat.", "Info",
					JOptionPane.INFORMATION_MESSAGE);
			frmPromeni.setVisible(true);
		}
	}// GEN-LAST:event_btnDetaljnijeActionPerformed

	private void btnKreirajNovuMasinuIliAlatActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnKreirajNovuMasinuIliAlatActionPerformed
		FrmNovaMasinaIliAlat frmNova = new FrmNovaMasinaIliAlat((FrmMain) this.getParent(), true);
		frmNova.setLocationRelativeTo(null);
		frmNova.setVisible(true);
	}// GEN-LAST:event_btnKreirajNovuMasinuIliAlatActionPerformed

	private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowGainedFocus
		if (btnPretrazi.isSelected()) {
			btnPretrazi.setSelected(false);
		} else {
			TableModelMasineIliAlat model = (TableModelMasineIliAlat) tblMasineIliAlat.getModel();
			try {
				List<MasinaIliAlat> masineIliALat = Controller.getInstance().ucitajListuMasinaIliAlata();
				model.setMasineIliAlat(masineIliALat);
				txtNaziv.setText("");
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(this, ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
			}
		}
	}// GEN-LAST:event_formWindowGainedFocus

	/**
	 * @param args the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnDetaljnije;
	private javax.swing.JButton btnKreirajNovuMasinuIliAlat;
	private javax.swing.JButton btnPretrazi;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable tblMasineIliAlat;
	private javax.swing.JTextField txtNaziv;
	// End of variables declaration//GEN-END:variables

	private void pripremiTabeluMasinaIliAlata() throws Exception {
		List<MasinaIliAlat> masineIliAlat = Controller.getInstance().ucitajListuMasinaIliAlata();
		TableModelMasineIliAlat model = new TableModelMasineIliAlat(masineIliAlat);
		tblMasineIliAlat.setModel(model);
	}

}

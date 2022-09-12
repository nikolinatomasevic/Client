/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view;

import rs.ac.bg.fon.ps.controller.Controller;
import rs.ac.bg.fon.ps.domain.Radnik;
import rs.ac.bg.fon.ps.domain.RadnoMesto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import rs.ac.bg.fon.ps.view.components.TableModelRadnici;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author nikolinatomasevic
 */
public class FrmRadnici extends javax.swing.JDialog {

	/**
	 * Creates new form FrmSviRadnici
	 */

	public FrmRadnici(java.awt.Frame parent, boolean modal) {
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

		jScrollPane1 = new javax.swing.JScrollPane();
		tblRadnici = new javax.swing.JTable();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		txtIme = new javax.swing.JTextField();
		cmbRadnoMesto = new javax.swing.JComboBox();
		jLabel4 = new javax.swing.JLabel();
		btnDetaljnije = new javax.swing.JButton();
		btnKreirajNovogRadnika = new javax.swing.JButton();
		btnPretrazi = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		txtPrezime = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Radnici");
		setMinimumSize(new java.awt.Dimension(1092, 547));
		addWindowFocusListener(new java.awt.event.WindowFocusListener() {
			public void windowGainedFocus(java.awt.event.WindowEvent evt) {
				formWindowGainedFocus(evt);
			}

			public void windowLostFocus(java.awt.event.WindowEvent evt) {
			}
		});

		tblRadnici.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		tblRadnici.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Ime", "Prezime", "Mejl" }));
		jScrollPane1.setViewportView(tblRadnici);

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
		jLabel1.setText("Pretrazi radnike po vrednostima:");

		jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		jLabel2.setText("ime:");

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		jLabel3.setText("radno mesto:");

		txtIme.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		cmbRadnoMesto.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		cmbRadnoMesto.setModel(
				new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		jLabel4.setText("Radnici:");

		btnDetaljnije.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		btnDetaljnije.setText("Detaljnije");
		btnDetaljnije.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDetaljnijeActionPerformed(evt);
			}
		});

		btnKreirajNovogRadnika.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		btnKreirajNovogRadnika.setText("Kreiraj novog radnika");
		btnKreirajNovogRadnika.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnKreirajNovogRadnikaActionPerformed(evt);
			}
		});

		btnPretrazi.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		btnPretrazi.setText("Pretrazi");
		btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnPretraziActionPerformed(evt);
			}
		});

		jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
		jLabel5.setText("prezime:");

		txtPrezime.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout
						.createParallelGroup(Alignment.LEADING, false).addComponent(jLabel1)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
								.addGap(18)
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(btnPretrazi, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(txtIme)
										.addComponent(cmbRadnoMesto, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(txtPrezime))))
						.addGroup(layout.createSequentialGroup()
								.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 865, GroupLayout.PREFERRED_SIZE)
								.addGap(18).addGroup(
										layout.createParallelGroup(Alignment.LEADING)
												.addComponent(btnDetaljnije, GroupLayout.DEFAULT_SIZE, 181,
														Short.MAX_VALUE)
												.addComponent(btnKreirajNovogRadnika, GroupLayout.DEFAULT_SIZE, 181,
														Short.MAX_VALUE))))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addGap(14)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtIme, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtPrezime, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(cmbRadnoMesto, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addGap(26)
						.addComponent(btnPretrazi, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup().addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 287,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(26, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup().addGap(36)
										.addComponent(btnDetaljnije, GroupLayout.PREFERRED_SIZE, 32,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
										.addComponent(btnKreirajNovogRadnika, GroupLayout.PREFERRED_SIZE, 32,
												GroupLayout.PREFERRED_SIZE)
										.addGap(205)))));
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnKreirajNovogRadnikaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnKreirajNovogRadnikaActionPerformed
		FrmNoviRadnik frmNoviRadnik = new FrmNoviRadnik((JFrame) this.getParent(), true);
		frmNoviRadnik.setLocationRelativeTo(null);
		frmNoviRadnik.setVisible(true);
	}// GEN-LAST:event_btnKreirajNovogRadnikaActionPerformed

	private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPretraziActionPerformed
		TableModelRadnici model = (TableModelRadnici) tblRadnici.getModel();
		String ime = txtIme.getText().trim();
		String prezime = txtPrezime.getText().trim();
		RadnoMesto radnoMesto = null;
		if (cmbRadnoMesto.getSelectedItem() instanceof RadnoMesto) {
			radnoMesto = (RadnoMesto) cmbRadnoMesto.getSelectedItem();
		}
		Radnik r = new Radnik();
		r.setIme(ime);
		r.setPrezime(prezime);
		r.setRadnoMesto(radnoMesto);

		List<Radnik> trazeniRadnici = new ArrayList<>();
		try {
			trazeniRadnici = Controller.getInstance().nadjiRadnike(r);
			JOptionPane.showMessageDialog(this, "Sistem je nasao radnike po zadatoj vrednosti.", "Info",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
		}
		model.setRadnici(trazeniRadnici);
		btnPretrazi.setSelected(true);
	}// GEN-LAST:event_btnPretraziActionPerformed

	private void btnDetaljnijeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDetaljnijeActionPerformed
		TableModelRadnici model = (TableModelRadnici) tblRadnici.getModel();
		int row = tblRadnici.getSelectedRow();
		if (row != -1) {
			Radnik radnik = model.getSelectedRadnik(row);
			FrmPromeniRadnika frmPromeni = new FrmPromeniRadnika((FrmMain) this.getParent(), true);
			frmPromeni.setRadnik(radnik);
			frmPromeni.setLocationRelativeTo(null);
			JOptionPane.showMessageDialog(this, "Sistem je ucitao radnika.", "Info", JOptionPane.INFORMATION_MESSAGE);
			frmPromeni.setVisible(true);
		}
	}// GEN-LAST:event_btnDetaljnijeActionPerformed

	private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowGainedFocus
		if (btnPretrazi.isSelected()) {
			btnPretrazi.setSelected(false);
		} else {
			TableModelRadnici model = (TableModelRadnici) tblRadnici.getModel();
			try {
				List<Radnik> radnici = Controller.getInstance().ucitajListuRadnika();
				model.setRadnici(radnici);
				txtIme.setText("");
				txtPrezime.setText("");
				cmbRadnoMesto.setSelectedIndex(0);
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
	private javax.swing.JButton btnKreirajNovogRadnika;
	private javax.swing.JButton btnPretrazi;
	private javax.swing.JComboBox cmbRadnoMesto;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable tblRadnici;
	private javax.swing.JTextField txtIme;
	private javax.swing.JTextField txtPrezime;
	// End of variables declaration//GEN-END:variables

	private void pripremiFormu() throws Exception {
		pripremiCmbRadnoMesto();
		pripremiTabeluRadnika();
	}

	private void pripremiTabeluRadnika() throws Exception {
		List<Radnik> radnici = Controller.getInstance().ucitajListuRadnika();
		TableModelRadnici model = new TableModelRadnici(radnici);
		tblRadnici.setModel(model);
	}

	private void pripremiCmbRadnoMesto() throws Exception {
		cmbRadnoMesto.removeAllItems();
		List<RadnoMesto> radnaMesta = Controller.getInstance().ucitajListuRadnihMesta();
		cmbRadnoMesto.addItem("Sva");
		for (RadnoMesto radnoMesto : radnaMesta) {
			cmbRadnoMesto.addItem(radnoMesto);
		}
	}

}

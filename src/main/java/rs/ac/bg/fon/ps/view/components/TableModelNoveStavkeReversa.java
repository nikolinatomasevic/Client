/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view.components;

import rs.ac.bg.fon.ps.domain.MasinaIliAlat;
import rs.ac.bg.fon.ps.domain.Revers;
import rs.ac.bg.fon.ps.domain.StavkaReversa;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ACER
 */
public class TableModelNoveStavkeReversa extends AbstractTableModel {

	private final Revers revers;
	private final String[] naziviKolona = new String[] { "RB", "Zaduzena kolicina", "Masina ili Alat" };

	public TableModelNoveStavkeReversa(Revers revers) {
		this.revers = revers;
	}

	@Override
	public int getRowCount() {
		if (revers != null && revers.getStavke() != null) {
			return revers.getStavke().size();
		} else {
			return 0;
		}
	}

	@Override
	public int getColumnCount() {
		return naziviKolona.length;
	}

	@Override
	public String getColumnName(int column) {
		return naziviKolona[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		StavkaReversa stavka = revers.getStavke().get(rowIndex);
		switch (columnIndex) {
		case 0:
			return stavka.getRb();
		case 1:
			return stavka.getZaduzenaKolicina();
		case 2:
			return stavka.getMasinaIliAlat();
		default:
			return "n/a";
		}
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if (columnIndex == 1 || columnIndex == 2) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		StavkaReversa stavka = revers.getStavke().get(rowIndex);
		switch (columnIndex) {
		case 1:
			if (!((String) aValue).isEmpty()) {
				stavka.setZaduzenaKolicina(Integer.valueOf((String) aValue));
			}
			break;
		case 2:
			if (((MasinaIliAlat) aValue) != null) {
				stavka.setMasinaIliAlat((MasinaIliAlat) aValue);
			}
			break;
		}
	}

	public void dodajNovuStavku() {
		StavkaReversa novaStavka = new StavkaReversa();
		novaStavka.setRb(revers.getStavke().size() + 1);
		novaStavka.setRevers(revers);
		revers.getStavke().add(novaStavka);
		fireTableRowsInserted(revers.getStavke().size() - 1, revers.getStavke().size() - 1);
	}

	public void ObrisiStavku(int red) {
		revers.getStavke().remove(red);
		int brojac = 1;
		for (StavkaReversa stavka : revers.getStavke()) {
			stavka.setRb(brojac);
			brojac++;
		}
		fireTableDataChanged();
	}

}

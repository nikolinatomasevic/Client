/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view.components;

import rs.ac.bg.fon.ps.domain.Radnik;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ACER
 */
public class TableModelRadnici extends AbstractTableModel {

	List<Radnik> radnici;
	private final String[] naziviKolona = new String[] { "Ime", "Prezime", "Mejl" };

	public TableModelRadnici(List<Radnik> radnici) {
		this.radnici = radnici;
	}

	@Override
	public int getRowCount() {
		if (radnici == null) {
			return 0;
		} else {
			return radnici.size();
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
		Radnik radnik = radnici.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return radnik.getIme();
		case 1:
			return radnik.getPrezime();
		case 2:
			return radnik.getMejl();
		default:
			return "n/a";
		}
	}

	public void setRadnici(List<Radnik> radnici) {
		this.radnici = radnici;
		fireTableDataChanged();
	}

	public Radnik getSelectedRadnik(int row) {
		return radnici.get(row);
	}

}

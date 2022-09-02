/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view.components;

import rs.ac.bg.fon.ps.domain.MasinaIliAlat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ACER
 */
public class TableModelMasineIliAlat extends AbstractTableModel {

	List<MasinaIliAlat> masineIliAlat;
	private final String[] naziviKolona = new String[] { "Naziv", "Kolicina u magacinu" };

	public TableModelMasineIliAlat(List<MasinaIliAlat> masineIliAlat) {
		this.masineIliAlat = masineIliAlat;
	}

	@Override
	public int getRowCount() {
		if (masineIliAlat == null) {
			return 0;
		} else {
			return masineIliAlat.size();
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
		MasinaIliAlat masinaIliAlat = masineIliAlat.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return masinaIliAlat.getNaziv();
		case 1:
			return masinaIliAlat.getKolicinaUMagacinu();
		default:
			return "n/a";
		}
	}

	public void setMasineIliAlat(List<MasinaIliAlat> masineIliAlat) {
		this.masineIliAlat = masineIliAlat;
		fireTableDataChanged();
	}

	public MasinaIliAlat getSelectedMasinaIliALat(int row) {
		return masineIliAlat.get(row);
	}

}

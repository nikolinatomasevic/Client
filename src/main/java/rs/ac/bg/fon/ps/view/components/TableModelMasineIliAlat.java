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
 * Predstavlja model tabele masina i alata.
 *
 * @author nikolinatomasevic
 */
public class TableModelMasineIliAlat extends AbstractTableModel {

	/**
	 * Lista masina i alata koji se prikazuju u tabeli
	 */
	List<MasinaIliAlat> masineIliAlat;
	/**
	 * Niz naziva kolona tabele
	 */
	private final String[] naziviKolona = new String[] { "Naziv", "Kolicina u magacinu" };

	/**
	 * Postavlja listu masina i alata na unetu vrednost.
	 * 
	 * @param masineIliAlat nova lista masina i alata
	 */
	public TableModelMasineIliAlat(List<MasinaIliAlat> masineIliAlat) {
		this.masineIliAlat = masineIliAlat;
	}

	/**
	 * Vraca broj redova tabele.
	 * 
	 * @return broj redova tabele kao ceo broj
	 */
	@Override
	public int getRowCount() {
		if (masineIliAlat == null) {
			return 0;
		} else {
			return masineIliAlat.size();
		}
	}

	/**
	 * Vraca broj kolona tabele.
	 * 
	 * @return broj kolona tabele kao ceo broj
	 */
	@Override
	public int getColumnCount() {
		return naziviKolona.length;
	}

	/**
	 * Za uneti redni broj kolone vraca njen naziv.
	 * 
	 * @param column redni broj kolone
	 * @return naziv kolone kao String
	 */
	@Override
	public String getColumnName(int column) {
		return naziviKolona[column];
	}

	/**
	 * Za uneti redni broj reda i kolone vraca vrednost koja se nalazi u toj celiji tabele.
	 * 
	 * @param rowIndex redni broj reda
	 * @param columnIndex redni broj kolone
	 * @return vrednost koja se nalazi u datom redu i koloni kao objekat
	 */
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

	/**
	 * Postavlja listu masina i alata.
	 * 
	 * @param masineIliAlat nove masine i alat
	 */
	public void setMasineIliAlat(List<MasinaIliAlat> masineIliAlat) {
		this.masineIliAlat = masineIliAlat;
		fireTableDataChanged();
	}

	/**
	 * Za uneti redni broj reda vraca odgovarajucu masinu ili alat.
	 * 
	 * @param row redni broj reda
	 * @return masina ili alat kao objekat tipa MasinaIliAlat
	 */
	public MasinaIliAlat getSelectedMasinaIliALat(int row) {
		return masineIliAlat.get(row);
	}

}

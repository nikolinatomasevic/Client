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
 * Predstavlja model tabele radnika.
 *
 * @author nikolinatomasevic
 */
public class TableModelRadnici extends AbstractTableModel {

	/**
	 * Lista radnika koji se prikazuju u tabeli
	 */
	List<Radnik> radnici;
	/**
	 * Niz naziva kolona tabele
	 */
	private final String[] naziviKolona = new String[] { "Ime", "Prezime", "Mejl" };

	/**
	 * Postavlja listu radnika na unetu vrednost.
	 * 
	 * @param radnici nova lista radnika
	 */
	public TableModelRadnici(List<Radnik> radnici) {
		this.radnici = radnici;
	}

	/**
	 * Vraca broj redova tabele.
	 * 
	 * @return broj redova tabele kao ceo broj
	 */
	@Override
	public int getRowCount() {
		if (radnici == null) {
			return 0;
		} else {
			return radnici.size();
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

	/**
	 * Postavlja listu radnika.
	 * 
	 * @param radnici novi radnici
	 */
	public void setRadnici(List<Radnik> radnici) {
		this.radnici = radnici;
		fireTableDataChanged();
	}

	/**
	 * Za uneti redni broj reda vraca odgovarajuceg radnika.
	 * 
	 * @param row redni broj reda
	 * @return radnik kao objekat tipa Radnik
	 * @see Radnik
	 */
	public Radnik getSelectedRadnik(int row) {
		return radnici.get(row);
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.view.components;

import rs.ac.bg.fon.ps.domain.Revers;
import rs.ac.bg.fon.ps.domain.StavkaReversa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Predstavlja model tabele reversa.
 *
 * @author ACER
 */
public class TableModelReversi extends AbstractTableModel {

	/**
	 * Lista reversa
	 */
	List<Revers> reversi;
	/**
	 * Lista svih stavki reversa
	 */
	List<StavkaReversa> sveStavke;
	/**
	 * Niz naziva kolona tabele
	 */
	private final String[] naziviKolona = new String[] { "Broj reversa", "Radnik", "RB stavke", "Zaduzena kolicina",
			"Masina ili alat" };

	/**
	 * Postavlja listu reversa na unetu vrednost. Takodje, na osnovu svih stavki reversa postavlja i listu stavki.
	 * 
	 * @param reversi nova lista reversa
	 */
	public TableModelReversi(List<Revers> reversi) {
		this.reversi = reversi;
		sveStavke = new ArrayList<>();
		for (Revers revers : reversi) {
			for (StavkaReversa stavka : revers.getStavke()) {
				sveStavke.add(stavka);
			}
		}
	}

	/**
	 * Vraca broj redova tabele.
	 * 
	 * @return broj redova tabele kao ceo broj
	 */
	@Override
	public int getRowCount() {
		if (reversi == null) {
			return 0;
		} else {
			return sveStavke.size();
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
		StavkaReversa stavka = sveStavke.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return stavka.getRevers().getBrojReversa();
		case 1:
			return stavka.getRevers().getRadnik();
		case 2:
			return stavka.getRb();
		case 3:
			return stavka.getZaduzenaKolicina();
		case 4:
			return stavka.getMasinaIliAlat();
		default:
			return "n/a";
		}
	}

	/**
	 * Postavlja listu reversa. Takodje, na osnovu svih stavki reversa postavlja i listu stavki.
	 * 
	 * @param reversi novi reversi
	 */
	public void setReversi(List<Revers> reversi) {
		this.reversi = reversi;
		sveStavke = new ArrayList<>();
		for (Revers revers : reversi) {
			for (StavkaReversa stavka : revers.getStavke()) {
				sveStavke.add(stavka);
			}
		}
		fireTableDataChanged();
	}

	/**
	 * Postavlja listu stavki reversa.
	 * 
	 * @param sveStavke nove stavke reversa
	 */
	public void setSveStavke(List<StavkaReversa> sveStavke) {
		this.sveStavke = sveStavke;
		fireTableDataChanged();
	}

	/**
	 * Za uneti redni broj reda vraca stavku reversa.
	 * 
	 * @param row redni broj reda
	 * @return stavka reversa kao objekat tipa StavkaReversa
	 */
	public StavkaReversa getSelectedStavka(int row) {
		return sveStavke.get(row);
	}

}

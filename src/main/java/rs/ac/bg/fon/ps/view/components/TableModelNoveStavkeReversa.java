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
 * Predstavlja model tabele novih stavki reversa.
 * 
 * @author nikolinatomasevic
 */
public class TableModelNoveStavkeReversa extends AbstractTableModel {

	/**
	 * Revers kome se dodaju stavke
	 */
	private final Revers revers;
	/**
	 * Niz naziva kolona tabele
	 */
	private final String[] naziviKolona = new String[] { "RB", "Zaduzena kolicina", "Masina ili Alat" };

	/**
	 * Postavlja revers na unetu vrednost.
	 * 
	 * @param revers novi revers
	 */
	public TableModelNoveStavkeReversa(Revers revers) {
		this.revers = revers;
	}

	/**
	 * Vraca broj redova tabele.
	 * 
	 * @return broj redova tabele kao ceo broj
	 */
	@Override
	public int getRowCount() {
		if (revers != null && revers.getStavke() != null) {
			return revers.getStavke().size();
		} else {
			return 0;
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

	/**
	 * Za uneti redni broj reda i kolone vraca da li se ta celija tabele moze menjati.
	 * 
	 * @param rowIndex redni broj reda
	 * @param columnIndex redni broj kolone
	 * @return
	 * <ul>
	 * <li>true - ako se ta celija moze menjati</li>
	 * <li>false - ako to nije slucaj</li>
	 * </ul>
	 */
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if (columnIndex == 1 || columnIndex == 2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Postavlja atribut stavke reversa na unetu vrednost.
	 * Na osnovu rednog broja kolone se odredjuje koji atribut, a na osnovu rednog broja reda kojoj stavci reversa.
	 * 
	 * @param aValue vrednost koju pridruzujemo stavci reversa
	 * @param rowIndex redni broj reda
	 * @param columnIndex redni broj kolone
	 */
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

	/**
	 * Dodaje novu stavku reversa u tabelu i listu stavki.
	 */
	public void dodajNovuStavku() {
		StavkaReversa novaStavka = new StavkaReversa();
		novaStavka.setRb(revers.getStavke().size() + 1);
		novaStavka.setRevers(revers);
		revers.getStavke().add(novaStavka);
		fireTableRowsInserted(revers.getStavke().size() - 1, revers.getStavke().size() - 1);
	}

	/**
	 * Za uneti redni broj reda brise se stavka reversa iz tabele i liste stavki.
	 * 
	 * @param red redni broj reda
	 */
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

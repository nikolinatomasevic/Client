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
 *
 * @author ACER
 */
public class TableModelReversi extends AbstractTableModel {

	List<Revers> reversi;
	List<StavkaReversa> sveStavke;
	private final String[] naziviKolona = new String[] { "Broj reversa", "Radnik", "RB stavke", "Zaduzena kolicina",
			"Masina ili alat" };

	public TableModelReversi(List<Revers> reversi) {
		this.reversi = reversi;
		sveStavke = new ArrayList<>();
		for (Revers revers : reversi) {
			for (StavkaReversa stavka : revers.getStavke()) {
				sveStavke.add(stavka);
			}
		}
	}

	@Override
	public int getRowCount() {
		if (reversi == null) {
			return 0;
		} else {
			return sveStavke.size();
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

	public void setSveStavke(List<StavkaReversa> sveStavke) {
		this.sveStavke = sveStavke;
		fireTableDataChanged();
	}

	public StavkaReversa getSelectedStavka(int row) {
		return sveStavke.get(row);
	}

}

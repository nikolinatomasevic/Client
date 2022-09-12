/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.controller;

import rs.ac.bg.fon.ps.communication.Communication;
import rs.ac.bg.fon.ps.communication.Operation;
import rs.ac.bg.fon.ps.communication.Request;
import rs.ac.bg.fon.ps.communication.Response;
import rs.ac.bg.fon.ps.communication.ResponseType;
import rs.ac.bg.fon.ps.domain.Magacioner;
import rs.ac.bg.fon.ps.domain.MasinaIliAlat;
import rs.ac.bg.fon.ps.domain.Radnik;
import rs.ac.bg.fon.ps.domain.RadnoMesto;
import rs.ac.bg.fon.ps.domain.Revers;
import rs.ac.bg.fon.ps.domain.StavkaReversa;
import java.util.List;

/**
 *
 * @author nikolinatomasevic
 */
public class Controller {

	private static Controller instance;

	public Controller() {

	}

	public static Controller getInstance() {
		if (instance == null) {
			instance = new Controller();
		}
		return instance;
	}

	public Magacioner login(String mejl, String sifra) throws Exception {
		Magacioner m = new Magacioner();
		m.setMejl(mejl);
		m.setSifra(sifra);
		Request request = new Request(Operation.LOGIN, m);
		Response response = Communication.getInstance().login(request);

		if (response.getResponseTip().equals(ResponseType.SUCCES)) {
			Magacioner magacioner = (Magacioner) response.getRezultat();
			return magacioner;
		} else {
			throw response.getException();
		}
	}

	public List<RadnoMesto> ucitajListuRadnihMesta() throws Exception {
		Request request = new Request(Operation.UCITAJ_LISTU_RADNIH_MESTA, null);
		Response response = Communication.getInstance().ucitajListuRadnihMesta(request);

		if (response.getResponseTip().equals(ResponseType.SUCCES)) {
			List<RadnoMesto> radnaMesta = (List<RadnoMesto>) response.getRezultat();
			return radnaMesta;
		} else {
			throw response.getException();
		}
	}

	public void zapamtiRadnika(Radnik noviRadnik) throws Exception {
		Request request = new Request(Operation.ZAPAMTI_RADNIKA, noviRadnik);
		Response response = Communication.getInstance().zapamtiRadnika(request);

		if (response.getResponseTip().equals(ResponseType.SUCCES)) {

		} else {
			throw response.getException();
		}
	}

	public List<Radnik> ucitajListuRadnika() throws Exception {
		Request request = new Request(Operation.UCITAJ_LISTU_RADNIKA, null);
		Response response = Communication.getInstance().ucitajListuRadnika(request);

		if (response.getResponseTip().equals(ResponseType.SUCCES)) {
			List<Radnik> radnici = (List<Radnik>) response.getRezultat();
			return radnici;
		} else {
			throw response.getException();
		}
	}

	public void zapamtiMasinuIliAlat(MasinaIliAlat novaMasinaIliAlat) throws Exception {
		Request request = new Request(Operation.ZAPAMTI_MASINU_ILI_ALAT, novaMasinaIliAlat);
		Response response = Communication.getInstance().zapamtiMasinuIliAlat(request);

		if (response.getResponseTip().equals(ResponseType.SUCCES)) {

		} else {
			throw response.getException();
		}
	}

	public List<MasinaIliAlat> ucitajListuMasinaIliAlata() throws Exception {
		Request request = new Request(Operation.UCITAJ_LISTU_MASINA_ILI_ALATA, null);
		Response response = Communication.getInstance().ucitajListuMasinaIliAlata(request);

		if (response.getResponseTip().equals(ResponseType.SUCCES)) {
			List<MasinaIliAlat> masineIliAlat = (List<MasinaIliAlat>) response.getRezultat();
			return masineIliAlat;
		} else {
			throw response.getException();
		}
	}

	public void zapamtiRevers(Revers revers) throws Exception {
		Request request = new Request(Operation.ZAPAMTI_REVERS, revers);
		Response response = Communication.getInstance().zapamtiRevers(request);

		if (response.getResponseTip().equals(ResponseType.SUCCES)) {

		} else {
			throw response.getException();
		}
	}

	public void promeniRadnika(Radnik radnik) throws Exception {
		Request request = new Request(Operation.PROMENI_RADNIKA, radnik);
		Response response = Communication.getInstance().promeniRadnika(request);

		if (response.getResponseTip().equals(ResponseType.SUCCES)) {

		} else {
			throw response.getException();
		}
	}

	public void promeniMasinuIliAlat(MasinaIliAlat masinaIliAlat) throws Exception {
		Request request = new Request(Operation.PROMENI_MASINU_ILI_ALAT, masinaIliAlat);
		Response response = Communication.getInstance().promeniMasinuIliAlat(request);

		if (response.getResponseTip().equals(ResponseType.SUCCES)) {

		} else {
			throw response.getException();
		}
	}

	public List<Revers> ucitajListuReversa() throws Exception {
		Request request = new Request(Operation.UCITAJ_LISTU_REVERSA, null);
		Response response = Communication.getInstance().ucitajListuReversa(request);

		if (response.getResponseTip().equals(ResponseType.SUCCES)) {
			List<Revers> reversi = (List<Revers>) response.getRezultat();
			return reversi;
		} else {
			throw response.getException();
		}
	}

	public void promeniStavkuReversa(StavkaReversa stavka) throws Exception {
		Request request = new Request(Operation.PROMENI_STAVKU_REVERSA, stavka);
		Response response = Communication.getInstance().promeniStavkuReversa(request);

		if (response.getResponseTip().equals(ResponseType.SUCCES)) {

		} else {
			throw response.getException();
		}
	}

	public List<Radnik> nadjiRadnike(Radnik r) throws Exception {
		Request request = new Request(Operation.NADJI_RADNIKE, r);
		Response response = Communication.getInstance().nadjiRadnike(request);

		if (response.getResponseTip().equals(ResponseType.SUCCES)) {
			List<Radnik> trazeniRadnici = (List<Radnik>) response.getRezultat();
			return trazeniRadnici;
		} else {
			throw response.getException();
		}
	}

	public List<MasinaIliAlat> nadjiMasineIliAlat(MasinaIliAlat m) throws Exception {
		Request request = new Request(Operation.NADJI_MASINE_ILI_ALAT, m);
		Response response = Communication.getInstance().nadjiMasineIliAlat(request);

		if (response.getResponseTip().equals(ResponseType.SUCCES)) {
			List<MasinaIliAlat> trazeneMasineIliAlat = (List<MasinaIliAlat>) response.getRezultat();
			return trazeneMasineIliAlat;
		} else {
			throw response.getException();
		}
	}

	public List<StavkaReversa> nadjiStavkeReversa(Revers r) throws Exception {
		Request request = new Request(Operation.NADJI_STAVKE_REVERSA, r);
		Response response = Communication.getInstance().nadjiStavkeReversa(request);

		if (response.getResponseTip().equals(ResponseType.SUCCES)) {
			List<StavkaReversa> trazeneStavke = (List<StavkaReversa>) response.getRezultat();
			return trazeneStavke;
		} else {
			throw response.getException();
		}
	}

}

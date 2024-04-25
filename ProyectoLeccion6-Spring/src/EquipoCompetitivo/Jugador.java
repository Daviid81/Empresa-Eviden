package EquipoCompetitivo;

import org.springframework.beans.factory.annotation.Value;

public class Jugador implements Jugadores {
	
	private CreacionInformeHorario informeHorario;
	
	@Value("${pais}")
	private String pais;
	
	@Value("${nombreEquipo}")
	private String nombreEquipo;
	
	// Constructor
	public Jugador(CreacionInformeHorario informeHorario) {
		this.informeHorario = informeHorario;
	}
	
	// Getters
	public String getPais() {
		return pais;
	}


	public String getNombreEquipo() {
		return nombreEquipo;
	}


	@Override
	public String getEntrenamiento() {
		// TODO Auto-generated method stub
		return "Practicar aereos 2h, metodo de mapa de siempre";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeHorario.getInformeHorario();
	}

	
}

package EquipoCompetitivo;

import org.springframework.stereotype.Component;

@Component
public class InformeHorarioVerano implements CreacionInformeHorario {

	@Override
	public String getInformeHorario() {
		
		return "Verano --> Miercoles-Domingo 11:00 a.m";

	}

}

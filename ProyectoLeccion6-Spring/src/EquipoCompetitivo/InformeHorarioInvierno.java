package EquipoCompetitivo;

import org.springframework.stereotype.Component;

@Component
public class InformeHorarioInvierno implements CreacionInformeHorario {

	@Override
	public String getInformeHorario() {

		return "Invierno --> Lunes-Sabado 22:00 p.m";
	}

}

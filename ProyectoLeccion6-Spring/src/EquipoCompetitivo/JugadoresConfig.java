package EquipoCompetitivo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("Anotaciones")
@PropertySource("classpath:jugadores.pvp")
public class JugadoresConfig {

	// definir el bean para InformeHorario
	
	@Bean
	public CreacionInformeHorario InformeHorarioJugadores(){ //sera el id del bean iyectado
		return new InformeHorarioJugadores();
	}
	
	// definir el bean para Jugador e inyectar dependencias
	
	@Bean
	public Jugadores jugador() {
		return new Jugador(InformeHorarioJugadores()); //bean para la inyeccion
	}
	
}

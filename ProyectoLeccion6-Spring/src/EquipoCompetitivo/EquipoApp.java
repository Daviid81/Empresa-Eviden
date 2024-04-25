package EquipoCompetitivo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EquipoApp {

	public static void main(String[] args) {
		
		//  Leer el .class de configuracion
		
			AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(JugadoresConfig.class);
		

		// pedir un bean al contenedor
		
			
			Jugadores jugadores = contexto.getBean("jugador", Jugadores.class);
			
			System.out.println("Entrenamiento: \t"+jugadores.getEntrenamiento());
		
			System.out.println("Informe: \t"+jugadores.getInforme());
			
			
			Jugador jugador = contexto.getBean("jugador", Jugador.class);
			
			System.out.println("Pais Equipo: \t" + jugador.getPais());
			
			System.out.println("Nombre Equipo: \t" +  jugador.getNombreEquipo());
			
		// cerrar contexto
		contexto.close();
	}

}













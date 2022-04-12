package net.instituto.desa;

public class Game {
	private static final int AVANCE = 1;

	private static final String ABAJO = "Abajo";
	private static final String ARRIBA = "Arriba";
	private static final String IZQUIERDA = "Izquierda";
	private static final String DERECHA = "Derecha";
	Jugador j;

	public void movimiento(String m) {
		if (m.equalsIgnoreCase(DERECHA)) {
			j.setX(j.getX() + AVANCE);
		}
		if (m.equalsIgnoreCase(IZQUIERDA)) {
			j.setX(j.getX() - AVANCE);
		}
		if (m.equalsIgnoreCase(ARRIBA)) {
			j.setY(j.getY() - AVANCE);
		}
		if (m.equalsIgnoreCase(ABAJO)) {
			j.setY(j.getY() + AVANCE);
		}
	}
}

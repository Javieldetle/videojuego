package net.instituto.desa;

public class Jugador {
	int y, x;

	private int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}

	private int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}
	 public void subir(int power) {
	        Jugador.this.setY(Jugador.this.getY() + power);
	    }
	 public void bajar(int power) {
	        Jugador.this.setY(Jugador.this.getY() + power);
	    }
	 public void derecha(int power) {
	        Jugador.this.setY(Jugador.this.getY() + power);
	    }
	 public void izquierda(int power) {
	        Jugador.this.setY(Jugador.this.getY() + power);
	    }
}

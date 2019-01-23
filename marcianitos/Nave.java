package marcianitos;

public class Nave {
	private int ejeX;
	private int ejeY;
	private boolean disparo;
	private int vidas;
	public Nave(){
	ejeX = 0;
	ejeY = 0;
	disparo = true;
	vidas = 3;
	}
	public void setEjeX(int ejeX){
		this.ejeX = ejeX;
	}
	public void setEjeY(int ejeY){
		this.ejeY = ejeY;
	}
	public void setDisparo(boolean disparo){
		this.disparo = disparo;
	}
	public int getEjeX(){
		return ejeX;
	}
	public int getEjeY(){
		return ejeY;
	}
	public boolean isDisparo(){
		return disparo;
	}
	public int getVidas(){
		return vidas;
	}
	public void disminuirVida(){
		vidas--;
	}
}

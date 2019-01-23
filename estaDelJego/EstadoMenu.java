package estaDelJego;

import graficos.Assets;
import interfazUsuario.Botones;

import java.awt.Graphics;
import java.util.ArrayList;

import objetosJuego_Normal.DisparoNave;
import objetosJuego_Normal.DisparosMarcianos;
import objetosJuego_Normal.ObjetosJuego;
/**
 * Esta clase extiende de Estado y define el menu del juego 
 * @author Rodrigo Pascual Arnaiz
 * @version 21/01/2019
 */
public class EstadoMenu extends Estado{
	private ArrayList<Botones> botones;
	private boolean borrarPts;
	private boolean ponerPts;
	private boolean printearPts;
	private Botones botonFacil;
	private Botones botonNormal;
	private Botones botonFdificil;
	private Botones botonBack;
	
	private Botones botonNave1;
	private Botones botonNave2;
	private Botones botonMarciano;
	
	private long tiempo2;
	private long ultimoTiempo2;
	
	private boolean navePrared;
	private boolean marcianoPrared;
	
	private ArrayList<ObjetosJuego> disparos;
	/**
	 * Constructor sin parametros que inicializa las variables necesarios para la pantalla de carga 
	 */
	public EstadoMenu(){
		setTiempo2(1000);
		disparos = new ArrayList<ObjetosJuego>();
		navePrared = true;
		marcianoPrared = true;
		ultimoTiempo2 = System.currentTimeMillis();
		borrarPts = false;
		printearPts = true;
		botones = new ArrayList<Botones>();
		
		
		botones.add(new Botones(Assets.botonSalir1,Assets.botonSalir1_1,285,570+70+70,0));
		botones.add(new Botones(Assets.botonModos1_1,Assets.botonModos1,270,570+70,5));
		
		
		botones.add(botonNave1=new Botones(Assets.botonEsterEgg2,Assets.botonEsterEgg2,30,400-10,4));
		botones.add(botonNave2=new Botones(Assets.botonEsterEgg2,Assets.botonEsterEgg2,30+70,400-10,4));
		botones.add(botonMarciano=new Botones(Assets.botonEsterEgg,Assets.botonEsterEgg,70,720,0));
	}
	/**
	 * Metodo heredado de Estado, este metodo es el que se va a encargar de actualizar los botones de la pantalla, ademas desde aqui si pulsas a modos se quietan las imagenes de la
	 * pantalla y salen los modos de juego 
	 *
	 */
	@Override						
	public void update() {
		Botones botonBorarr = null;
		for(Botones b:botones){
			b.update();
			if(b.isBorrarPts()){
				botonBorarr= b;
				borrarPts = true;
			}
			if(b.isPonerPts()){
				ponerPts = true;
			}
		}
		botones.remove(botonBorarr);
		
		if(borrarPts){
			botones.add(botonFacil =new Botones(Assets.botonFacil1,Assets.botonFacil1_1,200,356+70,2));
			botones.add(botonNormal =new Botones(Assets.botonNormal1,Assets.botonNormal1_1,200,356+70+70,1));
			botones.add(botonFdificil =new Botones(Assets.botonDificil1,Assets.botonDificil1_1,200,356+70+70+70,3));
			botones.add(botonBack =new Botones(Assets.botonBack1,Assets.botonBack_1,595,356+70+70+70,6));
			printearPts = false;
			borrarPts = false;
		}
		if(ponerPts){
			botones.remove(botonFacil);
			botones.remove(botonNormal);
			botones.remove(botonFdificil);
			botones.remove(botonBack);
			ponerPts = false;
			printearPts = true;
			botones.add(new Botones(Assets.botonModos1_1,Assets.botonModos1,270,570+70,5));
		}
		for(ObjetosJuego d:disparos){
			d.update();
		}
		borrarDisparos(disparos);
	}
	/**
	 * Metodo heredado de Estado, este metodo se encarga de dibijar en pantalla todos los Assets del menu y cada 500 segundos las vanes y los marcianos del menu se mueven 
	 * en el eje X 
	 */
	@Override
	public void draw(Graphics g) {
		for(Botones b:botones){
			b.draw(g);
		}
		//Movimiento Marcnianos
		tiempo2 += System.currentTimeMillis()-ultimoTiempo2;
		ultimoTiempo2 = System.currentTimeMillis();
		if(tiempo2<500&&tiempo2>400){
			if(navePrared){
				botonMarciano.setEjeXeY(botonMarciano.getX()+1,720);
			}
			if(botonMarciano.getX()<30){
				navePrared = true;
			}
			if(botonMarciano.getX()>650&&navePrared){
				navePrared = false;
			}
			if(navePrared==false){
				botonMarciano.setEjeXeY(botonMarciano.getX()-1,720);
			}
			int numeroDisparo = (int)(Math.random()*1000)+1;
			if(numeroDisparo==1){
				disparos.add(new DisparoNave(botonMarciano.getCentre(),Assets.disparoNave1,Assets.disparoNave2));
			}
		}
		if(tiempo2>500){
			if(marcianoPrared){
				botonNave1.setEjeXeY(botonNave1.getX()+40,400-10);
				botonNave2.setEjeXeY(botonNave2.getX()+40,400-10);
			}
			if(marcianoPrared==false){
				botonNave1.setEjeXeY(botonNave1.getX()-40,400-10);
				botonNave2.setEjeXeY(botonNave2.getX()-40,400-10);
			}
			if(botonNave1.getX()<30){
				marcianoPrared = true;
			}
			if(botonNave2.getX()>450&&navePrared){
				marcianoPrared = false;
			}
			int numeroDisparo = (int)(Math.random()*6)+1;
			if(numeroDisparo==3){
				disparos.add(new DisparosMarcianos(botonNave1.getCentre(),Assets.disparoMarcianos1,Assets.disparoMarcianos2));
			}
			if(numeroDisparo==1){
				disparos.add(new DisparosMarcianos(botonNave2.getCentre(),Assets.disparoMarcianos1,Assets.disparoMarcianos2));
			}
			int numero = (int)(Math.random()*7)+1;
			if(numero==1){
				navePrared=false;
			}
			if(numero==3){
				navePrared=true;
			}
			tiempo2= 0;
		}
		
		for(ObjetosJuego d:disparos){
			d.draw(g);
		}
		//resto cosas
		g.drawImage(Assets.spaceInvaders,-6,0,null);
		g.drawImage(Assets.ronri,570,400-10,null);
		if(printearPts){
			g.drawImage(Assets.pts10,200,356+20+40,null);
			g.drawImage(Assets.pts20,200,356+58+20+40,null);
			g.drawImage(Assets.pts40,200,356+58+58+20+40,null);	
		}
		
	}
	/**
	 * Este metodo borra todos los disparos de los marcianos que salen de la pnatalla tanto del eje Y=0 y del eje Y=700
	 * @param a de tipo ArrayList
	 */
	public void borrarDisparos(ArrayList<ObjetosJuego> a){
		ObjetosJuego borrar = null;
		for(ObjetosJuego d:a){
			if(d.getPosicion().getY()<350){
				borrar = d;
			}
			if(d.getPosicion().getY()>800){
				borrar = d;
			}
		}
		a.remove(borrar);
	}
	/**
	 * Este metodo retorna la variabe tiempo2
	 * @return long
	 */
	public long getTiempo2() {
		return tiempo2;
	}
	/**
	 * Este metodo sieve para poner el tiempo2
	 * @param tiempo2 de tipo long
	 */
	public void setTiempo2(long tiempo2) {
		this.tiempo2 = tiempo2;
	}

}

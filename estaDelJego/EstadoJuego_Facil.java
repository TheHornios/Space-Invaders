package estaDelJego;

import graficos.Assets;
import interfazUsuario.Botones;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import logica.Vector2D;
import objetosJuego_Facil.Marcianos;
import objetosJuego_Facil.Nave;
import objetosJuego_Facil.ObjetosJuego;
import objetosJuego_Facil.Parapeto;
import ventanas.Ventana;
/**
 * Esta clase extiende de Estado y define como se crea el juego en modo dificil, se encarga de la comunicacion entre los objetosJuego
 * @author Rodrigo Pascual Arnaiz
 * @version 21/01/2019
 */
public class EstadoJuego_Facil extends Estado{
	private Nave nave;
	private ArrayList<ObjetosJuego> objetosNave = new  ArrayList<ObjetosJuego>();
	private boolean perder;
	private Botones botn;
	private boolean derecha = true;
	private boolean izquierda = false;
	
	private Marcianos marciano_fila_1_numero1;
	private Marcianos marciano_fila_1_numero2;
	private Marcianos marciano_fila_1_numero3;
	private Marcianos marciano_fila_1_numero4;
	private Marcianos marciano_fila_1_numero5;
	private Marcianos marciano_fila_1_numero6;
	private Marcianos marciano_fila_1_numero7;
	
	private Marcianos marciano_fila_2_numero1;
	private Marcianos marciano_fila_2_numero2;
	private Marcianos marciano_fila_2_numero3;
	private Marcianos marciano_fila_2_numero4;
	private Marcianos marciano_fila_2_numero5;
	private Marcianos marciano_fila_2_numero6;
	private Marcianos marciano_fila_2_numero7;
	
	private Marcianos marciano_fila_3_numero1;
	private Marcianos marciano_fila_3_numero2;
	private Marcianos marciano_fila_3_numero3;
	private Marcianos marciano_fila_3_numero4;
	private Marcianos marciano_fila_3_numero5;
	private Marcianos marciano_fila_3_numero6;
	private Marcianos marciano_fila_3_numero7;
	
	private Marcianos marciano_fila_4_numero1;
	private Marcianos marciano_fila_4_numero2;
	private Marcianos marciano_fila_4_numero3;
	private Marcianos marciano_fila_4_numero4;
	private Marcianos marciano_fila_4_numero5;
	private Marcianos marciano_fila_4_numero6;
	private Marcianos marciano_fila_4_numero7;
	
	private Marcianos marciano_fila_5_numero1;
	private Marcianos marciano_fila_5_numero2;
	private Marcianos marciano_fila_5_numero3;
	private Marcianos marciano_fila_5_numero4;
	private Marcianos marciano_fila_5_numero5;
	private Marcianos marciano_fila_5_numero6;
	private Marcianos marciano_fila_5_numero7;
	
	private Marcianos marciano_fila_6_numero1;
	private Marcianos marciano_fila_6_numero2;
	private Marcianos marciano_fila_6_numero3;
	private Marcianos marciano_fila_6_numero4;
	private Marcianos marciano_fila_6_numero5;
	private Marcianos marciano_fila_6_numero6;
	private Marcianos marciano_fila_6_numero7;
	
	private Parapeto parapeto1_1;
	private Parapeto parapeto2_1;
	private Parapeto parapeto3_1;
	private Parapeto parapeto4_1;
	private Parapeto parapeto5_1;
	private Parapeto parapeto6_1;
	private Parapeto parapeto7_1;
	private Parapeto parapeto8_1;
	private Parapeto parapeto9_1;
	private Parapeto parapeto10_1;
	
	private Parapeto parapeto1_2;
	private Parapeto parapeto2_2;
	private Parapeto parapeto3_2;
	private Parapeto parapeto4_2;
	private Parapeto parapeto5_2;
	private Parapeto parapeto6_2;
	private Parapeto parapeto7_2;
	private Parapeto parapeto8_2;
	private Parapeto parapeto9_2;
	private Parapeto parapeto10_2;
	
	private Parapeto parapeto1_3;
	private Parapeto parapeto2_3;
	private Parapeto parapeto3_3;
	private Parapeto parapeto4_3;
	private Parapeto parapeto5_3;
	private Parapeto parapeto6_3;
	private Parapeto parapeto7_3;
	private Parapeto parapeto8_3;
	private Parapeto parapeto9_3;
	private Parapeto parapeto10_3;
	
	private Parapeto parapeto1_4;
	private Parapeto parapeto2_4;
	private Parapeto parapeto3_4;
	private Parapeto parapeto4_4;
	private Parapeto parapeto5_4;
	private Parapeto parapeto6_4;
	private Parapeto parapeto7_4;
	private Parapeto parapeto8_4;
	private Parapeto parapeto9_4;
	private Parapeto parapeto10_4;
	
	private ArrayList<ObjetosJuego> objetosMarcianos = new ArrayList<ObjetosJuego>(); 
	private ArrayList<Marcianos> marcianos = new ArrayList<Marcianos>(); 
	
	private ArrayList<Parapeto> parapetos = new ArrayList<Parapeto>(); 
	
	private int contador;
	/**
	 * Constructor sin paramtros que inicializa todos los atributos
	 */
	public EstadoJuego_Facil(){
		nave = new Nave(new Vector2D(85,700),Assets.nave,this);
		objetosNave.add(nave);
		perder = false;
		parapeto1_4 = new Parapeto(new Vector2D(400-10,600),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto2_4 = new Parapeto(new Vector2D(400-10,583),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto3_4 = new Parapeto(new Vector2D(400-10,566),Assets.parapeto7,this,Assets.parapeto7_2,Assets.parapeto7_3,Assets.parapeto7_4);
		parapeto4_4 = new Parapeto(new Vector2D(418-10,583),Assets.parapeto5,this,Assets.parapeto5_2,Assets.parapeto5_3,Assets.parapeto5_4);
		parapeto5_4 = new Parapeto(new Vector2D(418-10,566),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto6_4 = new Parapeto(new Vector2D(436-10,583),Assets.parapeto6,this,Assets.parapeto6_2,Assets.parapeto6_3,Assets.parapeto6_4);
		parapeto7_4 = new Parapeto(new Vector2D(436-10,566),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4); 
		parapeto8_4 = new Parapeto(new Vector2D(454-10,600),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto9_4 = new Parapeto(new Vector2D(454-10,583),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto10_4 = new Parapeto(new Vector2D(454-10,566),Assets.parapeto9,this,Assets.parapeto9_2,Assets.parapeto9_3,Assets.parapeto9_4); 
		
		parapetos.add(parapeto1_4);
		parapetos.add(parapeto2_4);
		parapetos.add(parapeto3_4);
		parapetos.add(parapeto4_4);
		parapetos.add(parapeto5_4);
		parapetos.add(parapeto6_4);
		parapetos.add(parapeto7_4);
		parapetos.add(parapeto8_4);
		parapetos.add(parapeto9_4);
		parapetos.add(parapeto10_4);
		
		parapeto1_3 = new Parapeto(new Vector2D(300-60,600),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto2_3 = new Parapeto(new Vector2D(300-60,583),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto3_3 = new Parapeto(new Vector2D(300-60,566),Assets.parapeto7,this,Assets.parapeto7_2,Assets.parapeto7_3,Assets.parapeto7_4);
		parapeto4_3 = new Parapeto(new Vector2D(318-60,583),Assets.parapeto5,this,Assets.parapeto5_2,Assets.parapeto5_3,Assets.parapeto5_4);
		parapeto5_3 = new Parapeto(new Vector2D(318-60,566),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto6_3 = new Parapeto(new Vector2D(336-60,583),Assets.parapeto6,this,Assets.parapeto6_2,Assets.parapeto6_3,Assets.parapeto6_4);
		parapeto7_3 = new Parapeto(new Vector2D(336-60,566),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4); 
		parapeto8_3 = new Parapeto(new Vector2D(354-60,600),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto9_3 = new Parapeto(new Vector2D(354-60,583),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto10_3 = new Parapeto(new Vector2D(354-60,566),Assets.parapeto9,this,Assets.parapeto9_2,Assets.parapeto9_3,Assets.parapeto9_4); 
		
		parapetos.add(parapeto1_3);
		parapetos.add(parapeto2_3);
		parapetos.add(parapeto3_3);
		parapetos.add(parapeto4_3);
		parapetos.add(parapeto5_3);
		parapetos.add(parapeto6_3);
		parapetos.add(parapeto7_3);
		parapetos.add(parapeto8_3);
		parapetos.add(parapeto9_3);
		parapetos.add(parapeto10_3);
		
		parapeto1_2 = new Parapeto(new Vector2D(600-60,600),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto2_2 = new Parapeto(new Vector2D(600-60,583),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto3_2 = new Parapeto(new Vector2D(600-60,566),Assets.parapeto7,this,Assets.parapeto7_2,Assets.parapeto7_3,Assets.parapeto7_4);
		parapeto4_2 = new Parapeto(new Vector2D(618-60,583),Assets.parapeto5,this,Assets.parapeto5_2,Assets.parapeto5_3,Assets.parapeto5_4);
		parapeto5_2 = new Parapeto(new Vector2D(618-60,566),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto6_2 = new Parapeto(new Vector2D(636-60,583),Assets.parapeto6,this,Assets.parapeto6_2,Assets.parapeto6_3,Assets.parapeto6_4);
		parapeto7_2 = new Parapeto(new Vector2D(636-60,566),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4); 
		parapeto8_2 = new Parapeto(new Vector2D(654-60,600),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto9_2 = new Parapeto(new Vector2D(654-60,583),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto10_2 = new Parapeto(new Vector2D(654-60,566),Assets.parapeto9,this,Assets.parapeto9_2,Assets.parapeto9_3,Assets.parapeto9_4); 
		
		parapetos.add(parapeto1_2);
		parapetos.add(parapeto2_2);
		parapetos.add(parapeto3_2);
		parapetos.add(parapeto4_2);
		parapetos.add(parapeto5_2);
		parapetos.add(parapeto6_2);
		parapetos.add(parapeto7_2);
		parapetos.add(parapeto8_2);
		parapetos.add(parapeto9_2);
		parapetos.add(parapeto10_2);
		
		parapeto1_1 = new Parapeto(new Vector2D(100-20,600),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto2_1 = new Parapeto(new Vector2D(100-20,583),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto3_1 = new Parapeto(new Vector2D(100-20,566),Assets.parapeto7,this,Assets.parapeto7_2,Assets.parapeto7_3,Assets.parapeto7_4);
		parapeto4_1 = new Parapeto(new Vector2D(118-20,583),Assets.parapeto5,this,Assets.parapeto5_2,Assets.parapeto5_3,Assets.parapeto5_4);
		parapeto5_1 = new Parapeto(new Vector2D(118-20,566),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto6_1 = new Parapeto(new Vector2D(136-20,583),Assets.parapeto6,this,Assets.parapeto6_2,Assets.parapeto6_3,Assets.parapeto6_4);
		parapeto7_1 = new Parapeto(new Vector2D(136-20,566),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4); 
		parapeto8_1 = new Parapeto(new Vector2D(154-20,600),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto9_1 = new Parapeto(new Vector2D(154-20,583),Assets.parapeto1,this,Assets.parapeto1_2,Assets.parapeto1_3,Assets.parapeto1_4);
		parapeto10_1 = new Parapeto(new Vector2D(154-20,566),Assets.parapeto9,this,Assets.parapeto9_2,Assets.parapeto9_3,Assets.parapeto9_4); 
		
		parapetos.add(parapeto1_1);
		parapetos.add(parapeto2_1);
		parapetos.add(parapeto3_1);
		parapetos.add(parapeto4_1);
		parapetos.add(parapeto5_1);
		parapetos.add(parapeto6_1);
		parapetos.add(parapeto7_1);
		parapetos.add(parapeto8_1);
		parapetos.add(parapeto9_1);
		parapetos.add(parapeto10_1);
		
		
		marciano_fila_1_numero1 = new Marcianos(new Vector2D(10,300),Assets.marciano1,Assets.marciano1_2,this,1,58);
		marciano_fila_1_numero2 = new Marcianos(new Vector2D(10+80,300),Assets.marciano1,Assets.marciano1_2,this,2,58);
		marciano_fila_1_numero3 = new Marcianos(new Vector2D(90+80,300),Assets.marciano1,Assets.marciano1_2,this,3,58);
		marciano_fila_1_numero4 = new Marcianos(new Vector2D(170+80,300),Assets.marciano1,Assets.marciano1_2,this,4,58);
		marciano_fila_1_numero5 = new Marcianos(new Vector2D(250+80,300),Assets.marciano1,Assets.marciano1_2,this,5,58);
		marciano_fila_1_numero6 = new Marcianos(new Vector2D(330+80,300),Assets.marciano1,Assets.marciano1_2,this,6,58);
		marciano_fila_1_numero7 = new Marcianos(new Vector2D(410+80,300),Assets.marciano1,Assets.marciano1_2,this,7,58);
		
		marciano_fila_2_numero1 = new Marcianos(new Vector2D(10,250),Assets.marciano1,Assets.marciano1_2,this,1,58);
		marciano_fila_2_numero2 = new Marcianos(new Vector2D(10+80,250),Assets.marciano1,Assets.marciano1_2,this,2,58);
		marciano_fila_2_numero3 = new Marcianos(new Vector2D(90+80,250),Assets.marciano1,Assets.marciano1_2,this,3,58);
		marciano_fila_2_numero4 = new Marcianos(new Vector2D(170+80,250),Assets.marciano1,Assets.marciano1_2,this,4,58);
		marciano_fila_2_numero5 = new Marcianos(new Vector2D(250+80,250),Assets.marciano1,Assets.marciano1_2,this,5,58);
		marciano_fila_2_numero6 = new Marcianos(new Vector2D(330+80,250),Assets.marciano1,Assets.marciano1_2,this,6,58);
		marciano_fila_2_numero7 = new Marcianos(new Vector2D(410+80,250),Assets.marciano1,Assets.marciano1_2,this,7,58);
		
		
		marciano_fila_3_numero1 = new Marcianos(new Vector2D(14,200),Assets.marciano2,Assets.marciano2_2,this,1,52);
		marciano_fila_3_numero2 = new Marcianos(new Vector2D(10+80,200),Assets.marciano2,Assets.marciano2_2,this,2,52);
		marciano_fila_3_numero3 = new Marcianos(new Vector2D(90+80,200),Assets.marciano2,Assets.marciano2_2,this,3,52);
		marciano_fila_3_numero4 = new Marcianos(new Vector2D(170+80,200),Assets.marciano2,Assets.marciano2_2,this,4,52);
		marciano_fila_3_numero5 = new Marcianos(new Vector2D(250+80,200),Assets.marciano2,Assets.marciano2_2,this,5,52);
		marciano_fila_3_numero6 = new Marcianos(new Vector2D(330+80,200),Assets.marciano2,Assets.marciano2_2,this,6,52);
		marciano_fila_3_numero7 = new Marcianos(new Vector2D(410+80,200),Assets.marciano2,Assets.marciano2_2,this,7,52);
		
		marciano_fila_4_numero1 = new Marcianos(new Vector2D(14,150),Assets.marciano2,Assets.marciano2_2,this,1,52);
		marciano_fila_4_numero2 = new Marcianos(new Vector2D(10+80,150),Assets.marciano2,Assets.marciano2_2,this,2,52);
		marciano_fila_4_numero3 = new Marcianos(new Vector2D(90+80,150),Assets.marciano2,Assets.marciano2_2,this,3,52);
		marciano_fila_4_numero4 = new Marcianos(new Vector2D(170+80,150),Assets.marciano2,Assets.marciano2_2,this,4,52);
		marciano_fila_4_numero5 = new Marcianos(new Vector2D(250+80,150),Assets.marciano2,Assets.marciano2_2,this,5,52);
		marciano_fila_4_numero6 = new Marcianos(new Vector2D(330+80,150),Assets.marciano2,Assets.marciano2_2,this,6,52);
		marciano_fila_4_numero7 = new Marcianos(new Vector2D(410+80,150),Assets.marciano2,Assets.marciano2_2,this,7,52);
		
		marciano_fila_5_numero1 = new Marcianos(new Vector2D(14,100),Assets.marciano2,Assets.marciano2_2,this,1,52);
		marciano_fila_5_numero2 = new Marcianos(new Vector2D(10+80,100),Assets.marciano2,Assets.marciano2_2,this,2,52);
		marciano_fila_5_numero3 = new Marcianos(new Vector2D(90+80,100),Assets.marciano2,Assets.marciano2_2,this,3,52);
		marciano_fila_5_numero4 = new Marcianos(new Vector2D(170+80,100),Assets.marciano2,Assets.marciano2_2,this,4,52);
		marciano_fila_5_numero5 = new Marcianos(new Vector2D(250+80,100),Assets.marciano2,Assets.marciano2_2,this,5,52);
		marciano_fila_5_numero6 = new Marcianos(new Vector2D(330+80,100),Assets.marciano2,Assets.marciano2_2,this,6,52);
		marciano_fila_5_numero7 = new Marcianos(new Vector2D(410+80,100),Assets.marciano2,Assets.marciano2_2,this,7,52);
		
		marciano_fila_6_numero1 = new Marcianos(new Vector2D(14+4,50),Assets.marciano3,Assets.marciano3_3,this,1,46);
		marciano_fila_6_numero2 = new Marcianos(new Vector2D(10+80+4,50),Assets.marciano3,Assets.marciano3_3,this,2,46);
		marciano_fila_6_numero3 = new Marcianos(new Vector2D(90+80+4,50),Assets.marciano3,Assets.marciano3_3,this,3,46);
		marciano_fila_6_numero4 = new Marcianos(new Vector2D(170+80+4,50),Assets.marciano3,Assets.marciano3_3,this,4,46);
		marciano_fila_6_numero5 = new Marcianos(new Vector2D(250+80+4,50),Assets.marciano3,Assets.marciano3_3,this,5,46);
		marciano_fila_6_numero6 = new Marcianos(new Vector2D(330+80+4,50),Assets.marciano3,Assets.marciano3_3,this,6,46);
		marciano_fila_6_numero7 = new Marcianos(new Vector2D(410+80+4,50),Assets.marciano3,Assets.marciano3_3,this,7,46);
		
		marcianos.add(marciano_fila_1_numero1);
		marcianos.add(marciano_fila_2_numero1);
		marcianos.add(marciano_fila_3_numero1);
		marcianos.add(marciano_fila_5_numero1);
		marcianos.add(marciano_fila_4_numero1);
		
		marcianos.add(marciano_fila_1_numero7);
		marcianos.add(marciano_fila_2_numero7);
		marcianos.add(marciano_fila_3_numero7);
		marcianos.add(marciano_fila_4_numero7);
		marcianos.add(marciano_fila_5_numero7);
		
		////
		marcianos.add(marciano_fila_1_numero2);
		marcianos.add(marciano_fila_1_numero3);
		marcianos.add(marciano_fila_1_numero4);
		marcianos.add(marciano_fila_1_numero5);
		marcianos.add(marciano_fila_1_numero6);

		marcianos.add(marciano_fila_2_numero2);
		marcianos.add(marciano_fila_2_numero3);
		marcianos.add(marciano_fila_2_numero4);
		marcianos.add(marciano_fila_2_numero5);
		marcianos.add(marciano_fila_2_numero6);

		marcianos.add(marciano_fila_3_numero2);
		marcianos.add(marciano_fila_3_numero3);
		marcianos.add(marciano_fila_3_numero4);
		marcianos.add(marciano_fila_3_numero5);
		marcianos.add(marciano_fila_3_numero6);

		marcianos.add(marciano_fila_4_numero2);
		marcianos.add(marciano_fila_4_numero3);
		marcianos.add(marciano_fila_4_numero4);
		marcianos.add(marciano_fila_4_numero5);
		marcianos.add(marciano_fila_4_numero6);
		
		marcianos.add(marciano_fila_5_numero2);
		marcianos.add(marciano_fila_5_numero3);
		marcianos.add(marciano_fila_5_numero4);
		marcianos.add(marciano_fila_5_numero5);
		marcianos.add(marciano_fila_5_numero6);
		
		marcianos.add(marciano_fila_6_numero1);
		marcianos.add(marciano_fila_6_numero2);
		marcianos.add(marciano_fila_6_numero3);
		marcianos.add(marciano_fila_6_numero4);
		marcianos.add(marciano_fila_6_numero5);
		marcianos.add(marciano_fila_6_numero6);
		marcianos.add(marciano_fila_6_numero7);
	}
	/**
	 * Metodo heredado de Estado, se encarga de actualizar el juego, este metodo actualiza los metodos update de los <b>ObjetosJuego</b>,
	 * ademas se encarga de comprobar que objetos tiene que borrar y se encarga de actualizar el boton que sale cuando pierdes.
	 * @see objetosJuego_Dificil.ObjetosJuego
	 * @see interfazUsuario.Botones
	 */
	public void update(){
		for(int i = 0;i <objetosNave.size(); i++){
			objetosNave.get(i).update();
		}
		eliminarObjetos(objetosNave);
		
		eliminarObjetos(objetosMarcianos);
		
		if(perder == false){
			for(int i = 0;i <objetosMarcianos.size(); i++){
					objetosMarcianos.get(i).update();
			}
			
			movimientoMarcianos(marcianos);
			
			for(Marcianos mar:marcianos){
				mar.update();
			}
		}
		Parapeto borrarp = null;
		for(Parapeto p:parapetos){
			p.update();
			if(p.getVidas()==0){
				borrarp = p;
			}
		}
		parapetos.remove(borrarp);
		if(botn !=null){
			botn.update();
		}
		
	}
	/**
	 * Metodo heredado de Estado, se encarga de dibiuar todos los metos draw() de los objetos <b>ObjetosJuego</b>, ademas se encarga de dibujar los menus que
	 * salen cuando pierdes y cuando ganas, tambien dibuja en la parte superior la vidas que te quedan en la nave y las puntuacion 
	 * @param g de tipo Graphics
	 * @see objetosJuego_Dificil.ObjetosJuego
	 */
	public void draw(Graphics g){
		if(perder == false){
		// lives
				g.drawImage(Assets.vidas,250,6,null);
				if(nave.getVidas()==4){
					g.drawImage(Assets.nave,370,6,null);
					g.drawImage(Assets.nave,440,6,null);
					g.drawImage(Assets.nave,510,6,null);
					g.drawImage(Assets.nave,580,6,null);
				}else{	
					if(nave.getVidas()==3){
						g.drawImage(Assets.nave,370,6,null);
						g.drawImage(Assets.nave,440,6,null);
						g.drawImage(Assets.nave,510,6,null);
					}else{
						if(nave.getVidas()==2){
							g.drawImage(Assets.nave,370,6,null);
							g.drawImage(Assets.nave,440,6,null);
						}else{
							if(nave.getVidas()==1){
								g.drawImage(Assets.nave,440,6,null);
							}else{
								if(nave.getVidas()==0){
									
								}
							}
						}
					}
				}
				Marcianos borrarM = null;
				for(Marcianos m:marcianos){
					m.draw(g);
					if(m.getVidas2()==0&&m.getTiempo3()>1000){
						borrarM = m;
					}
				}
				if(borrarM!=null){
					contador += borrarM.getPuntuacion();
					marcianos.remove(borrarM);
				}
				
				
				for(int i = 0;i <objetosMarcianos.size(); i++){
					objetosMarcianos.get(i).draw(g);	
				}
				// score
				numerosContador(g);	
				
		}
		g.setColor(Color.green);
		g.drawLine(0,750,Ventana.ancho,750);
			
		for(ObjetosJuego oN:objetosNave){
			oN.draw(g);
		}
			
		for(Parapeto p:parapetos){
			p.draw(g);
		}
		perder(g);
		ganar(g);
	
		
	}
	/**
	 * Este metodo se encarga de recorrer el ArrayList pasado por parametro he indicarle a que lado se tienen que mover su objetos, le indica si se tiene que mover a la izquierda
	 * y a la derecha siempre sin salirse de la pantalla, ademas cada vez que un objeto del ArrayList se choque con un borde de la pantalla
	 * todos los objetos del ArrayList aumentan su eje Y en 10 (Metodo usado solo para Marcianos)
	 * @param a de tipo ArrayList
	 * @see objetosJuego_Dificil.Marcianos
	 */
	public void movimientoMarcianos(ArrayList<Marcianos> a){
		if(derecha){
			for(Marcianos m:marcianos){
				m.setDerecha(true);
				m.setIzquierda(false);
			}
		}
		if(izquierda){
			for(Marcianos m:marcianos){
				m.setDerecha(false);
				m.setIzquierda(true);
			}
		}
			for(Marcianos m:marcianos){
				if(derecha){
					if(m.getPosicion().getX()+75>Ventana.ancho){
						derecha = false;
						izquierda = true;
						for(Marcianos z:marcianos){
							z.getPosicion().setY(z.getPosicion().getY()+50);
							if(z.getTiempo()>200){
								z.setTiempo(z.getTiempo()-200);
							}
							if(z.getTiempo()==200){
								z.setTiempo(100);
							}
						}
					}	
				}
				if(izquierda){
					if(m.getPosicion().getX()-10<0){
						derecha = true;
						izquierda = false;
						for(Marcianos z:marcianos){
							z.getPosicion().setY(z.getPosicion().getY()+50);
							if(z.getTiempo()>200){
								z.setTiempo(z.getTiempo()-200);
							}
							if(z.getTiempo()==200){
								z.setTiempo(100);
							}
						}
					}
				}
			}
			
		
	}
	/**
	 * Este metodo se encarga de eliminar objetos tanto si se salen se la pantalla como si se quedan sin vidas 
	 * @param a de tipo ArrayList
	 */
	public void eliminarObjetos(ArrayList<ObjetosJuego> a){
		ObjetosJuego w = null;
		for(ObjetosJuego o:a){
			if(o.getPosicion().getY()<10||o.getPosicion().getY()>750){
				w = o;
			}
			if(nave.getVidas()==-1){
				w = nave;
			}
		}
		a.remove(w);
	}
	/**
	 * Retorna el ArrayList que contiene los objetos que crean los marcianos 
	 * @return ArrayList<ObjetosJuego>
	 */
	public ArrayList<ObjetosJuego> getObjetosMarcianos() {
		return objetosMarcianos;
	}
	/**
	 * Retorna el ArrayList que contiene todos los objetos que tiene el juego 
	 * @see objetosJuego_Dificil.ObjetosJuego
	 * @return ArrayList
	 */
	public ArrayList<ObjetosJuego> getObjetosNave() {
		return objetosNave;
	}
	/**
	 * Retorna el ArrayList marcianos que contiene todos los marcianos del juego 
	 * @return ArrayList
	 */
	public ArrayList<Marcianos> getMarcianos() {
		return marcianos;
	}
	/**
	 * Retorna la objeto nave de la calse <b>Nave</b>
	 * @see objetosJuego_Dificil.Nave
	 * @return Nave
	 */
	public Nave getNave(){
		return nave;
	}
	/**
	 * Retorna el valor de la variable contador
	 * @return String
	 */
	public String getContador() {
		return ""+contador;
	}
	/**
	 * Se encarga cambiar la variable contador con el parametro 
	 * @param contador de tipo int
	 */
	public void setContador(int contador) {
		this.contador = contador;
	}
	/**
	 * Se encarga de dibujar la puntuacion si los digitos son 1 o 2, ademas es el encargado de llamar a numerosContadorValoresDeDos1
	 * @see estaDelJego.EstadoJuego_Dificil#numerosContadorValoresDeDos1(Graphics)
	 * @param g de tipo Graphics
	 */
	public void numerosContador(Graphics g){
		g.drawImage(Assets.score,50,6,null);
		if(getContador().length()==1){
			g.drawImage(Assets.numero0,50+100,6,null);
		}else{
			if(getContador().length()==2){
					if(getContador().charAt(0)=='1'){
						g.drawImage(Assets.numero1,50+100,6,null);
						g.drawImage(Assets.numero0,50+100+16+4,6,null);
					}
					if(getContador().charAt(0)=='2'){
						g.drawImage(Assets.numero2,50+100,6,null);
						g.drawImage(Assets.numero0,50+100+16+4,6,null);
					}
					if(getContador().charAt(0)=='3'){
						g.drawImage(Assets.numero3,50+100,6,null);
						g.drawImage(Assets.numero0,50+100+16+4,6,null);
					}
					if(getContador().charAt(0)=='4'){
						g.drawImage(Assets.numero4,50+100,6,null);
						g.drawImage(Assets.numero0,50+100+16+4,6,null);
					}
					if(getContador().charAt(0)=='5'){
						g.drawImage(Assets.numero5,50+100,6,null);
						g.drawImage(Assets.numero0,50+100+16+4,6,null);
					}
					if(getContador().charAt(0)=='6'){
						g.drawImage(Assets.numero6,50+100,6,null);
						g.drawImage(Assets.numero0,50+100+16+4,6,null);
					}		
					if(getContador().charAt(0)=='7'){
						g.drawImage(Assets.numero7,50+100,6,null);
						g.drawImage(Assets.numero0,50+100+16+4,6,null);
					}
					if(getContador().charAt(0)=='8'){
						g.drawImage(Assets.numero8,50+100,6,null);	
						g.drawImage(Assets.numero0,50+100+16+4,6,null);
										}
					if(getContador().charAt(0)=='9'){
						g.drawImage(Assets.numero9,50+100,6,null);
						g.drawImage(Assets.numero0,50+100+16+4,6,null);
					}
			}else{
				if(getContador().length()==3){
					if(getContador().charAt(0)=='1'){
						g.drawImage(Assets.numero1,50+100,6,null);
						numerosContadorValoresDeDos(g);
					}
					if(getContador().charAt(0)=='2'){
						g.drawImage(Assets.numero2,50+100,6,null);
						numerosContadorValoresDeDos(g);
					}
					if(getContador().charAt(0)=='3'){
						g.drawImage(Assets.numero3,50+100,6,null);
						numerosContadorValoresDeDos(g);
					}
					if(getContador().charAt(0)=='4'){
						g.drawImage(Assets.numero4,50+100,6,null);
						numerosContadorValoresDeDos(g);
					}
					if(getContador().charAt(0)=='5'){
						g.drawImage(Assets.numero5,50+100,6,null);
						numerosContadorValoresDeDos(g);
					}
					if(getContador().charAt(0)=='6'){
						g.drawImage(Assets.numero6,50+100,6,null);
						numerosContadorValoresDeDos(g);
					}		
					if(getContador().charAt(0)=='7'){
						g.drawImage(Assets.numero7,50+100,6,null);
						numerosContadorValoresDeDos(g);
					}
					if(getContador().charAt(0)=='8'){
						g.drawImage(Assets.numero8,50+100,6,null);	
						numerosContadorValoresDeDos(g);
										}
					if(getContador().charAt(0)=='9'){
						g.drawImage(Assets.numero9,50+100,6,null);
						numerosContadorValoresDeDos(g);
					}	
				}
			}
			
		}
	}
	/**
	 * Este metodo dibuja los numeros que representan los puntos que as consegido al matar marcianos, pero solo dibuja los numeros en el caso de que 
	 * tu puntuacion tenga 3 digitos 
	 * @param g de tipo Graphics
	 */
	public void numerosContadorValoresDeDos(Graphics g){
		if(getContador().charAt(1)=='0'){
			g.drawImage(Assets.numero0,50+100+16+4,6,null);
			g.drawImage(Assets.numero0,50+100+16+4+16+4,6,null);
		}
		if(getContador().charAt(1)=='1'){
			g.drawImage(Assets.numero1,50+100+16+4,6,null);
			g.drawImage(Assets.numero0,50+100+16+4+16+4,6,null);
		}
		if(getContador().charAt(1)=='2'){
			g.drawImage(Assets.numero2,50+100+16+4,6,null);
			g.drawImage(Assets.numero0,50+100+16+4+16+4,6,null);
		}
		if(getContador().charAt(1)=='3'){
			g.drawImage(Assets.numero3,50+100+16+4,6,null);
			g.drawImage(Assets.numero0,50+100+16+4+16+4,6,null);
		}
		if(getContador().charAt(1)=='4'){
			g.drawImage(Assets.numero4,50+100+16+4,6,null);
			g.drawImage(Assets.numero0,50+100+16+4+16+4,6,null);
		}
		if(getContador().charAt(1)=='5'){
			g.drawImage(Assets.numero5,50+100+16+4,6,null);
			g.drawImage(Assets.numero0,50+100+16+4+16+4,6,null);
		}
		if(getContador().charAt(1)=='6'){
			g.drawImage(Assets.numero6,50+100+16+4,6,null);
			g.drawImage(Assets.numero0,50+100+16+4+16+4,6,null);
		}		
		if(getContador().charAt(1)=='7'){
			g.drawImage(Assets.numero7,50+100+16+4,6,null);
			g.drawImage(Assets.numero0,50+100+16+4+16+4,6,null);
		}
		if(getContador().charAt(1)=='8'){
			g.drawImage(Assets.numero8,50+100+16+4,6,null);	
			g.drawImage(Assets.numero0,50+100+16+4+16+4,6,null);
							}
		if(getContador().charAt(1)=='9'){
			g.drawImage(Assets.numero9,50+100+16+4,6,null);
			g.drawImage(Assets.numero0,50+100+16+4+16+4,6,null);
		}
	}
	/**
	 * Este metodo se encarga mostrar las imagenes cuando ganas la partida, muestra la cantidad de vidas que te quedan, tu puntuacion y una imagen de ganar, ademas
	 * en la ventan se crea un voton para volver al menu
	 * @see interfazUsuario.Botones
	 * @param g de tipo Graphics
	 */
	public void ganar(Graphics g){
		if(marcianos.size()==0){
			perder = true;
			g.drawImage(Assets.your1,50,500,null);
			g.drawImage(Assets.vidas,50+120,500,null);
			if(nave.getVidas()==4){
				g.drawImage(Assets.nave,50+120+40+70,500,null);
				g.drawImage(Assets.nave,50+120+40+70+70,500,null);
				g.drawImage(Assets.nave,50+120+40+70+70+70,500,null);
				g.drawImage(Assets.nave,50+120+40+70+70+70+70,500,null);
			}
			if(nave.getVidas()==3){
				g.drawImage(Assets.nave,50+120+40+70,500,null);
				g.drawImage(Assets.nave,50+120+40+70+70,500,null);
				g.drawImage(Assets.nave,50+120+40+70+70+70,500,null);
			}
			if(nave.getVidas()==2){
				g.drawImage(Assets.nave,50+120+40+70,500,null);
				g.drawImage(Assets.nave,50+120+40+70+70,500,null);
			}
			if(nave.getVidas()==1){
				g.drawImage(Assets.nave,50+120+40+70,500,null);
			}
			g.drawImage(Assets.ganar,20,0,null);
			g.drawImage(Assets.ronri,500,450,null);
			if(botn==null){
				botn = new Botones(Assets.goBack,Assets.goBack1,450,650, 7);
			}
			botn.draw(g);
		}
	}
	/**
	 * Este metodo es el encargado de dibujar en pantalla encaso de perder las puntuaciones y el mensaje de que as perdido
	 * @param g de tipo Graphics
	 */
	public void perder(Graphics g){
		if(nave.getVidas()==-1){
			perder = true;
			g.drawImage(Assets.your1,200,300,null);
			g.drawImage(Assets.score2,200+120,300,null);
			g.drawImage(Assets.ronri,400,400,null);
			g.drawImage(Assets.peder,-4,200,null);
			numerosContador1(g);
			if(botn==null){
				botn = new Botones(Assets.goBack,Assets.goBack1,450,670, 7);
			}
			botn.draw(g);
		}
	}
	/**
	 * Se encarga de dibujar la puntuacion si los digitos son 1 o 2, ademas es el encargado de llamar a numerosContadorValoresDeDos1
	 * @see estaDelJego.EstadoJuego_Dificil#numerosContadorValoresDeDos1(Graphics)
	 * @param g de tipo Graphics
	 */
	public void numerosContador1(Graphics g){
		if(getContador().length()==1){
			g.drawImage(Assets.numero0,200+120+120,300,null);
		}else{
			if(getContador().length()==2){
					if(getContador().charAt(0)=='1'){
						g.drawImage(Assets.numero1,200+120+120,300,null);
						g.drawImage(Assets.numero0,200+120+120+16+4,300,null);
					}
					if(getContador().charAt(0)=='2'){
						g.drawImage(Assets.numero2,200+120+120,300,null);
						g.drawImage(Assets.numero0,200+120+120+16+4,300,null);
					}
					if(getContador().charAt(0)=='3'){
						g.drawImage(Assets.numero3,200+120+120,300,null);
						g.drawImage(Assets.numero0,200+120+120+16+4,300,null);
					}
					if(getContador().charAt(0)=='4'){
						g.drawImage(Assets.numero4,200+120+120,350,null);
						g.drawImage(Assets.numero0,200+120+120+16+4,350,null);
					}
					if(getContador().charAt(0)=='5'){
						g.drawImage(Assets.numero5,200+120+120,300,null);
						g.drawImage(Assets.numero0,200+120+120+16+4,300,null);
					}
					if(getContador().charAt(0)=='6'){
						g.drawImage(Assets.numero6,200+120+120,300,null);
						g.drawImage(Assets.numero0,200+120+120+16+4,300,null);
					}		
					if(getContador().charAt(0)=='7'){
						g.drawImage(Assets.numero7,200+120+120,300,null);
						g.drawImage(Assets.numero0,200+120+120+16+4,300,null);
					}
					if(getContador().charAt(0)=='8'){
						g.drawImage(Assets.numero8,200+120+120,300,null);	
						g.drawImage(Assets.numero0,200+120+120+16+4,300,null);
										}
					if(getContador().charAt(0)=='9'){
						g.drawImage(Assets.numero9,200+120+120,300,null);
						g.drawImage(Assets.numero0,200+120+120+16+4,300,null);
					}
			}else{
				if(getContador().length()==3){
					if(getContador().charAt(0)=='1'){
						g.drawImage(Assets.numero1,200+120+120,300,null);
						numerosContadorValoresDeDos1(g);
					}
					if(getContador().charAt(0)=='2'){
						g.drawImage(Assets.numero2,200+120+120,300,null);
						numerosContadorValoresDeDos1(g);
					}
					if(getContador().charAt(0)=='3'){
						g.drawImage(Assets.numero3,200+120+120,300,null);
						numerosContadorValoresDeDos1(g);
					}
					if(getContador().charAt(0)=='4'){
						g.drawImage(Assets.numero4,200+120+120,300,null);
						numerosContadorValoresDeDos1(g);
					}
					if(getContador().charAt(0)=='5'){
						g.drawImage(Assets.numero5,200+120+120,300,null);
						numerosContadorValoresDeDos1(g);
					}
					if(getContador().charAt(0)=='6'){
						g.drawImage(Assets.numero6,200+120+120,300,null);
						numerosContadorValoresDeDos1(g);
					}		
					if(getContador().charAt(0)=='7'){
						g.drawImage(Assets.numero7,200+120+120,300,null);
						numerosContadorValoresDeDos1(g);
					}
					if(getContador().charAt(0)=='8'){
						g.drawImage(Assets.numero8,200+120+120,300,null);	
						numerosContadorValoresDeDos1(g);
										}
					if(getContador().charAt(0)=='9'){
						g.drawImage(Assets.numero9,200+120+120,300,null);
						numerosContadorValoresDeDos1(g);
					}	
				}
			}
			
		}
	}
	/**
	 * Este metodo dibuja los numeros que representan los puntos que as consegido al matar marcianos, pero solo dibuja los numeros en el caso de que 
	 * tu puntuacion tenga 3 digitos 
	 * @param g de tipo Graphics
	 */
	public void numerosContadorValoresDeDos1(Graphics g){
		if(getContador().charAt(1)=='0'){
			g.drawImage(Assets.numero0,200+120+120+16+4,300,null);
			g.drawImage(Assets.numero0,200+120+120+16+4+16+4,300,null);
		}
		if(getContador().charAt(1)=='1'){
			g.drawImage(Assets.numero1,200+120+120+16+4,300,null);
			g.drawImage(Assets.numero0,200+120+120+16+4+16+4,300,null);
		}
		if(getContador().charAt(1)=='2'){
			g.drawImage(Assets.numero2,200+120+120+16+4,300,null);
			g.drawImage(Assets.numero0,200+120+120+16+4+16+4,300,null);
		}
		if(getContador().charAt(1)=='3'){
			g.drawImage(Assets.numero3,200+120+120+16+4,300,null);
			g.drawImage(Assets.numero0,200+120+120+16+4+16+4,300,null);
		}
		if(getContador().charAt(1)=='4'){
			g.drawImage(Assets.numero4,200+120+120+16+4,300,null);
			g.drawImage(Assets.numero0,200+120+120+16+4+16+4,300,null);
		}
		if(getContador().charAt(1)=='5'){
			g.drawImage(Assets.numero5,200+120+120+16+4,300,null);
			g.drawImage(Assets.numero0,200+120+120+16+4+16+4,300,null);
		}
		if(getContador().charAt(1)=='6'){
			g.drawImage(Assets.numero6,200+120+120+16+4,300,null);
			g.drawImage(Assets.numero0,200+120+120+16+4+16+4,300,null);
		}		
		if(getContador().charAt(1)=='7'){
			g.drawImage(Assets.numero7,200+120+120+16+4,300,null);
			g.drawImage(Assets.numero0,200+120+120+16+4+16+4,300,null);
		}
		if(getContador().charAt(1)=='8'){
			g.drawImage(Assets.numero8,200+120+120+16+4,300,null);	
			g.drawImage(Assets.numero0,200+120+120+16+4+16+4,300,null);
							}
		if(getContador().charAt(1)=='9'){
			g.drawImage(Assets.numero9,200+120+120+16+4,300,null);
			g.drawImage(Assets.numero0,200+120+120+16+4+16+4,300,null);
		}
	}
}

package edd.src.Wizard;
import java.util.NoSuchElementException;

public class Jugador {

    private lista mano;
    private int puntos;

    public Jugador(lista mano, int puntos){
	this.mano = mano;
	this.puntos = puntos;
    }

    public int getPuntos(){
	return this.puntos;
    }


  
    public Carta juegaCarta(){
	System.out.println("puedes elegir alguna de las siguientes: "+ mano);

	public static Scanner sc = new Scanner(System.in);
	
	if(!(mano.contains(Integer.parseInt(scanner.nextLine()))))
	    throw new NoSuchElementException("Esta carta no pertenece a tu mano. Elige una que sí pertenezca a esta.");

	return mano.elemento(Integer.parseInt(scanner.nextLine()))
	//elimina esa carta de la mano que tenemos.
    }


    public Carta juegaCarta(Carta paloLider){
	System.out.println("puedes elegir alguna de las siguientes: "+ mano);
	System.out.println("Preferentemente juega la carta más alta del palo líder.");

	public static Scanner sc = new Scanner(System.in);

	if(!(mano.contains(Integer.parseInt(scanner.nextLine()))))
	    throw new NoSuchElementException("Esta carta no pertenece a tu mano. Elige una que sí pertenezca a esta.");
	
	if(mano.contains(Integer.parseInt(scanner.nextLine())) && (Integer.parseInt(scanner.nextLine()) != paloLider))
	    throw new NoSuchElementException("Sí tienes cartas del palo líder, utiliza esas primero. Preferentemente la de mayor valor.");
		
	return mano.elemento(Integer.parseInt(scanner.nextLine()))
	//elimina esa carta de la mano que tenemos.
	
    }

 
    @Override
    public String toString(){
	String aux = this.palo + numero + ColorTerminal.RESET;
	return aux;
    }
    
}

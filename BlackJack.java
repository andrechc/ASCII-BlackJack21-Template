import java.lang.Math;
import java.util.Scanner;

public class BlackJack extends CardDisplayer {
	static Scanner sc = new Scanner(System.in);
		
	// BlackJack ASCII por André Chaumet. 
	
	static TwoBlocks fuente = new TwoBlocks(); // FUENTE EXTRAIDA JUNTO CON UN ALGORITMO QUE DESARROLLÉ DESDE 0 PARA CONVERTIR STRINGS
//	                                              A FUENTES QUE OCUPAN MÁS DE 7 RENGLONES POR LETRA. VÉASE MyConsoleFonts.

	private String nombre; // nombre jugador(Se debe crear el Cruiper también)
	private String nombreFont; // nombre con tipografía TwoBlocks
	private int puntajeCartas = 0; // PUNTAJE GENERADO EN BASE A String codigoCartas;
	private String codigoCartas = ""; // UTILIZADA PARA ALMACENAR LAS CARTAS QUE SACÓ EL JUGADOR
	private tipo tipoParticipante; // UTILIZADA PARA OCULTAR AL JUGADOR LA 2DA CARTA DE LAS PRIMERAS 2 CARTAS QUE RECIBE EL CRUIPER
	private boolean esManoInicial = true; // UTILIZADA PARA GENERAR 2 CARTAS EN LA PRIMERA MANO

	public BlackJack(String nombre, tipo tipoParticipante) {
		this.tipoParticipante = tipoParticipante;
		this.nombre = nombre;
		this.nombreFont = fuente.generator(nombre.toLowerCase());
	}

	public void pedirCarta() { // GENERA CARTAS.
		if (this.esManoInicial == true) {
			//LA PRIMERA MANO ENTREGA 2 CARTAS.
			esManoInicial = false;
			generarCodigoCartas(2);
		} else {
			//LA SEGUNDA MANO EN ADELANTE ENTREGA SIEMPRE 1 CARTA A LA VEZ.
			generarCodigoCartas(1);
		}		
		generarValoresCartas(codigoCartas);
		mostrarCartas();
	}

	private void mostrarCartas() { // DISPLAYER DE LAS CARTAS GENERADAS CON DIBUJOS ASCII.
//		                             LAS CARTAS SE GENERAN LINEA POR LINEA PARA PODER VERSE UNA AL LADO DE LA OTRA
//                                   HECHO REUTILIZANDO EL ALGORITMO QUE DISEÑÉ PREVIAMENTE PARA MyConsoleFonts.
		if (this.tipoParticipante == tipo.CRUIPER && this.codigoCartas.length() <= 2) {
			//DISPLAY CARTAS CRUIPER
			System.out.println(this.nombre + " tiene las siguientes cartas...");
			System.out.println(generator(this.codigoCartas.charAt(0) + "r"));
			//OCULTA LA CARTA N°2 EN LA PRIMERA MANO.
			String paraEsconder =  Integer.toString(getPuntajeCartas());			
			enterParaContinuar();
		} else {
			//DISPLAY CARTAS JUGADOR
			System.out.println(generator(this.codigoCartas));
			System.out.println(this.nombreFont + " tiene un puntaje total de: " + getPuntajeCartas() + "\n");
			enterParaContinuar();
		}
	}

	public int calcularPuntaje(BlackJack jugador) {  // DEVUELVE EL PUNTAJE DE X JUGADOR. A SU VEZ ANUNCIA EL "BLACKJACK21"
		if(jugador.getPuntajeCartas() > 21 && jugador.codigoCartas.contains("a")) { // MANIPULA EL VALOR DEL AS A CONVENIENCIA DEL PUNTAJE.
			jugador.setPuntajeCartas(puntajeCartas-10);                             // AS puede valer 1 || 11.
		}
		if (jugador.getPuntajeCartas() == 21) {
			System.out.println(fuente.generator(jugador.getNombre() + " ha sacado blackjack" + "\n"));		
		} 
		return puntajeCartas;
	}

	private void generarCodigoCartas(int cantCartas) { // GENERA ALEATORIAMENTE LOS CODIGOS DE LAS CARTAS. "NO ES PARA ASIGNAR PUNTAJE, SÓLO PARA ALMACENAR
//																										  LAS CARTAS SACADAS PARA LUEGO SER CONVERTIDAS.
		for (int i = 0; i < cantCartas; i++) {
			double j = Math.random() * (13 - 0) + 1;
			int k = (int) j;

			switch (k) {
			case 1:
				codigoCartas += "a";
				break;
			case 2:
				codigoCartas += "k";
				break;
			case 3:
				codigoCartas += "q";
				break;
			case 4:
				codigoCartas += "j";
				break;
			case 5:
				codigoCartas += "2";
				break;
			case 6:
				codigoCartas += "3";
				break;
			case 7:
				codigoCartas += "4";
				break;
			case 8:
				codigoCartas += "5";
				break;
			case 9:
				codigoCartas += "6";
				break;
			case 10:
				codigoCartas += "7";
				break;
			case 11:
				codigoCartas += "8";
				break;
			case 12:
				codigoCartas += "9";
				break;
			case 13:
				codigoCartas += "0";
				break;
			}
		}
	}

	private void generarValoresCartas(String codigoCartas) { // RECIBE UN CÓDIGO QUE SIMBOLIZA LAS CARTAS SACADAS, Y LO CONVIERTE A UN PUNTAJE.
															 
		puntajeCartas = 0;
		for (int i = 0; i < codigoCartas.length(); i++) {

			switch (codigoCartas.charAt(i)) {
			case 'a':
				puntajeCartas += 11;				
				// EL PUNTAJE DEL AS PUEDE VARIAR DEPENDIENDO DEL RESULTADO TOTAL DE LAS CARTAS.
				// SE CAMBIA A CONVENIENCIA DEL PUNTAJE DEL JUGADOR, I.E. SI EL JUGADOR SACÓ J(10), 5(5) & A(11)
				//                                                        EN LUGAR DE SUMARSE 26(10+5+11) SE SUMARÁ 16(10+5+1).
				//                                                        ESTO ESTÁ ESTIMADO EN EL MÉTODO calcularPuntaje(puntaje);
				break;
			case 'k':
				puntajeCartas += 10;
				break;
			case 'q':
				puntajeCartas += 10;
				break;
			case 'j':
				puntajeCartas += 10;
				break;
			case '2':
				puntajeCartas += 2;
				break;
			case '3':
				puntajeCartas += 3;
				break;
			case '4':
				puntajeCartas += 4;
				break;
			case '5':
				puntajeCartas += 5;
				break;
			case '6':
				puntajeCartas += 6;
				break;
			case '7':
				puntajeCartas += 7;
				break;
			case '8':
				puntajeCartas += 8;
				break;
			case '9':
				puntajeCartas += 9;
				break;
			case '0':
				puntajeCartas += 10;
				break;
			}

		}
	}

	static void enterParaContinuar() { // ESTE METODO ES SOLO PARA DARLE UNA PAUSA AL JUGADOR ENTRE CADA MOVIMIENTO PARA QUE PUEDA PENSAR
		System.out.println("Presionar Enter para continuar...");
		sc.nextLine();
		System.out.println("________________________________________________");
		System.out.println("________________________________________________" + "\n");
	}

	static void enterParaComenzar() { // ESTE METODO ES SOLO PARA UTILIZAR AL INICIO DE CADA MANO
		System.out.println("  ________________  \r\n"
				+ "((                ))\r\n"
				+ " )) BlackJack 21 (( \r\n"
				+ "((   por André    ))\r\n"
				+ "  ----------------  ");
		System.out.println("\n" + "Presionar Enter para comenzar...");
		sc.nextLine();
	}

	public void reiniciarJuego() { // ESTE METODO RESETEA LOS VALORES PARA PODER COMENZAR LA SIGUIENTE MANO
		this.codigoCartas = "";
		this.puntajeCartas = 0;
		this.esManoInicial = true;
	}
	
	private void setPuntajeCartas(int nuevoPuntaje) { // ESTE METODO ES SÓLO PARA REASIGNAR EL VALOR DEL AS A CONVENIENCIA DE X.
		this.puntajeCartas = nuevoPuntaje;            // AS(11) A ---> AS(1) PARA NO PASARSE (SÓLO SI EXISTE A Y LA SUMA ES MAYOR A 21) 
	}

	private int getPuntajeCartas() {
		return puntajeCartas;
	}

	public String getNombre() {
		return nombre;
	}
}


public class Coche {
	
	private int velocidad;
	
	// constructor
	Coche () {
		velocidad=0;
	}
	
	int getVelocidad(){
		
		return velocidad;
	}
	
	void acelera(int mas){
		//velocidad += mas;
		velocidad = velocidad + mas;
		
	}
	
	void frena(int menos){
		
		// velocidad = velocidad - menos;
		velocidad -= menos;
		
	}
}
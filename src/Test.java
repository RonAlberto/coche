
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche mibuga = new Coche();
		
		mibuga.acelera(40);
		mibuga.acelera(80);
		mibuga.acelera(10);
		System.out.println(mibuga.getVelocidad());
		
		mibuga.frena(20);
		System.out.println(mibuga.getVelocidad());
	}

}

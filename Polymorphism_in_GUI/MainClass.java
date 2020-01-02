package cS4;

public class MainClass {
	public static void main(String [] args) {
		
		IFACE fc ;//= new IFACE();
		TestIface f1 = new TestIface();
		fc = new TestIface();
		fc.display();
		fc = new Testt2Iface();
		fc.display();
	}
}

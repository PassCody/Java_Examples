package uebung_IV;

interface MyFirstInterface {
	public int init();
	public void sounds(int i);
	
}

class UebungIV_Main {
	public static void main(String[] args){
		MyFirstInterfaceClass mfi = new MyFirstInterfaceClass();
		mfi.sounds(mfi.init());
	}	
}
	
class MyFirstInterfaceClass implements MyFirstInterface{
	
	public int init() {
		int i = (int)((Math.random() * 5) + 1);
		return i;
	}
	
	public void sounds(int i){
		switch(i){
			case 1:
				System.out.println("1");
			break;
			case 2:
				System.out.println("2");
			break;
			case 3:
				System.out.println("3");
			break;
			case 4:
				System.out.println("4");
			break;
			case 5:
				System.out.println("5");
			break;
		}
	}
}

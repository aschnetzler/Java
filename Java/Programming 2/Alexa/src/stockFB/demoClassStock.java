package stockFB;

public class demoClassStock {

	public static void main(String args){
		//Instance 1
		stock fb= new stock();
			fb.setSymbol("FB");
			fb.setOpenPrice(110.80);
			fb.setPrice(110.06);
			fb.setTime("2:25 pm");
			fb.setName("Facebook");
			fb.setDate("02/04/2016");
			fb.setPreviousClose(112.69);
			
			System.out.println(fb);
			System.out.println("Varation is" + fb.getVaration());
		//Instance 2
		stock ms= new stock();
			ms.setSymbol("MSFT");
			ms.setOpenPrice(52.10);
			ms.setPrice(51.28);
			ms.setTime("2:26 pm");
			ms.setName("Microsoft");
			ms.setDate("02/04/2016");
			ms.setPreviousClose(52.16);
			
			System.out.println(ms);
			System.out.println("Varation is" + ms.getVaration());
			
	}
		
		
	

}

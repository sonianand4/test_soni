package week1.day3;

public class Myphone {
	
    String mycall="abc";
    public String msg="I am good";
    protected int ph=1;
    private int w=1;
     void selfie()
     {
    	 System.out.println("Selfie taken from vivo v9 are very good");
     }
static void paronoma()
{System.out.println("this is an execellent feature");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile be=new Mobile();
		be.talk();
		be.watsapp();
		paronoma();
		Myphone vv= new Myphone();
		vv.selfie();
		

	}

}

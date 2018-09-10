package week1.day3;

public class Mobile {

	public static void main(String[] args)
	{ 
		String call="Efg";
		switch(call)
		{
		case "Abc": System.out.println("call is connected via 3G");
				break;
				case "Efg":System.out.println("call is connected via 4G");
				break;
				
		}
		Mobile be=new Mobile();
		be.talk();
		be.textmessage();
		watchvideos();
		be.watsapp();
		be.sendSMS(8939243130L,"Good morning! Happy Sunday");
		be.callContact(8939243130L);
	}
	
	public void talk()
	{
    System.out.println("I am talking");
    String callquality="execellent";
	}

	private void textmessage()

	{
		String textmessagedel="good";
		System.out.println("I am texting");
		}
	static void watchvideos()
	{
		System.out.println("Video quality is good");
	
	}
	protected void watsapp()
	{
		System.out.println("i am using watsapp");
	}
	
	public  void sendSMS(long mobileNumber,String SMS)
	{
		System.out.println("Good morning! Happy Sunday!");
	}
	public void callContact(long mobileNumber)
	{
		System.out.println("calling");
	}
	
		}
	
	



package host;

public class AlreadyReservedException extends Throwable{

	public AlreadyReservedException(){
		
	}
	
	public AlreadyReservedException(String message){
		System.out.println(message);
	}
	
}

import java.util.Random;

public class GenerateOTP {

	
	static char[] sendOTP(int lenght) {
		System.out.println("Please do not share, Your OTP is :");
		String numbers="0123456789abcdefghijklmnopqrstuvwxyz";
		Random r=new Random();
		char[] otp=new char[lenght];
		for(int i=0;i<lenght;i++) {
			
			otp[i]=numbers.charAt(r.nextInt(numbers.length()));
		}
		
		return otp;
	}
	public static void main(String[] args) {
		System.out.println("Generating opt...........");
		System.out.println(sendOTP(4));

	}

}

package ezgi;
import java.util.*;
public class Carpan {

	public static void main(String[] args) {
		// Bu program, kullan�c�dan al�nan pozitif say�n�n �arpanlar�n� bulur ve ekrana basar..
		
		
	Scanner sayi1 = new Scanner (System.in);
		System.out.println("Carpanlar�n� bulmak istediginiz pozitif sayiyi giriniz: ");
		int s = sayi1.nextInt();
		
		
		for (int i=1; i<=s; i++) {
			
			 if (s > 0 && s%i == 0) {
	 
				System.out.println(i+ " girdiginiz sayinin bir carpanidir");
				
				}
	
		}

			}
		
		
}


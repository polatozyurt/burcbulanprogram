import java.util.Scanner;

public class burcbulanprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		//burç bulan program	
		
		int month, day ;
		
		
		System.out.print("Doðduðunuz ay: ");
		month=input.nextInt();
		
		System.out.print("Doðduðunuz gün: ");
		day=input.nextInt();
		
		
		if(day<=31) {
			
			
			
			if(month ==1) {	
				if(day<=21) {
					System.out.print("Burcunuz Oðlak");	
				}else {
					System.out.print("Burcunuz Kova");	
				}
					}
			else if(month==2) {
				if(day<=19) {
					System.out.print("Burcunuz Kova");	
				}else {
					System.out.print("Burcunuz Balýk");	
				}
			}
			else if(month==3) {
				if(day<=20) {
					System.out.print("Burcunuz Balýk");	
				}else {
					System.out.print("Burcunuz Koç");	
			}
			}
			else if(month==4) {
				if(day<=20) {
					System.out.print("Burcunuz Koç");	
				}else {
					System.out.print("Burcunuz Boða");	
				}
			}	
			else if(month==5) {
				if(day<=21) {
					System.out.print("Burcunuz Boða");	
				}else {
					System.out.print("Burcunuz Ýkizler");	
				}
				
			}
			else if(month==6) {
				if(day<=22) {
					System.out.print("Burcunuz Ýkizler");	
				}else {
					System.out.print("Burcunuz Yengeç");	
				}
			}
			else if(month==7) {
				if(day<=22) {
					System.out.print("Burcunuz Yengeç");	
				}else {
					System.out.print("Burcunuz Aslan");	
				}
			}	
			else if(month==8) {
				if(day<=22) {
					System.out.print("Burcunuz Aslan");	
				}else {
					System.out.print("Burcunuz Baþak");	
				}
			}	
			else if(month==9) {
				if(day<=22) {
					System.out.print("Burcunuz Baþak");	
				}else {
					System.out.print("Burcunuz Terazi");	
				}
			}	
			else if(month==10) {
				if(day<=22) {
					System.out.print("Burcunuz Terazi");	
				}else {
					System.out.print("Burcunuz Akrep");	
				}
			}	
			else if(month==11) {
				if(day<=21) {
					System.out.print("Burcunuz Akrep");	
				}else {
					System.out.print("Burcunuz Yay");	
				}
			}	
			else if(month==12) {
				if(day<=21) {
					System.out.print("Burcunuz Yay");	
				}else {
					System.out.print("Burcunuz Oðlak");	
				}
				
				}
			else {
				System.out.print("Yanlýþ bir ay sayýsý girdiniz");
			}
			}	
		else {
			System.out.print("Yanlýþ bir gün sayýsý girdiniz");
		}
			}
			
			
		
		}
		
		
		
	
			
	
			
			
			
		
		
	
	
	
	
	
	
	
	
	
	

	
	



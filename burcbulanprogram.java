import java.util.Scanner;

public class burcbulanprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		//bur� bulan program	
		
		int month, day ;
		
		
		System.out.print("Do�du�unuz ay: ");
		month=input.nextInt();
		
		System.out.print("Do�du�unuz g�n: ");
		day=input.nextInt();
		
		
		if(day<=31) {
			
			
			
			if(month ==1) {	
				if(day<=21) {
					System.out.print("Burcunuz O�lak");	
				}else {
					System.out.print("Burcunuz Kova");	
				}
					}
			else if(month==2) {
				if(day<=19) {
					System.out.print("Burcunuz Kova");	
				}else {
					System.out.print("Burcunuz Bal�k");	
				}
			}
			else if(month==3) {
				if(day<=20) {
					System.out.print("Burcunuz Bal�k");	
				}else {
					System.out.print("Burcunuz Ko�");	
			}
			}
			else if(month==4) {
				if(day<=20) {
					System.out.print("Burcunuz Ko�");	
				}else {
					System.out.print("Burcunuz Bo�a");	
				}
			}	
			else if(month==5) {
				if(day<=21) {
					System.out.print("Burcunuz Bo�a");	
				}else {
					System.out.print("Burcunuz �kizler");	
				}
				
			}
			else if(month==6) {
				if(day<=22) {
					System.out.print("Burcunuz �kizler");	
				}else {
					System.out.print("Burcunuz Yenge�");	
				}
			}
			else if(month==7) {
				if(day<=22) {
					System.out.print("Burcunuz Yenge�");	
				}else {
					System.out.print("Burcunuz Aslan");	
				}
			}	
			else if(month==8) {
				if(day<=22) {
					System.out.print("Burcunuz Aslan");	
				}else {
					System.out.print("Burcunuz Ba�ak");	
				}
			}	
			else if(month==9) {
				if(day<=22) {
					System.out.print("Burcunuz Ba�ak");	
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
					System.out.print("Burcunuz O�lak");	
				}
				
				}
			else {
				System.out.print("Yanl�� bir ay say�s� girdiniz");
			}
			}	
		else {
			System.out.print("Yanl�� bir g�n say�s� girdiniz");
		}
			}
			
			
		
		}
		
		
		
	
			
	
			
			
			
		
		
	
	
	
	
	
	
	
	
	
	

	
	



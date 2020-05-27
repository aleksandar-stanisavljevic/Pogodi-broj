//////////////////////////////////////////////////////////////////////////////////////////
//Igra POGODI BROJ                                                                      //
//                                                                                      //
//Cilj igre je pogoditi broj koji racunar slucajno bira                                 //
//u opsegu koji na pocetku igre bira korisnik.                                          //
//Broj pokusaja za pogadjanje broja je 10.                                              //
//U slucaju da korisnik ne pogodi broj iz 10 pokusaja, igrac je izgubio.                //
//U toku igre postoji mala pomoc koja govori igracu da li je izabrani broj manji ili    //
//veci od slucajno izabranog broja ili van definisanog opsega brojeva.                  //
//Kada igrac pogodi broj, na ekranu se pojavljuje poruka CESTITAM! i iz kog pokusaja je //
//pogodio broj.                                                                         //
//////////////////////////////////////////////////////////////////////////////////////////

package pogodiBroj; //paket pogodiBroj

import java.util.Scanner; //class Scanner
import java.util.Random; //class Random

public class PogodiBroj { //driver class

	public static void main(String[] args) { //glavna metoda main
			
		Random generatorBroja = new Random();
		Scanner unos = new Scanner(System.in);
		
		//deklarisanje i inicijalizacija promenljivih
		int slBroj = generatorBroja.nextInt();
		int n, a, b, c;
		int i=1; 
			
		System.out.print ("Unesi minimalni opseg broja: ");
		b=unos.nextInt();
		System.out.print ("Unesi maksimalni opseg broja: ");
		a=unos.nextInt();
		c=(a-b)+1;
		slBroj = generatorBroja.nextInt(c)+b; 
		//System.out.println ( "Broj za pogadjanje je: "+ slBroj);
		System.out.print ("Pogadjaj broj: ");
		n=unos.nextInt();

		while((n!=slBroj)&&(i<=9)) { 
				
			if((n>slBroj) && (n<(c+b))) {
				System.out.print("Izabrani broj je veci. Pokusaj ponovo: ");
			}
			else if (n>=(c+b)){ 
				System.out.print("GRESKA! Broj koji ste uneli je van izabranog opsega. Pokusajte ponovo: ");
			}
			else if((n<slBroj)&&(n>=b)) {
				System.out.print("Izabrani broj je manji. Pokusaj ponovo: ");
			}
			else if (n<b){ 
				System.out.print("GRESKA! Broj koji ste uneli je van izabranog opsega. Pokusajte ponovo: ");		
			}
				
			n=unos.nextInt();
			i=i+1;
			}
			
		if (i<=9){
			System.out.println ("CESTITAM! Pogodili ste broj iz "+i+" pokusaja.");
		}
		else {
			System.out.println ("KRAJ IGRE! Niste pogodili broj iz 10 pokusaja.");
		}
	}	
}
package okan;

import java.util.Scanner;

public class Monthsthree {

	public static void main(String[] args) {
		int select;
		int monthsNumber;
		boolean control=true;
		Scanner ok = new Scanner(System.in);
		String[][] months = { { "Ocak", "January", "Kamin" }, { "Şubat", "February", "Februar" },
				{ "Mart", "March", "Marsch" }, { "Nisan", "April", "April" }, { "Mayıs", "May", "Dürfen" },
				{ "Haziran", "June", "Juni" }, { "Temmuz", "July", "Juli" }, { "Ağustos", "August", "August" },
				{ "Eylül", "September", "September" }, { "Ekim", "October", "Oktober" },
				{ "Kasım", "November", "November" }, { "Aralık", "December", "Dezember" } };

		
		do {
			System.out.println("Select Language\n[0]Türkçe\n[1]English\n[2]Deutsch");
			select = ok.nextInt();
			switch (select) {
			case 0: {
				System.out.println("Kaçıncı Ay?");
				monthsNumber=ok.nextInt();
				
				switch (monthsNumber) {
				case 1: {
					System.out.println(months[0][0]);
					
					break;
				}
				case 2: {
					System.out.println(months[1][0]);
					
					break;
				}
				case 3: {
					System.out.println(months[2][0]);
					
					break;
				}
				case 4: {
					System.out.println(months[3][0]);
					
					break;
				}
				case 5: {
					System.out.println(months[4][0]);
					
					break;
				}
				case 6: {
					System.out.println(months[5][0]);
					
					break;
				}
				case 7: {
					System.out.println(months[6][0]);
					
					break;
				}case 8: {
					System.out.println(months[7][0]);
					
					break;
				}case 9: {
					System.out.println(months[8][0]);
					
					break;
				}case 10: {
					System.out.println(months[9][0]);
					
					break;
				}case 11: {
					System.out.println(months[10][0]);
					
					break;
				}case 12: {
					System.out.println(months[11][0]);
					
					break;
				}
				default:
					System.out.println("Hatalı İşlem");
				}				
				control=false;				
				break;
			}
			case 1: {
				System.out.println("Which Month?");
				monthsNumber=ok.nextInt();
				switch (monthsNumber) {
				case 1: {
					System.out.println(months[0][1]);
					
					break;
				}
				case 2: {
					System.out.println(months[1][1]);
					
					break;
				}
				case 3: {
					System.out.println(months[2][1]);
					
					break;
				}
				case 4: {
					System.out.println(months[3][1]);
					
					break;
				}
				case 5: {
					System.out.println(months[4][1]);
					
					break;
				}
				case 6: {
					System.out.println(months[5][1]);
					
					break;
				}
				case 7: {
					System.out.println(months[6][1]);
					
					break;
				}case 8: {
					System.out.println(months[7][1]);
					
					break;
				}case 9: {
					System.out.println(months[8][1]);
					
					break;
				}case 10: {
					System.out.println(months[9][1]);
					
					break;
				}case 11: {
					System.out.println(months[10][1]);
					
					break;
				}case 12: {
					System.out.println(months[11][1]);
					
					break;
				}
				default:
					System.out.println("Incorrect Operation!!!");
				}				
				control=false;
				
				break;
			}
			case 2: {
				System.out.println("Welcher Monat?");
				monthsNumber=ok.nextInt();
				switch (monthsNumber) {
				case 1: {
					System.out.println(months[0][2]);
					
					break;
				}
				case 2: {
					System.out.println(months[1][2]);
					
					break;
				}
				case 3: {
					System.out.println(months[2][2]);
					
					break;
				}
				case 4: {
					System.out.println(months[3][2]);
					
					break;
				}
				case 5: {
					System.out.println(months[4][2]);
					
					break;
				}
				case 6: {
					System.out.println(months[5][2]);
					
					break;
				}
				case 7: {
					System.out.println(months[6][2]);
					
					break;
				}case 8: {
					System.out.println(months[7][2]);
					
					break;
				}case 9: {
					System.out.println(months[8][2]);
					
					break;
				}case 10: {
					System.out.println(months[9][2]);
					
					break;
				}case 11: {
					System.out.println(months[10][2]);
					
					break;
				}case 12: {
					System.out.println(months[11][2]);
					
					break;
				}
				default:
					System.out.println("Falsche Bedienung!!!");
				}				
				control=false;
				
				break;
			}
			default:
				System.out.println("Enter a valid number");
				control=true;
				
				
			}
		}while(control);
	}

}

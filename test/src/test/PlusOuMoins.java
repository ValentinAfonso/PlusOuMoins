/**
 * 
 */
package test;

import java.util.Random;
import java.util.Scanner;

/**
 * @author valentin
 *
 */
public class PlusOuMoins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Random nb = new Random();
		int x=0;
		x = nb.nextInt(101);
		int solution;
		int restart=0;
		String recommencer;
		int testmodification;
		
		do {
			do {
				System.out.println("Entrez une proposition : ");
				solution = scan.nextInt();
			
			
				if(solution == x) {
					System.out.println("Vous avez gagné !!!!");
					scan.nextLine();
					System.out.println("Voulez vous recommencer ? (oui ou non)");
					recommencer = scan.nextLine();
					if(recommencer.equals("oui")) {
						restart =1;
						x = nb.nextInt(101);
					}else if(recommencer.equals("non")) {
						System.out.println("Au revoir !");
						restart =0;
					}else {
						System.out.println("Veuillez entrer oui ou non");
					}
				}else if(solution < x){
					System.out.println("Trop petit");
				}else if(solution > x){
					System.out.println("Trop grand");
				}
			}while(solution != x);
		}while(restart ==1);

	}

}

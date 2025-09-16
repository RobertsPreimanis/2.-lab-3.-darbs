//251RDC028 Roberts Preimanis

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("251RDC028 Roberts Preimanis");
		System.out.println("9. variants");
				
		double x, y;
		
		System.out.print("x=");
		x = sc.nextDouble();
		
		System.out.print("y=");
		y = sc.nextDouble();
		sc.close();
		boolean gray = (x-3)*(x-3) + (y-3)*(y-3) <= 9 || y <= 12-x && y > 4 && x>4;
		boolean white = x < 6 && x > 5 && y > 5 && y < 6;
		if (white){
			System.out.println("white");
		}
		else if (gray){
			System.out.println("gray");
		}
		else{
			System.out.println("white");
		}		
	}
}

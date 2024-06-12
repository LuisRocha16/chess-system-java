package application;

import java.util.Locale;
import java.util.Scanner;

import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row value: ");
		int row = sc.nextInt();
		System.out.println("Enter column value: ");
		int column = sc.nextInt();
		
		Position pos = new Position(row, column);
		
		System.out.println(pos);
		
		sc.close();

	}

}

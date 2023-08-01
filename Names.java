
	import java.util.Scanner;
public class Names {

		public static void main(String[] args) {
			Scanner console = new Scanner( System.in );
			String name, ape;
			System.out.println("Ingresa tu nombre: ");
			name = console.nextLine();
			System.out.println("Ingresa tu apellido: ");
			ape = console.nextLine();
			printNameLength( name );
			printNameCharacters( name );
			printNameLength( ape );
			printNameCharacters( ape );
			
			System.out.println("Nombre completo: " + name + " " + ape);
			console.close();

		} // main
	private static void printNameLength( String name ) {
		System.out.println(name.length());
	}
	private static void printNameCharacters( String name ) {
			for(int posi=0;posi<name.length();posi++) {
				System.out.println(name.charAt(posi));
			}
			
			}// for
	}// class Names

/**
 * Il s'agit de l'application principale.
 * @author Samy ABDOUCHE
 * @author Maxime LOSSON
 */

import java.io.*;

public class Appli {
	
	
/*
	public static void main(String[] args) {
		Num n1 = new Num(40);
		Num n2 = new Num(2);
		Binop b = new Binop(n1,n2,"+");
		Visitor v = new PPVisitor();
		Visitor v2 = new EvalVisitor();
		//b.accept(v);
		//b.accept(v2);
		File input = new File("src/programme_test/test1.txt");
		try {
			InputStream inputs = new FileInputStream(input);
			new Grammar(inputs);		
			System.out.println("Test reussi");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	*/
	
	public static void main(String[] args) throws ParseException {
        File input = new File("programme_test/test_add_1.txt");
        try {
                InputStream inputs = new FileInputStream(input);
                Grammar parser = new Grammar(inputs);
                parser.mainloop();
                System.out.println("Test fini");
        }
        catch (FileNotFoundException e) {
                e.printStackTrace();
        }
	}

}

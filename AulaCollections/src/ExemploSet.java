import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;

public class ExemploSet {
	public static void main(String[]args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		
		c1.add(10);
		c1.add(15);
		c1.add(10);
		c1.add(1);
		c1.add(15);
		
		Collection<Integer>c2 = new HashSet<Integer>(); //n�o tem no��o posicional, s� tem no��o de elementos at� porque n�o armazena valores iguais
		
		c2.add(10);
		c2.add(15);
		c2.add(10);
		c2.add(1);
		c2.add(15);
	}
}

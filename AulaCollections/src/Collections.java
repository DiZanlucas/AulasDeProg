import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Collections {
	public static void metodoEstranho(Collection<Integer> colecao) {
		Iterator<Integer> iterator = colecao.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
	}
	public static void main(String[]args) {
		Collection<Integer> colecao1 = new ArrayList<Integer>();
		Collection<Integer> colecao2 = new LinkedList<Integer>();
		
		metodoEstranho(colecao1);
		metodoEstranho(colecao2);
		
	}
}

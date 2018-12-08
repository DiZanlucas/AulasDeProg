import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Lists {
	
	public static void main(String[]args) {
		Random random = new Random();
		
		ArrayList<Integer>arrayList = new ArrayList(); //trabalha com ponteiros por isso double está com D maiusculo
		/*arrayList.add(56.0);
		arrayList.add(45.0);*/
		
		LinkedList<Integer> linkedList = new LinkedList();
		/*linkedList.add(23.0);
		linkedList.add(12.5);*/
		
		//Vencedor:LinkedLista
		for(int i = 0; i<1000;i++) {
			arrayList.add(random.nextInt());
			linkedList.add(random.nextInt());
		}
		//Vencedor: ArrayList
		for(int i = 0; i<1000;i++) {
			int posicaoAleatoria = random.nextInt(1000);
			System.out.println(arrayList.get(posicaoAleatoria));
			System.out.println(linkedList.get(posicaoAleatoria));
		}
		//Vencedor: depende
		for(int i = 0; i<100; i++) {
			int posicaoAleatoria = random.nextInt(100000);
			
		}
	}
}

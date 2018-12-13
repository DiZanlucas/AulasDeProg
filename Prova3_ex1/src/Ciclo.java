
public class Ciclo {
	
	int x = 0;
	
	int cicloR(int n) {
		
		if(n==1) {
			x++;
			return 1;
		}
		if(n%2==0) {
			x++;
			cicloR(n/2);
			
		}
		else {
			x++;
			cicloR((n*3)+1);
		}
		System.out.println(n);
		return x;
		
	}
	
}

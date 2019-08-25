
public class RamdomTest {

	public static void main(String[] args) {
		
		double r = 0;
		
		//1부터 10까지 난수 구히기
		for(int i=0 ; i<10; i++) {
			r = Math.random()*10+1;
			int rand_int = (int)Math.round(r);
			System.out.println(rand_int);
		}
		
		//향상된 for
		int [] random_list = new int[3];
		random_list[0] = (int)(Math.random()*100)+1;
		random_list[1] = (int)(Math.random()*100)+1;
		random_list[2] = (int)(Math.random()*100)+1;
		
		for(int i : random_list) {
			System.out.println(i);
		}
	}

}

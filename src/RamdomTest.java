
public class RamdomTest {

	public static void main(String[] args) {
		
		double r = 0;
		
		//1���� 10���� ���� ������
		for(int i=0 ; i<10; i++) {
			r = Math.random()*10+1;
			int rand_int = (int)Math.round(r);
			System.out.println(rand_int);
		}
		
	}

}

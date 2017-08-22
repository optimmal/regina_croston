package regina_masterarbeit;

public class Expo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initialisiere ein Array A welches die 
		int N = 4;
		int periods = 530;
		int L = 14;
		double[] A = new double[N];
		int[] x = new int[periods];
		
		
		for(int j = 1; j <= N; j++) {
			int sum = 0;
			for(int i = 0; i<= L-1; i++) {
				sum = sum + x[(j-1)*L+i];
			}
			A[j] = sum/L;
		}
	}

}

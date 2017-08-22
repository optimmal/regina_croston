package regina_masterarbeit;

import java.util.Arrays;

public class Croston {

	public static void main(String[] args) {
		
		//diese Werte jedes Mal anpassen
		
		int duration = 530;
		double alpha = 0.3;
		
		
		//diese Arrays sind statisch
		double[] q = new double[duration];
		double[] v = new double[duration];
		double[] y = new double[duration];
		double[] p = new double[duration];
		int z = 1;
		
		// hier fängt die Initialisierung an
		if (v[0] != 0) {
			q[0] = v[1];
			y[0] = 1;
		} else{
			q[0] = 1;
			y[0] = 2; 
		}
		
		 for (int i=0; i<duration; i++){
		        v[i] = (int)(Math.random()*9 + 1);
		 }
		// hier beginnt die for-Schleife und damit der eigentliche Algorithmus
		for (int i=1; i<duration; i++) {
			if ( v[i] == 0) {
				q[i] = q[i-1];
				y[i] = y[i-1];
				z = z+1;
				
			} else{
				q[i] = q[i-1] + alpha*(v[i] - q[i-1]);
				y[i] = y[i-1] + alpha*(z-y[i-1]);
				z=1;
			}
		}
		
		
		
		System.out.println(Arrays.toString(q));
		System.out.println(Arrays.toString(v));
		System.out.println(Arrays.toString(y));
		// TODO Auto-generated method stub

	}

}

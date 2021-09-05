package learningJava;

public class TwoDimensional {

	public static void main(String[] args) {
		
//		int[][] a= {{10,20,30},{40,50},{60,70,80}};
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				System.out.println(a[i][j]);
//			}
//		}
		int[][][] p= {{{10,20},{30,40},{50,60}},{{70,80},{90,100},{101,102}}};
             for(int i=0;i<p.length;i++) {
            	 for(int j=0;j<p[i].length;j++) {
            		 for(int k=0;k<p[i][j].length;k++) {
            			 System.out.println(p[i][j][k]);
            		 }
            	 }
             }
	}

}

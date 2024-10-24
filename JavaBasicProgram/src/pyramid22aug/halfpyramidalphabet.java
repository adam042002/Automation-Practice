package pyramid22aug;

public class halfpyramidalphabet {
    public static void main(String[] args) {
		char last='G' ,alph='A';
		for (int k=1;k<=last-'A';++k) {
		
			for (int m=1;m<=k;++m) {
				System.out.print(alph + " ");
			}
			++alph; 
			System.out.println();
		}
		
	}
}
/////half pyramid alphabet/////

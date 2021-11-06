package basics;

public class ContinueInnerLoop {

	public static void main(String[] args) {
		for(int i=1;i<=2;i++) { //1 1 1 2 2 1
			for(int j=1;j<=2;j++) {
				if(i==2 || j==2) {// skipping this part 1 1
					continue;
				}
				System.out.println(i + " "+ j);
			}
		}

	}

}

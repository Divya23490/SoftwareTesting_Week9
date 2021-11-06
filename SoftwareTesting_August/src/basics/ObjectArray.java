package basics;

public class ObjectArray {

	public static void main(String[] args) {
		Object arr[]=new Object[5];
		arr[0]=5;
		arr[1]="Welcome";
		arr[2]=10.5;
		arr[3]='a';
		arr[4]=true;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}

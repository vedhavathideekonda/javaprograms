package loops;

public class NestedFor {
	public static void main(String[] args) {

	int arr[][]= {{1,2,3,4},{3,4,5,6},{4,5,6,7}};
for (int i=0;i<3;i++) {
for (int j=0;j<3;j++) {
	System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
}

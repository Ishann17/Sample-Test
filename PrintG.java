
public class PrintG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =12;
		//print G
	for(int i=0; i<n;i++)
	{
	for(int j=0; j<n; j++) {
		if((i==0 && j>0 && j<n) || (j==0 && i>0 && i<n) ||(i==(n)/2 && j>=n/2 &&j<=(3*n)/2) ||
				(j==n-1 && i>(n)/2 && i<n) ||(i==n-1 && j<=n/2 ) || (j==n/2 && i>n/2)) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
			}
		}
		System.out.println();
		}

	}

}

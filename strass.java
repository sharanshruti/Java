import java.util.*;

public class strass {

	static int count=1;

	public static void strassen(int arr1[][],int arr2[][])

	{
		int n =arr1[0].length;
		

		for(int i=0;i<n-1;i=i+2)

		{

			for(int j=0;j<n-1;j=j+2)

			{

				int a = arr1[i][j];

				int b = arr1[i][j+1];

				int c = arr1[i+1][j];

				int d = arr1[i+1][j+1];

				int e = arr2[i][j];

				int f = arr2[i][j+1];

				int g = arr2[i+1][j];

				int h = arr2[i+1][j+1];

				int p1 = a*(f-h);

				int p2 = (a+b)*h;

				int p3 = (c+d)*e;

				int p4 = d*(g-e);

				int p5 = (a+d)*(e+h);

				int p6 = (b-d)*(g+h);

				int p7 = (a-c)*(e+f);

				int r = p5+p4-p2+p6;

				int s = p1+p2;

				int t = p3+p4;

				int u = p5+p1-p3-p7;

				display(r,s,t,u);

			}

		}

	}

	public static void display(int one,int two,int three,int four){

		System.out.println(count+" 2x2 output matrix");

		System.out.println(one + " "+two+"\n"+three+" "+four);

		count++;

	}

	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);

		System.out.println("enter n");

		int n = sc.nextInt();

		sc.nextLine();

		int[][] a = new int[n][n];

		int[][] a2 = new int[n][n];

		System.out.println("enter array1 elements");

		//read first nxn matrix

		for(int i =0;i<n;i++)

		{

			for(int j=0;j<n;j++)

			{

				a[i][j]=sc.nextInt();

			}

		}

		System.out.println("enter array2 elements");

		//read Second nxn matrix

		for(int i =0;i<n;i++)

		{

			for(int j=0;j<n;j++)

			{

				a2[i][j]=sc.nextInt();

			}

		}

		strassen(a,a2);

		}

}
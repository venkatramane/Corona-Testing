package ss_pack;

import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		int n1=0,n2=1,n3=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int l=sc.nextInt();
		l=l-2;
		System.out.print(n1+" "+n2);
		while(l>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			l--;
		}

	}

}

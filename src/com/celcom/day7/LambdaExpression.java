package com.celcom.day7;

interface Calculator{
	int cal(int a,int b);
}

public class LambdaExpression {
	
	

	public static void main(String[] args) {
		
		int ans;
		
		Calculator add=(a,b)->(a+b);
		ans=add.cal(20, 10);
		System.out.println(ans);
		
		Calculator sub=(a,b)->(a-b);
		ans=sub.cal(20, 10);
		System.out.println(ans);
		
		Calculator mul=(a,b)->(a*b);
		ans=mul.cal(20, 10);
		System.out.println(ans);
		
		Calculator div=(a,b)->(a/b);
		ans=div.cal(20, 10);
		System.out.println(ans);

	}

}

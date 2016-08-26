package org.iii.www_ABC;
import java.io.*;

public class 金額大寫 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("請輸入小寫金額:");
		
		String str = br.readLine();
		int a = Integer.parseInt(str);
		
		int b=0; int c=0;int d=0;int e=0; int f=0; int g=0; int h=0; int i=0; int j=0;  //錯誤一: 初期沒讓變數初始化

//		int b = a / 100000000;
//		int c = (a - b * 100000000) / 10000000;
//		int d = (a - b * 100000000 - c * 10000000) / 1000000;
//		int e = (a - b * 100000000 - c * 10000000 - d * 1000000) / 100000;
//		int f = (a - b * 100000000 - c * 10000000 - d * 1000000 - e * 100000) / 10000;
//		int g = (a - b * 100000000 - c * 10000000 - d * 1000000 - e * 100000 - f * 10000) / 1000;
//		int h = (a - b * 100000000 - c * 10000000 - d * 1000000 - e * 100000 - f * 10000 - g * 1000) / 100;
//		int i = (a - b * 100000000 - c * 10000000 - d * 1000000 - e * 100000 - f * 10000 - g * 1000 - h * 100) / 10;
//		int j = (a - b * 100000000 - c * 10000000 - d * 1000000 - e * 100000 - f * 10000 - g * 1000 - h * 100 - i * 10);
//        
		
		String []r ={"零","壹","貳","叁","肆","伍","陸","柒","捌","玖"};

		
		if(a>100000000){
			b = a / 100000000;
			System.out.print(r[b]+"億");
		}
		if(a>10000000){
			c = (a - b * 100000000) / 10000000;
			System.out.print(r[c]+"仟");
		}if(a>1000000){
			d = (a - b * 100000000 - c * 10000000) / 1000000;
			System.out.print(r[d]+"佰");
		}if(a>100000){
			e = (a - b * 100000000 - c * 10000000 - d * 1000000) / 100000;
			System.out.print(r[e]+"拾");
		}if(a>10000){
			f = (a - b * 100000000 - c * 10000000 - d * 1000000 - e * 100000) / 10000;
			System.out.print(r[f]+"萬");
		}if(a>1000){
			g = (a - b * 100000000 - c * 10000000 - d * 1000000 - e * 100000 - f * 10000) / 1000;
			System.out.print(r[g]+"仟");
		}if(a>100){
			h = (a - b * 100000000 - c * 10000000 - d * 1000000 - e * 100000 - f * 10000 - g * 1000) / 100;
			System.out.print(r[h]+"佰");
		}
		if(a>10){
			i = (a - b * 100000000 - c * 10000000 - d * 1000000 - e * 100000 - f * 10000 - g * 1000 - h * 100) / 10;
			System.out.print(r[i]+"拾");
		}
		if(a>1){
			j = (a - b * 100000000 - c * 10000000 - d * 1000000 - e * 100000 - f * 10000 - g * 1000 - h * 100 - i * 10);
	        System.out.print(r[j]+"元整");
		}
	
	}
}

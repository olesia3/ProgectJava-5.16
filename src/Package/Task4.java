package Package;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		int sumRandom=0;
		int countRandom=0;
		int i=0;
		int life=0;
		int sumAnswer=0;
		while(countRandom<3) {
			i=(int)(Math.random()*2 +1);
			System.out.print(i+" ");
			sumRandom+=i;
			countRandom++;
		}
		System.out.println();
		System.out.println("� ��� � 2 ������");
		Scanner sc=new Scanner(System.in);
		while(life<2) {
		System.out.print("������ ����� �����: ");
		if (sc.hasNextInt()){
			  sumAnswer+=sc.nextInt();			 
		}
		System.out.print("������ ����� �����: ");
		if (sc.hasNextInt()){
			  sumAnswer+=sc.nextInt();
		}
		System.out.print("������ ���� �����: ");
		if (sc.hasNextInt()){
			  sumAnswer+=sc.nextInt();
		}
		if(sumRandom==sumAnswer) {
			System.out.print("�� �������!");
			break;
		}else {
			life++;
			System.out.println("� ��� ���������� "+(2-life)+" ������");
			sumAnswer=0;
		}
	}
	}
}
		
	


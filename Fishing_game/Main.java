package port2;

import java.util.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static int max;
	static Book bo = new Book();
	static Shop Sh = new Shop();
	static Bag bg = new Bag();
	public static void main(String[] args) throws InterruptedException {
		Op o = new Op();
		���� ���� = new ����();
		Fishing fs = new Fishing();
		
		boolean Ke = true;
		int menu;
		
		
		
		while(Ke) {
			System.out.println("===========menu==========");
			System.out.println("0-����     1-����");
			System.out.println("2-���     3-����");
			System.out.println("4-��        5-����");
			System.out.println("6-����");
			System.out.print("����");
			
			����.exp(o);
			
			
			do {
				menu = sc.nextInt();
				if(menu<0||menu>7) {
					System.out.println("!0~6");
				}
			}while(menu<0||menu>7);
			
			switch(menu) {
			   case 0:
				 if(o.ufr == 0) {
					 System.out.println("������� ���˴밡 �����ϴ�.");
					 break;
				 } else if(o.uaf == 0) {
					 System.out.println("������� � �����ϴ�.");
						 break;
				 } else {	 
					 System.out.println("���ø� �����մϴ�.");
					 fs.test(o);
					 break;
				 }
			   case 1:
				   System.out.println();
				   ����(o);
				   break;
			   case 2:
				   ���(o);
				   break;
			   case 3:
				   ����(o);
				   break;
			   case 4:
				   ��(o);
				   break;
			   case 5:
				   bg.list(o);
				   break;	   
			   case 6:
				   ����.infor(o);
				   break;
			}
	}
	}

	private static void ����(Op o) {
		int ch;
		
		System.out.println("���������������ڡߡڦ�������������");
		System.out.println("��   1.��� ����   2.����� �Ǹ�    ��");
		System.out.println("���������������ߡڡߦ�������������");
		while(true) {
			ch = sc.nextInt();
			if(ch<1 || ch>2) {
				System.out.println("!1~2");
			} else
				break;
		}
		
		switch(ch) {
		case 1: 
			Sh.����(o);
			break;
		case 2:
			bg.list(o);
			Sh.�Ǹ�(o);
			break;
		}
		
	}

	private static void ���(Op o) {
		int me;
		
		System.out.println("1.���˴�   2.��   3.�̳�");
		me = sc.nextInt();
		
		switch(me) {
		case 1 : 
			���.���˴�(o);
			break;
		case 2 : 
			���.��(o);		
			break;
		case 3 : 
			���.�̳�(o);
			break;
		default :
			System.out.println("!1~3");
			break;
		}		
		
	}

	private static void ����(Op o) {

		boolean tr = true;
		
		while(tr) {
			System.out.println("�������������");
			System.out.println("1.ȣ��   2.��   3.������");
			System.out.println("4.�ٴ�   5.����  6.???");
			System.out.println("�������������");
			
			o.���� = sc.nextInt();
			
			if(o.����<1 || o.����>6) {
				System.out.println("!(1~6)");
			}
			
			if(o.����>0 && o.����<7) {
				bo.����(o);
				tr = false;
			}
			
		}
		
		
	}

	private static void ��(Op o) {
		
		int map;
		boolean tr = true;
		
		while(tr) {
			System.out.println("1_ȣ��                     2_��(LV_5)");
			System.out.println("3_������(LV_10)        4_�ٴ�(LV_15)");
			System.out.println("5_����(LV_15)           6_???(LV_20)");
			map = sc.nextInt();
		
			if(map<1 || map>6) {
				System.out.println("!(1~6)");
			}
			
			if(map == 1) {
				System.out.println("ȣ���� �̵��մϴ�.");
				o.MAP = 1;
				tr = false;
			}
			
			if(map == 2) {
				if(o.LV < 5) {
					System.out.println("������ �����մϴ�.");
					tr = false;
				} else {
					System.out.println("������ �̵��մϴ�.");
					o.MAP = 2;
					tr = false;
				}
			}
			
			if(map == 3) {
				if(o.LV < 10) {
					System.out.println("������ �����մϴ�.");
					tr = false;
				} else {
					System.out.println("������� �̵��մϴ�.");
					o.MAP = 3;
					tr = false;
				}
			}
			
			if(map == 4) {
				if(o.LV < 15) {
					System.out.println("������ �����մϴ�.");
					tr = false;
				} else {
					System.out.println("�ٴٷ� �̵��մϴ�.");
					o.MAP = 4;
					tr = false;
				}
			}
			
			if(map == 5) {
				if(o.LV < 15) {
					System.out.println("������ �����մϴ�.");
					tr = false;
				} else {
					System.out.println("���ط� �̵��մϴ�.");
					o.MAP = 5;
					tr = false;
				}
			}
			
			if(map == 6) {
				if(o.LV < 6) {
					System.out.println("������ �����մϴ�.");
					tr = false;
				} else {
					System.out.println("����� �ؾȰ��� �̵��մϴ�.");
					o.MAP = 6;
					tr = false;
				}
			}
			
		}
		
		
	}
}

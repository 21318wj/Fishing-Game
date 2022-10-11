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
		정보 정보 = new 정보();
		Fishing fs = new Fishing();
		
		boolean Ke = true;
		int menu;
		
		
		
		while(Ke) {
			System.out.println("===========menu==========");
			System.out.println("0-낚시     1-도감");
			System.out.println("2-장비     3-상점");
			System.out.println("4-맵        5-가방");
			System.out.println("6-정보");
			System.out.print("▶▶");
			
			정보.exp(o);
			
			
			do {
				menu = sc.nextInt();
				if(menu<0||menu>7) {
					System.out.println("!0~6");
				}
			}while(menu<0||menu>7);
			
			switch(menu) {
			   case 0:
				 if(o.ufr == 0) {
					 System.out.println("사용중인 낚싯대가 없습니다.");
					 break;
				 } else if(o.uaf == 0) {
					 System.out.println("사용중인 찌가 없습니다.");
						 break;
				 } else {	 
					 System.out.println("낚시를 시작합니다.");
					 fs.test(o);
					 break;
				 }
			   case 1:
				   System.out.println();
				   도감(o);
				   break;
			   case 2:
				   장비(o);
				   break;
			   case 3:
				   상점(o);
				   break;
			   case 4:
				   맵(o);
				   break;
			   case 5:
				   bg.list(o);
				   break;	   
			   case 6:
				   정보.infor(o);
				   break;
			}
	}
	}

	private static void 상점(Op o) {
		int ch;
		
		System.out.println("┌──────★◆★──────┐");
		System.out.println("│   1.장비 구매   2.물고기 판매    │");
		System.out.println("└──────◆★◆──────┘");
		while(true) {
			ch = sc.nextInt();
			if(ch<1 || ch>2) {
				System.out.println("!1~2");
			} else
				break;
		}
		
		switch(ch) {
		case 1: 
			Sh.구매(o);
			break;
		case 2:
			bg.list(o);
			Sh.판매(o);
			break;
		}
		
	}

	private static void 장비(Op o) {
		int me;
		
		System.out.println("1.낙싯대   2.찌   3.미끼");
		me = sc.nextInt();
		
		switch(me) {
		case 1 : 
			장비.낚싯대(o);
			break;
		case 2 : 
			장비.찌(o);		
			break;
		case 3 : 
			장비.미끼(o);
			break;
		default :
			System.out.println("!1~3");
			break;
		}		
		
	}

	private static void 도감(Op o) {

		boolean tr = true;
		
		while(tr) {
			System.out.println("▼▼▼▼▼▼▼▼▼▼▼▼");
			System.out.println("1.호수   2.강   3.늪지대");
			System.out.println("4.바다   5.심해  6.???");
			System.out.println("▲▲▲▲▲▲▲▲▲▲▲▲");
			
			o.도감 = sc.nextInt();
			
			if(o.도감<1 || o.도감>6) {
				System.out.println("!(1~6)");
			}
			
			if(o.도감>0 && o.도감<7) {
				bo.도감(o);
				tr = false;
			}
			
		}
		
		
	}

	private static void 맵(Op o) {
		
		int map;
		boolean tr = true;
		
		while(tr) {
			System.out.println("1_호수                     2_강(LV_5)");
			System.out.println("3_늪지대(LV_10)        4_바다(LV_15)");
			System.out.println("5_심해(LV_15)           6_???(LV_20)");
			map = sc.nextInt();
		
			if(map<1 || map>6) {
				System.out.println("!(1~6)");
			}
			
			if(map == 1) {
				System.out.println("호수로 이동합니다.");
				o.MAP = 1;
				tr = false;
			}
			
			if(map == 2) {
				if(o.LV < 5) {
					System.out.println("레벨이 부족합니다.");
					tr = false;
				} else {
					System.out.println("강으로 이동합니다.");
					o.MAP = 2;
					tr = false;
				}
			}
			
			if(map == 3) {
				if(o.LV < 10) {
					System.out.println("레벨이 부족합니다.");
					tr = false;
				} else {
					System.out.println("늪지대로 이동합니다.");
					o.MAP = 3;
					tr = false;
				}
			}
			
			if(map == 4) {
				if(o.LV < 15) {
					System.out.println("레벨이 부족합니다.");
					tr = false;
				} else {
					System.out.println("바다로 이동합니다.");
					o.MAP = 4;
					tr = false;
				}
			}
			
			if(map == 5) {
				if(o.LV < 15) {
					System.out.println("레벨이 부족합니다.");
					tr = false;
				} else {
					System.out.println("심해로 이동합니다.");
					o.MAP = 5;
					tr = false;
				}
			}
			
			if(map == 6) {
				if(o.LV < 6) {
					System.out.println("레벨이 부족합니다.");
					tr = false;
				} else {
					System.out.println("고대의 해안가로 이동합니다.");
					o.MAP = 6;
					tr = false;
				}
			}
			
		}
		
		
	}
}

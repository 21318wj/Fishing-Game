package port2;

public class 정보 {
	static int ex;
	static String 칭호;
	public void exp(Op o) {
	
		switch(o.LV) {
		case 1:
			ex = 10;
			break;
		case 2:
			ex =20;
			break;
		case 3:
			ex = 30;
			break;
		case 4:
			ex = 40;
			break;
		case 5:
			ex = 50;
			break;
		case 6:
			ex = 60;
			break;
		case 7:
			ex = 70;
			break;
		case 8:
			ex = 80;
			break;
		case 9:
			ex = 90;
			break;
		case 10:
			ex = 100;
			break;
		case 11:
			ex = 110;
			break;
		case 12:
			ex = 120;
			break;			
		case 13:
			ex = 130;
			break;
		case 14:
			ex = 140;
			break;
		case 15:
			ex = 150;
			break;
		case 16:
			ex = 160;
			break;
		case 17:
			ex = 170;
			break;
		case 18:
			ex = 180;
			break;
		case 19:
			ex = 190;
			break;
		case 20:
			ex = 200;
			break;
		case 21:
			ex = 210;
			break;
		case 22:
			ex = 220;
			break;
		case 23:
			ex = 230;
			break;
		case 24:
			ex = 240;
			break;
		case 25:
			ex = 250;
			break;
		case 26:
			ex = 260;
			break;
		case 27:
			ex = 270;
			break;
		case 28:
			ex = 280;
			break;
		case 29:
			ex = 290;
			break;
		case 30:
			ex = 300;
			break;
		}
	}	
		
	public void infor(Op o) {
		
		System.out.println("◇◇◇◇◇◇◇◇◇◇◇◇◇");
		
		if(o.LV<=5) {
			칭호 = "◆초보 낚시꾼";
			System.out.print("          ");
		} else if(o.LV<=10) {
			칭호 = "♠견습 낚시꾼";
			System.out.print("          ");
		} else if(o.LV<=15) {
			칭호 = "☆경험 많은 낚시꾼";	
			System.out.print("        ");
		} else if(o.LV<=20) {
			칭호 = "★배테랑 낚시꾼";
	        System.out.print("        ");
		} else {
			칭호 = "§전설의 낚시꾼";
			System.out.print("         ");
		}

		
		System.out.println(칭호);
		System.out.println("-LV:"+o.LV);
		System.out.println("-EXP:"+ex+"/"+o.EXP);
		System.out.println("-보유한 돈: "+o.money+"원");
		System.out.println("◇◇◇◇◇◇◇◇◇◇◇◇◇");
	}
		
		
	public void LV_UP(Op o) {	
		if(ex <= o.EXP) {
			System.out.println("LV_UP");
			o.LV++;
			o.EXP -= ex;
		}
		else
			return;
	}
}

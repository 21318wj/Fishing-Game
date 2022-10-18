package port2;

import java.util.*;

public class Fish {
	static Random r = new Random();
	static int pro;
	static double size;
	static String fh;
	정보 정보 = new 정보();
		
	public void 맵(Op o) {
		switch(o.MAP) {
		case 1: 
			호수_물고기(o);
			break;
		case 2: 
			강_물고기(o);
			break;
		case 3:
			늪지대_물고기(o);
			break;
		case 4:
			바다_물고기(o);
			break;
		case 5:
			심해_물고기(o);
			break;
		case 6:
			고대_물고기(o);
			break;
		}
	}
	
	private void 고대_물고기(Op o) {
		pro = Math.abs(r.nextInt(10000)+1);
		
		if(pro<=9200) {
			System.out.println("아무것도 낚이지 않았다...");
		} else if(pro<=9300){
			fh = "암모나이트";
			고대_크기("암모나이트", o);
		} else if(pro<=9400){
			fh = "실러캔스";
			심해_크기("실러캔스", o);
		} else if(pro<=9500){
			fh = "모사사우루스";
			심해_크기("모사사우루스", o);
		} else if(pro<=9600){
			fh = "플레시오사우르스";
			심해_크기("플레시오사우르스", o);
		} else if(pro<=9700){
			fh = "익티오사우르스";
			심해_크기("익티오사우르스", o);
		} else if(pro<=9800){
			fh = "아노말로카리스";
			심해_크기("아노말로카리스", o);
		} else if(pro<=9900){
			fh = "삼엽충";
			심해_크기("삼엽충", o);
		} else {
			fh = "야이켈롭테루스";
			심해_크기("야이켈롭테루스", o);
		}
	}

	private void 고대_크기(String kd, Op o) {
		double b = 0;
		Random r = new Random();
		switch(kd) {
			case "암모나이트":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(50)+1);
				}
				size = Math.abs(r.nextDouble(180)+20+b);
				o.암모나이트++;	
				System.out.print("암모나이트(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.암모나이트) {
					o.암모나이트s = size;
					System.out.println("★신기록");
				}
				경험치고대(o);
				break;
			case "실러캔스":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(40)+1);
				}
				size = Math.abs(r.nextDouble(150)+40+b);
				o.실러캔스++;
				System.out.print("실러캔스(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.실러캔스s) {
					o.실러캔스s = size;
					System.out.println("★신기록");
				}
				경험치고대(o);
				break;
			case "모사사우루스":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(150)+1);
				}
				size = Math.abs(r.nextDouble(300)+900+b);				
				o.모사사우루스++;
				System.out.print("모사사우루스(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.모사사우루스s) {
					o.모사사우루스s = size;
					System.out.println("★신기록");
				}
				경험치고대(o);
				break;	
			case "플레시오사우르스":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(100)+1);
				}
				size = Math.abs(r.nextDouble(200)+300+b);
				o.플레시오사우르스++;
				System.out.print("플레시오사우르스(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.플레시오사우르스s) {
					o.플레시오사우르스s = size;
					System.out.println("★신기록");
				}
				경험치고대(o);
				break;	
			case "익티오사우르스":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(100)+1);
				}
				size = Math.abs(r.nextDouble(100)+200+b);
				o.익티오사우르스++;
				System.out.print("익티오사우르스(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.익티오사우르스s) {
					o.익티오사우르스s = size;
					System.out.println("★신기록");
				}
				경험치고대(o);
				break;	
			case "아노말로카리스":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				size = Math.abs(r.nextDouble(40)+20+b);
				o.아노말로카리스++;
				System.out.print("아노말로카리스(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)을 낚았다.");
				if(size > o.아노말로카리스s) {
					o.아노말로카리스s = size;
					System.out.println("★신기록");
				}
				경험치고대(o);
				break;	
			case "삼엽충":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(72)+b);
				o.삼엽충++;
				System.out.print("삼엽충");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.삼엽충s) {
					o.삼엽충s = size;
					System.out.println("★신기록");
				}
				경험치고대(o);
				break;	
			case "야이켈롭테루스":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(70)+1);
				}
				size = Math.abs(r.nextDouble(100)+150+b);
				o.야이켈롭테루스++;
				System.out.print("야이켈롭테루스(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.야이켈롭테루스s) {
					o.야이켈롭테루스s = size;
					System.out.println("★신기록");
				}
				경험치고대(o);
				break;			
		}
		정보.LV_UP(o);
		낚싯대ch(o);
		찌ch(o);
		미끼ch(o);
	}

	private void 심해_물고기(Op o) {
		pro = Math.abs(r.nextInt(10000)+1);
		
		if(pro<=1500) {
			fh = "산갈치";
			심해_크기("산갈치", o);
		} else if(pro<=3000){
			fh = "투라치류";
			심해_크기("투라치류", o);
		} else if(pro<=4500){
			fh = "발광오징어";
			심해_크기("발광오징어", o);
		} else if(pro<=6000){
			fh = "설인게";
			심해_크기("설인게", o);
		} else if(pro<=6500){
			fh = "스팅레이";
			심해_크기("스팅레이", o);
		} else if(pro<=7000){
			fh = "나뭇잎해룡";
			심해_크기("나뭇잎해룡", o);
		} else if(pro<=7500){
			fh = "리본장어";
			심해_크기("리본장어", o);
		} else if(pro<=8000){
			fh = "해파리";
			심해_크기("해파리", o);
		} else if(pro<=8500){
			fh = "전기가오리";
			심해_크기("전기가오리", o);
		} else if(pro<=8700){
			fh = "심해악치";
			심해_크기("심해악치", o);
		} else if(pro<=8900){
			fh = "심해아귀";
			심해_크기("심해아귀", o);
		} else if(pro<=9100){
			fh = "팰리컨장어";
			심해_크기("팰리컨장어", o);
		} else if(pro<=9300) {
			fh = "해체트피시";
			심해_크기("해체트피시", o);
		} else if(pro<=9500) {
			fh = "블룹피시";
			심해_크기("블룹피시", o);
		} else if(pro<=9700) {
			fh = "초롱아귀";
			심해_크기("초롱아귀", o);
		} else if(pro<=9850) {
			fh = "크라켄";
			심해_크기("크라켄", o);
		} else {
			fh = "팽투스";
			심해_크기("팽투스", o);
		}
	}

	private void 심해_크기(String kd, Op o) {
		double b = 0;
		Random r = new Random();
		switch(kd) {
			case "산갈치":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(300)+1);
				}
				size = Math.abs(r.nextDouble(1000)+500+b);
				o.산갈치++;	
				System.out.print("산갈치(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.산갈치s) {
					o.산갈치s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;
			case "투라치류":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(50)+1);
				}
				size = Math.abs(r.nextDouble(100)+150+b);
				o.투라치류++;
				System.out.print("투라치류(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.투라치류s) {
					o.투라치류s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;
			case "설인게":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(15)+30+b);				
				o.설인게++;
				System.out.print("설인게(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.설인게s) {
					o.설인게s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "발광오징어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(10)+20+b);
				o.발광오징어++;
				System.out.print("발광오징어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.발광오징어s) {
					o.발광오징어s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;	
			case "스팅레이":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(100)+50);
				}
				size = Math.abs(r.nextDouble(100)+700+b);
				o.스팅레이++;
				System.out.print("스팅레이(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.스팅레이s) {
					o.스팅레이s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;	
			case "나뭇잎해룡":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(14)+20+b);
				o.나뭇잎해룡++;
				System.out.print("나뭇잎해룡(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)을 낚았다.");
				if(size > o.나뭇잎해룡s) {
					o.나뭇잎해룡s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "리본장어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(30)+1);
				}
				size = Math.abs(r.nextDouble(40)+90+b);
				o.리본장어++;
				System.out.print("리본장어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.리본장어s) {
					o.리본장어s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;	
			case "해파리":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(7)+1);
				}
				size = Math.abs(r.nextDouble(15)+5+b);
				o.해파리++;
				System.out.print("해파리(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.해파리s) {
					o.해파리s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;			
			case "전기가오리":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(20)+30+b);
				o.전기가오리++;
				System.out.print("전기가오리(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.전기가오리s) {
					o.전기가오리s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;
			case "심해악치":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				size = Math.abs(r.nextDouble(50)+50+b);
				o.심해악치++;
				System.out.print("심해악치(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.심해악치s) {
					o.심해악치s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;			
			case "심해아귀":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(50)+1);
				}
				size = Math.abs(r.nextDouble(380)+20+b);
				o.심해아귀++;
				System.out.print("심해아귀(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.심해아귀s) {
					o.심해아귀s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;			
			case "팰리컨장어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				o.팰리컨장어++;	
				size = Math.abs(r.nextDouble(50)+50+b);
				System.out.print("팰리컨장어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.팰리컨장어s) {
					o.팰리컨장어s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;	
			case "해체트피시":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(2)+1);
				}
				o.해체트피시++;
				size = Math.abs(r.nextDouble(2)+3+b);
				System.out.print("해체트피시(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.해체트피시s) {
					o.해체트피시s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;		
			case "블룹피시":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				o.블룹피시++;
				size = Math.abs(r.nextDouble(5)+30+b);
				System.out.print("블룹피시(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.블룹피시s) {
					o.블룹피시s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;		
			case "초롱아귀":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				o.초롱아귀++;
				size = Math.abs(r.nextDouble(15)+50+b);
				System.out.print("초롱아귀(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.초롱아귀s) {
					o.초롱아귀s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;		
			case "크라켄":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(1000)+1);
				}
				o.크라켄++;
				size = Math.abs(r.nextDouble(2000)+1500+b);
				System.out.print("크라켄(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)을 낚았다.");
				if(size > o.크라켄) {
					o.돌고래s = size;
					System.out.println("★신기록");
				}
				경험치전설(o);
				break;		
			case "팽투스":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(300)+1);
				}
				o.팽투스++;
				size = Math.abs(r.nextDouble(300)+1500+b);
				System.out.print("팽투스(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.팽투스s) {
					o.팽투스s = size;
					System.out.println("★신기록");
				}
				경험치전설(o);
				break;		
		}
		정보.LV_UP(o);
		낚싯대ch(o);
		찌ch(o);
		미끼ch(o);
	}

	private void 바다_물고기(Op o) {
		pro = Math.abs(r.nextInt(10000)+1);
		
		if(pro<=1000) {
			fh = "오징어";
			바다_크기("오징어", o);
		} else if(pro<=2000){
			fh = "갈치";
			바다_크기("갈치", o);
		} else if(pro<=3000){
			fh = "멸치";
			바다_크기("멸치", o);
		} else if(pro<=4000){
			fh = "꽁치";
			바다_크기("꽁치", o);
		} else if(pro<=5000){
			fh = "삼치";
			바다_크기("삼치", o);
		} else if(pro<=6000){
			fh = "방어";
			바다_크기("방어", o);
		} else if(pro<=7000){
			fh = "돔";
			바다_크기("돔", o);
		} else if(pro<=7300){
			fh = "우럭";
			바다_크기("우럭", o);
		} else if(pro<=7600){
			fh = "참치";
			바다_크기("참치", o);
		} else if(pro<=7900){
			fh = "불가사리";
			바다_크기("불가사리", o);
		} else if(pro<=8200){
			fh = "청새치";
			바다_크기("청새치", o);
		} else if(pro<=8500){
			fh = "스팅레이";
			바다_크기("스팅레이", o);
		} else if(pro<=8800) {
			fh = "복어";
			바다_크기("복어", o);
		} else if(pro<=9100) {
			fh = "개복치";
			바다_크기("개복치", o);
		} else if(pro<=9250) {
			fh = "고래상어";
			바다_크기("고래상어", o);
		} else if(pro<=9400) {
			fh = "돌고래";
			바다_크기("돌고래", o);
		}  else if(pro<=9550) {
			fh = "범고래";
			바다_크기("범고래", o);
		}  else if(pro<=9700) {
			fh = "톱상어";
			바다_크기("톱상어", o);
		}  else if(pro<=9850) {
			fh = "흰수염고래";
			바다_크기("흰수염고래", o);
		} else {
			fh = "메갈로돈";
			바다_크기("메갈로돈", o);
		}
	}

	private void 바다_크기(String kd, Op o) {
		double b = 0;
		Random r = new Random();
		switch(kd) {
			case "오징어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				size = Math.abs(r.nextDouble(12)+14+b);
				o.오징어++;			
				System.out.print("오징어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.오징어s) {
					o.오징어s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;
			case "갈치":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(4)+18+b);
				o.갈치++;
				System.out.print("갈치(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.갈치s) {
					o.가시고기s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;
			case "멸치":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(2)+1);
				}
				size = Math.abs(r.nextDouble(3)+1+b);				
				o.멸치++;
				System.out.print("멸치(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.멸치s) {
					o.멸치s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "꽁치":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(23)+20+b);
				o.꽁치++;
				System.out.print("꽁치(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.꽁치s) {
					o.꽁치s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "삼치":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(10)+30+b);
				o.삼치++;
				System.out.print("삼치(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.삼치s) {
					o.삼치s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "방어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(15)+1);
				}
				size = Math.abs(r.nextDouble(35)+30+b);
				o.방어++;
				System.out.print("방어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.방어s) {
					o.방어s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "돔":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(20)+10);
				o.돔++;
				System.out.print("돔(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.돔s) {
					o.돔s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "우럭":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(15)+1);
				}
				size = Math.abs(r.nextDouble(50)+25+b);
				o.우럭++;
				System.out.print("우럭(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.우럭s) {
					o.우럭s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;			
			case "참치":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(50)+1);
				}
				size = Math.abs(r.nextDouble(250)+50+b);
				o.참치++;
				System.out.print("참치(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.참치s) {
					o.참치s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;
			case "불가사리":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(30)+25+b);
				o.불가사리++;
				System.out.print("도롱뇽(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.불가사리s) {
					o.불가사리s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;			
			case "청새치":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(100)+1);
				}
				size = Math.abs(r.nextDouble(350)+350+b);
				o.청새치++;
				System.out.print("청새치(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.청새치s) {
					o.청새치s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;			
			case "스팅레이":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(100)+1);
				}
				o.스팅레이++;
				size = Math.abs(r.nextDouble(200)+500+b);
				System.out.print("스팅레이(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.스팅레이s) {
					o.스팅레이s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;	
			case "복어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				o.복어++;
				size = Math.abs(r.nextDouble(10)+30+b);
				System.out.print("복어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.복어s) {
					o.복어s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;		
			case "개복치":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(40)+1);
				}
				o.개복치++;
				size = Math.abs(r.nextDouble(100)+100+b);
				System.out.print("개복치(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.개복치s) {
					o.개복치s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;		
			case "고래상어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(150)+1);
				}
				o.고래상어++;
				size = Math.abs(r.nextDouble(540)+500+b);
				System.out.print("고래상어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.고래상어s) {
					o.고래상어s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;		
			case "돌고래":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(50)+1);
				}
				o.돌고래++;
				size = Math.abs(r.nextDouble(100)+200+b);
				System.out.print("돌고래(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.돌고래s) {
					o.돌고래s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;		
			case "범고래":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(150)+1);
				}
				o.범고래++;
				size = Math.abs(r.nextDouble(200)+600+b);
				System.out.print("범고래(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.범고래s) {
					o.범고래s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;		
			case "톱상어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(50)+1);
				}
				o.톱상어++;
				size = Math.abs(r.nextDouble(50)+150+b);
				System.out.print("톱상어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.톱상어s) {
					o.톱상어s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;
			case "흰수염고래":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(300)+150);
				}
				o.흰수염고래++;
				size = Math.abs(r.nextDouble(200)+2200+b);
				System.out.print("흰 수염 고래(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.흰수염고래s) {
					o.흰수염고래s = size;
					System.out.println("★신기록");
				}
				경험치전설(o);
				break;
			case "메갈로돈":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(250)+100);
				}
				o.메갈로돈++;
				size = Math.abs(r.nextDouble(500)+1500+b);
				System.out.print("메갈로돈(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)을 낚았다.");
				if(size > o.메갈로돈s) {
					o.메갈로돈s = size;
					System.out.println("★신기록");
				}
				경험치전설(o);
				break;
		}
		정보.LV_UP(o);
		낚싯대ch(o);
		찌ch(o);
		미끼ch(o);
	}

	private void 늪지대_물고기(Op o) {
		pro = Math.abs(r.nextInt(10000)+1);
		
		if(pro<=1000) {
			fh = "피라냐";
			늪지대_크기("피라냐", o);
		} else if(pro<=2000){
			fh = "가시고기";
			늪지대_크기("가시고기", o);
		} else if(pro<=3000){
			fh = "잉어";
			늪지대_크기("잉어", o);
		} else if(pro<=4000){
			fh = "붕어";
			늪지대_크기("붕어", o);
		} else if(pro<=5000){
			fh = "송사리";
			늪지대_크기("송사리", o);
		} else if(pro<=6000){
			fh = "가물치";
			늪지대_크기("가물치", o);
		} else if(pro<=7000){
			fh = "큰입배스";
			늪지대_크기("큰입배스", o);
		} else if(pro<=7440){
			fh = "청개구리";
			늪지대_크기("청개구리", o);
		} else if(pro<=7880){
			fh = "돌고기";
			늪지대_크기("돌고기", o);
		} else if(pro<=8320){
			fh = "도롱뇽";
			늪지대_크기("도롱뇽", o);
		} else if(pro<=8760){
			fh = "장어";
			늪지대_크기("장어", o);
		} else if(pro<=9200){
			fh = "메기";
			늪지대_크기("메기", o);
		} else if(pro<=9350) {
			fh = "황소개구리";
			늪지대_크기("황소개구리", o);
		} else if(pro<=9500) {
			fh = "자라";
			늪지대_크기("자라", o);
		} else if(pro<=9650) {
			fh = "뱀장어";
			늪지대_크기("뱀장어", o);
		} else if(pro<=9800) {
			fh = "버들붕어";
			늪지대_크기("버들붕어", o);
		} else {
			fh = "악어";
			늪지대_크기("악어", o);
		}
	}

	private void 강_물고기(Op o) {
		pro = Math.abs(r.nextInt(10000)+1);
		
		if(pro<=875) {
			fh = "송사리";
			강_크기("송사리", o);
		} else if(pro<=1750){
			fh = "민어";
			강_크기("민어", o);
		} else if(pro<=2625){
			fh = "무지개송어";
			강_크기("무지개송어", o);
		} else if(pro<=3500){
			fh = "연어";
			강_크기("연어", o);
		} else if(pro<=4375){
			fh = "피라냐";
			강_크기("피라냐", o);
		} else if(pro<=5250){
			fh = "잉어";
			강_크기("잉어", o);
		} else if(pro<=6125){
			fh = "붕어";
			강_크기("붕어", o);
		} else if(pro<=7000){
			fh = "가시고기";
			강_크기("가시고기", o);
		} else if(pro<=7800){
			fh = "미꾸라지";
			강_크기("미꾸라지", o);
		} else if(pro<=8600){
			fh = "장어";
			강_크기("장어", o);
		} else if(pro<=9400){
			fh = "메기";
			강_크기("메기", o);
		} else if(pro<=9600){
			fh = "비단잉어";
			강_크기("비단잉어", o);
		} else if(pro<=9800) {
			fh = "아홀로틀";
			강_크기("아홀로틀", o);
		} else {
			fh = "흰동가리";
			강_크기("흰동가리", o);
		}
	}
	
	private void 늪지대_크기(String kd, Op o) {
		double b = 0;
		Random r = new Random();
		switch(kd) {
			case "피라냐":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				size = Math.abs(r.nextDouble(13)+14+b);
				o.피라냐++;			
				System.out.print("피라냐(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.피라냐s) {
					o.피라냐s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;
			case "가시고기":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(3)+1);
				}
				size = Math.abs(r.nextDouble(5)+3+b);
				o.가시고기++;
				System.out.print("가시고기(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.가시고기s) {
					o.가시고기s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;
			case "잉어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+5);
				}
				size = Math.abs(r.nextDouble(75)+30+b);				
				o.잉어++;
				System.out.print("잉어");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.잉어) {
					o.잉어s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "붕어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(23)+20+b);
				o.붕어++;
				System.out.print("붕어");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.붕어s) {
					o.붕어s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "송사리":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(2)+1);
				}
				size = Math.abs(r.nextDouble(2)+2+b);
				o.송사리++;
				System.out.print("송사리(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.송사리s) {
					o.송사리s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "가물치":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				size = Math.abs(r.nextDouble(50)+50+b);
				o.가물치++;
				System.out.print("가물치(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.가물치s) {
					o.가물치s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "큰입배스":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+2);
				}
				size = Math.abs(r.nextDouble(35)+25+b);
				o.큰입배스++;
				System.out.print("큰입배스(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.큰입배스s) {
					o.큰입배스s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "청개구리":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(3)+1);
				}
				size = Math.abs(r.nextDouble(3)+2+b);
				o.청개구리++;
				System.out.print("청개구리(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.청개구리s) {
					o.가시고기s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;			
			case "돌고기":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				size = Math.abs(r.nextDouble(5)+10+b);
				o.돌고기++;
				System.out.print("돌고기(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.돌고기s) {
					o.돌고기s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;
			case "도롱뇽":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				size = Math.abs(r.nextDouble(8)+7+b);
				o.도롱뇽++;
				System.out.print("도롱뇽(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)을 낚았다.");
				if(size > o.도롱뇽s) {
					o.도롱뇽s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;			
			case "장어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				size = Math.abs(r.nextDouble(70)+30+b);
				o.장어++;
				System.out.print("장어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.장어s) {
					o.장어s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;			
			case "메기":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				o.메기++;
				size = Math.abs(r.nextDouble(70)+30+b);
				System.out.print("메기(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.메기s) {
					o.메기s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;	
			case "황소개구리":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(8)+1);
				}
				o.황소개구리++;
				size = Math.abs(r.nextDouble(10)+10+b);
				System.out.print("황소개구리(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.황소개구리s) {
					o.황소개구리s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;		
			case "자라":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				o.자라++;
				size = Math.abs(r.nextDouble(50)+15+b);
				System.out.print("자라(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.자라s) {
					o.자라s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;		
			case "뱀장어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(15)+1);
				}
				o.뱀장어++;
				size = Math.abs(r.nextDouble(40)+50+b);
				System.out.print("뱀장어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.뱀장어s) {
					o.뱀장어s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;		
			case "버들붕어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(3)+1);
				}
				o.버들붕어++;
				size = Math.abs(r.nextDouble(5)+5+b);
				System.out.print("버들붕어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.버들붕어s) {
					o.버들붕어s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;		
			case "악어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(50)+30);
				}
				o.악어++;
				size = Math.abs(r.nextDouble(200)+350+b);
				System.out.print("악어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.악어s) {
					o.악어s = size;
					System.out.println("★신기록");
				}
				경험치전설(o);
				break;			
		}
		정보.LV_UP(o);
		낚싯대ch(o);
		찌ch(o);
		미끼ch(o);
	}

	private void 강_크기(String kd, Op o) {
		double b = 0;
		Random r = new Random();
		switch(kd) {
			case "송사리":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(2)+1);
				}
				size = Math.abs(r.nextDouble(2)+2+b);
				o.송사리++;		
				System.out.print("송사리(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.송사리s) {
					o.송사리s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;
			case "민어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(15)+1);
				}
				size = Math.abs(r.nextDouble(30)+33+b);
				o.민어++;
				System.out.print("민어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.민어s) {
					o.민어s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;
			case "무지개송어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(15)+1);
				}
				size = Math.abs(r.nextDouble(60)+40+b);				
				o.무지개송어++;
				System.out.print("무지개송어");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.무지개송어s) {
					o.무지개송어s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "연어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(15)+1);
				}
				size = Math.abs(r.nextDouble(30)+50+b);
				o.연어++;				
				System.out.print("연어");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.연어s) {
					o.연어s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "피라냐":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(8)+1);
				}
				size = Math.abs(r.nextDouble(12)+14+b);
				o.피라냐++;
				System.out.print("피라냐(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.피라냐s) {
					o.피라냐s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "잉어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(30)+1);
				}
				size = Math.abs(r.nextDouble(95)+25+b);
				o.쏘가리++;
				System.out.print("잉어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.잉어s) {
					o.잉어s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "붕어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(25)+20+b);
				o.붕어++;
				System.out.print("붕어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.붕어s) {
					o.붕어s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "가시고기":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(3)+1);
				}
				size = Math.abs(r.nextDouble(5)+3+b);
				o.가시고기++;
				System.out.print("가시고기(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.가시고기s) {
					o.가시고기s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;			
			case "미꾸라지":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				size = Math.abs(r.nextDouble(10)+15+b);
				o.미꾸라지++;
				System.out.print("미꾸라지(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.미꾸라지s) {
					o.미꾸라지s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;
			case "장어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				size = Math.abs(r.nextDouble(70)+30+b);
				o.장어++;
				System.out.print("장어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.장어s) {
					o.장어s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;			
			case "메기":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				size = Math.abs(r.nextDouble(70)+30+b);
				o.메기++;
				System.out.print("메기(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.메기s) {
					o.메기s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;			
			case "비단잉어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(25)+1);
				}
				o.비단잉어++;
				size = Math.abs(r.nextDouble(70)+40+b);
				System.out.print("비단잉어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.비단잉어s) {
					o.비단잉어s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;	
			case "아홀로틀":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				o.아홀로틀++;
				size = Math.abs(r.nextDouble(30)+15+b);
				System.out.print("아홀로틀(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.아홀로틀s) {
					o.아홀로틀s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;		
			case "흰동가리":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				o.흰동가리++;
				size = Math.abs(r.nextDouble(5)+12+b);
				System.out.print("흰동가리(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.흰동가리s) {
					o.흰동가리s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;		
		}
		정보.LV_UP(o);
		낚싯대ch(o);
		찌ch(o);
		미끼ch(o);
	}

	public void 호수_물고기(Op o) {
		pro = Math.abs(r.nextInt(10000)+1);
		
		if(pro<=1000) {
			fh = "무지개송어";
			호수_크기("무지개송어", o);
		} else if(pro<=2000){
			fh = "연어";
			호수_크기("연어", o);
		} else if(pro<=3000){
			fh = "잉어";
			호수_크기("잉어", o);
		} else if(pro<=4000){
			fh = "붕어";
			호수_크기("붕어", o);
		} else if(pro<=5000){
			fh = "금붕어";
			호수_크기("금붕어", o);
		} else if(pro<=6000){
			fh = "쏘가리";
			호수_크기("쏘가리", o);
		} else if(pro<=7000){
			fh = "송사리";
			호수_크기("송사리", o);
		} else if(pro<=7800){
			fh = "미꾸라지";
			호수_크기("미꾸라지", o);
		} else if(pro<=8600){
			fh = "돌고기";
			호수_크기("돌고기", o);
		} else if(pro<=9400){
			fh = "도롱뇽";
			호수_크기("도롱뇽", o);
		} else if(pro<=9600){
			fh = "황소개구리";
			호수_크기("황소개구리", o);
		} else if(pro<=9800){
			fh = "비단잉어";
			호수_크기("비단잉어", o);
		} else {
			fh = "아홀로틀";
			호수_크기("아홀로틀", o);
		}
	}
	
	public void 호수_크기(String kd, Op o) {
		double b = 0;
		Random r = new Random();
		switch(kd) {
			case "무지개송어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(60)+40+b);
				o.무지개송어++;			
				System.out.print("무지개송어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.무지개송어s) {
					o.무지개송어s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;
			case "연어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(40)+60+b);
				o.연어++;
				System.out.print("연어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.연어s) {
					o.연어s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;
			case "잉어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(15)+1);
				}
				size = Math.abs(r.nextDouble(70)+50+b);				
				o.잉어++;
				System.out.print("잉어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.잉어s) {
					o.잉어s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "붕어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(23)+20+b);
				o.붕어++;
				System.out.print("붕어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.붕어s) {
					o.붕어s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "금붕어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				size = Math.abs(r.nextDouble(30)+5+b);
				o.금붕어++;
				System.out.print("금붕어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.금붕어s) {
					o.금붕어s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "쏘가리":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(35)+20+b);
				o.쏘가리++;
				System.out.print("쏘가리(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.쏘가리s) {
					o.쏘가리s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "송사리":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(3)+1);
				}
				size = Math.abs(r.nextDouble(6)+b);
				o.송사리++;
				System.out.print("송사리(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.송사리s) {
					o.송사리s = size;
					System.out.println("★신기록");
				}
				경험치초(o);
				break;	
			case "미꾸라지":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(7)+1);
				}
				size = Math.abs(r.nextDouble(5)+15+b);
				o.미꾸라지++;
				System.out.print("미꾸라지(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.미꾸라지s) {
					o.미꾸라지s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;			
			case "돌고기":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				size = Math.abs(r.nextDouble(5)+10+b);
				o.돌고기++;
				System.out.print("돌고기(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.돌고기s) {
					o.돌고기s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;
			case "도롱뇽":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				size = Math.abs(r.nextDouble(8)+7+b);
				o.도롱뇽++;
				System.out.print("도롱뇽(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.도롱뇽s) {
					o.도롱뇽s = size;
					System.out.println("★신기록");
				}
				경험치중(o);
				break;			
			case "황소개구리":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(33)+13+b);
				o.황소개구리++;
				System.out.print("황소개구리(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.황소개구리s) {
					o.황소개구리s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;			
			case "비단잉어":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				o.비단잉어++;
				size = Math.abs(r.nextDouble(70)+50+b);
				System.out.print("비단잉어(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)를 낚았다.");
				if(size > o.비단잉어s) {
					o.비단잉어s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;	
			case "아홀로틀":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				o.아홀로틀++;
				size = Math.abs(r.nextDouble(30)+15+b);
				System.out.print("아홀로틀(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)을 낚았다.");
				if(size > o.아홀로틀s) {
					o.아홀로틀s = size;
					System.out.println("★신기록");
				}
				경험치상(o);
				break;		
		}
		정보.LV_UP(o);
		낚싯대ch(o);
		찌ch(o);
		미끼ch(o);
	}

	private void 경험치초(Op o) {
		switch(o.uaf) {
		case 1:
			o.EXP += 2;
			System.out.println("EXP+2");
			break;
		case 2:
			o.EXP += 3;
			System.out.println("EXP+3(2+1)");
			break;
		case 3:
			o.EXP += 4;
			System.out.println("EXP+4(2+2)");
			break;
		}	
		
	}
	

	private void 경험치중(Op o) {
		switch(o.uaf) {
		case 1:
			o.EXP += 4;
			System.out.println("EXP+4");
			break;
		case 2:
			o.EXP += 6;
			System.out.println("EXP+6(4+2)");
			break;
		case 3:
			o.EXP += 8;
			System.out.println("EXP+8(4+4)");
			break;
		}
		
	}
	private void 경험치상(Op o) {
		switch(o.uaf) {
		case 1:
			o.EXP += 10;
			System.out.println("EXP+10");
			break;
		case 2:
			o.EXP += 15;
			System.out.println("EXP+15(10+5)");
			break;
		case 3:
			o.EXP += 20;
			System.out.println("EXP+20(10+10)");
			break;
		}
		
	}
	
	private void 경험치전설(Op o) {
		switch(o.uaf) {
		case 1:
			o.EXP += 20;
			System.out.println("EXP+20");
			break;
		case 2:
			o.EXP += 30;
			System.out.println("EXP+30(20+10)");
			break;
		case 3:
			o.EXP += 40;
			System.out.println("EXP+40(20+20)");
			break;
		}	
		
	}
	
	private void 경험치고대(Op o) {
		switch(o.uaf) {
		case 1:
			o.EXP += 30;
			System.out.println("EXP+30");
			break;
		case 2:
			o.EXP += 45;
			System.out.println("EXP+45(30+15)");
			break;
		case 3:
			o.EXP += 60;
			System.out.println("EXP+60(30+30)");
			break;
		}	
		
	}
	
	private void 낚싯대ch(Op o) {
		switch(o.ufr) {
		case 1:
			o.기본낚싯대 -= 1;
			if(o.기본낚싯대 == 0) {
				o.ufr = 0;
				System.out.println("(낚싯대의 내구도가 0이 되었습니다.)");
			} break;	
		case 2:
			o.고급낚싯대 -= 1;
			if(o.고급낚싯대 == 0) {
				o.ufr = 0;
				System.out.println("(낚싯대의 내구도가 0이 되었습니다.)");
			} break;
		case 3:
			o.대단한낚싯대 -= 1;
			if(o.대단한낚싯대 == 0) {
				o.ufr = 0;
				System.out.println("(낚싯대의 내구도가 0이 되었습니다.)");
			} break;
		}
		
	}
	private void 찌ch(Op o) {
		switch(o.uaf) {
		case 1:
			o.기본찌 -= 1;
			if(o.기본찌 == 0) {
				o.uaf = 0;
				System.out.println("(찌의 내구도가 0이 되었습니다.)");
			}
			break;
		case 2:
			o.고급찌 -= 1;
			if(o.고급찌 == 0) {
				o.uaf = 0;
				System.out.println("(찌의 내구도가 0이 되었습니다.)");
			}
			break;
		case 3:
			o.신비한찌 -= 1;
			if(o.신비한찌 == 0) {
				o.uaf = 0;
				System.out.println("(찌의 내구도가 0이 되었습니다.)");
			}
			break;
		}
		
	}
	
	private void 미끼ch(Op o) {
		switch(o.ub) {
		case 1:
			o.떡밥 -= 1;
			if(o.떡밥 == 0) {
				o.ub = 0;
				System.out.println("(미끼를 모두 소모하였습니다.)");
			}
			break;
		case 2:
			o.갯지렁이 -= 1;
			if(o.갯지렁이 == 0) {
				o.ub = 0;
				System.out.println("(미끼를 모두 소모하였습니다.)");
			}
			break;
		case 3:
			o.민물새우 -= 1;
			if(o.민물새우 == 0) {
				o.ub = 0;
				System.out.println("(미끼를 모두 소모하였습니다.)");
			}
			break;
		}
		
	}
}

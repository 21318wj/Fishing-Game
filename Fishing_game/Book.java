package port2;

public class Book {

	public void 도감(Op o) {
		switch(o.도감) {
		case 1: 
			도감_호수(o);
			break;
		case 2:
			도감_강(o);
			break;
		case 3:
			도감_늪지대(o);
			break;
		case 4:
			도감_바다(o);
			break;
		case 5:
			도감_심해(o);
			break;
		case 6:
			도감_고대(o);
			break;
		}
		
	}

	private void 도감_고대(Op o) {
		System.out.println("--------고대 물고기--------");
		System.out.println();
		System.out.println("-------  등급 : 고대 --------");
		System.out.println();
		
		if(o.암모나이트s == 0) {
			System.out.println("???(???): 미발견");
		} else {
			System.out.print("암모나이트(고대의 해안가): ");
			System.out.printf("%4.2f", o.암모나이트s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.실러캔스s == 0) {
			System.out.println("???(???): 미발견");
		} else {
			System.out.print("실러캔스(고대의 해안가): ");
			System.out.printf("%4.2f", o.실러캔스s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.모사사우루스s == 0) {
			System.out.println("???(???): 미발견");
		} else {
			System.out.print("모사사우루스(고대의 해안가): ");
			System.out.printf("%4.2f", o.모사사우루스s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.플레시오사우르스s == 0) {
			System.out.println("???(???): 미발견");
		} else {
			System.out.print("플레시오사우르스(고대의 해안가): ");
			System.out.printf("%4.2f", o.플레시오사우르스s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.익티오사우르스s == 0) {
			System.out.println("???(???): 미발견");
		} else {
			System.out.print("익티오사우르스(고대의 해안가): ");
			System.out.printf("%4.2f", o.익티오사우르스s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.익티오사우르스s == 0) {
			System.out.println("???(???): 미발견");
		} else {
			System.out.print("익티오사우르스(고대의 해안가): ");
			System.out.printf("%4.2f", o.익티오사우르스s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.삼엽충s == 0) {
			System.out.println("???(???): 미발견");
		} else {
			System.out.print("삼엽충(고대의 해안가): ");
			System.out.printf("%4.2f", o.삼엽충s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.야이켈롭테루스s == 0) {
			System.out.println("???(???): 미발견");
		} else {
			System.out.print("야이켈롭테루스(고대의 해안가): ");
			System.out.printf("%4.2f", o.야이켈롭테루스s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println();
		
	}

	private void 도감_심해(Op o) {
		System.out.println("--------심해 물고기--------");
		System.out.println();
		System.out.println("-------  등급 : 하 --------");
		System.out.println();
		
		if(o.산갈치s == 0) {
			System.out.println("산갈치(심해): 미발견");
		} else {
			System.out.print("산갈치(심해): ");
			System.out.printf("%4.2f", o.산갈치s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.투라치류s == 0) {
			System.out.println("투라치류(심해): 미발견");
		} else {
			System.out.print("투라치류(심해): ");
			System.out.printf("%4.2f", o.투라치류s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.설인게s == 0) {
			System.out.println("설인게(심해): 미발견");
		} else {
			System.out.print("설인게(심해): ");
			System.out.printf("%4.2f", o.설인게s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.발광오징어s == 0) {
			System.out.println("발광오징어(심해): 미발견");
		} else {
			System.out.print("발광오징어(심해): ");
			System.out.printf("%4.2f", o.발광오징어s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println();
		System.out.println("-------  등급 : 중 --------");
		System.out.println();
		
		if(o.스팅레이s == 0) {
			System.out.println("스팅레이(심해, 바다): 미발견");
		} else {
			System.out.print("스팅레이(심해): ");
			System.out.printf("%4.2f", o.스팅레이s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.나뭇잎해룡s == 0) {
			System.out.println("나뭇잎해룡(심해): 미발견");
		} else {
			System.out.print("나뭇잎해룡(심해): ");
			System.out.printf("%4.2f", o.나뭇잎해룡s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.리본장어s == 0) {
			System.out.println("리본장어(심해): 미발견");
		} else {
			System.out.print("리본장어(심해): ");
			System.out.printf("%4.2f", o.리본장어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.해파리s == 0) {
			System.out.println("해파리(심해): 미발견");
		} else {
			System.out.print("해파리(심해): ");
			System.out.printf("%4.2f", o.해파리s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.전기가오리s == 0) {
			System.out.println("전기가오리(심해): 미발견");
		} else {
			System.out.print("전기가오리(심해): ");
			System.out.printf("%4.2f", o.전기가오리s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println();
		System.out.println("-------  등급 : 상 --------");
		System.out.println();
		
		if(o.심해악치s == 0) {
			System.out.println("심해악치(심해): 미발견");
		} else {
			System.out.print("심해악치(심해): ");
			System.out.printf("%4.2f", o.심해악치s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.심해아귀s == 0) {
			System.out.println("심해아귀(심해): 미발견");
		} else {
			System.out.print("심해아귀(심해): ");
			System.out.printf("%4.2f", o.심해아귀s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.팰리컨장어s == 0) {
			System.out.println("팰리컨장어(심해): 미발견");
		} else {
			System.out.print("팰리컨장어(심해): ");
			System.out.printf("%4.2f", o.팰리컨장어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.해체트피시s == 0) {
			System.out.println("해체트피시(심해): 미발견");
		} else {
			System.out.print("해체트피시(심해): ");
			System.out.printf("%4.2f", o.해체트피시s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.블룹피시 == 0) {
			System.out.println("블룹피시(심해): 미발견");
		} else {
			System.out.print("블룹피시(심해): ");
			System.out.printf("%4.2f", o.블룹피시s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.초롱아귀s == 0) {
			System.out.println("초롱아귀(심해): 미발견");
		} else {
			System.out.print("초롱아귀(심해): ");
			System.out.printf("%4.2f", o.초롱아귀s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println();
		System.out.println("-------  등급 : 전설 --------");
		System.out.println();
		
		if(o.크라켄s == 0) {
			System.out.println("크라켄(심해): 미발견");
		} else {
			System.out.print("크라켄(심해): ");
			System.out.printf("%4.2f", o.크라켄s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.팽투스s == 0) {
			System.out.println("팽투스(심해): 미발견");
		} else {
			System.out.print("팽투스(심해): ");
			System.out.printf("%4.2f", o.팽투스s);
			System.out.println("cm (최고기록)");
		}
		
	}

	private void 도감_바다(Op o) {
		System.out.println("--------바다 물고기--------");
		System.out.println();
		System.out.println("-------  등급 : 하 --------");
		System.out.println();
		
		if(o.오징어s == 0) {
			System.out.println("오징어(바다): 미발견");
		} else {
			System.out.print("오징어(바다): ");
			System.out.printf("%4.2f", o.오징어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.갈치s == 0) {
			System.out.println("갈치(바다): 미발견");
		} else {
			System.out.print("갈치(바다): ");
			System.out.printf("%4.2f", o.갈치s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.멸치s == 0) {
			System.out.println("멸치(바다): 미발견");
		} else {
			System.out.print("멸치(바다): ");
			System.out.printf("%4.2f", o.멸치s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.꽁치s == 0) {
			System.out.println("꽁치(바다): 미발견");
		} else {
			System.out.print("꽁치(바다): ");
			System.out.printf("%4.2f", o.꽁치s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.삼치s == 0) {
			System.out.println("삼치(바다): 미발견");
		} else {
			System.out.print("삼치(바다): ");
			System.out.printf("%4.2f", o.삼치s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.방어s == 0) {
			System.out.println("방어(방어): 미발견");
		} else {
			System.out.print("방어(방어): ");
			System.out.printf("%4.2f", o.방어s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println();
		System.out.println("-------  등급 : 중 --------");
		System.out.println();
		
		if(o.우럭s == 0) {
			System.out.println("우럭(바다)");
		} else {
			System.out.print("우럭(바다): ");
			System.out.printf("%4.2f", o.우럭s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.참치s == 0) {
			System.out.println("참치(바다): 미발견");
		} else {
			System.out.print("참치(바다): ");
			System.out.printf("%4.2f", o.참치s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.불가사리s == 0) {
			System.out.println("불가사리(바다): 미발견");
		} else {
			System.out.print("불가사리(바다): ");
			System.out.printf("%4.2f", o.불가사리s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.청새치s == 0) {
			System.out.println("청새치(바다): 미발견");
		} else {
			System.out.print("청새치(바다): ");
			System.out.printf("%4.2f", o.청새치s);
			System.out.println("cm (최고기록)");
		}	
		
		if(o.스팅레이s == 0) {
			System.out.println("스팅레이(바다, 심해): 미발견");
		} else {
			System.out.print("스팅레이(바다, 심해): ");
			System.out.printf("%4.2f", o.스팅레이s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.복어s == 0) {
			System.out.println("복어(바다): 미발견");
		} else {
			System.out.print("복어(바다): ");
			System.out.printf("%4.2f", o.복어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.개복치s == 0) {
			System.out.println("개복치(바다): 미발견");
		} else {
			System.out.print("개복치(바다): ");
			System.out.printf("%4.2f", o.개복치s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println();
		System.out.println("-------  등급 : 상 --------");
		System.out.println();
		
		if(o.돌고래s == 0) {
			System.out.println("돌고래(바다): 미발견");
		} else {
			System.out.print("돌고래(바다): ");
			System.out.printf("%4.2f", o.돌고래s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.범고래s == 0) {
			System.out.println("범고래(바다): 미발견");
		} else {
			System.out.print("범고래(바다): ");
			System.out.printf("%4.2f", o.범고래s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.톱상어s == 0) {
			System.out.println("톱상어(바다): 미발견");
		} else {
			System.out.print("톱상어(바다): ");
			System.out.printf("%4.2f", o.톱상어s);
			System.out.println("cm (최고기록)");
		}
		
		
		System.out.println("-------  등급 : 전설 --------");
		System.out.println();
		
		if(o.흰수염고래s == 0) {
			System.out.println("흰수염고래(바다): 미발견");
		} else {
			System.out.print("흰수염고래(바다): ");
			System.out.printf("%4.2f", o.흰수염고래s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.메갈로돈s == 0) {
			System.out.println("메갈로돈(바다): 미발견");
		} else {
			System.out.print("메갈로돈(바다): ");
			System.out.printf("%4.2f", o.메갈로돈s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println();
		System.out.println("---------------------------");
		
	}

	private void 도감_늪지대(Op o) {
		System.out.println("--------늪지대 물고기--------");
		System.out.println();
		System.out.println("-------  등급 : 하 --------");
		System.out.println();
		
		if(o.피라냐s == 0) {
			System.out.println("피라냐(강, 늪지대): 미발견");
		} else {
			System.out.print("피라냐(강, 늪지대): ");
			System.out.printf("%4.2f", o.피라냐s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.가시고기s == 0) {
			System.out.println("가시고기(강, 늪지대): 미발견");
		} else {
			System.out.print("가시고기(강, 늪지대): ");
			System.out.printf("%4.2f", o.가시고기s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.잉어s == 0) {
			System.out.println("잉어(호수, 강, 늪지대): 미발견");
		} else {
			System.out.print("잉어(호수, 강, 늪지대): ");
			System.out.printf("%4.2f", o.잉어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.붕어s == 0) {
			System.out.println("붕어(호수, 강, 늪지대): 미발견");
		} else {
			System.out.print("붕어(호수, 강, 늪지대): ");
			System.out.printf("%4.2f", o.붕어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.피라냐s == 0) {
			System.out.println("피라냐(강): 미발견");
		} else {
			System.out.print("피라냐(강): ");
			System.out.printf("%4.2f", o.피라냐s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.잉어s == 0) {
			System.out.println("잉어(호수, 강, 늪지대): 미발견");
		} else {
			System.out.print("잉어(호수, 강, 늪지대): ");
			System.out.printf("%4.2f", o.잉어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.붕어s == 0) {
			System.out.println("붕어(호수, 강, 늪지대): 미발견");
		} else {
			System.out.print("붕어(호수, 강, 늪지대): ");
			System.out.printf("%4.2f", o.붕어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.송사리s == 0) {
			System.out.println("송사리(호수, 강, 늪지대): 미발견");
		} else {
			System.out.print("송사리(호수, 강, 늪지대): ");
			System.out.printf("%4.2f", o.송사리s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.가물치s == 0) {
			System.out.println("가물치(늪지대): 미발견");
		} else {
			System.out.print("가물치(늪지대): ");
			System.out.printf("%4.2f", o.가물치s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.큰입배스s == 0) {
			System.out.println("큰입배스(늪지대): 미발견");
		} else {
			System.out.print("큰입배스(늪지대): ");
			System.out.printf("%4.2f", o.큰입배스s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println();
		System.out.println("-------  등급 : 중 --------");
		System.out.println();
		
		if(o.청개구리s == 0) {
			System.out.println("청개구리(늪지대): 미발견");
		} else {
			System.out.print("청개구리(늪지대): ");
			System.out.printf("%4.2f", o.청개구리s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.돌고기s == 0) {
			System.out.println("돌고기(호수, 늪지대): 미발견");
		} else {
			System.out.print("돌고기(호수, 늪지대): ");
			System.out.printf("%4.2f", o.돌고기s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.도롱뇽s == 0) {
			System.out.println("도롱뇽(호수, 늪지대): 미발견");
		} else {
			System.out.print("도롱뇽(호수, 늪지대): ");
			System.out.printf("%4.2f", o.도롱뇽s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.장어s == 0) {
			System.out.println("장어(강, 늪지대): 미발견");
		} else {
			System.out.print("장어(강, 늪지대): ");
			System.out.printf("%4.2f", o.장어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.메기s == 0) {
			System.out.println("메기(강, 늪지대): 미발견");
		} else {
			System.out.print("메기(강, 늪지대): ");
			System.out.printf("%4.2f", o.메기s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println();
		System.out.println("-------  등급 : 상 --------");
		System.out.println();
		
		if(o.황소개구리s == 0) {
			System.out.println("황소개구리(호수, 늪지대): 미발견");
		} else {
			System.out.print("황소개구리(호수, 늪지대): ");
			System.out.printf("%4.2f", o.황소개구리s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.자라 == 0) {
			System.out.println("자라(늪지대): 미발견");
		} else {
			System.out.print("자라(늪지대): ");
			System.out.printf("%4.2f", o.자라s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.뱀장어s == 0) {
			System.out.println("뱀장어(늪지대): 미발견");
		} else {
			System.out.print("뱀장어(늪지대): ");
			System.out.printf("%4.2f", o.뱀장어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.버들붕어s == 0) {
			System.out.println("버들붕어(늪지대): 미발견");
		} else {
			System.out.print("버들붕어(늪지대): ");
			System.out.printf("%4.2f", o.버들붕어s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println("-------  등급 : 전설 --------");
		System.out.println();
		
		if(o.악어s == 0) {
			System.out.println("악어(늪지대): 미발견");
		} else {
			System.out.print("악어(늪지대): ");
			System.out.printf("%4.2f", o.악어s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println();
		System.out.println("---------------------------");
		
	}

	private void 도감_강(Op o) {
		System.out.println("--------강 물고기--------");
		System.out.println();
		System.out.println("-------  등급 : 하 --------");
		System.out.println();
		
		if(o.송사리s == 0) {
			System.out.println("송사리(호수, 강, 늪지대): 미발견");
		} else {
			System.out.print("송사리(호수, 강, 늪지대): ");
			System.out.printf("%4.2f", o.송사리s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.민어s == 0) {
			System.out.println("민어(강): 미발견");
		} else {
			System.out.print("민어(강): ");
			System.out.printf("%4.2f", o.민어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.무지개송어s == 0) {
			System.out.println("무지개송어(호수, 강): 미발견");
		} else {
			System.out.print("무지개송어(호수, 강): ");
			System.out.printf("%4.2f", o.무지개송어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.연어s == 0) {
			System.out.println("연어(호수, 강): 미발견");
		} else {
			System.out.print("연어(호수, 강): ");
			System.out.printf("%4.2f", o.연어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.피라냐s == 0) {
			System.out.println("피라냐(강): 미발견");
		} else {
			System.out.print("피라냐(강): ");
			System.out.printf("%4.2f", o.피라냐s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.잉어s == 0) {
			System.out.println("잉어(호수, 강, 늪지대): 미발견");
		} else {
			System.out.print("잉어(호수, 강, 늪지대): ");
			System.out.printf("%4.2f", o.잉어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.붕어s == 0) {
			System.out.println("붕어(호수, 강, 늪지대): 미발견");
		} else {
			System.out.print("붕어(호수, 강, 늪지대): ");
			System.out.printf("%4.2f", o.붕어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.가시고기s == 0) {
			System.out.println("가시고기(강, 늪지대): 미발견");
		} else {
			System.out.print("가시고기(강, 늪지대): ");
			System.out.printf("%4.2f", o.가시고기s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println();
		System.out.println("-------  등급 : 중 --------");
		System.out.println();
		
		if(o.미꾸라지s == 0) {
			System.out.println("미꾸라지(호수, 강): 미발견");
		} else {
			System.out.print("미꾸라지(호수, 강): ");
			System.out.printf("%4.2f", o.미꾸라지s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.장어s == 0) {
			System.out.println("장어(호수, 늪지대): 미발견");
		} else {
			System.out.print("장어(호수, 늪지대): ");
			System.out.printf("%4.2f", o.장어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.메기s == 0) {
			System.out.println("메기(호수, 늪지대): 미발견");
		} else {
			System.out.print("메기(호수, 늪지대): ");
			System.out.printf("%4.2f", o.메기s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println();
		System.out.println("-------  등급 : 상 --------");
		System.out.println();
		
		if(o.비단잉어s == 0) {
			System.out.println("비단잉어(호수, 강): 미발견");
		} else {
			System.out.print("비단잉어(호수, 강): ");
			System.out.printf("%4.2f", o.비단잉어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.아홀로틀s == 0) {
			System.out.println("아홀로틀(호수, 강): 미발견");
		} else {
			System.out.print("아홀로틀(호수, 강): ");
			System.out.printf("%4.2f", o.아홀로틀s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.흰동가리s == 0) {
			System.out.println("흰동가리(강): 미발견");
		} else {
			System.out.print("흰동가리(강): ");
			System.out.printf("%4.2f", o.흰동가리s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println();
		System.out.println("---------------------------");
		
	}

	private void 도감_호수(Op o) {
		System.out.println("--------호수 물고기--------");
		System.out.println();
		System.out.println("-------  등급 : 하 --------");
		System.out.println();
		
		if(o.무지개송어s == 0) {
			System.out.println("무지개송어(호수, 강): 미발견");
		} else {
			System.out.print("무지개송어(호수, 강): ");
			System.out.printf("%4.2f", o.무지개송어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.연어s == 0) {
			System.out.println("연어(호수, 강): 미발견");
		} else {
			System.out.print("연어(호수, 강): ");
			System.out.printf("%4.2f", o.연어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.잉어s == 0) {
			System.out.println("잉어(호수, 강, 늪지대): 미발견");
		} else {
			System.out.print("잉어(호수, 강): ");
			System.out.printf("%4.2f", o.잉어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.붕어s == 0) {
			System.out.println("붕어(호수, 강, 늪지대): 미발견");
		} else {
			System.out.print("붕어(호수, 강): ");
			System.out.printf("%4.2f", o.붕어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.금붕어s == 0) {
			System.out.println("금붕어(호수): 미발견");
		} else {
			System.out.print("금붕어(호수): ");
			System.out.printf("%4.2f", o.금붕어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.쏘가리s == 0) {
			System.out.println("쏘가리(호수): 미발견");
		} else {
			System.out.print("쏘가리(호수): ");
			System.out.printf("%4.2f", o.쏘가리s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.송사리s == 0) {
			System.out.println("송사리(호수, 강, 늪지대): 미발견");
		} else {
			System.out.print("송사리(호수, 강): ");
			System.out.printf("%4.2f", o.송사리s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println();
		System.out.println("-------  등급 : 중 --------");
		System.out.println();
		
		if(o.미꾸라지s == 0) {
			System.out.println("미꾸라지(호수, 강): 미발견");
		} else {
			System.out.print("미꾸라지(호수, 강): ");
			System.out.printf("%4.2f", o.미꾸라지s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.돌고기s == 0) {
			System.out.println("돌고기(호수, 늪지대): 미발견");
		} else {
			System.out.print("돌고기(호수, 늪지대): ");
			System.out.printf("%4.2f", o.돌고기s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.도롱뇽s == 0) {
			System.out.println("도롱뇽(호수, 늪지대): 미발견");
		} else {
			System.out.print("도롱뇽(호수, 늪지대): ");
			System.out.printf("%4.2f", o.도롱뇽s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println();
		System.out.println("-------  등급 : 상 --------");
		System.out.println();
		
		if(o.황소개구리s == 0) {
			System.out.println("황소개구리(호수, 늪지대): 미발견");
		} else {
			System.out.print("황소개구리(호수, 늪지대): ");
			System.out.printf("%4.2f", o.황소개구리s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.비단잉어s == 0) {
			System.out.println("비단잉어(호수, 강): 미발견");
		} else {
			System.out.print("비단잉어(호수, 강): ");
			System.out.printf("%4.2f", o.비단잉어s);
			System.out.println("cm (최고기록)");
		}
		
		if(o.아홀로틀s == 0) {
			System.out.println("아홀로틀(호수, 강): 미발견");
		} else {
			System.out.print("아홀로틀(호수, 강): ");
			System.out.printf("%4.2f", o.아홀로틀s);
			System.out.println("cm (최고기록)");
		}
		
		System.out.println();
		System.out.println("---------------------------");
		
	}
}

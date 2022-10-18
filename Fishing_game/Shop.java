package port2;

import java.util.*;

public class Shop {
	static Scanner sc = new Scanner(System.in);
	public void 구매(Op o) {
		int ch;
		
		System.out.println("┌──────★◆★──────┐");
		System.out.println("│   1.낚대    2.찌   3.미끼        │");
		System.out.println("└──────◆★◆──────┘");
		while(true) {
			ch = sc.nextInt();
			if(ch<1 || ch>3) {
				System.out.println("!1~3");
			} else
				break;
		}
	
		switch(ch) {
		case 1: 
			구매_낚시대(o);
			break;
		case 2:
			구매_찌(o);
			break;
		case 3:
			구매_미끼(o);
			break;
		}
		
	
	}

	private void 구매_미끼(Op o) {
		int i;
		int no;
		System.out.println("===============================");
		System.out.println("1. 떡밥-5원");
		System.out.println();
		System.out.println("2. 갯지렁이-7원");
		System.out.println();
		System.out.println("3. 민물새우-12원");
		System.out.println("===============================");
		
		while(true) {
			i = sc.nextInt();
			if(i<1 || i>3) {
				System.out.println("!1~3");
			} else
				break;
		}
		
		switch(i) {
		case 1:
			while(true) {
				System.out.println("몇개를 구매하시겠습니까?");
				no = sc.nextInt();
				if(no < 1) {
					System.out.println("0보다 큰 수를 입력하세요.");
				} else {
					break;
				}
			}			
			if(no*5 > o.money) {
				System.out.println("돈이 부족합니다.");
			} else {
				o.떡밥 += no;
				o.money -= no*5;
				System.out.println("떡밥 "+ no+"개를 구매하였습니다.");
				System.out.println("돈: "+ (o.money+no*5)+" >>> " + o.money);
			} break;
		case 2:	
			while(true) {
				System.out.println("몇개를 구매하시겠습니까?");
				no = sc.nextInt();
				if(no < 1) {
					System.out.println("0보다 큰 수를 입력하세요.");
				} else {
					break;
				}
			}			
			if(no*7 > o.money) {
				System.out.println("돈이 부족합니다.");
			} else {
				o.갯지렁이 += no;
				o.money -= no*7;
				System.out.println("갯지렁이 "+ no+"마리를 구매하였습니다.");
				System.out.println("돈: "+ (o.money+no*7)+" >>> " + o.money);
			} break;
		case 3:	
			while(true) {
				System.out.println("몇개를 구매하시겠습니까?");
				no = sc.nextInt();
				if(no < 1) {
					System.out.println("0보다 큰 수를 입력하세요.");
				} else {
					break;
				}
			}			
			if(no*12 > o.money) {
				System.out.println("돈이 부족합니다.");
			} else {
				o.민물새우 += no;
				o.money -= no*12;
				System.out.println("민물새우 "+ no+"마리를 구매하였습니다.");
				System.out.println("돈: "+ (o.money+no*12)+" >>> " + o.money);
			} break;
		}
		
	}

	private void 구매_찌(Op o) {
		int i;
		System.out.println("===============================");
		System.out.println("1. 기본찌(내구도-10)-100원");
		System.out.println();
		System.out.println("2. 고급찌(내구도-30)-500원");
		System.out.println();
		System.out.println("3. 신비한찌(내구도-50)-900원");
		System.out.println("===============================");
		
		while(true) {
			i = sc.nextInt();
			if(i<1 || i>3) {
				System.out.println("!1~3");
			} else
				break;
		}
		
		switch(i) {
		case 1:
			if(o.기본찌>0) {
				System.out.println("이미 보유 중인 찌입니다.");
			} else if(o.money < 100) {
				System.out.println("돈이 부족합니다.");
			} else {
				System.out.println("기본찌를 구매하였습니다.");
				System.out.println("돈: " + o.money + ">>>" +(o.money-100));		
				o.money -= 100;
				o.기본찌 = 10;
			}	break;
		case 2:	
			if(o.고급찌>0) {
				System.out.println("이미 보유 중인 찌입니다.");
			} else if(o.money < 500) {
				System.out.println("돈이 부족합니다.");
			} else {
				System.out.println("고급찌를 구매하였습니다.");
				System.out.println("돈: " + o.money + ">>>" +(o.money-500));		
				o.money -= 500;
				o.고급찌 = 30;
			}	break;
		case 3:	
			if(o.신비한찌>0) {
				System.out.println("이미 보유 중인 찌입니다..");
			} else if(o.money < 900) {
				System.out.println("돈이 부족합니다.");
			} else {
				System.out.println("신비한찌 구매하였습니다.");
				System.out.println("돈: " + o.money + ">>>" +(o.money-900));		
				o.money -= 900;
				o.신비한찌 = 50;
			}	break;
		}
		
	}

	private void 구매_낚시대(Op o) {
		int i;
		System.out.println("===============================");
		System.out.println("1. 기본낚싯대(내구도-10)-100원");
		System.out.println();
		System.out.println("2. 고급낚싯대(내구도-30)-400원");
		System.out.println();
		System.out.println("3. 대단한낚싯대(내구도-50)-700원");
		System.out.println("===============================");
		
		while(true) {
			i = sc.nextInt();
			if(i<1 || i>3) {
				System.out.println("!1~3");
			} else
				break;
		}
		
		switch(i) {
		case 1:
			if(o.기본낚싯대>0) {
				System.out.println("이미 보유 중인 낚싯대입니다.");
			} else if(o.money < 100) {
				System.out.println("돈이 부족합니다.");
			} else {
				System.out.println("기본낚싯대를 구매하였습니다.");
				System.out.println("돈: " + o.money + ">>>" +(o.money-100));				o.money -= 100;
				o.기본낚싯대 = 10;
			}	break;
		case 2:	
			if(o.고급낚싯대>0) {
				System.out.println("이미 보유 중인 낚싯대입니다.");
			} else if(o.money < 400) {
				System.out.println("돈이 부족합니다.");
			} else {
				System.out.println("고급낚싯대를 구매하였습니다.");
				System.out.println("돈: " + o.money + ">>>" +(o.money-400));		
				o.money -= 400;
				o.고급낚싯대 = 30;
			}	break;
		case 3:	
			if(o.대단한낚싯대>0) {
				System.out.println("이미 보유 중인 낚싯대입니다.");
			} else if(o.money < 700) {
				System.out.println("돈이 부족합니다.");
			} else {
				System.out.println("대단한낚싯대를 구매하였습니다.");
				System.out.println("돈: " + o.money + ">>>" +(o.money-700));		
				o.money -= 700;
				o.대단한낚싯대 = 50;
			}	break;
		}
	}
		
	
	public void 판매(Op o) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("판매할 물고기");
		System.out.print("▶▶▶");
		
		String l = sc.nextLine();
		int i;
		
		switch(l) {
		case "무지개송어":
			if(o.무지개송어>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.무지개송어) {
					System.out.println("무지개송어 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("무지개송어 "+i+"마리를 판매하였습니다.");
					o.무지개송어 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("무지개송어를 보유하고 있지 않습니다.");
			} break;
		case "연어":
			if(o.연어>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.연어) {
					System.out.println("연어 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("연어 "+i+"마리를 판매하였습니다.");
					o.연어 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("연어를 보유하고 있지 않습니다.");
			} break;
		case "잉어":
			if(o.잉어>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.잉어) {
					System.out.println("잉어 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("잉어 "+i+"마리를 판매하였습니다.");
					o.잉어 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("잉어를 보유하고 있지 않습니다.");
			} break;
		case "붕어":
			if(o.붕어>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.붕어) {
					System.out.println("붕어 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("붕어 "+i+"마리를 판매하였습니다.");
					o.붕어 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("붕어를 보유하고 있지 않습니다.");
			} break;	
		case "금붕어":
			if(o.금붕어>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.금붕어) {
					System.out.println("금붕어 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("금붕어 "+i+"마리를 판매하였습니다.");
					o.금붕어 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("금붕어를 보유하고 있지 않습니다.");
			} break;	
		case "쏘가리":
			if(o.쏘가리>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.쏘가리) {
					System.out.println("쏘가리 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("쏘가리 "+i+"마리를 판매하였습니다.");
					o.쏘가리 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("쏘가리를 보유하고 있지 않습니다.");
			} break;
		case "송사리":
			if(o.송사리>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.송사리) {
					System.out.println("송사리 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("송사리 "+i+"마리를 판매하였습니다.");
					o.송사리 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("송사리를 보유하고 있지 않습니다.");
			} break;
		case "민어":
			if(o.민어>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.민어) {
					System.out.println("민어 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("민어 "+i+"마리를 판매하였습니다.");
					o.민어 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("민어를 보유하고 있지 않습니다.");
			} break;
		case "피라냐":
			if(o.피라냐>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.피라냐) {
					System.out.println("피라냐 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("피라냐 "+i+"마리를 판매하였습니다.");
					o.피라냐 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("피라냐를 보유하고 있지 않습니다.");
			} break;
		case "가시고기":
			if(o.가시고기>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.가시고기) {
					System.out.println("가시고기 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("가시고기 "+i+"마리를 판매하였습니다.");
					o.가시고기 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("가시고기를 보유하고 있지 않습니다.");
			} break;
		case "돔":
			if(o.돔>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.돔) {
					System.out.println("돔 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("돔 "+i+"마리를 판매하였습니다.");
					o.돔 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("돔을 보유하고 있지 않습니다.");
			} break;
		case "오징어":
			if(o.오징어>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.오징어) {
					System.out.println("오징어 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("오징어 "+i+"마리를 판매하였습니다.");
					o.오징어 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("오징어를 보유하고 있지 않습니다.");
			} break;
		case "갈치":
			if(o.갈치>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.갈치) {
					System.out.println("갈치 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("갈치 "+i+"마리를 판매하였습니다.");
					o.갈치 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("갈치를 보유하고 있지 않습니다.");
			} break;
		case "멸치":
			if(o.멸치>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.멸치) {
					System.out.println("멸치 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("멸치 "+i+"마리를 판매하였습니다.");
					o.멸치 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("멸치를 보유하고 있지 않습니다.");
			} break;
		case "꽁치":
			if(o.꽁치>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.꽁치) {
					System.out.println("꽁치 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("꽁치 "+i+"마리를 판매하였습니다.");
					o.꽁치 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("꽁치 보유하고 있지 않습니다.");
			} break;
		case "삼치":
			if(o.삼치>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.삼치) {
					System.out.println("삼치 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("삼치 "+i+"마리를 판매하였습니다.");
					o.삼치 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("삼치를 보유하고 있지 않습니다.");
			} break;
		case "방어":
			if(o.방어>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.방어) {
					System.out.println("방어 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("방어 "+i+"마리를 판매하였습니다.");
					o.방어 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("방어를 보유하고 있지 않습니다.");
			} break;
		case "자갈치":
			if(o.자갈치>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.자갈치) {
					System.out.println("자갈치 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("자갈치 "+i+"마리를 판매하였습니다.");
					o.자갈치 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("자갈치를 보유하고 있지 않습니다.");
			} break;
		case "넙치":
			if(o.넙치>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.넙치) {
					System.out.println("넙치 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("넙치 "+i+"마리를 판매하였습니다.");
					o.넙치 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("넙치를 보유하고 있지 않습니다.");
			} break;
		case "송어":
			if(o.송어>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.송어) {
					System.out.println("송어 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("송어 "+i+"마리를 판매하였습니다.");
					o.송어 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("송어를 보유하고 있지 않습니다.");
			} break;
		case "복어":
			if(o.복어>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.복어) {
					System.out.println("복어 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("복어 "+i+"마리를 판매하였습니다.");
					o.복어 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("복어를 보유하고 있지 않습니다.");
			} break;
		case "참치":
			if(o.참치>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.참치) {
					System.out.println("참치 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("참치 "+i+"마리를 판매하였습니다.");
					o.참치 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("참치를 보유하고 있지 않습니다.");
			} break;
		case "개복치":
			if(o.개복치>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.개복치) {
					System.out.println("개복치 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("개복치 "+i+"마리를 판매하였습니다.");
					o.개복치 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("개복치를 보유하고 있지 않습니다.");
			} break;
		case "청새치":
			if(o.청새치>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.청새치) {
					System.out.println("청새치 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("청새치 "+i+"마리를 판매하였습니다.");
					o.청새치 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("청새치를 보유하고 있지 않습니다.");
			} break;
		case "장어":
			if(o.장어>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.장어) {
					System.out.println("장어 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("장어 "+i+"마리를 판매하였습니다.");
					o.장어 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("청새치를 보유하고 있지 않습니다.");
			} break;
		case "메기":
			if(o.메기>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.메기) {
					System.out.println("메기 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("메기 "+i+"마리를 판매하였습니다.");
					o.메기 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("메기를 보유하고 있지 않습니다.");
			} break;
		case "버들개":
			if(o.버들개>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.버들개) {
					System.out.println("버들개 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("버들개 "+i+"마리를 판매하였습니다.");
					o.버들개 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("버들개를 보유하고 있지 않습니다.");
			} break;
		case "우럭":
			if(o.우럭>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.우럭) {
					System.out.println("우럭 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("우럭 "+i+"마리를 판매하였습니다.");
					o.우럭 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("우럭을 보유하고 있지 않습니다.");
			} break;
		case "스팅레이":
			if(o.스팅레이>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.스팅레이) {
					System.out.println("스팅레이"+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("스팅레이 "+i+"마리를 판매하였습니다.");
					o.스팅레이 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("스팅레이를 보유하고 있지 않습니다.");
			} break;
		case "전기가오리":
			if(o.전기가오리>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.전기가오리) {
					System.out.println("전기가오리"+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("전기가오리 "+i+"마리를 판매하였습니다.");
					o.전기가오리 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("전기가오리를 보유하고 있지 않습니다.");
			} break;
		case "도롱뇽":
			if(o.도롱뇽>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.도롱뇽) {
					System.out.println("도롱뇽 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("도롱뇽"+i+"마리를 판매하였습니다.");
					o.도롱뇽 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("도롱뇽을 보유하고 있지 않습니다.");
			} break;
		case "불가사리":
			if(o.불가사리>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.불가사리) {
					System.out.println("불가사리 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("불가사리"+i+"마리를 판매하였습니다.");
					o.불가사리 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("불가사리를 보유하고 있지 않습니다.");
			} break;
		case "미꾸라지":
			if(o.미꾸라지>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.미꾸라지) {
					System.out.println("미꾸라지 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("미꾸라지 "+i+"마리를 판매하였습니다.");
					o.메기 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("미꾸라지를 보유하고 있지 않습니다.");
			} break;
		case "돌고기":
			if(o.돌고기>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.돌고기) {
					System.out.println("돌고기 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("돌고기"+i+"마리를 판매하였습니다.");
					o.돌고기 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("돌고기를 보유하고 있지 않습니다.");
			} break;
		case "해파리":
			if(o.해파리>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.해파리) {
					System.out.println("해파리 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("해파리 "+i+"마리를 판매하였습니다.");
					o.해파리 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("해파리를 보유하고 있지 않습니다.");
			} break;
		case "대게":
			if(o.대게>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.대게) {
					System.out.println("대게 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("대게 "+i+"마리를 판매하였습니다.");
					o.대게 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("대게를 보유하고 있지 않습니다.");
			} break;
		case "개구리":
			if(o.개구리>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.개구리) {
					System.out.println("개구리 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("개구리 "+i+"마리를 판매하였습니다.");
					o.개구리 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("개구리를 보유하고 있지 않습니다.");
			} break;
		case "돌고래":
			if(o.돌고래>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.돌고래) {
					System.out.println("돌고래 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("돌고래 "+i+"마리를 판매하였습니다.");
					o.돌고래 -= i;
					o.money += 100;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("돌고래를 보유하고 있지 않습니다.");
			} break;
		case "톱상어":
			if(o.톱상어>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.톱상어) {
					System.out.println("톱상어 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("톱상어 "+i+"마리를 판매하였습니다.");
					o.톱상어 -= i;
					o.money += 100;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("톱상어를 보유하고 있지 않습니다.");
			} break;
		case "범고래":
			if(o.범고래>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.범고래) {
					System.out.println("범고래 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("범고래 "+i+"마리를 판매하였습니다.");
					o.범고래 -= i;
					o.money += 100;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("범고래를 보유하고 있지 않습니다.");
			} break;
		case "고래상어":
			if(o.고래상어>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.고래상어) {
					System.out.println("고래상어 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("고래상어 "+i+"마리를 판매하였습니다.");
					o.고래상어 -= i;
					o.money += 100;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("고래상어를 보유하고 있지 않습니다.");
			} break;
		case "초롱아귀":
			if(o.초롱아귀>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.초롱아귀) {
					System.out.println("초롱아귀 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("초롱아귀 "+i+"마리를 판매하였습니다.");
					o.초롱아귀 -= i;
					o.money += 100;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("초롱아귀를 보유하고 있지 않습니다.");
			} break;
		case "악어":
			if(o.악어>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.악어) {
					System.out.println("악어 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("악어 "+i+"마리를 판매하였습니다.");
					o.악어 -= i;
					o.money += 100;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("악어를 보유하고 있지 않습니다.");
			} break;
		case "아홀로틀":
			if(o.아홀로틀>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.아홀로틀) {
					System.out.println("아홀로틀 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("아홀로틀 "+i+"마리를 판매하였습니다.");
					o.아홀로틀 -= i;
					o.money += 100;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("아홀로틀을 보유하고 있지 않습니다.");
			} break;
		case "흰동가리":
			if(o.흰동가리>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.흰동가리) {
					System.out.println("흰둥가리 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("흰둥가리 "+i+"마리를 판매하였습니다.");
					o.흰동가리 -= i;
					o.money += 100;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("흰둥가리를 보유하고 있지 않습니다.");
			} break;
		case "블룹피시":
			if(o.블룹피시>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.블룹피시) {
					System.out.println("블룹피시 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("블룹피시 "+i+"마리를 판매하였습니다.");
					o.블룹피시 -= i;
					o.money += 100;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("블룹피쉬를 보유하고 있지 않습니다.");
			} break;
		case "킹크랩":
			if(o.킹크랩>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.킹크랩) {
					System.out.println("킹크랩 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("킹크랩 "+i+"마리를 판매하였습니다.");
					o.킹크랩 -= i;
					o.money += 100;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("킹크랩을 보유하고 있지 않습니다.");
			} break;
		case "비단잉어":
			if(o.비단잉어>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.비단잉어) {
					System.out.println("비단잉어 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("비단잉어 "+i+"마리를 판매하였습니다.");
					o.비단잉어 -= i;
					o.money += 100;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("비단잉어를 보유하고 있지 않습니다.");
			} break;
		case "황소개구리":
			if(o.황소개구리>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.황소개구리) {
					System.out.println("황소개구리 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("황소개구리 "+i+"마리를 판매하였습니다.");
					o.황소개구리 -= i;
					o.money += 100;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("황소개구리를 보유하고 있지 않습니다.");
			} break;
		case "메갈로돈":
			if(o.메갈로돈>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.메갈로돈) {
					System.out.println("메갈로돈 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("메갈로돈 "+i+"마리를 판매하였습니다.");
					o.메갈로돈 -= i;
					o.money += 200;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-200)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("메갈로돈을 보유하고 있지 않습니다.");
			} break;
		case "흰수염고래":
			if(o.흰수염고래>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.흰수염고래) {
					System.out.println("흰수염고래"+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("흰수염고래 "+i+"마리를 판매하였습니다.");
					o.흰수염고래 -= i;
					o.money += 200;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-200)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("흰수염고래를 보유하고 있지 않습니다.");
			} break;
		case "크라켄":
			if(o.크라켄>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.크라켄) {
					System.out.println("크라켄"+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("크라켄 "+i+"마리를 판매하였습니다.");
					o.크라켄 -= i;
					o.money += 200;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-200)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("크라켄을 보유하고 있지 않습니다.");
			} break;
		case "백상아리":
			if(o.백상아리>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.백상아리) {
					System.out.println("백상아리 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("백상아리 "+i+"마리를 판매하였습니다.");
					o.백상아리 -= i;
					o.money += 200;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-200)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("백상아리를 보유하고 있지 않습니다.");
			} break;
		case "플레시오사우르스":
			if(o.플레시오사우르스>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.플레시오사우르스) {
					System.out.println("플레시오사우르스 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("플레시오사우르스 "+i+"마리를 판매하였습니다.");
					o.플레시오사우르스 -= i;
					o.money += 400;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-400)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("플레시오사우르스를 보유하고 있지 않습니다.");
			} break;
		case "익티오사우르스":
			if(o.익티오사우르스>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.익티오사우르스) {
					System.out.println("익티오사우르스 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("익티오사우르스 "+i+"마리를 판매하였습니다.");
					o.익티오사우르스 -= i;
					o.money += 400;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-400)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("익티오사우르스를 보유하고 있지 않습니다.");
			} break;
		case "아노말로카리스":
			if(o.아노말로카리스>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.아노말로카리스) {
					System.out.println("아노말로카리스 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("아노말로카리스 "+i+"마리를 판매하였습니다.");
					o.아노말로카리스 -= i;
					o.money += 400;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-400)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("아노말로카리스를 보유하고 있지 않습니다.");
			} break;
		case "삼엽충":
			if(o.삼엽충>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.삼엽충) {
					System.out.println("삼엽충 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("삼엽충 "+i+"마리를 판매하였습니다.");
					o.삼엽충 -= i;
					o.money += 400;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-400)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("삼엽충을 보유하고 있지 않습니다.");
			} break;
		case "야이켈롭테루스":
			if(o.야이켈롭테루스>0) {
				System.out.println("몇 마리를 판매하시겠습니까?");
				i = sc.nextInt();
				if(i<o.야이켈롭테루스) {
					System.out.println("야이켈롭테루스 "+i+"마리를 보유 중이 아닙니다.");
				} else {
					System.out.println("야이켈롭테루스 "+i+"마리를 판매하였습니다.");
					o.야이켈롭테루스 -= i;
					o.money += 400;
					System.out.println();
					System.out.println("보유한 돈: "+(o.money-400)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("야이켈롭테루스를 보유하고 있지 않습니다.");
			} break;
		default :
			System.out.println(l+"라는 물고리를 보유하고 있지 않습니다.");
			break;
		} 	
	}
	
}

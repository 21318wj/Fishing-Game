package port2;

import java.util.*;

import port.Oi;

public class Fishing {
	static Random r = new Random();
	static Scanner sc = new Scanner(System.in);
	static boolean ke, lo;
	static int i,p, b, m;
	static Fish fi = new Fish();
	
	public void test(Op o) throws InterruptedException {
		ke = true;
		lo = true;
		while(ke) {
			int f;
			if(o.ub == 2) {
				b = 2;
			} else {
				b = 1;
			}
			Thread.sleep(1000);
			i = r.nextInt(10)+1;
				
			if(i<=b) {
				System.out.println("!!!");
				f = sc.nextInt();
				ke = false;
					
				switch(f) {
				case 1 : 
					낚시대ck(o);
					break;
				default :
					System.out.println("낚시에 실패하였습니다.");
					break;
				}					
			} else {
				System.out.println("...");
			}
		}
	}	
	
	
	private void 낚시대ck(Op o) {
		
		switch(o.ufr) {
		case 0 :
			System.out.println("사용중인 낚시대가 없습니다.");
			break;
		case 1:
			기본낚시대(o);
			break;
		case 2:
			고급낚시대(o);
			break;
		case 3:
			대단한낚시대(o);
			break;
		}
		
	}


	private void 대단한낚시대(Op o) {
		
		int a = 6;
		int b = 0;
		
		boolean t = true;
		
		while(t) {			
			if(b == 0) {
				System.out.println("◇◇◇◇◇◇");
			}
			
			int i = sc.nextInt();
			
			if(i == 0) {
				b++;
				switch(b) {
				case 1:
					System.out.println("◆◇◇◇◇◇");
					break;
				case 2:
					System.out.println("◆◆◇◇◇◇");
					break;
				case 3:
					System.out.println("◆◆◆◇◇◇");
					break;
				case 4:
					System.out.println("◆◆◆◆◇◇");
					break;
				case 5:
					System.out.println("◆◆◆◆◆◇");
					break;
				case 6:
					System.out.println("◆◆◆◆◆◆");
					System.out.println("낚시에 성공하였습니다.");
					if(o.ub == 3) {
						Random r = new Random();
						m = Math.abs(r.nextInt(5)+1);
						if(m==1) {
							System.out.println("◆미끼의 효과로 물고기 2마리가 낚였습니다.◆");
							fi.맵(o);
						}
					}
					fi.맵(o);
					break;			
				}
				
			} else {
				System.out.println("낚시에 실패하였습니다.");
				t = false;
			}
			 if(b == a) {
				 t = false;
			 
			}
		}	 
	}


	private void 고급낚시대(Op o) {
		int a = 8;
		int b = 0;
		
		boolean t = true;
		
		while(t) {			
			if(b == 0) {
				System.out.println("☆☆☆☆☆☆☆☆");
			}
			
			int i = sc.nextInt();
			
			if(i == 0) {
				b++;
				switch(b) {
				case 1:
					System.out.println("★☆☆☆☆☆☆☆");
					break;
				case 2:
					System.out.println("★★☆☆☆☆☆☆");
					break;
				case 3:
					System.out.println("★★★☆☆☆☆☆");
					break;
				case 4:
					System.out.println("★★★★☆☆☆☆");
					break;
				case 5:
					System.out.println("★★★★★☆☆☆");
					break;
				case 6:
					System.out.println("★★★★★★☆☆");
					break;
				case 7:
					System.out.println("★★★★★★★☆");
					break;
				case 8:
					System.out.println("★★★★★★★★");
					System.out.println("낚시에 성공하였습니다.");
					if(o.ub == 3) {
						Random r = new Random();
						m = Math.abs(r.nextInt(5)+1);
						if(m==1) {
							System.out.println("◆미끼의 효과로 물고기 2마리가 낚였습니다.◆");
							fi.맵(o);
						}
					}
					fi.맵(o);
					break;
				}
				
			} else {
				System.out.println("낚시에 실패하였습니다.");
				t = false;
			}
			 if(b == a) {
				 t = false;
			 
			}
		}
	}


	public void 기본낚시대(Op o) {
		int a = 10;
		int b = 0;
		
		boolean t = true;
		
		while(t) {			
			if(b == 0) {
				System.out.println("□□□□□□□□□□");
			}
			
			int i = sc.nextInt();
			
			if(i == 0) {
				b++;
				switch(b) {
				case 1:
					System.out.println("■□□□□□□□□□");
					break;
				case 2:
					System.out.println("■■□□□□□□□□");
					break;
				case 3:
					System.out.println("■■■□□□□□□□");
					break;
				case 4:
					System.out.println("■■■■□□□□□□");
					break;
				case 5:
					System.out.println("■■■■■□□□□□");
					break;
				case 6:
					System.out.println("■■■■■■□□□□");
					break;
				case 7:
					System.out.println("■■■■■■■□□□");
					break;
				case 8:
					System.out.println("■■■■■■■■□□");
					break;
				case 9:
					System.out.println("■■■■■■■■■□");
					break;		
				case 10:
					System.out.println("■■■■■■■■■■");
					System.out.println("낚시에 성공하였습니다.");
					if(o.ub == 3) {
						Random r = new Random();
						m = Math.abs(r.nextInt(5)+1);
						if(m==1) {
							System.out.println("◆미끼의 효과로 물고기 2마리가 낚였습니다.◆");
							fi.맵(o);
						}
					}
					fi.맵(o);
					break;
				}
				
			} else {
				System.out.println("낚시에 실패하였습니다.");
				t = false;
			}
			 if(b == a) {
				 t = false;
			 
			}
		}
	}
	

}
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
					���ô�ck(o);
					break;
				default :
					System.out.println("���ÿ� �����Ͽ����ϴ�.");
					break;
				}					
			} else {
				System.out.println("...");
			}
		}
	}	
	
	
	private void ���ô�ck(Op o) {
		
		switch(o.ufr) {
		case 0 :
			System.out.println("������� ���ô밡 �����ϴ�.");
			break;
		case 1:
			�⺻���ô�(o);
			break;
		case 2:
			��޳��ô�(o);
			break;
		case 3:
			����ѳ��ô�(o);
			break;
		}
		
	}


	private void ����ѳ��ô�(Op o) {
		
		int a = 6;
		int b = 0;
		
		boolean t = true;
		
		while(t) {			
			if(b == 0) {
				System.out.println("�ޡޡޡޡޡ�");
			}
			
			int i = sc.nextInt();
			
			if(i == 0) {
				b++;
				switch(b) {
				case 1:
					System.out.println("�ߡޡޡޡޡ�");
					break;
				case 2:
					System.out.println("�ߡߡޡޡޡ�");
					break;
				case 3:
					System.out.println("�ߡߡߡޡޡ�");
					break;
				case 4:
					System.out.println("�ߡߡߡߡޡ�");
					break;
				case 5:
					System.out.println("�ߡߡߡߡߡ�");
					break;
				case 6:
					System.out.println("�ߡߡߡߡߡ�");
					System.out.println("���ÿ� �����Ͽ����ϴ�.");
					if(o.ub == 3) {
						Random r = new Random();
						m = Math.abs(r.nextInt(5)+1);
						if(m==1) {
							System.out.println("�߹̳��� ȿ���� ����� 2������ �������ϴ�.��");
							fi.��(o);
						}
					}
					fi.��(o);
					break;			
				}
				
			} else {
				System.out.println("���ÿ� �����Ͽ����ϴ�.");
				t = false;
			}
			 if(b == a) {
				 t = false;
			 
			}
		}	 
	}


	private void ��޳��ô�(Op o) {
		int a = 8;
		int b = 0;
		
		boolean t = true;
		
		while(t) {			
			if(b == 0) {
				System.out.println("�١١١١١١١�");
			}
			
			int i = sc.nextInt();
			
			if(i == 0) {
				b++;
				switch(b) {
				case 1:
					System.out.println("�ڡ١١١١١١�");
					break;
				case 2:
					System.out.println("�ڡڡ١١١١١�");
					break;
				case 3:
					System.out.println("�ڡڡڡ١١١١�");
					break;
				case 4:
					System.out.println("�ڡڡڡڡ١١١�");
					break;
				case 5:
					System.out.println("�ڡڡڡڡڡ١١�");
					break;
				case 6:
					System.out.println("�ڡڡڡڡڡڡ١�");
					break;
				case 7:
					System.out.println("�ڡڡڡڡڡڡڡ�");
					break;
				case 8:
					System.out.println("�ڡڡڡڡڡڡڡ�");
					System.out.println("���ÿ� �����Ͽ����ϴ�.");
					if(o.ub == 3) {
						Random r = new Random();
						m = Math.abs(r.nextInt(5)+1);
						if(m==1) {
							System.out.println("�߹̳��� ȿ���� ����� 2������ �������ϴ�.��");
							fi.��(o);
						}
					}
					fi.��(o);
					break;
				}
				
			} else {
				System.out.println("���ÿ� �����Ͽ����ϴ�.");
				t = false;
			}
			 if(b == a) {
				 t = false;
			 
			}
		}
	}


	public void �⺻���ô�(Op o) {
		int a = 10;
		int b = 0;
		
		boolean t = true;
		
		while(t) {			
			if(b == 0) {
				System.out.println("�����������");
			}
			
			int i = sc.nextInt();
			
			if(i == 0) {
				b++;
				switch(b) {
				case 1:
					System.out.println("�����������");
					break;
				case 2:
					System.out.println("�����������");
					break;
				case 3:
					System.out.println("�����������");
					break;
				case 4:
					System.out.println("�����������");
					break;
				case 5:
					System.out.println("�����������");
					break;
				case 6:
					System.out.println("�����������");
					break;
				case 7:
					System.out.println("�����������");
					break;
				case 8:
					System.out.println("�����������");
					break;
				case 9:
					System.out.println("�����������");
					break;		
				case 10:
					System.out.println("�����������");
					System.out.println("���ÿ� �����Ͽ����ϴ�.");
					if(o.ub == 3) {
						Random r = new Random();
						m = Math.abs(r.nextInt(5)+1);
						if(m==1) {
							System.out.println("�߹̳��� ȿ���� ����� 2������ �������ϴ�.��");
							fi.��(o);
						}
					}
					fi.��(o);
					break;
				}
				
			} else {
				System.out.println("���ÿ� �����Ͽ����ϴ�.");
				t = false;
			}
			 if(b == a) {
				 t = false;
			 
			}
		}
	}
	

}
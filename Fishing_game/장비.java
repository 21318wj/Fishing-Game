package port2;

import java.util.*;



public class ��� {

	static int i;
	static Scanner sc = new Scanner(System.in);
	
	public static void ���˴�(Op o) {
		boolean ke = true;
		
		
		System.out.println("======�������� ���˴�======");
		if(o.�⺻���˴�>0) {
			System.out.println();
			System.out.print("�⺻���˴�(������: "+o.�⺻���˴�+")");
			if(o.ufr == 1) {
				System.out.println("-��� ��");
			} else {
				System.out.println();
			}
			System.out.println();
		}
		
		if(o.��޳��˴�>0) {
			System.out.println();
			System.out.print("��޳��˴�(������: "+o.��޳��˴�+")");
			if(o.ufr == 2) {
				System.out.println("-��� ��");
			} else {
				System.out.println();
			}
			System.out.println();
		}
		
		if(o.����ѳ��˴�>0) {
			System.out.println();
			System.out.print("����ѳ��˴�(������: "+o.����ѳ��˴�+")");
			if(o.ufr == 3) {
				System.out.println("-��� ��");
			} else {
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("1.���˴� ����   2.�޴�");
			while(ke) {
				
				i = sc.nextInt();
				
				switch(i) {
				case 1:
					���ô�ch(o);
					ke = false;
					break;
				case 2:
					ke = false;
					break;
				default:
					System.out.println("!1~2");
					break;
				}
			}
		}
		
	

	private static void ���ô�ch(Op o) {
		boolean kl = true;
		
		System.out.println("1.�⺻���˴�   2.��޳��˴�   3.����ѳ��˴�");
		
		while(kl) {
			i = sc.nextInt();
			
			switch(i) {
			case 1: 
				if(o.�⺻���˴� == 0) {
					 System.out.println("�������� ���˴밡 �ƴմϴ�.");
					 System.out.println();
					 kl = false;
					 break;
				} else if(o.ufr == 1) {
					System.out.println("���� ��� ���� ���˴��Դϴ�.");
					System.out.println();
					kl = false;
					break;
				} else {
					o.ufr = 1;
					System.out.println("���˴밡 ����Ǿ����ϴ�.");
					System.out.println();
					kl = false;
				    break;
				}
			case 2:
				if(o.��޳��˴� == 0) {
					 System.out.println("�������� ���˴밡 �ƴմϴ�.");
					 System.out.println();
					 kl = false;
					 break;
				} else if(o.ufr == 2) {
					System.out.println("���� ��� ���� ���˴��Դϴ�.");
					System.out.println();
					kl = false;
					break;
				} else {
					o.ufr = 2;
					System.out.println("���˴밡 ����Ǿ����ϴ�.");
					System.out.println();
					kl = false;
				    break;
				}
			case 3:
				if(o.����ѳ��˴� == 0) {
					 System.out.println("�������� ���˴밡 �ƴմϴ�.");
					 System.out.println();
					 kl = false;
					 break;
				} else if(o.ufr == 3) {
					System.out.println("���� ��� ���� ���˴��Դϴ�.");
					System.out.println();
					kl = false;
					break;
				} else {
					o.ufr = 3;
					System.out.println("���˴밡 ����Ǿ����ϴ�.");
					System.out.println();
					kl = false;
				    break;
				}
			}
			
		}
		
	}
	
	public static void ��(Op o) {
		
		boolean ke = true;
		
		
		System.out.println("======�������� ��======");
		if(o.�⺻��>0) {
			System.out.println();
			System.out.print("�⺻��(������: "+o.�⺻��+")");
			if(o.uaf == 1) {
				System.out.println("-��� ��");
			} else {
				System.out.println();
			}
			System.out.println();
		}
		
		if(o.�����>0) {
			System.out.println();
			System.out.print("�����(������: "+o.�����+")");
			if(o.uaf == 2) {
				System.out.println("-��� ��");
			} else {
				System.out.println();
			}
			System.out.println();
		}
		
		if(o.�ź�����>0) {
			System.out.println();
			System.out.print("�ź�����(������: "+o.�ź�����+")");
			if(o.uaf == 3) {
				System.out.println("-��� ��");
			} else {
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("1.�� ����   2.�޴�");
			while(ke) {
				
				i = sc.nextInt();
				
				switch(i) {
				case 1:
					��ch(o);
					ke = false;
					break;
				case 2:
					ke = false;
					break;
				default:
					System.out.println("!1~2");
					break;
				}
			}
		}

	public static void ��ch(Op o) {
		boolean kl = true;
		
		System.out.println("1.�⺻��   2.�����   3.�ź�����");
		
		while(kl) {
			i = sc.nextInt();
			
			switch(i) {
			case 1: 
				if(o.�⺻�� == 0) {
					 System.out.println("�������� � �ƴմϴ�.");
					 System.out.println();
					 kl = false;
					 break;
				} else if(o.uaf == 1) {
					System.out.println("���� ��� ���� ���Դϴ�.");
					System.out.println();
					kl = false;
					break;
				} else {
					o.uaf = 1;
					System.out.println("� ����Ǿ����ϴ�.");
					System.out.println();
					kl = false;
				    break;
				}
			case 2:
				if(o.����� == 0) {
					 System.out.println("�������� � �ƴմϴ�.");
					 System.out.println();
					 kl = false;
					 break;
				} else if(o.uaf == 2) {
					System.out.println("���� ��� ���� ���Դϴ�.");
					System.out.println();
					kl = false;
					break;
				} else {
					o.uaf = 2;
					System.out.println("� ����Ǿ����ϴ�.");
					System.out.println();
					kl = false;
				    break;
				}
			case 3:
				if(o.�ź����� == 0) {
					 System.out.println("�������� � �ƴմϴ�.");
					 System.out.println();
					 kl = false;
					 break;
				} else if(o.uaf == 3) {
					System.out.println("���� ��� ���� ���Դϴ�.");
					System.out.println();
					kl = false;
					break;
				} else {
					o.uaf = 3;
					System.out.println("� ����Ǿ����ϴ�.");
					System.out.println();
					kl = false;
				    break;
				}
			}
			
		}
		
	}

	public static void �̳�(Op o) {
			
			boolean ke = true;
			
			System.out.println("======�������� �̳�======");
			if(o.����>0) {
				System.out.println();
				System.out.print("����(����: "+o.����+")");
				if(o.ub == 1) {
					System.out.println("-��� ��");
				} else {
					System.out.println();
				}
				System.out.println();
			}
			
			if(o.��������>0) {
				System.out.println();
				System.out.print("��������(����: "+o.��������+")");
				if(o.ub == 2) {
					System.out.println("-��� ��");
				} else {
					System.out.println();
				}
				System.out.println();
			}
			
			if(o.�ι�����>0) {
				System.out.println();
				System.out.print("�ι�����(����: "+o.�ι�����+")");
				if(o.ub == 3) {
					System.out.println("-��� ��");
				} else {
					System.out.println();
				}
				System.out.println();
			}
			
			System.out.println("1.�̳� ����   2.�޴�");
				while(ke) {
					
					i = sc.nextInt();
					
					switch(i) {
					case 1:
						�̳�ch(o);
						ke = false;
						break;
					case 2:
						ke = false;
						break;
					default:
						System.out.println("!1~2");
						break;
					}
				}
			}
	
		public static void �̳�ch(Op o) {
			boolean kl = true;
			
			System.out.println("0.�̳�����  1.����   2.��������   3.�ι�����");
			
			while(kl) {
				
				i = sc.nextInt();
				
				switch(i) {
				case 0: 
					if(o.ub == 0) {
						System.out.println("�̹� �̳��� ��� ���� �ƴմϴ�.");
					} else {
						o.ub = 0;
						System.out.println("�̳��� �����Ͽ����ϴ�.");
						kl = false;
					} break;
				case 1: 
					if(o.���� == 0) {
						 System.out.println("�������� �̳��� �ƴմϴ�.");
						 System.out.println();
						 kl = false;
						 break;
					} else if(o.ub == 1) {
						System.out.println("���� ��� ���� �̳��Դϴ�.");
						System.out.println();
						kl = false;
						break;
					} else {
						o.ub = 1;
						System.out.println("�̳��� ����Ǿ����ϴ�.");
						System.out.println();
						kl = false;					    
					} break;
				case 2:
					if(o.�������� == 0) {
						 System.out.println("�������� �̳��� �ƴմϴ�.");
						 System.out.println();
						 kl = false;
						 break;
					} else if(o.ub == 2) {
						System.out.println("���� ��� ���� �̳��Դϴ�.");
						System.out.println();
						kl = false;
						break;
					} else {
						o.ub = 2;
						System.out.println("�̳��� ����Ǿ����ϴ�.");
						System.out.println();
						kl = false;					    
					} break;
				case 3:
					if(o.�ι����� == 0) {
						 System.out.println("�������� �̳��� �ƴմϴ�.");
						 System.out.println();
						 kl = false;
						 break;
					} else if(o.ub == 3) {
						System.out.println("���� ��� ���� �̳��Դϴ�.");
						System.out.println();
						kl = false;
						break;
					} else {
						o.ub = 3;
						System.out.println("�̳��� ����Ǿ����ϴ�.");
						System.out.println();
						kl = false;	   
					} break;
				default:
					System.out.println("!0~3");
					break;	
				}
				
			}
			
		}	

}
package port2;

import java.util.*;

public class Shop {
	static Scanner sc = new Scanner(System.in);
	public void ����(Op o) {
		int ch;
		
		System.out.println("���������������ڡߡڦ�������������");
		System.out.println("��   1.���ô�    2.��   3.�̳�        ��");
		System.out.println("���������������ߡڡߦ�������������");
		while(true) {
			ch = sc.nextInt();
			if(ch<1 || ch>3) {
				System.out.println("!1~3");
			} else
				break;
		}
	
		switch(ch) {
		case 1: 
			����_���ô�(o);
			break;
		case 2:
			����_��(o);
			break;
		case 3:
			����_�̳�(o);
			break;
		}
		
	
	}

	private void ����_�̳�(Op o) {
		int i;
		int no;
		System.out.println("===============================");
		System.out.println("1. ����-5��");
		System.out.println();
		System.out.println("2. ��������-7��");
		System.out.println();
		System.out.println("3. �ι�����-12��");
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
				System.out.println("��� �����Ͻðڽ��ϱ�?");
				no = sc.nextInt();
				if(no < 1) {
					System.out.println("0���� ū ���� �Է��ϼ���.");
				} else {
					break;
				}
			}			
			if(no*5 > o.money) {
				System.out.println("���� �����մϴ�.");
			} else {
				o.���� += no;
				o.money -= no*5;
				System.out.println("���� "+ no+"���� �����Ͽ����ϴ�.");
				System.out.println("��: "+ (o.money+no*5)+" >>> " + o.money);
			} break;
		case 2:	
			while(true) {
				System.out.println("��� �����Ͻðڽ��ϱ�?");
				no = sc.nextInt();
				if(no < 1) {
					System.out.println("0���� ū ���� �Է��ϼ���.");
				} else {
					break;
				}
			}			
			if(no*7 > o.money) {
				System.out.println("���� �����մϴ�.");
			} else {
				o.�������� += no;
				o.money -= no*7;
				System.out.println("�������� "+ no+"������ �����Ͽ����ϴ�.");
				System.out.println("��: "+ (o.money+no*7)+" >>> " + o.money);
			} break;
		case 3:	
			while(true) {
				System.out.println("��� �����Ͻðڽ��ϱ�?");
				no = sc.nextInt();
				if(no < 1) {
					System.out.println("0���� ū ���� �Է��ϼ���.");
				} else {
					break;
				}
			}			
			if(no*12 > o.money) {
				System.out.println("���� �����մϴ�.");
			} else {
				o.�ι����� += no;
				o.money -= no*12;
				System.out.println("�ι����� "+ no+"������ �����Ͽ����ϴ�.");
				System.out.println("��: "+ (o.money+no*12)+" >>> " + o.money);
			} break;
		}
		
	}

	private void ����_��(Op o) {
		int i;
		System.out.println("===============================");
		System.out.println("1. �⺻��(������-10)-100��");
		System.out.println();
		System.out.println("2. �����(������-30)-500��");
		System.out.println();
		System.out.println("3. �ź�����(������-50)-900��");
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
			if(o.�⺻��>0) {
				System.out.println("�̹� ���� ���� ���Դϴ�.");
			} else if(o.money < 100) {
				System.out.println("���� �����մϴ�.");
			} else {
				System.out.println("�⺻� �����Ͽ����ϴ�.");
				System.out.println("��: " + o.money + ">>>" +(o.money-100));		
				o.money -= 100;
				o.�⺻�� = 10;
			}	break;
		case 2:	
			if(o.�����>0) {
				System.out.println("�̹� ���� ���� ���Դϴ�.");
			} else if(o.money < 500) {
				System.out.println("���� �����մϴ�.");
			} else {
				System.out.println("���� �����Ͽ����ϴ�.");
				System.out.println("��: " + o.money + ">>>" +(o.money-500));		
				o.money -= 500;
				o.����� = 30;
			}	break;
		case 3:	
			if(o.�ź�����>0) {
				System.out.println("�̹� ���� ���� ���Դϴ�..");
			} else if(o.money < 900) {
				System.out.println("���� �����մϴ�.");
			} else {
				System.out.println("�ź����� �����Ͽ����ϴ�.");
				System.out.println("��: " + o.money + ">>>" +(o.money-900));		
				o.money -= 900;
				o.�ź����� = 50;
			}	break;
		}
		
	}

	private void ����_���ô�(Op o) {
		int i;
		System.out.println("===============================");
		System.out.println("1. �⺻���˴�(������-10)-100��");
		System.out.println();
		System.out.println("2. ��޳��˴�(������-30)-400��");
		System.out.println();
		System.out.println("3. ����ѳ��˴�(������-50)-700��");
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
			if(o.�⺻���˴�>0) {
				System.out.println("�̹� ���� ���� ���˴��Դϴ�.");
			} else if(o.money < 100) {
				System.out.println("���� �����մϴ�.");
			} else {
				System.out.println("�⺻���˴븦 �����Ͽ����ϴ�.");
				System.out.println("��: " + o.money + ">>>" +(o.money-100));				o.money -= 100;
				o.�⺻���˴� = 10;
			}	break;
		case 2:	
			if(o.��޳��˴�>0) {
				System.out.println("�̹� ���� ���� ���˴��Դϴ�.");
			} else if(o.money < 400) {
				System.out.println("���� �����մϴ�.");
			} else {
				System.out.println("��޳��˴븦 �����Ͽ����ϴ�.");
				System.out.println("��: " + o.money + ">>>" +(o.money-400));		
				o.money -= 400;
				o.��޳��˴� = 30;
			}	break;
		case 3:	
			if(o.����ѳ��˴�>0) {
				System.out.println("�̹� ���� ���� ���˴��Դϴ�.");
			} else if(o.money < 700) {
				System.out.println("���� �����մϴ�.");
			} else {
				System.out.println("����ѳ��˴븦 �����Ͽ����ϴ�.");
				System.out.println("��: " + o.money + ">>>" +(o.money-700));		
				o.money -= 700;
				o.����ѳ��˴� = 50;
			}	break;
		}
	}
		
	
	public void �Ǹ�(Op o) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Ǹ��� �����");
		System.out.print("������");
		
		String l = sc.nextLine();
		int i;
		
		switch(l) {
		case "�������۾�":
			if(o.�������۾�>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�������۾�) {
					System.out.println("�������۾� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�������۾� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�������۾� -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�������۾ �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "����":
			if(o.����>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.����) {
					System.out.println("���� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("���� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.���� -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("��� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�׾�":
			if(o.�׾�>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�׾�) {
					System.out.println("�׾� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�׾� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�׾� -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�׾ �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�ؾ�":
			if(o.�ؾ�>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�ؾ�) {
					System.out.println("�ؾ� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�ؾ� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�ؾ� -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�ؾ �����ϰ� ���� �ʽ��ϴ�.");
			} break;	
		case "�ݺؾ�":
			if(o.�ݺؾ�>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�ݺؾ�) {
					System.out.println("�ݺؾ� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�ݺؾ� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�ݺؾ� -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�ݺؾ �����ϰ� ���� �ʽ��ϴ�.");
			} break;	
		case "���":
			if(o.���>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.���) {
					System.out.println("��� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("��� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.��� -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("����� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�ۻ縮":
			if(o.�ۻ縮>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�ۻ縮) {
					System.out.println("�ۻ縮 "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�ۻ縮 "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�ۻ縮 -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�ۻ縮�� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�ξ�":
			if(o.�ξ�>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�ξ�) {
					System.out.println("�ξ� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�ξ� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�ξ� -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�ξ �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�Ƕ��":
			if(o.�Ƕ��>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�Ƕ��) {
					System.out.println("�Ƕ�� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�Ƕ�� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�Ƕ�� -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�Ƕ�ĸ� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "���ð��":
			if(o.���ð��>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.���ð��) {
					System.out.println("���ð�� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("���ð�� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.���ð�� -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("���ð�⸦ �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "��":
			if(o.��>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.��) {
					System.out.println("�� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�� -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("���� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "��¡��":
			if(o.��¡��>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.��¡��) {
					System.out.println("��¡�� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("��¡�� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.��¡�� -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("��¡� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "��ġ":
			if(o.��ġ>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.��ġ) {
					System.out.println("��ġ "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("��ġ "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.��ġ -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("��ġ�� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "��ġ":
			if(o.��ġ>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.��ġ) {
					System.out.println("��ġ "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("��ġ "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.��ġ -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("��ġ�� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "��ġ":
			if(o.��ġ>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.��ġ) {
					System.out.println("��ġ "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("��ġ "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.��ġ -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("��ġ �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "��ġ":
			if(o.��ġ>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.��ġ) {
					System.out.println("��ġ "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("��ġ "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.��ġ -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("��ġ�� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "���":
			if(o.���>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.���) {
					System.out.println("��� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("��� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.��� -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�ڰ�ġ":
			if(o.�ڰ�ġ>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�ڰ�ġ) {
					System.out.println("�ڰ�ġ "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�ڰ�ġ "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�ڰ�ġ -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�ڰ�ġ�� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "��ġ":
			if(o.��ġ>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.��ġ) {
					System.out.println("��ġ "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("��ġ "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.��ġ -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("��ġ�� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�۾�":
			if(o.�۾�>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�۾�) {
					System.out.println("�۾� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�۾� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�۾� -= i;
					o.money += 15;
					System.out.println();
					System.out.println("������ ��: "+(o.money-15)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�۾ �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "����":
			if(o.����>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.����) {
					System.out.println("���� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("���� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.���� -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("��� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "��ġ":
			if(o.��ġ>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.��ġ) {
					System.out.println("��ġ "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("��ġ "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.��ġ -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("��ġ�� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "����ġ":
			if(o.����ġ>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.����ġ) {
					System.out.println("����ġ "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("����ġ "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.����ġ -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("����ġ�� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "û��ġ":
			if(o.û��ġ>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.û��ġ) {
					System.out.println("û��ġ "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("û��ġ "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.û��ġ -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("û��ġ�� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "���":
			if(o.���>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.���) {
					System.out.println("��� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("��� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.��� -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("û��ġ�� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�ޱ�":
			if(o.�ޱ�>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�ޱ�) {
					System.out.println("�ޱ� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�ޱ� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�ޱ� -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�ޱ⸦ �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "���鰳":
			if(o.���鰳>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.���鰳) {
					System.out.println("���鰳 "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("���鰳 "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.���鰳 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("���鰳�� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�췰":
			if(o.�췰>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�췰) {
					System.out.println("�췰 "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�췰 "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�췰 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�췰�� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "���÷���":
			if(o.���÷���>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.���÷���) {
					System.out.println("���÷���"+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("���÷��� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.���÷��� -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("���÷��̸� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "���Ⱑ����":
			if(o.���Ⱑ����>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.���Ⱑ����) {
					System.out.println("���Ⱑ����"+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("���Ⱑ���� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.���Ⱑ���� -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("���Ⱑ������ �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "���մ�":
			if(o.���մ�>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.���մ�) {
					System.out.println("���մ� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("���մ�"+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.���մ� -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("���մ��� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�Ұ��縮":
			if(o.�Ұ��縮>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�Ұ��縮) {
					System.out.println("�Ұ��縮 "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�Ұ��縮"+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�Ұ��縮 -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�Ұ��縮�� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�̲ٶ���":
			if(o.�̲ٶ���>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�̲ٶ���) {
					System.out.println("�̲ٶ��� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�̲ٶ��� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�ޱ� -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�̲ٶ����� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�����":
			if(o.�����>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�����) {
					System.out.println("����� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�����"+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.����� -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("����⸦ �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "���ĸ�":
			if(o.���ĸ�>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.���ĸ�) {
					System.out.println("���ĸ� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("���ĸ� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.���ĸ� -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("���ĸ��� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "���":
			if(o.���>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.���) {
					System.out.println("��� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("��� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.��� -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("��Ը� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "������":
			if(o.������>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.������) {
					System.out.println("������ "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("������ "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.������ -= i;
					o.money += 40;
					System.out.println();
					System.out.println("������ ��: "+(o.money-40)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�������� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "����":
			if(o.����>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.����) {
					System.out.println("���� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("���� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.���� -= i;
					o.money += 100;
					System.out.println();
					System.out.println("������ ��: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("������ �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "����":
			if(o.����>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.����) {
					System.out.println("���� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("���� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.���� -= i;
					o.money += 100;
					System.out.println();
					System.out.println("������ ��: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("��� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "����":
			if(o.����>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.����) {
					System.out.println("���� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("���� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.���� -= i;
					o.money += 100;
					System.out.println();
					System.out.println("������ ��: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("������ �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�����":
			if(o.�����>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�����) {
					System.out.println("����� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("����� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.����� -= i;
					o.money += 100;
					System.out.println();
					System.out.println("������ ��: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("���� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�ʷվƱ�":
			if(o.�ʷվƱ�>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�ʷվƱ�) {
					System.out.println("�ʷվƱ� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�ʷվƱ� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�ʷվƱ� -= i;
					o.money += 100;
					System.out.println();
					System.out.println("������ ��: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�ʷվƱ͸� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�Ǿ�":
			if(o.�Ǿ�>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�Ǿ�) {
					System.out.println("�Ǿ� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�Ǿ� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�Ǿ� -= i;
					o.money += 100;
					System.out.println();
					System.out.println("������ ��: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�Ǿ �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "��Ȧ��Ʋ":
			if(o.��Ȧ��Ʋ>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.��Ȧ��Ʋ) {
					System.out.println("��Ȧ��Ʋ "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("��Ȧ��Ʋ "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.��Ȧ��Ʋ -= i;
					o.money += 100;
					System.out.println();
					System.out.println("������ ��: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("��Ȧ��Ʋ�� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�򵿰���":
			if(o.�򵿰���>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�򵿰���) {
					System.out.println("��հ��� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("��հ��� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�򵿰��� -= i;
					o.money += 100;
					System.out.println();
					System.out.println("������ ��: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("��հ����� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "����ǽ�":
			if(o.����ǽ�>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.����ǽ�) {
					System.out.println("����ǽ� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("����ǽ� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.����ǽ� -= i;
					o.money += 100;
					System.out.println();
					System.out.println("������ ��: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("����ǽ��� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "ŷũ��":
			if(o.ŷũ��>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.ŷũ��) {
					System.out.println("ŷũ�� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("ŷũ�� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.ŷũ�� -= i;
					o.money += 100;
					System.out.println();
					System.out.println("������ ��: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("ŷũ���� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "����׾�":
			if(o.����׾�>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.����׾�) {
					System.out.println("����׾� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("����׾� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.����׾� -= i;
					o.money += 100;
					System.out.println();
					System.out.println("������ ��: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("����׾ �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "Ȳ�Ұ�����":
			if(o.Ȳ�Ұ�����>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.Ȳ�Ұ�����) {
					System.out.println("Ȳ�Ұ����� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("Ȳ�Ұ����� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.Ȳ�Ұ����� -= i;
					o.money += 100;
					System.out.println();
					System.out.println("������ ��: "+(o.money-100)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("Ȳ�Ұ������� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�ް��ε�":
			if(o.�ް��ε�>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�ް��ε�) {
					System.out.println("�ް��ε� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�ް��ε� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�ް��ε� -= i;
					o.money += 200;
					System.out.println();
					System.out.println("������ ��: "+(o.money-200)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�ް��ε��� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�������":
			if(o.�������>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�������) {
					System.out.println("�������"+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("������� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.������� -= i;
					o.money += 200;
					System.out.println();
					System.out.println("������ ��: "+(o.money-200)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("��������� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "ũ����":
			if(o.ũ����>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.ũ����) {
					System.out.println("ũ����"+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("ũ���� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.ũ���� -= i;
					o.money += 200;
					System.out.println();
					System.out.println("������ ��: "+(o.money-200)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("ũ������ �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "���Ƹ�":
			if(o.���Ƹ�>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.���Ƹ�) {
					System.out.println("���Ƹ� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("���Ƹ� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.���Ƹ� -= i;
					o.money += 200;
					System.out.println();
					System.out.println("������ ��: "+(o.money-200)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("���Ƹ��� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�÷��ÿ���츣��":
			if(o.�÷��ÿ���츣��>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�÷��ÿ���츣��) {
					System.out.println("�÷��ÿ���츣�� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�÷��ÿ���츣�� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�÷��ÿ���츣�� -= i;
					o.money += 400;
					System.out.println();
					System.out.println("������ ��: "+(o.money-400)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�÷��ÿ���츣���� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "��Ƽ����츣��":
			if(o.��Ƽ����츣��>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.��Ƽ����츣��) {
					System.out.println("��Ƽ����츣�� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("��Ƽ����츣�� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.��Ƽ����츣�� -= i;
					o.money += 400;
					System.out.println();
					System.out.println("������ ��: "+(o.money-400)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("��Ƽ����츣���� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�Ƴ븻��ī����":
			if(o.�Ƴ븻��ī����>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�Ƴ븻��ī����) {
					System.out.println("�Ƴ븻��ī���� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�Ƴ븻��ī���� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�Ƴ븻��ī���� -= i;
					o.money += 400;
					System.out.println();
					System.out.println("������ ��: "+(o.money-400)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�Ƴ븻��ī������ �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�￱��":
			if(o.�￱��>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�￱��) {
					System.out.println("�￱�� "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�￱�� "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�￱�� -= i;
					o.money += 400;
					System.out.println();
					System.out.println("������ ��: "+(o.money-400)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�￱���� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		case "�����̷��׷罺":
			if(o.�����̷��׷罺>0) {
				System.out.println("�� ������ �Ǹ��Ͻðڽ��ϱ�?");
				i = sc.nextInt();
				if(i<o.�����̷��׷罺) {
					System.out.println("�����̷��׷罺 "+i+"������ ���� ���� �ƴմϴ�.");
				} else {
					System.out.println("�����̷��׷罺 "+i+"������ �Ǹ��Ͽ����ϴ�.");
					o.�����̷��׷罺 -= i;
					o.money += 400;
					System.out.println();
					System.out.println("������ ��: "+(o.money-400)+" >>> "+ o.money);
					System.out.println();
				}
			} else {
				System.out.println("�����̷��׷罺�� �����ϰ� ���� �ʽ��ϴ�.");
			} break;
		default :
			System.out.println(l+"��� ������ �����ϰ� ���� �ʽ��ϴ�.");
			break;
		} 	
	}
	
}

package port2;

import java.util.*;

public class Fish {
	static Random r = new Random();
	static int pro;
	static double size;
	static String fh;
	���� ���� = new ����();
		
	public void ��(Op o) {
		switch(o.MAP) {
		case 1: 
			ȣ��_�����(o);
			break;
		case 2: 
			��_�����(o);
			break;
		case 3:
			������_�����(o);
			break;
		case 4:
			�ٴ�_�����(o);
			break;
		case 5:
			����_�����(o);
			break;
		case 6:
			���_�����(o);
			break;
		}
	}
	
	private void ���_�����(Op o) {
		pro = Math.abs(r.nextInt(10000)+1);
		
		if(pro<=9200) {
			System.out.println("�ƹ��͵� ������ �ʾҴ�...");
		} else if(pro<=9300){
			fh = "�ϸ���Ʈ";
			���_ũ��("�ϸ���Ʈ", o);
		} else if(pro<=9400){
			fh = "�Ƿ�ĵ��";
			����_ũ��("�Ƿ�ĵ��", o);
		} else if(pro<=9500){
			fh = "�����罺";
			����_ũ��("�����罺", o);
		} else if(pro<=9600){
			fh = "�÷��ÿ���츣��";
			����_ũ��("�÷��ÿ���츣��", o);
		} else if(pro<=9700){
			fh = "��Ƽ����츣��";
			����_ũ��("��Ƽ����츣��", o);
		} else if(pro<=9800){
			fh = "�Ƴ븻��ī����";
			����_ũ��("�Ƴ븻��ī����", o);
		} else if(pro<=9900){
			fh = "�￱��";
			����_ũ��("�￱��", o);
		} else {
			fh = "�����̷��׷罺";
			����_ũ��("�����̷��׷罺", o);
		}
	}

	private void ���_ũ��(String kd, Op o) {
		double b = 0;
		Random r = new Random();
		switch(kd) {
			case "�ϸ���Ʈ":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(50)+1);
				}
				size = Math.abs(r.nextDouble(180)+20+b);
				o.�ϸ���Ʈ++;
				o.����ũ��++;			
				System.out.print("�ϸ���Ʈ(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�ϸ���Ʈ) {
					o.�ϸ���Ʈs = size;
					System.out.println("�ڽű��");
				}
				����ġ���(o);
				break;
			case "�Ƿ�ĵ��":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(40)+1);
				}
				size = Math.abs(r.nextDouble(150)+40+b);
				o.�Ƿ�ĵ��++;
				o.����ũ��++;
				System.out.print("�Ƿ�ĵ��(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�Ƿ�ĵ��s) {
					o.�Ƿ�ĵ��s = size;
					System.out.println("�ڽű��");
				}
				����ġ���(o);
				break;
			case "�����罺":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(150)+1);
				}
				size = Math.abs(r.nextDouble(300)+900+b);				
				o.�����罺++;
				o.����ũ��++;
				System.out.print("�����罺(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�����罺s) {
					o.�����罺s = size;
					System.out.println("�ڽű��");
				}
				����ġ���(o);
				break;	
			case "�÷��ÿ���츣��":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(100)+1);
				}
				size = Math.abs(r.nextDouble(200)+300+b);
				o.�÷��ÿ���츣��++;
				o.����ũ��++;
				System.out.print("�÷��ÿ���츣��(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�÷��ÿ���츣��s) {
					o.�÷��ÿ���츣��s = size;
					System.out.println("�ڽű��");
				}
				����ġ���(o);
				break;	
			case "��Ƽ����츣��":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(100)+1);
				}
				size = Math.abs(r.nextDouble(100)+200+b);
				o.��Ƽ����츣��++;
				o.����ũ��++;
				System.out.print("��Ƽ����츣��(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.��Ƽ����츣��s) {
					o.��Ƽ����츣��s = size;
					System.out.println("�ڽű��");
				}
				����ġ���(o);
				break;	
			case "�Ƴ븻��ī����":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				size = Math.abs(r.nextDouble(40)+20+b);
				o.�Ƴ븻��ī����++;
				o.����ũ��++;
				System.out.print("�Ƴ븻��ī����(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�Ƴ븻��ī����s) {
					o.�Ƴ븻��ī����s = size;
					System.out.println("�ڽű��");
				}
				����ġ���(o);
				break;	
			case "�￱��":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(72)+b);
				o.�￱��++;
				o.����ũ��++;
				System.out.print("�￱��");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�￱��s) {
					o.�￱��s = size;
					System.out.println("�ڽű��");
				}
				����ġ���(o);
				break;	
			case "�����̷��׷罺":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(70)+1);
				}
				size = Math.abs(r.nextDouble(100)+150+b);
				o.�����̷��׷罺++;
				o.����ũ��++;
				System.out.print("�����̷��׷罺(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�����̷��׷罺s) {
					o.�����̷��׷罺s = size;
					System.out.println("�ڽű��");
				}
				����ġ���(o);
				break;			
		}
		����.LV_UP(o);
		���˴�ch(o);
		��ch(o);
		�̳�ch(o);
	}

	private void ����_�����(Op o) {
		pro = Math.abs(r.nextInt(10000)+1);
		
		if(pro<=1500) {
			fh = "�갥ġ";
			����_ũ��("�갥ġ", o);
		} else if(pro<=3000){
			fh = "����ġ��";
			����_ũ��("����ġ��", o);
		} else if(pro<=4500){
			fh = "�߱���¡��";
			����_ũ��("�߱���¡��", o);
		} else if(pro<=6000){
			fh = "���ΰ�";
			����_ũ��("���ΰ�", o);
		} else if(pro<=6500){
			fh = "���÷���";
			����_ũ��("���÷���", o);
		} else if(pro<=7000){
			fh = "�������ط�";
			����_ũ��("�������ط�", o);
		} else if(pro<=7500){
			fh = "�������";
			����_ũ��("�������", o);
		} else if(pro<=8000){
			fh = "���ĸ�";
			����_ũ��("���ĸ�", o);
		} else if(pro<=8500){
			fh = "���Ⱑ����";
			����_ũ��("���Ⱑ����", o);
		} else if(pro<=8700){
			fh = "���ؾ�ġ";
			����_ũ��("���ؾ�ġ", o);
		} else if(pro<=8900){
			fh = "���ؾƱ�";
			����_ũ��("���ؾƱ�", o);
		} else if(pro<=9100){
			fh = "�Ӹ������";
			����_ũ��("�Ӹ������", o);
		} else if(pro<=9300) {
			fh = "��üƮ�ǽ�";
			����_ũ��("��üƮ�ǽ�", o);
		} else if(pro<=9500) {
			fh = "����ǽ�";
			����_ũ��("����ǽ�", o);
		} else if(pro<=9700) {
			fh = "�ʷվƱ�";
			����_ũ��("�ʷվƱ�", o);
		} else if(pro<=9850) {
			fh = "ũ����";
			����_ũ��("ũ����", o);
		} else {
			fh = "������";
			����_ũ��("������", o);
		}
	}

	private void ����_ũ��(String kd, Op o) {
		double b = 0;
		Random r = new Random();
		switch(kd) {
			case "�갥ġ":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(300)+1);
				}
				size = Math.abs(r.nextDouble(1000)+500+b);
				o.�갥ġ++;
				o.����ũ��++;			
				System.out.print("�갥ġ(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�갥ġs) {
					o.�갥ġs = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;
			case "����ġ��":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(50)+1);
				}
				size = Math.abs(r.nextDouble(100)+150+b);
				o.����ġ��++;
				o.����ũ��++;
				System.out.print("����ġ��(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.����ġ��s) {
					o.����ġ��s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;
			case "���ΰ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(15)+30+b);				
				o.���ΰ�++;
				o.����ũ��++;
				System.out.print("���ΰ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.���ΰ�s) {
					o.���ΰ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "�߱���¡��":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(10)+20+b);
				o.�߱���¡��++;
				o.����ũ��++;
				System.out.print("�߱���¡��(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�߱���¡��s) {
					o.�߱���¡��s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "���÷���":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(100)+50);
				}
				size = Math.abs(r.nextDouble(100)+700+b);
				o.���÷���++;
				o.����ũ��++;
				System.out.print("���÷���(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.���÷���s) {
					o.���÷���s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "�������ط�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(14)+20+b);
				o.�������ط�++;
				o.����ũ��++;
				System.out.print("�������ط�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�������ط�s) {
					o.�������ط�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "�������":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(30)+1);
				}
				size = Math.abs(r.nextDouble(40)+90+b);
				o.�������++;
				o.����ũ��++;
				System.out.print("�������(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�������s) {
					o.�������s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "���ĸ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(7)+1);
				}
				size = Math.abs(r.nextDouble(15)+5+b);
				o.���ĸ�++;
				o.����ũ��++;
				System.out.print("���ĸ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.���ĸ�s) {
					o.���ĸ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;			
			case "���Ⱑ����":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(20)+30+b);
				o.���Ⱑ����++;
				o.����ũ��++;
				System.out.print("���Ⱑ����(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.���Ⱑ����s) {
					o.���Ⱑ����s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;
			case "���ؾ�ġ":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				size = Math.abs(r.nextDouble(50)+50+b);
				o.���ؾ�ġ++;
				o.����ũ��++;
				System.out.print("���ؾ�ġ(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.���ؾ�ġs) {
					o.���ؾ�ġs = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;			
			case "���ؾƱ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(50)+1);
				}
				size = Math.abs(r.nextDouble(380)+20+b);
				o.���ؾƱ�++;
				o.����ũ��++;
				System.out.print("���ؾƱ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.���ؾƱ�s) {
					o.���ؾƱ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;			
			case "�Ӹ������":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				o.�Ӹ������++;
				o.����ũ��++;	
				size = Math.abs(r.nextDouble(50)+50+b);
				System.out.print("�Ӹ������(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�Ӹ������s) {
					o.�Ӹ������s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "��üƮ�ǽ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(2)+1);
				}
				o.��üƮ�ǽ�++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(2)+3+b);
				System.out.print("��üƮ�ǽ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.��üƮ�ǽ�s) {
					o.��üƮ�ǽ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;		
			case "����ǽ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				o.����ǽ�++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(5)+30+b);
				System.out.print("����ǽ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.����ǽ�s) {
					o.����ǽ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;		
			case "�ʷվƱ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				o.�ʷվƱ�++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(15)+50+b);
				System.out.print("�ʷվƱ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�ʷվƱ�s) {
					o.�ʷվƱ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;		
			case "ũ����":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(1000)+1);
				}
				o.ũ����++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(2000)+1500+b);
				System.out.print("ũ����(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.ũ����) {
					o.����s = size;
					System.out.println("�ڽű��");
				}
				����ġ����(o);
				break;		
			case "������":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(300)+1);
				}
				o.������++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(300)+1500+b);
				System.out.print("������(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.������s) {
					o.������s = size;
					System.out.println("�ڽű��");
				}
				����ġ����(o);
				break;		
		}
		����.LV_UP(o);
		���˴�ch(o);
		��ch(o);
		�̳�ch(o);
	}

	private void �ٴ�_�����(Op o) {
		pro = Math.abs(r.nextInt(10000)+1);
		
		if(pro<=1000) {
			fh = "��¡��";
			�ٴ�_ũ��("��¡��", o);
		} else if(pro<=2000){
			fh = "��ġ";
			�ٴ�_ũ��("��ġ", o);
		} else if(pro<=3000){
			fh = "��ġ";
			�ٴ�_ũ��("��ġ", o);
		} else if(pro<=4000){
			fh = "��ġ";
			�ٴ�_ũ��("��ġ", o);
		} else if(pro<=5000){
			fh = "��ġ";
			�ٴ�_ũ��("��ġ", o);
		} else if(pro<=6000){
			fh = "���";
			�ٴ�_ũ��("���", o);
		} else if(pro<=7000){
			fh = "��";
			�ٴ�_ũ��("��", o);
		} else if(pro<=7300){
			fh = "�췰";
			�ٴ�_ũ��("�췰", o);
		} else if(pro<=7600){
			fh = "��ġ";
			�ٴ�_ũ��("��ġ", o);
		} else if(pro<=7900){
			fh = "�Ұ��縮";
			�ٴ�_ũ��("�Ұ��縮", o);
		} else if(pro<=8200){
			fh = "û��ġ";
			�ٴ�_ũ��("û��ġ", o);
		} else if(pro<=8500){
			fh = "���÷���";
			�ٴ�_ũ��("���÷���", o);
		} else if(pro<=8800) {
			fh = "����";
			�ٴ�_ũ��("����", o);
		} else if(pro<=9100) {
			fh = "����ġ";
			�ٴ�_ũ��("����ġ", o);
		} else if(pro<=9250) {
			fh = "�����";
			�ٴ�_ũ��("�����", o);
		} else if(pro<=9400) {
			fh = "����";
			�ٴ�_ũ��("����", o);
		}  else if(pro<=9550) {
			fh = "����";
			�ٴ�_ũ��("����", o);
		}  else if(pro<=9700) {
			fh = "����";
			�ٴ�_ũ��("����", o);
		}  else if(pro<=9850) {
			fh = "�������";
			�ٴ�_ũ��("�������", o);
		} else {
			fh = "�ް��ε�";
			�ٴ�_ũ��("�ް��ε�", o);
		}
	}

	private void �ٴ�_ũ��(String kd, Op o) {
		double b = 0;
		Random r = new Random();
		switch(kd) {
			case "��¡��":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				size = Math.abs(r.nextDouble(12)+14+b);
				o.��¡��++;
				o.����ũ��++;			
				System.out.print("��¡��(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.��¡��s) {
					o.��¡��s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;
			case "��ġ":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(4)+18+b);
				o.��ġ++;
				o.����ũ��++;
				System.out.print("��ġ(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.��ġs) {
					o.���ð��s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;
			case "��ġ":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(2)+1);
				}
				size = Math.abs(r.nextDouble(3)+1+b);				
				o.��ġ++;
				o.����ũ��++;
				System.out.print("��ġ(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.��ġs) {
					o.��ġs = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "��ġ":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(23)+20+b);
				o.��ġ++;
				o.����ũ��++;
				System.out.print("��ġ(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.��ġs) {
					o.��ġs = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "��ġ":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(10)+30+b);
				o.��ġ++;
				o.����ũ��++;
				System.out.print("��ġ(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.��ġs) {
					o.��ġs = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "���":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(15)+1);
				}
				size = Math.abs(r.nextDouble(35)+30+b);
				o.���++;
				o.����ũ��++;
				System.out.print("���(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.���s) {
					o.���s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "��":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(20)+10);
				o.��++;
				o.����ũ��++;
				System.out.print("��(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.��s) {
					o.��s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "�췰":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(15)+1);
				}
				size = Math.abs(r.nextDouble(50)+25+b);
				o.�췰++;
				o.����ũ��++;
				System.out.print("�췰(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�췰s) {
					o.�췰s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;			
			case "��ġ":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(50)+1);
				}
				size = Math.abs(r.nextDouble(250)+50+b);
				o.��ġ++;
				o.����ũ��++;
				System.out.print("��ġ(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.��ġs) {
					o.��ġs = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;
			case "�Ұ��縮":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(30)+25+b);
				o.�Ұ��縮++;
				o.����ũ��++;
				System.out.print("���մ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�Ұ��縮s) {
					o.�Ұ��縮s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;			
			case "û��ġ":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(100)+1);
				}
				size = Math.abs(r.nextDouble(350)+350+b);
				o.û��ġ++;
				o.����ũ��++;
				System.out.print("û��ġ(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.û��ġs) {
					o.û��ġs = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;			
			case "���÷���":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(100)+1);
				}
				o.���÷���++;
				o.����ũ��++;	
				size = Math.abs(r.nextDouble(200)+500+b);
				System.out.print("���÷���(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.���÷���s) {
					o.���÷���s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "����":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				o.����++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(10)+30+b);
				System.out.print("����(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.����s) {
					o.����s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;		
			case "����ġ":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(40)+1);
				}
				o.����ġ++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(100)+100+b);
				System.out.print("����ġ(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.����ġs) {
					o.����ġs = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;		
			case "�����":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(150)+1);
				}
				o.�����++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(540)+500+b);
				System.out.print("�����(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�����s) {
					o.�����s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;		
			case "����":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(50)+1);
				}
				o.����++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(100)+200+b);
				System.out.print("����(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.����s) {
					o.����s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;		
			case "����":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(150)+1);
				}
				o.����++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(200)+600+b);
				System.out.print("����(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.����s) {
					o.����s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;		
			case "����":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(50)+1);
				}
				o.����++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(50)+150+b);
				System.out.print("����(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.����s) {
					o.����s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;
			case "�������":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(300)+150);
				}
				o.�������++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(200)+2200+b);
				System.out.print("�� ���� ��(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�������s) {
					o.�������s = size;
					System.out.println("�ڽű��");
				}
				����ġ����(o);
				break;
			case "�ް��ε�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(250)+100);
				}
				o.�ް��ε�++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(500)+1500+b);
				System.out.print("�ް��ε�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�ް��ε�s) {
					o.�ް��ε�s = size;
					System.out.println("�ڽű��");
				}
				����ġ����(o);
				break;
		}
		����.LV_UP(o);
		���˴�ch(o);
		��ch(o);
		�̳�ch(o);
	}

	private void ������_�����(Op o) {
		pro = Math.abs(r.nextInt(10000)+1);
		
		if(pro<=1000) {
			fh = "�Ƕ��";
			������_ũ��("�Ƕ��", o);
		} else if(pro<=2000){
			fh = "���ð��";
			������_ũ��("���ð��", o);
		} else if(pro<=3000){
			fh = "�׾�";
			������_ũ��("�׾�", o);
		} else if(pro<=4000){
			fh = "�ؾ�";
			������_ũ��("�ؾ�", o);
		} else if(pro<=5000){
			fh = "�ۻ縮";
			������_ũ��("�ۻ縮", o);
		} else if(pro<=6000){
			fh = "����ġ";
			������_ũ��("����ġ", o);
		} else if(pro<=7000){
			fh = "ū�Թ轺";
			������_ũ��("ū�Թ轺", o);
		} else if(pro<=7440){
			fh = "û������";
			������_ũ��("û������", o);
		} else if(pro<=7880){
			fh = "�����";
			������_ũ��("�����", o);
		} else if(pro<=8320){
			fh = "���մ�";
			������_ũ��("���մ�", o);
		} else if(pro<=8760){
			fh = "���";
			������_ũ��("���", o);
		} else if(pro<=9200){
			fh = "�ޱ�";
			������_ũ��("�ޱ�", o);
		} else if(pro<=9350) {
			fh = "Ȳ�Ұ�����";
			������_ũ��("Ȳ�Ұ�����", o);
		} else if(pro<=9500) {
			fh = "�ڶ�";
			������_ũ��("�ڶ�", o);
		} else if(pro<=9650) {
			fh = "�����";
			������_ũ��("�����", o);
		} else if(pro<=9800) {
			fh = "����ؾ�";
			������_ũ��("����ؾ�", o);
		} else {
			fh = "�Ǿ�";
			������_ũ��("�Ǿ�", o);
		}
	}

	private void ��_�����(Op o) {
		pro = Math.abs(r.nextInt(10000)+1);
		
		if(pro<=875) {
			fh = "�ۻ縮";
			��_ũ��("�ۻ縮", o);
		} else if(pro<=1750){
			fh = "�ξ�";
			��_ũ��("�ξ�", o);
		} else if(pro<=2625){
			fh = "�������۾�";
			��_ũ��("�������۾�", o);
		} else if(pro<=3500){
			fh = "����";
			��_ũ��("����", o);
		} else if(pro<=4375){
			fh = "�Ƕ��";
			��_ũ��("�Ƕ��", o);
		} else if(pro<=5250){
			fh = "�׾�";
			��_ũ��("�׾�", o);
		} else if(pro<=6125){
			fh = "�ؾ�";
			��_ũ��("�ؾ�", o);
		} else if(pro<=7000){
			fh = "���ð��";
			��_ũ��("���ð��", o);
		} else if(pro<=7800){
			fh = "�̲ٶ���";
			��_ũ��("�̲ٶ���", o);
		} else if(pro<=8600){
			fh = "���";
			��_ũ��("���", o);
		} else if(pro<=9400){
			fh = "�ޱ�";
			��_ũ��("�ޱ�", o);
		} else if(pro<=9600){
			fh = "����׾�";
			��_ũ��("����׾�", o);
		} else if(pro<=9800) {
			fh = "��Ȧ��Ʋ";
			��_ũ��("��Ȧ��Ʋ", o);
		} else {
			fh = "�򵿰���";
			��_ũ��("�򵿰���", o);
		}
	}
	
	private void ������_ũ��(String kd, Op o) {
		double b = 0;
		Random r = new Random();
		switch(kd) {
			case "�Ƕ��":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				size = Math.abs(r.nextDouble(13)+14+b);
				o.�Ƕ��++;
				o.����ũ��++;			
				System.out.print("�Ƕ��(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�Ƕ��s) {
					o.�Ƕ��s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;
			case "���ð��":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(3)+1);
				}
				size = Math.abs(r.nextDouble(5)+3+b);
				o.���ð��++;
				o.����ũ��++;
				System.out.print("���ð��(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.���ð��s) {
					o.���ð��s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;
			case "�׾�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+5);
				}
				size = Math.abs(r.nextDouble(75)+30+b);				
				o.�׾�++;
				o.����ũ��++;
				System.out.print("�׾�");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�׾�) {
					o.�׾�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "�ؾ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(23)+20+b);
				o.�ؾ�++;
				o.����ũ��++;
				System.out.print("�ؾ�");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�ؾ�s) {
					o.�ؾ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "�ۻ縮":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(2)+1);
				}
				size = Math.abs(r.nextDouble(2)+2+b);
				o.�ۻ縮++;
				o.����ũ��++;
				System.out.print("�ۻ縮(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�ۻ縮s) {
					o.�ۻ縮s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "����ġ":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				size = Math.abs(r.nextDouble(50)+50+b);
				o.����ġ++;
				o.����ũ��++;
				System.out.print("����ġ(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.����ġs) {
					o.����ġs = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "ū�Թ轺":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+2);
				}
				size = Math.abs(r.nextDouble(35)+25+b);
				o.ū�Թ轺++;
				o.����ũ��++;
				System.out.print("ū�Թ轺(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.ū�Թ轺s) {
					o.ū�Թ轺s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "û������":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(3)+1);
				}
				size = Math.abs(r.nextDouble(3)+2+b);
				o.û������++;
				o.����ũ��++;
				System.out.print("û������(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.û������s) {
					o.���ð��s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;			
			case "�����":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				size = Math.abs(r.nextDouble(5)+10+b);
				o.�����++;
				o.����ũ��++;
				System.out.print("�����(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�����s) {
					o.�����s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;
			case "���մ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				size = Math.abs(r.nextDouble(8)+7+b);
				o.���մ�++;
				o.����ũ��++;
				System.out.print("���մ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.���մ�s) {
					o.���մ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;			
			case "���":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				size = Math.abs(r.nextDouble(70)+30+b);
				o.���++;
				o.����ũ��++;
				System.out.print("���(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.���s) {
					o.���s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;			
			case "�ޱ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				o.�ޱ�++;
				o.����ũ��++;	
				size = Math.abs(r.nextDouble(70)+30+b);
				System.out.print("�ޱ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�ޱ�s) {
					o.�ޱ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "Ȳ�Ұ�����":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(8)+1);
				}
				o.Ȳ�Ұ�����++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(10)+10+b);
				System.out.print("Ȳ�Ұ�����(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.Ȳ�Ұ�����s) {
					o.Ȳ�Ұ�����s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;		
			case "�ڶ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				o.�ڶ�++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(50)+15+b);
				System.out.print("�ڶ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�ڶ�s) {
					o.�ڶ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;		
			case "�����":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(15)+1);
				}
				o.�����++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(40)+50+b);
				System.out.print("�����(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�����s) {
					o.�����s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;		
			case "����ؾ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(3)+1);
				}
				o.����ؾ�++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(5)+5+b);
				System.out.print("����ؾ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.����ؾ�s) {
					o.����ؾ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;		
			case "�Ǿ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(50)+30);
				}
				o.�Ǿ�++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(200)+350+b);
				System.out.print("�Ǿ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�Ǿ�s) {
					o.�Ǿ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ����(o);
				break;			
		}
		����.LV_UP(o);
		���˴�ch(o);
		��ch(o);
		�̳�ch(o);
	}

	private void ��_ũ��(String kd, Op o) {
		double b = 0;
		Random r = new Random();
		switch(kd) {
			case "�ۻ縮":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(2)+1);
				}
				size = Math.abs(r.nextDouble(2)+2+b);
				o.�ۻ縮++;
				o.����ũ��++;			
				System.out.print("�ۻ縮(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�ۻ縮s) {
					o.�ۻ縮s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;
			case "�ξ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(15)+1);
				}
				size = Math.abs(r.nextDouble(30)+33+b);
				o.�ξ�++;
				o.����ũ��++;
				System.out.print("�ξ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�ξ�s) {
					o.�ξ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;
			case "�������۾�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(15)+1);
				}
				size = Math.abs(r.nextDouble(60)+40+b);				
				o.�������۾�++;
				o.����ũ��++;
				System.out.print("�������۾�");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�������۾�s) {
					o.�������۾�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "����":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(15)+1);
				}
				size = Math.abs(r.nextDouble(30)+50+b);
				o.����++;
				o.����ũ��++;
				System.out.print("����");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.����s) {
					o.����s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "�Ƕ��":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(8)+1);
				}
				size = Math.abs(r.nextDouble(12)+14+b);
				o.�Ƕ��++;
				o.����ũ��++;
				System.out.print("�Ƕ��(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�Ƕ��s) {
					o.�Ƕ��s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "�׾�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(30)+1);
				}
				size = Math.abs(r.nextDouble(95)+25+b);
				o.���++;
				o.����ũ��++;
				System.out.print("�׾�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�׾�s) {
					o.�׾�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "�ؾ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(25)+20+b);
				o.�ؾ�++;
				o.����ũ��++;
				System.out.print("�ؾ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�ؾ�s) {
					o.�ؾ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "���ð��":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(3)+1);
				}
				size = Math.abs(r.nextDouble(5)+3+b);
				o.���ð��++;
				o.����ũ��++;
				System.out.print("���ð��(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.���ð��s) {
					o.���ð��s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;			
			case "�̲ٶ���":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				size = Math.abs(r.nextDouble(10)+15+b);
				o.�̲ٶ���++;
				o.����ũ��++;
				System.out.print("�̲ٶ���(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�̲ٶ���s) {
					o.�̲ٶ���s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;
			case "���":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				size = Math.abs(r.nextDouble(70)+30+b);
				o.���++;
				o.����ũ��++;
				System.out.print("���(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.���s) {
					o.���s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;			
			case "�ޱ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				size = Math.abs(r.nextDouble(70)+30+b);
				o.�ޱ�++;
				o.����ũ��++;
				System.out.print("�ޱ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�ޱ�s) {
					o.�ޱ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;			
			case "����׾�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(25)+1);
				}
				o.����׾�++;
				o.����ũ��++;	
				size = Math.abs(r.nextDouble(70)+40+b);
				System.out.print("����׾�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.����׾�s) {
					o.����׾�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "��Ȧ��Ʋ":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				o.��Ȧ��Ʋ++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(30)+15+b);
				System.out.print("��Ȧ��Ʋ(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.��Ȧ��Ʋs) {
					o.��Ȧ��Ʋs = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;		
			case "�򵿰���":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				o.�򵿰���++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(5)+12+b);
				System.out.print("�򵿰���(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�򵿰���s) {
					o.�򵿰���s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;		
		}
		����.LV_UP(o);
		���˴�ch(o);
		��ch(o);
		�̳�ch(o);
	}

	public void ȣ��_�����(Op o) {
		pro = Math.abs(r.nextInt(10000)+1);
		
		if(pro<=1000) {
			fh = "�������۾�";
			ȣ��_ũ��("�������۾�", o);
		} else if(pro<=2000){
			fh = "����";
			ȣ��_ũ��("����", o);
		} else if(pro<=3000){
			fh = "�׾�";
			ȣ��_ũ��("�׾�", o);
		} else if(pro<=4000){
			fh = "�ؾ�";
			ȣ��_ũ��("�ؾ�", o);
		} else if(pro<=5000){
			fh = "�ݺؾ�";
			ȣ��_ũ��("�ݺؾ�", o);
		} else if(pro<=6000){
			fh = "���";
			ȣ��_ũ��("���", o);
		} else if(pro<=7000){
			fh = "�ۻ縮";
			ȣ��_ũ��("�ۻ縮", o);
		} else if(pro<=7800){
			fh = "�̲ٶ���";
			ȣ��_ũ��("�̲ٶ���", o);
		} else if(pro<=8600){
			fh = "�����";
			ȣ��_ũ��("�����", o);
		} else if(pro<=9400){
			fh = "���մ�";
			ȣ��_ũ��("���մ�", o);
		} else if(pro<=9600){
			fh = "Ȳ�Ұ�����";
			ȣ��_ũ��("Ȳ�Ұ�����", o);
		} else if(pro<=9800){
			fh = "����׾�";
			ȣ��_ũ��("����׾�", o);
		} else {
			fh = "��Ȧ��Ʋ";
			ȣ��_ũ��("��Ȧ��Ʋ", o);
		}
	}
	
	public void ȣ��_ũ��(String kd, Op o) {
		double b = 0;
		Random r = new Random();
		switch(kd) {
			case "�������۾�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(60)+40+b);
				o.�������۾�++;
				o.����ũ��++;			
				System.out.print("�������۾�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�������۾�s) {
					o.�������۾�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;
			case "����":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(40)+60+b);
				o.����++;
				o.����ũ��++;
				System.out.print("����(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.����s) {
					o.����s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;
			case "�׾�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(15)+1);
				}
				size = Math.abs(r.nextDouble(70)+50+b);				
				o.�׾�++;
				o.����ũ��++;
				System.out.print("�׾�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�׾�s) {
					o.�׾�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "�ؾ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(23)+20+b);
				o.�ؾ�++;
				o.����ũ��++;
				System.out.print("�ؾ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�ؾ�s) {
					o.�ؾ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "�ݺؾ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				size = Math.abs(r.nextDouble(30)+5+b);
				o.�ݺؾ�++;
				o.����ũ��++;
				System.out.print("�ݺؾ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�ݺؾ�s) {
					o.�ݺؾ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "���":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(35)+20+b);
				o.���++;
				o.����ũ��++;
				System.out.print("���(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.���s) {
					o.���s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "�ۻ縮":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(3)+1);
				}
				size = Math.abs(r.nextDouble(6)+b);
				o.�ۻ縮++;
				o.����ũ��++;
				System.out.print("�ۻ縮(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�ۻ縮s) {
					o.�ۻ縮s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "�̲ٶ���":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(7)+1);
				}
				size = Math.abs(r.nextDouble(5)+15+b);
				o.�̲ٶ���++;
				o.����ũ��++;
				System.out.print("�̲ٶ���(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�̲ٶ���s) {
					o.�̲ٶ���s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;			
			case "�����":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				size = Math.abs(r.nextDouble(5)+10+b);
				o.�����++;
				o.����ũ��++;
				System.out.print("�����(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.�����s) {
					o.�����s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;
			case "���մ�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(5)+1);
				}
				size = Math.abs(r.nextDouble(8)+7+b);
				o.���մ�++;
				o.����ũ��++;
				System.out.print("���մ�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.���մ�s) {
					o.���մ�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;			
			case "Ȳ�Ұ�����":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				size = Math.abs(r.nextDouble(33)+13+b);
				o.Ȳ�Ұ�����++;
				o.����ũ��++;
				System.out.print("Ȳ�Ұ�����(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.Ȳ�Ұ�����s) {
					o.Ȳ�Ұ�����s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;			
			case "����׾�":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(20)+1);
				}
				o.����׾�++;
				o.����ũ��++;	
				size = Math.abs(r.nextDouble(70)+50+b);
				System.out.print("����׾�(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.����׾�s) {
					o.����׾�s = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;	
			case "��Ȧ��Ʋ":
				if(o.ub==1) {
					b = Math.abs(r.nextDouble(10)+1);
				}
				o.��Ȧ��Ʋ++;
				o.����ũ��++;
				size = Math.abs(r.nextDouble(30)+15+b);
				System.out.print("��Ȧ��Ʋ(");
				System.out.printf("%4.2f", size);
				System.out.println("cm)�� ���Ҵ�.");
				if(size > o.��Ȧ��Ʋs) {
					o.��Ȧ��Ʋs = size;
					System.out.println("�ڽű��");
				}
				����ġ��(o);
				break;		
		}
		����.LV_UP(o);
		���˴�ch(o);
		��ch(o);
		�̳�ch(o);
	}

	private void ����ġ��(Op o) {
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
	

	private void ����ġ��(Op o) {
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
	private void ����ġ��(Op o) {
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
	
	private void ����ġ����(Op o) {
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
	
	private void ����ġ���(Op o) {
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
	
	private void ���˴�ch(Op o) {
		switch(o.ufr) {
		case 1:
			o.�⺻���˴� -= 1;
			if(o.�⺻���˴� == 0) {
				o.ufr = 0;
				System.out.println("(���˴��� �������� 0�� �Ǿ����ϴ�.)");
			} break;	
		case 2:
			o.��޳��˴� -= 1;
			if(o.��޳��˴� == 0) {
				o.ufr = 0;
				System.out.println("(���˴��� �������� 0�� �Ǿ����ϴ�.)");
			} break;
		case 3:
			o.����ѳ��˴� -= 1;
			if(o.����ѳ��˴� == 0) {
				o.ufr = 0;
				System.out.println("(���˴��� �������� 0�� �Ǿ����ϴ�.)");
			} break;
		}
		
	}
	private void ��ch(Op o) {
		switch(o.uaf) {
		case 1:
			o.�⺻�� -= 1;
			if(o.�⺻�� == 0) {
				o.uaf = 0;
				System.out.println("(���� �������� 0�� �Ǿ����ϴ�.)");
			}
			break;
		case 2:
			o.����� -= 1;
			if(o.����� == 0) {
				o.uaf = 0;
				System.out.println("(���� �������� 0�� �Ǿ����ϴ�.)");
			}
			break;
		case 3:
			o.�ź����� -= 1;
			if(o.�ź����� == 0) {
				o.uaf = 0;
				System.out.println("(���� �������� 0�� �Ǿ����ϴ�.)");
			}
			break;
		}
		
	}
	
	private void �̳�ch(Op o) {
		switch(o.ub) {
		case 1:
			o.���� -= 1;
			if(o.���� == 0) {
				o.ub = 0;
				System.out.println("(�̳��� ��� �Ҹ��Ͽ����ϴ�.)");
			}
			break;
		case 2:
			o.�������� -= 1;
			if(o.�������� == 0) {
				o.ub = 0;
				System.out.println("(�̳��� ��� �Ҹ��Ͽ����ϴ�.)");
			}
			break;
		case 3:
			o.�ι����� -= 1;
			if(o.�ι����� == 0) {
				o.ub = 0;
				System.out.println("(�̳��� ��� �Ҹ��Ͽ����ϴ�.)");
			}
			break;
		}
		
	}
}

package port2;

public class Book {

	public void ����(Op o) {
		switch(o.����) {
		case 1: 
			����_ȣ��(o);
			break;
		case 2:
			����_��(o);
			break;
		case 3:
			����_������(o);
			break;
		case 4:
			����_�ٴ�(o);
			break;
		case 5:
			����_����(o);
			break;
		case 6:
			����_���(o);
			break;
		}
		
	}

	private void ����_���(Op o) {
		System.out.println("--------��� �����--------");
		System.out.println();
		System.out.println("-------  ��� : ��� --------");
		System.out.println();
		
		if(o.�ϸ���Ʈs == 0) {
			System.out.println("???(???): �̹߰�");
		} else {
			System.out.print("�ϸ���Ʈ(����� �ؾȰ�): ");
			System.out.printf("%4.2f", o.�ϸ���Ʈs);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�Ƿ�ĵ��s == 0) {
			System.out.println("???(???): �̹߰�");
		} else {
			System.out.print("�Ƿ�ĵ��(����� �ؾȰ�): ");
			System.out.printf("%4.2f", o.�Ƿ�ĵ��s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�����罺s == 0) {
			System.out.println("???(???): �̹߰�");
		} else {
			System.out.print("�����罺(����� �ؾȰ�): ");
			System.out.printf("%4.2f", o.�����罺s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�÷��ÿ���츣��s == 0) {
			System.out.println("???(???): �̹߰�");
		} else {
			System.out.print("�÷��ÿ���츣��(����� �ؾȰ�): ");
			System.out.printf("%4.2f", o.�÷��ÿ���츣��s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.��Ƽ����츣��s == 0) {
			System.out.println("???(???): �̹߰�");
		} else {
			System.out.print("��Ƽ����츣��(����� �ؾȰ�): ");
			System.out.printf("%4.2f", o.��Ƽ����츣��s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.��Ƽ����츣��s == 0) {
			System.out.println("???(???): �̹߰�");
		} else {
			System.out.print("��Ƽ����츣��(����� �ؾȰ�): ");
			System.out.printf("%4.2f", o.��Ƽ����츣��s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�￱��s == 0) {
			System.out.println("???(???): �̹߰�");
		} else {
			System.out.print("�￱��(����� �ؾȰ�): ");
			System.out.printf("%4.2f", o.�￱��s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�����̷��׷罺s == 0) {
			System.out.println("???(???): �̹߰�");
		} else {
			System.out.print("�����̷��׷罺(����� �ؾȰ�): ");
			System.out.printf("%4.2f", o.�����̷��׷罺s);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println();
		
	}

	private void ����_����(Op o) {
		System.out.println("--------���� �����--------");
		System.out.println();
		System.out.println("-------  ��� : �� --------");
		System.out.println();
		
		if(o.�갥ġs == 0) {
			System.out.println("�갥ġ(����): �̹߰�");
		} else {
			System.out.print("�갥ġ(����): ");
			System.out.printf("%4.2f", o.�갥ġs);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.����ġ��s == 0) {
			System.out.println("����ġ��(����): �̹߰�");
		} else {
			System.out.print("����ġ��(����): ");
			System.out.printf("%4.2f", o.����ġ��s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.���ΰ�s == 0) {
			System.out.println("���ΰ�(����): �̹߰�");
		} else {
			System.out.print("���ΰ�(����): ");
			System.out.printf("%4.2f", o.���ΰ�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�߱���¡��s == 0) {
			System.out.println("�߱���¡��(����): �̹߰�");
		} else {
			System.out.print("�߱���¡��(����): ");
			System.out.printf("%4.2f", o.�߱���¡��s);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println();
		System.out.println("-------  ��� : �� --------");
		System.out.println();
		
		if(o.���÷���s == 0) {
			System.out.println("���÷���(����, �ٴ�): �̹߰�");
		} else {
			System.out.print("���÷���(����): ");
			System.out.printf("%4.2f", o.���÷���s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�������ط�s == 0) {
			System.out.println("�������ط�(����): �̹߰�");
		} else {
			System.out.print("�������ط�(����): ");
			System.out.printf("%4.2f", o.�������ط�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�������s == 0) {
			System.out.println("�������(����): �̹߰�");
		} else {
			System.out.print("�������(����): ");
			System.out.printf("%4.2f", o.�������s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.���ĸ�s == 0) {
			System.out.println("���ĸ�(����): �̹߰�");
		} else {
			System.out.print("���ĸ�(����): ");
			System.out.printf("%4.2f", o.���ĸ�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.���Ⱑ����s == 0) {
			System.out.println("���Ⱑ����(����): �̹߰�");
		} else {
			System.out.print("���Ⱑ����(����): ");
			System.out.printf("%4.2f", o.���Ⱑ����s);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println();
		System.out.println("-------  ��� : �� --------");
		System.out.println();
		
		if(o.���ؾ�ġs == 0) {
			System.out.println("���ؾ�ġ(����): �̹߰�");
		} else {
			System.out.print("���ؾ�ġ(����): ");
			System.out.printf("%4.2f", o.���ؾ�ġs);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.���ؾƱ�s == 0) {
			System.out.println("���ؾƱ�(����): �̹߰�");
		} else {
			System.out.print("���ؾƱ�(����): ");
			System.out.printf("%4.2f", o.���ؾƱ�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�Ӹ������s == 0) {
			System.out.println("�Ӹ������(����): �̹߰�");
		} else {
			System.out.print("�Ӹ������(����): ");
			System.out.printf("%4.2f", o.�Ӹ������s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.��üƮ�ǽ�s == 0) {
			System.out.println("��üƮ�ǽ�(����): �̹߰�");
		} else {
			System.out.print("��üƮ�ǽ�(����): ");
			System.out.printf("%4.2f", o.��üƮ�ǽ�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.����ǽ� == 0) {
			System.out.println("����ǽ�(����): �̹߰�");
		} else {
			System.out.print("����ǽ�(����): ");
			System.out.printf("%4.2f", o.����ǽ�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�ʷվƱ�s == 0) {
			System.out.println("�ʷվƱ�(����): �̹߰�");
		} else {
			System.out.print("�ʷվƱ�(����): ");
			System.out.printf("%4.2f", o.�ʷվƱ�s);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println();
		System.out.println("-------  ��� : ���� --------");
		System.out.println();
		
		if(o.ũ����s == 0) {
			System.out.println("ũ����(����): �̹߰�");
		} else {
			System.out.print("ũ����(����): ");
			System.out.printf("%4.2f", o.ũ����s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.������s == 0) {
			System.out.println("������(����): �̹߰�");
		} else {
			System.out.print("������(����): ");
			System.out.printf("%4.2f", o.������s);
			System.out.println("cm (�ְ���)");
		}
		
	}

	private void ����_�ٴ�(Op o) {
		System.out.println("--------�ٴ� �����--------");
		System.out.println();
		System.out.println("-------  ��� : �� --------");
		System.out.println();
		
		if(o.��¡��s == 0) {
			System.out.println("��¡��(�ٴ�): �̹߰�");
		} else {
			System.out.print("��¡��(�ٴ�): ");
			System.out.printf("%4.2f", o.��¡��s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.��ġs == 0) {
			System.out.println("��ġ(�ٴ�): �̹߰�");
		} else {
			System.out.print("��ġ(�ٴ�): ");
			System.out.printf("%4.2f", o.��ġs);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.��ġs == 0) {
			System.out.println("��ġ(�ٴ�): �̹߰�");
		} else {
			System.out.print("��ġ(�ٴ�): ");
			System.out.printf("%4.2f", o.��ġs);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.��ġs == 0) {
			System.out.println("��ġ(�ٴ�): �̹߰�");
		} else {
			System.out.print("��ġ(�ٴ�): ");
			System.out.printf("%4.2f", o.��ġs);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.��ġs == 0) {
			System.out.println("��ġ(�ٴ�): �̹߰�");
		} else {
			System.out.print("��ġ(�ٴ�): ");
			System.out.printf("%4.2f", o.��ġs);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.���s == 0) {
			System.out.println("���(���): �̹߰�");
		} else {
			System.out.print("���(���): ");
			System.out.printf("%4.2f", o.���s);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println();
		System.out.println("-------  ��� : �� --------");
		System.out.println();
		
		if(o.�췰s == 0) {
			System.out.println("�췰(�ٴ�)");
		} else {
			System.out.print("�췰(�ٴ�): ");
			System.out.printf("%4.2f", o.�췰s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.��ġs == 0) {
			System.out.println("��ġ(�ٴ�): �̹߰�");
		} else {
			System.out.print("��ġ(�ٴ�): ");
			System.out.printf("%4.2f", o.��ġs);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�Ұ��縮s == 0) {
			System.out.println("�Ұ��縮(�ٴ�): �̹߰�");
		} else {
			System.out.print("�Ұ��縮(�ٴ�): ");
			System.out.printf("%4.2f", o.�Ұ��縮s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.û��ġs == 0) {
			System.out.println("û��ġ(�ٴ�): �̹߰�");
		} else {
			System.out.print("û��ġ(�ٴ�): ");
			System.out.printf("%4.2f", o.û��ġs);
			System.out.println("cm (�ְ���)");
		}	
		
		if(o.���÷���s == 0) {
			System.out.println("���÷���(�ٴ�, ����): �̹߰�");
		} else {
			System.out.print("���÷���(�ٴ�, ����): ");
			System.out.printf("%4.2f", o.���÷���s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.����s == 0) {
			System.out.println("����(�ٴ�): �̹߰�");
		} else {
			System.out.print("����(�ٴ�): ");
			System.out.printf("%4.2f", o.����s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.����ġs == 0) {
			System.out.println("����ġ(�ٴ�): �̹߰�");
		} else {
			System.out.print("����ġ(�ٴ�): ");
			System.out.printf("%4.2f", o.����ġs);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println();
		System.out.println("-------  ��� : �� --------");
		System.out.println();
		
		if(o.����s == 0) {
			System.out.println("����(�ٴ�): �̹߰�");
		} else {
			System.out.print("����(�ٴ�): ");
			System.out.printf("%4.2f", o.����s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.����s == 0) {
			System.out.println("����(�ٴ�): �̹߰�");
		} else {
			System.out.print("����(�ٴ�): ");
			System.out.printf("%4.2f", o.����s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.����s == 0) {
			System.out.println("����(�ٴ�): �̹߰�");
		} else {
			System.out.print("����(�ٴ�): ");
			System.out.printf("%4.2f", o.����s);
			System.out.println("cm (�ְ���)");
		}
		
		
		System.out.println("-------  ��� : ���� --------");
		System.out.println();
		
		if(o.�������s == 0) {
			System.out.println("�������(�ٴ�): �̹߰�");
		} else {
			System.out.print("�������(�ٴ�): ");
			System.out.printf("%4.2f", o.�������s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�ް��ε�s == 0) {
			System.out.println("�ް��ε�(�ٴ�): �̹߰�");
		} else {
			System.out.print("�ް��ε�(�ٴ�): ");
			System.out.printf("%4.2f", o.�ް��ε�s);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println();
		System.out.println("---------------------------");
		
	}

	private void ����_������(Op o) {
		System.out.println("--------������ �����--------");
		System.out.println();
		System.out.println("-------  ��� : �� --------");
		System.out.println();
		
		if(o.�Ƕ��s == 0) {
			System.out.println("�Ƕ��(��, ������): �̹߰�");
		} else {
			System.out.print("�Ƕ��(��, ������): ");
			System.out.printf("%4.2f", o.�Ƕ��s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.���ð��s == 0) {
			System.out.println("���ð��(��, ������): �̹߰�");
		} else {
			System.out.print("���ð��(��, ������): ");
			System.out.printf("%4.2f", o.���ð��s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�׾�s == 0) {
			System.out.println("�׾�(ȣ��, ��, ������): �̹߰�");
		} else {
			System.out.print("�׾�(ȣ��, ��, ������): ");
			System.out.printf("%4.2f", o.�׾�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�ؾ�s == 0) {
			System.out.println("�ؾ�(ȣ��, ��, ������): �̹߰�");
		} else {
			System.out.print("�ؾ�(ȣ��, ��, ������): ");
			System.out.printf("%4.2f", o.�ؾ�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�Ƕ��s == 0) {
			System.out.println("�Ƕ��(��): �̹߰�");
		} else {
			System.out.print("�Ƕ��(��): ");
			System.out.printf("%4.2f", o.�Ƕ��s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�׾�s == 0) {
			System.out.println("�׾�(ȣ��, ��, ������): �̹߰�");
		} else {
			System.out.print("�׾�(ȣ��, ��, ������): ");
			System.out.printf("%4.2f", o.�׾�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�ؾ�s == 0) {
			System.out.println("�ؾ�(ȣ��, ��, ������): �̹߰�");
		} else {
			System.out.print("�ؾ�(ȣ��, ��, ������): ");
			System.out.printf("%4.2f", o.�ؾ�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�ۻ縮s == 0) {
			System.out.println("�ۻ縮(ȣ��, ��, ������): �̹߰�");
		} else {
			System.out.print("�ۻ縮(ȣ��, ��, ������): ");
			System.out.printf("%4.2f", o.�ۻ縮s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.����ġs == 0) {
			System.out.println("����ġ(������): �̹߰�");
		} else {
			System.out.print("����ġ(������): ");
			System.out.printf("%4.2f", o.����ġs);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.ū�Թ轺s == 0) {
			System.out.println("ū�Թ轺(������): �̹߰�");
		} else {
			System.out.print("ū�Թ轺(������): ");
			System.out.printf("%4.2f", o.ū�Թ轺s);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println();
		System.out.println("-------  ��� : �� --------");
		System.out.println();
		
		if(o.û������s == 0) {
			System.out.println("û������(������): �̹߰�");
		} else {
			System.out.print("û������(������): ");
			System.out.printf("%4.2f", o.û������s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�����s == 0) {
			System.out.println("�����(ȣ��, ������): �̹߰�");
		} else {
			System.out.print("�����(ȣ��, ������): ");
			System.out.printf("%4.2f", o.�����s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.���մ�s == 0) {
			System.out.println("���մ�(ȣ��, ������): �̹߰�");
		} else {
			System.out.print("���մ�(ȣ��, ������): ");
			System.out.printf("%4.2f", o.���մ�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.���s == 0) {
			System.out.println("���(��, ������): �̹߰�");
		} else {
			System.out.print("���(��, ������): ");
			System.out.printf("%4.2f", o.���s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�ޱ�s == 0) {
			System.out.println("�ޱ�(��, ������): �̹߰�");
		} else {
			System.out.print("�ޱ�(��, ������): ");
			System.out.printf("%4.2f", o.�ޱ�s);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println();
		System.out.println("-------  ��� : �� --------");
		System.out.println();
		
		if(o.Ȳ�Ұ�����s == 0) {
			System.out.println("Ȳ�Ұ�����(ȣ��, ������): �̹߰�");
		} else {
			System.out.print("Ȳ�Ұ�����(ȣ��, ������): ");
			System.out.printf("%4.2f", o.Ȳ�Ұ�����s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�ڶ� == 0) {
			System.out.println("�ڶ�(������): �̹߰�");
		} else {
			System.out.print("�ڶ�(������): ");
			System.out.printf("%4.2f", o.�ڶ�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�����s == 0) {
			System.out.println("�����(������): �̹߰�");
		} else {
			System.out.print("�����(������): ");
			System.out.printf("%4.2f", o.�����s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.����ؾ�s == 0) {
			System.out.println("����ؾ�(������): �̹߰�");
		} else {
			System.out.print("����ؾ�(������): ");
			System.out.printf("%4.2f", o.����ؾ�s);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println("-------  ��� : ���� --------");
		System.out.println();
		
		if(o.�Ǿ�s == 0) {
			System.out.println("�Ǿ�(������): �̹߰�");
		} else {
			System.out.print("�Ǿ�(������): ");
			System.out.printf("%4.2f", o.�Ǿ�s);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println();
		System.out.println("---------------------------");
		
	}

	private void ����_��(Op o) {
		System.out.println("--------�� �����--------");
		System.out.println();
		System.out.println("-------  ��� : �� --------");
		System.out.println();
		
		if(o.�ۻ縮s == 0) {
			System.out.println("�ۻ縮(ȣ��, ��, ������): �̹߰�");
		} else {
			System.out.print("�ۻ縮(ȣ��, ��, ������): ");
			System.out.printf("%4.2f", o.�ۻ縮s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�ξ�s == 0) {
			System.out.println("�ξ�(��): �̹߰�");
		} else {
			System.out.print("�ξ�(��): ");
			System.out.printf("%4.2f", o.�ξ�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�������۾�s == 0) {
			System.out.println("�������۾�(ȣ��, ��): �̹߰�");
		} else {
			System.out.print("�������۾�(ȣ��, ��): ");
			System.out.printf("%4.2f", o.�������۾�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.����s == 0) {
			System.out.println("����(ȣ��, ��): �̹߰�");
		} else {
			System.out.print("����(ȣ��, ��): ");
			System.out.printf("%4.2f", o.����s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�Ƕ��s == 0) {
			System.out.println("�Ƕ��(��): �̹߰�");
		} else {
			System.out.print("�Ƕ��(��): ");
			System.out.printf("%4.2f", o.�Ƕ��s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�׾�s == 0) {
			System.out.println("�׾�(ȣ��, ��, ������): �̹߰�");
		} else {
			System.out.print("�׾�(ȣ��, ��, ������): ");
			System.out.printf("%4.2f", o.�׾�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�ؾ�s == 0) {
			System.out.println("�ؾ�(ȣ��, ��, ������): �̹߰�");
		} else {
			System.out.print("�ؾ�(ȣ��, ��, ������): ");
			System.out.printf("%4.2f", o.�ؾ�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.���ð��s == 0) {
			System.out.println("���ð��(��, ������): �̹߰�");
		} else {
			System.out.print("���ð��(��, ������): ");
			System.out.printf("%4.2f", o.���ð��s);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println();
		System.out.println("-------  ��� : �� --------");
		System.out.println();
		
		if(o.�̲ٶ���s == 0) {
			System.out.println("�̲ٶ���(ȣ��, ��): �̹߰�");
		} else {
			System.out.print("�̲ٶ���(ȣ��, ��): ");
			System.out.printf("%4.2f", o.�̲ٶ���s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.���s == 0) {
			System.out.println("���(ȣ��, ������): �̹߰�");
		} else {
			System.out.print("���(ȣ��, ������): ");
			System.out.printf("%4.2f", o.���s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�ޱ�s == 0) {
			System.out.println("�ޱ�(ȣ��, ������): �̹߰�");
		} else {
			System.out.print("�ޱ�(ȣ��, ������): ");
			System.out.printf("%4.2f", o.�ޱ�s);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println();
		System.out.println("-------  ��� : �� --------");
		System.out.println();
		
		if(o.����׾�s == 0) {
			System.out.println("����׾�(ȣ��, ��): �̹߰�");
		} else {
			System.out.print("����׾�(ȣ��, ��): ");
			System.out.printf("%4.2f", o.����׾�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.��Ȧ��Ʋs == 0) {
			System.out.println("��Ȧ��Ʋ(ȣ��, ��): �̹߰�");
		} else {
			System.out.print("��Ȧ��Ʋ(ȣ��, ��): ");
			System.out.printf("%4.2f", o.��Ȧ��Ʋs);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�򵿰���s == 0) {
			System.out.println("�򵿰���(��): �̹߰�");
		} else {
			System.out.print("�򵿰���(��): ");
			System.out.printf("%4.2f", o.�򵿰���s);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println();
		System.out.println("---------------------------");
		
	}

	private void ����_ȣ��(Op o) {
		System.out.println("--------ȣ�� �����--------");
		System.out.println();
		System.out.println("-------  ��� : �� --------");
		System.out.println();
		
		if(o.�������۾�s == 0) {
			System.out.println("�������۾�(ȣ��, ��): �̹߰�");
		} else {
			System.out.print("�������۾�(ȣ��, ��): ");
			System.out.printf("%4.2f", o.�������۾�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.����s == 0) {
			System.out.println("����(ȣ��, ��): �̹߰�");
		} else {
			System.out.print("����(ȣ��, ��): ");
			System.out.printf("%4.2f", o.����s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�׾�s == 0) {
			System.out.println("�׾�(ȣ��, ��, ������): �̹߰�");
		} else {
			System.out.print("�׾�(ȣ��, ��): ");
			System.out.printf("%4.2f", o.�׾�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�ؾ�s == 0) {
			System.out.println("�ؾ�(ȣ��, ��, ������): �̹߰�");
		} else {
			System.out.print("�ؾ�(ȣ��, ��): ");
			System.out.printf("%4.2f", o.�ؾ�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�ݺؾ�s == 0) {
			System.out.println("�ݺؾ�(ȣ��): �̹߰�");
		} else {
			System.out.print("�ݺؾ�(ȣ��): ");
			System.out.printf("%4.2f", o.�ݺؾ�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.���s == 0) {
			System.out.println("���(ȣ��): �̹߰�");
		} else {
			System.out.print("���(ȣ��): ");
			System.out.printf("%4.2f", o.���s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�ۻ縮s == 0) {
			System.out.println("�ۻ縮(ȣ��, ��, ������): �̹߰�");
		} else {
			System.out.print("�ۻ縮(ȣ��, ��): ");
			System.out.printf("%4.2f", o.�ۻ縮s);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println();
		System.out.println("-------  ��� : �� --------");
		System.out.println();
		
		if(o.�̲ٶ���s == 0) {
			System.out.println("�̲ٶ���(ȣ��, ��): �̹߰�");
		} else {
			System.out.print("�̲ٶ���(ȣ��, ��): ");
			System.out.printf("%4.2f", o.�̲ٶ���s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.�����s == 0) {
			System.out.println("�����(ȣ��, ������): �̹߰�");
		} else {
			System.out.print("�����(ȣ��, ������): ");
			System.out.printf("%4.2f", o.�����s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.���մ�s == 0) {
			System.out.println("���մ�(ȣ��, ������): �̹߰�");
		} else {
			System.out.print("���մ�(ȣ��, ������): ");
			System.out.printf("%4.2f", o.���մ�s);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println();
		System.out.println("-------  ��� : �� --------");
		System.out.println();
		
		if(o.Ȳ�Ұ�����s == 0) {
			System.out.println("Ȳ�Ұ�����(ȣ��, ������): �̹߰�");
		} else {
			System.out.print("Ȳ�Ұ�����(ȣ��, ������): ");
			System.out.printf("%4.2f", o.Ȳ�Ұ�����s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.����׾�s == 0) {
			System.out.println("����׾�(ȣ��, ��): �̹߰�");
		} else {
			System.out.print("����׾�(ȣ��, ��): ");
			System.out.printf("%4.2f", o.����׾�s);
			System.out.println("cm (�ְ���)");
		}
		
		if(o.��Ȧ��Ʋs == 0) {
			System.out.println("��Ȧ��Ʋ(ȣ��, ��): �̹߰�");
		} else {
			System.out.print("��Ȧ��Ʋ(ȣ��, ��): ");
			System.out.printf("%4.2f", o.��Ȧ��Ʋs);
			System.out.println("cm (�ְ���)");
		}
		
		System.out.println();
		System.out.println("---------------------------");
		
	}
}

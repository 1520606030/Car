package com.uber.car.carrental;

public class ClosedCar extends Car{
	//����-�γ�Ʒ��
	String[] cc = {"�������","����550i","���������"};
	//����-�γ�ÿ��۸�
	int[] rents = {600,500,300};
	@Override
	//ѡ�񳵵�Ʒ�Ʒ���
	public void select() {
		//�����복��Ʒ�ƺͼ۸��Թ��û�ѡ��
		System.out.print("\r\n�γ����ͣ�\t");
		for (int i = 0; i < cc.length; i++) {
			System.out.print(cc[i] + "\t");
		}
		System.out.println("\r\n��       ��\t200Ԫ/��\t350Ԫ/��\t280Ԫ/��");
		System.out.print("\r\n��ѡ��γ�Ʒ�ƣ�\r\n1.�������     2.����550i  3.���������    ��1:2:3��?");
		//ѡ��γ�Ʒ��--�����û�����
		//�������Ѿ�ʵ����Scanner���˴�������д
		//����һ���ֲ�����number����ʱ���ɳ��ͺ͵���
		int number = input.nextInt();
		//ȷ���γ�Ʒ��
		setCarKind(cc[number - 1]);
		//ȷ���γ�Ʒ�Ƶ�ͬʱ��Ҫȷ����Ʒ�ƽγ�ÿ�����ĵ��ۣ��Ա����������ʱֱ�ӵ���getter������ȡ����
		setRent(rents[number - 1]);
		System.out.println("��ѡ��ĳ���: " + getCarKind());
	}
}

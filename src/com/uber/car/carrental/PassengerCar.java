package com.uber.car.carrental;

public class PassengerCar extends Car{
		//����-�γ�Ʒ��
		String[] cc = {"<=16��",">16��"};
		//����-�γ�ÿ��۸�
		int[] rents = {800,1500};
		@Override
		//ѡ�񳵵�Ʒ�Ʒ���
		public void select() {
			//�����복��Ʒ�ƺͼ۸��Թ��û�ѡ��
			System.out.print("\r\n�ͳ����ͣ�\t");
			for (int i = 0; i < cc.length; i++) {
				System.out.print(cc[i] + "\t");
			}
			System.out.println("\r\n��       ��\t800Ԫ/��\t1500Ԫ/��");
			System.out.print("\r\n��ѡ��γ�Ʒ�ƣ�\r\n1.<=16��     2.>16��    ��1:2:3��?");
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

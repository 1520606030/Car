package com.uber.car.carrental;

import java.util.Scanner;

public class Waiter {
	//����-ѡ��ť1��2
	private int select1Or2;
	//ʵ����Car����ClosedCar&PassengerCar
	private ClosedCar closedCar = new ClosedCar();
	private PassengerCar cassengerCar = new PassengerCar();
	Scanner input = new Scanner(System.in);
	//��ʼѡ������
	public void startSelect() {
		System.out.println("***��ӭ����Uber�⳵��˾***");
		System.out.print("��ѡ�񳵣�1.�γ�  2.�ͳ�  (1:2 ?):");
		//��ѡ�񳵵�����
		select1Or2 = input.nextInt();
		//��������ť1����ôѡ�񡰽γ������͵ĳ���
		if(select1Or2 == 1){
			//����ѡ����塰Ʒ�ơ��ĳ�����
			closedCar.select();
		//������������ť2����ôѡ���ͳ������͵ĳ���
		}else if(select1Or2 == 2){
			//����ѡ����塰Ʒ�ơ��ĳ�
			cassengerCar.select();
		}
	}
	
	//�����⳵���ܼ۸񷽷�
	public void calculatedPrice(){
		//��������ť1����ôѡ�񡰽γ������͵ĳ���
		if(select1Or2 == 1){
			//����ѡ����塰Ʒ�ơ��ĳ������������
			closedCar.rental();
		//������������ť2����ôѡ���ͳ������͵ĳ���
		}else if(select1Or2 == 2){
			//����ѡ����塰Ʒ�ơ��ĳ������������
			cassengerCar.rental();
		}
	}
	//main����������ʼ�ķ���
	public static void main(String[] args) {
		//ʵ����
		Waiter w = new Waiter();
		//����ѡ������
		w.startSelect();
		//���ü�����𷽷�
		w.calculatedPrice();
	}
}

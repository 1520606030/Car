package com.uber.car.carrental;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Car {
	//ʵ����Scanner���Թ��û�����������ѡ��Ʒ��
	Scanner input = new Scanner(System.in);
	//����
	//��Ʒ��
	private String carKind;
	//ÿ�����
	private int rent;
	//��������
	private int time;
	//��̬��
	//��ʼ����
	
	//ѡ������--��Ϊ�������͵ĳ��İ�����ͬ����Ҫ������д
	public abstract void select();
	//����۸�--��Ϊ���㷽ʽ��ͬ����������̳У����빫��
	public void rental(){
		System.out.print("���������⳵��������");
		//�����⳵����
		setTime(input.nextInt());
		//��ӡ����������Щ���ݾ͵�����Щ����
		System.out.println("\r\n*********��������*********");
		System.out.println("����Ʒ��:\t" + getCarKind());
		System.out.println("ÿ�����:\t" + getRent() + "\tԪ");
		System.out.println("�⳵����:\t" + getTime() + "\t��");
		System.out.println("\r\n�����:\t" + getRent()*getTime() +"\tԪ");
		System.out.println("\r\n    Uber(�й�)�ൺ��ѧ�ֹ�˾");
		System.out.print("    ����ʱ��  ");
		//��ȡ��ǰʱ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:MM:ss");
		System.out.println(sdf.format(new Date()));
		System.out.println("        ǩ����________");
	}

	// setter&getter����
	public String getCarKind() {
		return carKind;
	}
	public void setCarKind(String carKind) {
		this.carKind = carKind;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		if(time > 0){
			this.time = time;
		}else	{
			System.out.println("����Ҫ����0");
		}
	}
	
}

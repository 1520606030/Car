package com.uber.car.carrental;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Car {
	//实例化Scanner，以供用户输入数据来选择车品牌
	Scanner input = new Scanner(System.in);
	//属性
	//车品牌
	private String carKind;
	//每天租金
	private int rent;
	//出租天数
	private int time;
	//静态块
	//初始化块
	
	//选车方法--因为两种类型的车的包含不同所以要子类重写
	public abstract void select();
	//计算价格--因为计算方式相同，所以子类继承，代码公用
	public void rental(){
		System.out.print("请输入您租车的天数：");
		//输入租车天数
		setTime(input.nextInt());
		//打印订单，用哪些数据就调用哪些数据
		System.out.println("\r\n*********订单详情*********");
		System.out.println("车型品牌:\t" + getCarKind());
		System.out.println("每天租金:\t" + getRent() + "\t元");
		System.out.println("租车天数:\t" + getTime() + "\t天");
		System.out.println("\r\n总租金:\t" + getRent()*getTime() +"\t元");
		System.out.println("\r\n    Uber(中国)青岛大学分公司");
		System.out.print("    订车时间  ");
		//获取当前时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:MM:ss");
		System.out.println(sdf.format(new Date()));
		System.out.println("        签名：________");
	}

	// setter&getter方法
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
			System.out.println("天数要大于0");
		}
	}
	
}

package com.uber.car.carrental;

import java.util.Scanner;

public class Waiter {
	//属性-选择按钮1和2
	private int select1Or2;
	//实例化Car子类ClosedCar&PassengerCar
	private ClosedCar closedCar = new ClosedCar();
	private PassengerCar cassengerCar = new PassengerCar();
	Scanner input = new Scanner(System.in);
	//开始选车方法
	public void startSelect() {
		System.out.println("***欢迎来到Uber租车公司***");
		System.out.print("请选择车：1.轿车  2.客车  (1:2 ?):");
		//先选择车的类型
		select1Or2 = input.nextInt();
		//如果点击按钮1，那么选择“轿车”类型的车库
		if(select1Or2 == 1){
			//调用选择具体“品牌”的车方法
			closedCar.select();
		//否则，如果点击按钮2，那么选“客车”类型的车库
		}else if(select1Or2 == 2){
			//调用选择具体“品牌”的车
			cassengerCar.select();
		}
	}
	
	//计算租车的总价格方法
	public void calculatedPrice(){
		//如果点击按钮1，那么选择“轿车”类型的车库
		if(select1Or2 == 1){
			//调用选择具体“品牌”的车方法，算租金
			closedCar.rental();
		//否则，如果点击按钮2，那么选“客车”类型的车库
		}else if(select1Or2 == 2){
			//调用选择具体“品牌”的车方法，算租金
			cassengerCar.rental();
		}
	}
	//main方法，程序开始的方法
	public static void main(String[] args) {
		//实例化
		Waiter w = new Waiter();
		//调用选车方法
		w.startSelect();
		//调用计算租金方法
		w.calculatedPrice();
	}
}

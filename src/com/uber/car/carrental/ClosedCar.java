package com.uber.car.carrental;

public class ClosedCar extends Car{
	//属性-轿车品牌
	String[] cc = {"别克商务","宝马550i","别克林荫大道"};
	//属性-轿车每天价格
	int[] rents = {600,500,300};
	@Override
	//选择车的品牌方法
	public void select() {
		//先输入车的品牌和价格，以供用户选择
		System.out.print("\r\n轿车类型：\t");
		for (int i = 0; i < cc.length; i++) {
			System.out.print(cc[i] + "\t");
		}
		System.out.println("\r\n价       格：\t200元/天\t350元/天\t280元/天");
		System.out.print("\r\n请选择轿车品牌：\r\n1.别克商务     2.宝马550i  3.别克林荫大道    （1:2:3）?");
		//选择轿车品牌--用于用户输入
		//父类中已经实例化Scanner，此处不用再写
		//定义一个局部变量number来临时过渡车型和单价
		int number = input.nextInt();
		//确定轿车品牌
		setCarKind(cc[number - 1]);
		//确定轿车品牌的同时，要确定该品牌轿车每天租金的单价，以备计算总租金时直接调用getter方法获取单价
		setRent(rents[number - 1]);
		System.out.println("你选择的车是: " + getCarKind());
	}
}

package com.uber.car.carrental;

public class PassengerCar extends Car{
		//属性-轿车品牌
		String[] cc = {"<=16座",">16座"};
		//属性-轿车每天价格
		int[] rents = {800,1500};
		@Override
		//选择车的品牌方法
		public void select() {
			//先输入车的品牌和价格，以供用户选择
			System.out.print("\r\n客车类型：\t");
			for (int i = 0; i < cc.length; i++) {
				System.out.print(cc[i] + "\t");
			}
			System.out.println("\r\n价       格：\t800元/天\t1500元/天");
			System.out.print("\r\n请选择轿车品牌：\r\n1.<=16座     2.>16座    （1:2:3）?");
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

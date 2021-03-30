package com.example.bean.factory;

import org.springframework.beans.factory.FactoryBean;

public class CarSpringFactory implements  FactoryBean<Car> {

	@Override
	public Car getObject() throws Exception {
		return new Car("BMW X6",9800000.00);
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}
}

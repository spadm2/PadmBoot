package com.bb.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:values.properties")
public class FualTank {
	@Value("${tankNo}")
	private int tankNo;
	@Value("${tankType}")
	private String tankType;
	@Value("${capacity}")
	private double capacity;

	@Override
	public String toString() {
		return "FualTank [tankNo=" + tankNo + ", tankType=" + tankType + ", capacity=" + capacity + "]";
	}

}

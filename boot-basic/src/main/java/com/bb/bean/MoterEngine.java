package com.bb.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MoterEngine {
	@Autowired
	private FualTank fualTank;
	@Override
	public String toString() {
		return "MoterEngine [fualTank=" + fualTank + "]";
	}
	
}

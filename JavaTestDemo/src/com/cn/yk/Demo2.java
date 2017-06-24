package com.cn.yk;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Demo2 {

	public String calculatedAmount(String quantity,String priceExcl,String taxRate){
		DecimalFormat df = new DecimalFormat("0.00");
		double toltal = Double.parseDouble(quantity)*Double.parseDouble(priceExcl)*(1+Double.parseDouble(taxRate)/100);
		return df.format(toltal);
	}
	
	public void start(){
		String quantity = "2";
		String priceExcl = "2.46";
		String taxRate = "17";
		String toltalPrice = calculatedAmount(quantity,priceExcl,taxRate);
		System.out.println("toltalPrice = "+toltalPrice);
	}
	
	public void start2(){
		List<Long> l1 = new ArrayList<Long>();
		List<Long> l2 = new ArrayList<Long>();
		
		l1.add(1L);l1.add(2L);l1.add(3L);l1.add(4L);
		l2.add(1L);l2.add(2L);l2.add(3L);l2.add(4L);//l2.add(5L);l2.add(6L);
		boolean flag = l2.containsAll(l1);
		System.out.println(flag);
	}
	
	@Test
	public void fun1(){
		Integer a1 = null;
		Integer a2 = null;
		try {
			boolean flag = a1==a2;
			boolean flag2 = a1.equals(a2);
			System.out.println("flag="+flag);
			System.out.println("flag2="+flag2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

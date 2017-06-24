package com.cn.yk;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class Demo1 {
	
	public void fun1(){
		double d1 = 43;
		double d2 =12;
		
		double rst = d1/d2;
		
		DecimalFormat df  = new DecimalFormat("0.00");//����Ϊ����2λ
		String r2 = df.format(rst);
		System.out.println(rst);
		System.out.println(r2);
	}

	public void start(){
		String s1 = "2014-02-02";
		String s2 = "2019-06-30";
		String s3 = "2017-03-02";
		double d1 = compareDate(s1,s3,1);
		double d2 = compareDate(s3,s2,1);
		double rst = d1/d2;
		DecimalFormat df  = new DecimalFormat("0.0");//����Ϊ����2λ
		String r2 = df.format(rst);
		System.out.println("rst = "+rst);
		System.out.println("r2 = "+r2);
	}
	
	@Test
    public void sss(){
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String nowStr = sdf.format(now);
		String saleDateStr = "2014-05-28";
		double d0 = compareDate(saleDateStr, nowStr, 1);
		System.out.println(d0);
    }

/**  ע�⣺��ʼʱ��Ҫ�Ƚ���ʱ��С
 * @param date1 ��Ҫ�Ƚϵ�ʱ�� ����Ϊ��(null),��Ҫ��ȷ�����ڸ�ʽ  
 * @param date2 ���Ƚϵ�ʱ��  ����Ϊ��(null),��Ҫ��ȷ�����ڸ�ʽ   
 * @param stype ����ֵ����   0Ϊ�����죬1Ϊ���ٸ��£�2Ϊ������  
 * @return  
 */ 
public static double compareDate(String date1,String date2,int stype){  
    int n = 0;  
       
    String[] u = {"��","��","��"};  
    String formatStyle = stype==1?"yyyy-MM":"yyyy-MM-dd";  
       
    SimpleDateFormat df = new SimpleDateFormat(formatStyle);  
    Calendar c1 = Calendar.getInstance();  
    Calendar c2 = Calendar.getInstance();  
    try {  
        c1.setTime(df.parse(date1));  
        c2.setTime(df.parse(date2));  
    } catch (Exception e3) {  
        System.out.println("wrong occured");  
    }  
    //List list = new ArrayList();  
    while (!c1.after(c2)) {                     // ѭ���Աȣ�ֱ����ȣ�n ������Ҫ�Ľ��  
        //list.add(df.format(c1.getTime()));    // ������԰Ѽ�������ڴ浽������ ��ӡ����  
        n++;  
        if(stype==1){  
            c1.add(Calendar.MONTH, 1);          // �Ƚ��·ݣ��·�+1  
        }  
        else{  
            c1.add(Calendar.DATE, 1);           // �Ƚ�����������+1  
        }  
    }
       
    n = n-1;  
       
    if(stype==2){  
        n = (int)n/365;  
    }     
       
//    System.out.println(date1+" -- "+date2+" ���  "+n+" "+u[stype]); 
    return (double)n;  
}

}
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
		
		DecimalFormat df  = new DecimalFormat("0.00");//这样为保持2位
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
		DecimalFormat df  = new DecimalFormat("0.0");//这样为保持2位
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

/**  注意：开始时间要比结束时间小
 * @param date1 需要比较的时间 不能为空(null),需要正确的日期格式  
 * @param date2 被比较的时间  不能为空(null),需要正确的日期格式   
 * @param stype 返回值类型   0为多少天，1为多少个月，2为多少年  
 * @return  
 */ 
public static double compareDate(String date1,String date2,int stype){  
    int n = 0;  
       
    String[] u = {"天","月","年"};  
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
    while (!c1.after(c2)) {                     // 循环对比，直到相等，n 就是所要的结果  
        //list.add(df.format(c1.getTime()));    // 这里可以把间隔的日期存到数组中 打印出来  
        n++;  
        if(stype==1){  
            c1.add(Calendar.MONTH, 1);          // 比较月份，月份+1  
        }  
        else{  
            c1.add(Calendar.DATE, 1);           // 比较天数，日期+1  
        }  
    }
       
    n = n-1;  
       
    if(stype==2){  
        n = (int)n/365;  
    }     
       
//    System.out.println(date1+" -- "+date2+" 相差  "+n+" "+u[stype]); 
    return (double)n;  
}

}
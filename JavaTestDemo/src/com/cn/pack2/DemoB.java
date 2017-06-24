package com.cn.pack2;

import com.cn.pack1.DemoA;

public class DemoB extends DemoA {
	public static void main(String[] args) {
		DemoB b=new DemoB();
		b.show2();
		b.show3();
 System.out.println("*********************");
        DemoA a=new DemoA();
        a.show2();
    }
}

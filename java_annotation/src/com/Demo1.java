package com;

import java.util.ArrayList;

class Super {
	public void abc() {
		System.out.println("super::abc()");
	}
}

class Sub extends Super {

	@Override
	public void abc() {
		System.out.println("sub::abc()");
	}
}

class SomeClass {

	@Deprecated
	public void v1() {
		System.out.println("v1()");
	}

	public void v2() {
		System.out.println("v1()");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.abc();

		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();

	}

}

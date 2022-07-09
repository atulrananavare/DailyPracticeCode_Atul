package com.demo.day1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class A extends B  {
	
	public void m1() throws FileNotFoundException {
		System.out.println("IOException");
	}

}


class B{
	public void m1() throws IOException {
		System.out.println("FileNotFoundException");
	}
}

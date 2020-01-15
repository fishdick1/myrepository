package com.liuyue.print;

public class UserThread1 extends Thread
{
	private PrintChar pc;
	public UserThread1(PrintChar pc)
	{
		// TODO Auto-generated constructor stub
		this.pc=pc;
	}

	public void run()
	{
		pc.PrintB();
	}
}

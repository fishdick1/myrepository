package com.liuyue.print;

public class UserThread extends Thread
{
	private PrintChar pc;
	public UserThread(PrintChar pc)
	{
		// TODO Auto-generated constructor stub
		this.pc=pc;
	}
	public void run()
	{
		pc.PrintA();
	}

}

package com.liuyue.print;

public class UserMain
{

	public static void main(String[] args)
	{
		PrintChar pc=new PrintChar();
		UserThread u1=new UserThread(pc);
		UserThread1 u2=new UserThread1(pc);
		UserThread2 u3=new UserThread2(pc);
		u1.start();
		u2.start();
		u3.start();
	}

}

package com.liuyue.print;

public class UserThread2 extends Thread
{

	
		private PrintChar pc;
		public UserThread2(PrintChar pc)
		{
			// TODO Auto-generated constructor stub
			this.pc=pc;
		}
		public void run()
		{
			pc.PrintC();
		}

	
}

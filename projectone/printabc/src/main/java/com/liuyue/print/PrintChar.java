package com.liuyue.print;

public class PrintChar
{
  static int flag=0;
	public void PrintA()
	{
		synchronized (this)
		{
			while(true)
			{
				if(flag==0)
				{
					try
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+",-->A");
					flag=1;
					this.notify();
				}
				try
				{
					this.wait();
				}
				catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		  
			}
		}
	}
	public void PrintB()
	{
		synchronized (this)
		{
			while(true)
			{
				if(flag==1)
				{
					
					try
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+",-->B");
					flag=2;
					this.notify();
				}
				try
				{
					this.wait();
				}
				catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}
	public void PrintC()
	{
		synchronized (this)
		{
			while(true)
			{
				if(flag==2)
				{
					try
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+",-->C");
					flag=0;
					this.notify();
				}
				try
				{
					this.wait();
				}
				catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  
			}
		}
	}
}

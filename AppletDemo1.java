import java.applet.*;
class AppletDemo1 extends Applet
{
	public void init()
	{
		System.out.println("init Called");
	}
	public void start()
	{
		System.out.println("start Called");
	}
	public void stop()
	{
		System.out.println("stop Called");
	}
	public void destroy()
	{
		System.out.println("destroy Called");
	}
}
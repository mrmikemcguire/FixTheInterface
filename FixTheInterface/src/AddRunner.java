public class AddRunner implements Addition
	{
	public static void main(String[] args)
		{
		Object o = new Object();
		System.out.println(new AddRunner().add(3, 2));
		}
	public int add(int x, int y)
		{
		return x + y;
		}
	}

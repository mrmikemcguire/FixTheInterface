public class AddRunner implements Addition
	{
	public static void main(String[] args)
		{
		System.out.println(add(3,2));
		printWord();
		}
	public int add(int x, int y)
		{
		return x + y;
		}
	public static void printWord()
		{
		System.out.println("Mullen");
		}
	}

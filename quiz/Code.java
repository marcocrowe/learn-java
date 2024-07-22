public class Test
{
	public static void main(String[] args)
	{
		Integer[] numbers = {1, 2, 3, 25, 30, 35, 40, 45, 50, 55};

		ArrayOperation arrayOperation1 = (Object item) -> {
			int number = (Integer) item;
			return (number % 3 == 0) && (number % 5 == 0); 
		};

		ArrayOperation arrayOperation2 = (Object item) -> {
			int number = (Integer) item;
			return number <= doIt(numbers, arrayOperation1);
		};

		System.out.println(doIt(numbers, arrayOperation2));
	}
	private static <T> int dolt(T array[], ArrayOperation arrayOperation)
	{
		int sum = 0;
		for(T item : array)
		{
			if(arrayOperation.doIt(item))
				++sum;
		}
		return sum;
	}
}
interface ArrayOperation<T>
{
	boolean test(T value);
}
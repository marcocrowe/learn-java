# Applications Programming Quiz 2020

## Question 9

### What value is printed to the screen when the class `Test` is run? (10 marks)

```java
public class Test
{
    public static void main(String[] args)
    {
        Integer[] numbers = {1, 2, 3, 25, 30, 35, 40, 45, 50, 55};

        ArrayOperation arrayOperation1 = (Object value) -> {
            int number = (Integer) value;
            return (number % 3 == 0) && (number % 5 == 0); 
        };

        ArrayOperation arrayOperation2 = (Object value) -> {
            int number = (Integer) value;
            return number <= doIt(numbers, arrayOperation1);
        };

        System.out.println(doIt(numbers, arrayOperation2));
    }
    private static <T> int doIt(T array[], ArrayOperation arrayOperation)
    {
        int count = 0;
        for(T value : array)
        {
            if(arrayOperation.test(value))
                ++count;
        }
        return count;
    }
}
interface ArrayOperation<T>
{
    boolean test(T value);
}
```

### Answer

arrayOperation2 excutes `number <= doIt(numbers, arrayOperation1)`.  `numbers` defined in `Test.main` as `{1, 2, 3, 25, 30, 35, 40, 45, 50, 55}`.  For `arrayOperation1` with `numbers = {1, 2, 3, 25, 30, 35, 40, 45, 50, 55}`  

Only `30` and `45` have factors of 3 and 5, so the result is `2`.  

For `arrayOperation2` with `numbers = {1, 2, 3, 25, 30, 35, 40, 45, 50, 55}` only adds to the `count` if the number in numbers is `<=` `arrayOperation1` result of `2`.  

Only `1, 2` are `<= 2` so the result is `2`.  

The answer is: 2  
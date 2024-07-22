# Applications Programming Quiz 2020

## Question 1

Examine the code below:  What is the output when the class Test is run? (?? marks)
You must show your workings/rough work for this question

```java
class A {
    private int i = 16;
    private int j = 32;

    public A() {
        this.i = 10;
        this.j = 20;
    }

    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() { return i; }
    public void setI(int i) { this.i = i; }
    public int getJ() { return j; }
    public void setJ(int j) { this.j = j; }

    public void increment() {
        this.i = this.i * 2;
        this.j = this.j * 2;
    }
}
class B extends A {
    private int x = 12;
    private int y = 24;

    public B() {
        this.x = 15;
        this.y = 20;
    }

    public B(int x, int y, int i, int j) {
        super(i, j);
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public void increment() {
        super.increment();
        this.x = this.x * 2;
        this.y = this.y * 2;
    }
}
public class Test {
    public static void main(String args[]) {
        B b = new B(1, 2, 3, 4);
        A a = new A();
        int ans = b.getI() + b.getJ() + b.getX() + b.getY() + a.getI() + a.getJ();
        b.increment();
        a.increment();
        ans += b.getI() + b.getJ() + b.getX() + b.getY() + a.getI() + a.getJ();
        System.out.println(ans);
    }
}
```

Answer: 120

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

## Question 10

Examine the code below:  What is the output when the class Main is run? (15 marks)

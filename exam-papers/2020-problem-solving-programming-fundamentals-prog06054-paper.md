
# Problem Solving and Programming Fundamentals (PROG06054) Paper 2020 Summer

## Paper Information

Summer Examinations 2019/2020

## Question 1 [TOTAL MARKS: 40]

### Question 1(a) [5 Marks]

Illustrate the elements of the array `examArray[]` using a diagram, after the following statements have been executed.

```java
int [] examArray = new int[5];
examArray[0] = 3;
examArray[1] = 3; 
examArray[2] = examArray[0] - 4; 
examArray[3] = examArray[0] * 4; 
examArray[4] = examArray[0] * 2 + examArray[1]; 
```

### Answer

```text
array0 = 3
array1 = 3
array2 = array0 - 4 = 3 - 4 = -1
array3 = array0 * 4 = 3 * 4 = 12
array4 = array0 * 2 + array2 = 3 * 2 + 3 = 9
```

| Index     | 0 | 1 | 2  | 3  | 4 |
|-----------|---|---|----|----|---|
| **Value** | 3 | 3 | -1 | 12 | 9 |

### Question 1(b) [6 Marks]

**Q 1(b)  [6 Marks]**

Two ways to pass arguments to methods are **call-by-value** and **call-by-reference.** Explain the difference.

### Answer 1.B

- **Call-by-value**: The method receives a copy of the argument passed to it. Any changes made to the argument inside the method do not affect the original argument.
- **Call-by-reference**: The method receives a reference to the argument passed to it. Any changes made to the argument inside the method affect the original argument.

**Example**:  

```java
public class Example {
    public static void main(String[] args) {
        int number1 = 5;
        add10ByValue(number1);
        System.out.println("number1 after add10ByValue: " + number1); // Output: 5

        int[] number2InArray = {5}; // Access the first element using number2InArray[0]
        add10ByReference(number2InArray);
        System.out.println("number2 after add10ByReference: " + number2InArray[0]); // Output: 15
    }

    public static void add10ByValue(int number) {
        number += 10;
    }

    public static void add10ByReference(int[] number) {
        number[0] += 10;
    }
}
```

Run at online compiler: [Online Java Compiler - jdoodle.com](https://www.jdoodle.com/online-java-compiler)

### Question 1(c) [8 Marks]

Write a method called **positiveValues** which will calculate and **return** the number (count) of positive numbers in an array  

### Answer 1.C

```java
/*
    * Method to count the number of positive values in an array
    * @param array The array to count positive values
    * @return The number of positive values in the array
    */
public static int positiveValues(int[] array) {
    int count = 0;
    for (int index = 0; index < array.length; index++) {
        if (array[index] > 0) {
            count++;
        }
    }
    return count;
}
/* ... */
```

### Question 1.D (4 Marks)

Give a definition of a two-dimensional array.

### Answer 1.D

A two-dimensional array is an array of arrays. It is a collection of elements arranged in rows and columns. Each element in a two-dimensional array is identified by two indices.

### Question 1.E [Total Marks: 9]

#### Question 1.E.1 [3 Marks]

Examine the following code segments and answer the corresponding question.  

```java
double[][] values =  {
                        {1.2, 9.0, 3.2},
                        {9.2, 0.5, 1.5, -1.2},
                        {7.3, 7.9, 4.8}
                     }; 
```

What is in `values[2][1]`?

#### Answer 1.E.I

| Index |   0 |   *1* |   2 |    3 |
|-------|----:|------:|----:|-----:|
| 0     | 1.2 |   9.0 | 3.2 |      |
| 1     | 9.2 |   0.5 | 1.5 | -1.2 |
| **2** | 7.3 | `7.9` | 4.8 |      |

**2** is the row index and *1* is the column index. The value at `values[2][1]` is `7.9`.

#### Question 1.E.2 (3 Marks)

```java
double[][] arrayOfNumbers = {
                                {1.2, 9.0},
                                {9.2, 0.5, 0.0},
                                {7.3, 7.9, 1.2, 3.9}
                            };
```

What is the value of arrayOfNumbers.length ?

#### Answer 1.E.2

The value of `arrayOfNumbers.length` is 3. The length of an array is the number of elements in the array.

#### Question 1.E.3 (3 Marks)

```java
int[][] items = {
                    {0, 1, 3, 4},
                    {4, 3, 99, 0, 7 },
                    {3, 2}
                };
```

Write a statement that replaces the 99 with 77.

#### Answer 1.E.3

```java
items[1][2] = 77;
```

### Question 1.F (8 Marks)

Given:

```java
int [][] array2d = {
                        {0, 1, 3, 4},
                        {4, 3, 99, 0, 7},
                        {3, 2}
                   };
```

Write a nested for loop to print out every element of `array2d`?

### Answer 1.F

```java
for (int row = 0; row < array2d.length; row++) {
    for (int col = 0; col < array2d[row].length; col++) {
        System.out.print(array2d[row][col] + " ");
    }
    System.out.println();
}
```

Alternatively, you can use the enhanced for loop:

```java
for (int[] row : array2d) {
    for (int col : row) {
        System.out.print(col + " ");
    }
    System.out.println();
}
```


## Question 2 [TOTAL MARKS: 30]

### Question 2.A (6 Marks)

Complete the following.

More generally, method declarations have the following components, in order:  

1. The Modifiers. e.g. `public`, `private`.
2. The \_\_\_\_\_\_\_\_\_\_\_\_\_\_type.
3. The \_\_\_\_\_\_\_\_\_\_\_\_\_\_ name.
4. The \_\_\_\_\_\_\_\_\_\_\_\_\_\_ list.

### Answer 2.A

1. The Modifiers. e.g. `public`, `private`.
2. The **return** type.
3. The **method** name.
4. The **parameter** list.

### Question 2.B [24 Marks]

The **Irish general election of 2020** took place on Saturday, 8th of February to elect the [lower house](http://en.wikipedia.org/wiki/Lower_house) of [Ireland's](http://en.wikipedia.org/wiki/Republic_of_Ireland) national [parliament](http://en.wikipedia.org/wiki/Parliament) the [Oireachtas](http://en.wikipedia.org/wiki/Oireachtas).

There was a total of 12 candidates who contested the election in Limerick City.  

**You are required to write an application** that allows the user to enter 12 integer values representing the total number of votes per candidate & store these in array `electionResults[]`.

Once the user has entered the votes for each candidate you must write and call a method called `calculateWinner` passing the array of votes which will calculate and display the candidate who has the overall majority(highest number of votes) and display the winning candidate number.

### Answer 2.B

The program is essentially a simple application that allows an input array and find the maximum value in the array. The following is the code to achieve this:

```java
//JOPionPane
import javax.swing.JOptionPane;

public class ElectionResults {
    public static void main(String[] args) {
        int[] electionResults = new int[12];

        // Input the votes for each candidate
        for (int index = 0; index < electionResults.length; index++) {
            String input = JOptionPane.showInputDialog("Enter the votes for candidate " + (index + 1));
            electionResults[index] = Integer.parseInt(input);
        }

        // Calculate and display the winner
        int winnerIndex = calculateWinner(electionResults);
        System.out.println("The winner is candidate " + (winnerIndex + 1) + " with " + maxVotes + " votes.");
    }
    /**
     * Method to calculate the winner of the election
     * @param votes The array of votes
     * @return The candidate number of the winner
     */
    public static int calculateWinner(int[] votes) {
        int maxVotes = votes[0];
        int winnerIndex = 0;
        for (int index = 1; index < votes.length; index++) {
            if (votes[index] > maxVotes) {
                maxVotes = votes[index];
                winnerIndex = index;
            }
        }
        return winnerIndex;

```


## Question 3 [TOTAL MARKS: 30]

### Question 3.A (8 Marks)

List the advantages of a two-dimensional array over a one-dimensional array.

### Question 3.B [22 Marks]

Write a Java application `CalculateAverageTemp` that allows the user to enter the average temperature for each month of the 4 (Spring, Summer, Autumn and Winter) seasons in degrees celsius for 2019.

Using a nested for loop, store these values in a 2D array called `TemperatureArray[][]`.

You must then calculate and display the `highestTemperature` and also output the `averageTemperature` for 2019.

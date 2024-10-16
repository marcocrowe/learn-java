
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

### Question 1(b) [6 Marks]

Two ways to pass arguments to methods are **call-by-value** and **call-by-reference.** Explain the difference.

### Question 1(c) [8 Marks]

Write a method called **positiveValues** which will calculate and **return** the number (count) of positive numbers in an array  

### Question 1.D (4 Marks)

Give a definition of a two-dimensional array.

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

#### Question 1.E.2 (3 Marks)

```java
double[][] arrayOfNumbers = {
                                {1.2, 9.0},
                                {9.2, 0.5, 0.0},
                                {7.3, 7.9, 1.2, 3.9}
                            };
```

What is the value of arrayOfNumbers.length ?

#### Question 1.E.3 (3 Marks)

```java
int[][] items = {
                    {0, 1, 3, 4},
                    {4, 3, 99, 0, 7 },
                    {3, 2}
                };
```

Write a statement that replaces the 99 with 77.

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

## Question 2 [TOTAL MARKS: 30]

### Question 2.A (6 Marks)

Complete the following.

More generally, method declarations have the following components, in order:  

1. The Modifiers. e.g. `public`, `private`.
2. The \_\_\_\_\_\_\_\_\_\_\_\_\_\_type.
3. The \_\_\_\_\_\_\_\_\_\_\_\_\_\_ name.
4. The \_\_\_\_\_\_\_\_\_\_\_\_\_\_ list.

### Question 2.B [24 Marks]

The **Irish general election of 2020** took place on Saturday, 8th of February to elect the [lower house](http://en.wikipedia.org/wiki/Lower_house) of [Ireland's](http://en.wikipedia.org/wiki/Republic_of_Ireland) national [parliament](http://en.wikipedia.org/wiki/Parliament) the [Oireachtas](http://en.wikipedia.org/wiki/Oireachtas).

There was a total of 12 candidates who contested the election in Limerick City.  

**You are required to write an application** that allows the user to enter 12 integer values representing the total number of votes per candidate & store these in array `electionResults[]`.

Once the user has entered the votes for each candidate you must write and call a method called `calculateWinner` passing the array of votes which will calculate and display the candidate who has the overall majority(highest number of votes) and display the winning candidate number.

## Question 3 [TOTAL MARKS: 30]

### Question 3.A (8 Marks)

List the advantages of a two-dimensional array over a one-dimensional array.

### Question 3.B [22 Marks]

Write a Java application `CalculateAverageTemp` that allows the user to enter the average temperature for each month of the 4 (Spring, Summer, Autumn and Winter) seasons in degrees celsius for 2019.

Using a nested for loop, store these values in a 2D array called `TemperatureArray[][]`.

You must then calculate and display the `highestTemperature` and also output the `averageTemperature` for 2019.

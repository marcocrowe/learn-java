
# Paper

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

public Class Example
{
    static void main(String[] args) {
        int number1 = 5;
        add10ByValue(number1);
        System.out.println(number1); // Output: 5

        Integer number2 = 5;
        add10ByReference(number2);
        System.out.println(number2); // Output: 15
    }
    public static void add10ByValue(int number) {
        number += 10;
    }
    public static  void add10ByReference(Integer number) {
        number += 10;
    }
}
```

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

### Question 1(d) [4 Marks]

Give a definition of a two-dimensional array.

### Answer 1.D

A two-dimensional array is an array of arrays. It is a collection of elements arranged in rows and columns. Each element in a two-dimensional array is identified by two indices.

### Question 1(e) [9 Marks]

#### Question 1(e) (i) [3 Marks]

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

| Index |   0 |   1 |   2 |    3 |
|-------|----:|----:|----:|-----:|
| 0     | 1.2 | 9.0 | 3.2 |      |
| 1     | 9.2 | 0.5 | 1.5 | -1.2 |
| 2     | 7.3 | 7.9 | 4.8 |      |

`2` is the row index and `1` is the column index. The value at `values[2][1]` is `7.9`.


#### Question 1.E.2 [3 Marks]


```java
double[]  ] arrayOfNumbers =  { {1.2, 9.0}, ![](Aspose.Words.7fa8a7ba-c30d-4cac-b5c2-45122269fcef.003.png)

`                                                     `{9.2, 0.5, 0.0}, 

`                                                     `{7.3, 7.9, 1.2, 3.9} } ; 

**What is the value of arrayOfNumbers.length ? (iii)** 

int [ ] [ ]  items =  { {0, 1, 3, 4}, ![](Aspose.Words.7fa8a7ba-c30d-4cac-b5c2-45122269fcef.004.png)

`                              `{4, 3, 99, 0, 7 },                               {3, 2} } ; 

**Write a statement that replaces the 99 with 77.** 

**Q 1 (f)   [8 Marks]** Given: 

int [ ] [ ] array2d = {     { 0, 1, 3, 4}, ![](Aspose.Words.7fa8a7ba-c30d-4cac-b5c2-45122269fcef.005.png)

{4, 3, 99, 0, 7}, {3, 2} }; 

Write a nested for loop to print out every element of ***array2d[ ] [ ]*** **?** 

**[End of Question 1]** 

**QUESTION 2       [TOTAL MARKS: 30]** 

**Q 2(a)  [6 Marks]** 

Complete the following. 

More generally, method declarations have the following components, in order:  

1. Modifiers—such as public, private.  
2. The \_\_\_\_\_\_\_\_\_\_\_\_\_\_\_type. 
3. The  \_\_\_\_\_\_\_\_\_\_\_\_\_\_ name. 
4. The \_\_\_\_\_\_\_\_\_\_\_\_\_\_\_ list. 

**Q 2(b)  [24 Marks]** The **Irish general election of 2020** took place on Saturday, 8th of February to elect 

the[ lower house ](http://en.wikipedia.org/wiki/Lower_house)of[ Ireland's](http://en.wikipedia.org/wiki/Republic_of_Ireland) national[ parliament,](http://en.wikipedia.org/wiki/Parliament) the[ Oireachtas.](http://en.wikipedia.org/wiki/Oireachtas)  

There was a total of 12 candidates who contested the election in Limerick City.  

￿  **You are required to write an application** that allows the user to enter 12 integer values representing the total number of votes per candidate & store these in array **electionResults[ ].**  

Once the user has entered the votes for each candidate you must write and call a method called **calculateWinner** passing the array of votes which will calculate and display the candidate who has the overall majority(highest number of votes) and display the winning candidate number. 

***[End of Question 2]*** 

***QUESTION 3  [TOTAL MARKS: 30]* Q 3(a)  [8 Marks]** 

List the advantages of a two-dimensional array over a one-dimensional array.** 

**Q 3(b)  [22 Marks]** 

Write a Java application **(CalculateAverageTemp)** that allows the user to enter the average temperature for each month of the 4 (Spring, Summer, Autumn and Winter) seasons in degrees celcius for 2019. 

Using a nested for loop, store these values in a 2D array called  **TemperatureArray [ ][ ] .**  

You must then calculate and display the **highest\_temperature** and also output the **average\_temperature** for 2019. 

***[End of Question 3]*** 

***[END OF EXAM]*** 
PROG06040 – Prob Solving and Prog Fund 

Summer Examinations 2019/2020  Page 5 of 5 

Here is the content from the exam papers converted into Markdown format:

---

# TUS

## Technological University of the Shannon: Midlands Midwest
Ollscoil Teicneolaíochta na Sionainne: Lár Tíre Iarthar Láir

---

### TECHNOLOGICAL UNIVERSITY OF THE SHANNON: MIDLANDS MIDWEST  
### SUMMER EXAMS 2023/2024

**MODULE:**  


**PROGRAMME(S):**  

- LC_KISYM_KMY Bachelor of Science (Honours) Internet Systems Development  
- LC_KISYM_JMY Bachelor of Science Internet Systems Development  
- LC_KMWCM_KMY Bachelor of Science (Honours) Mobile and Web Computing

**YEAR OF STUDY:** 1

**EXAMINER(S):**  

- Suzanne O Gorman (Internal)  
- Irene Murtagh (External)

**TIME ALLOWED:** 1.45 hours

**Instructions:**  
Answer **All** Questions.  
Answer all questions in your answer book.

## Question 1 (Total Marks: 40)

### Question 1

In Java, how do you retrieve the **number of elements** in a 1D array called `exampleArray[]`?  
*Write the statement to support your answer.*

```java
int numberOfElements = exampleArray.length;
```

### Question 1.B (10 Marks)

Write a Java **method** named `calculateAverage` that takes an array of integers as a parameter and returns the average of all the elements in the array.

```java
public double calculateAverage(int[] array) {
    int sum = 0;
    for (int index = 0; index < array.length; index++) {
        sum += array[index];
    }
    return (double) sum / array.length;
}
```

### Question 1.C (3 Marks)

Given the following 1D array:

```java
double[] arrayOfNumbers = {23.2, 41.1, 25.6, 36.4, 3.1, 67.7, 72.2, 88.8};
```

What is the value of `arrayOfNumbers[2]`?

**(d) [7 Marks]**  
Write a `for` loop structure to print out every element of `arrayOfNumbers[1]` in the previous question.

### Question 1.E (5 Marks)

What is the advantage of using **Binary Search** over **Linear Search** in arrays?

### Answer 1.E

Binary Search is more efficient than Linear Search because it has a time complexity of $O(\log_2 n)$ compared to Linear Search with a time complexity of $O(n)$.

### Question 1.F (10 Marks)

Given the method definition below, **complete the code** for the BubbleSort method:

Online Compiler: [Bubble Sort](https://www.onlinegdb.com/online_java_compiler)

```java
public Class BubbleSortExample
{
    public static void main(String[] args)
    {
        int[] array = {23, 41, 25, 36, 3, 67, 72, 88};
        system.out.println("Original Array: ");
        printArray(array);
        bubbleSort(array);
        System.out.println("Sorted Array: ");
        printArray(array);
    }
    public static void bubbleSort(int array[]) {
        boolean isSorted = false;
        for(int pass = 1; pass <= array.length - 1 && !isSorted; pass++) {
            isSorted = true;
            for(int index = 0; index < array.length - pass; index++) {
                if(array[index] > array[index + 1]) {
                    int lhsCopy = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = lhsCopy;

                    isSorted = false;
                }
            }
        }
    }
    public static void printArray(int array[]) {
        for(int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }
}
```

---

### Question 2  

**(Total Marks: 30)**

Write an **ALGORITHM** for the following program:

The program allows the user to input the `month_number` using appropriate `JOptionPane` and returns the name of the month as a string.

(e.g., `1` for January, `2` for February, etc.)

The program should write and call the method `getMonthName` to achieve the desired functionality using a `switch` statement.

---

### Question 3  

**(Total Marks: 40)**

An employee's annual salary is to increase by a fixed percentage at the end of each year of his employment.

Write a program that will enter an `employee_Number`.

A **Sentinel** value of `-1` must be entered to terminate the list of employees.

For each employee, enter their starting **salary** and their **percentage increase** (e.g., 0.05).

The program should then display a message showing their new annual salary incremented with their **percentage_increase**, calculated using the formula below:

```java
annual_Salary += (annual_Salary / 100) * percentage_Increase;
```

You are also required to calculate and output the **total salaries** paid by the company for all its employees.

---

This Markdown format captures the structure and content of the exam paper for easy readability and reference.

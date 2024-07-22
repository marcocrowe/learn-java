
# **LIMERICK INSTITUTE OF TECHNOLOGY**

**WINTER** **EXAMINATIONS** **2019/2020**

**MODULE:** PROG06041-Prog Fund

## **PROGRAMME(S):**

| LC\_KISYM\_KMY | Bachelor of Science (Honours) Internet Systems Development |
|:---------------|:-----------------------------------------------------------|
| LC\_KISYM\_JMY | Bachelor of Science Internet Systems Development           |
| LC\_KISYM\_IMY | Higher Certificate in Science Internet Systems Development |
| LC\_KIDMM\_KMY | Bachelor of Science (Honours) Interactive Digital Media    |
|                |                                                            |

**YEAR OF STUDY:** 1

**EXAMINER(S):**

| Suzanne O Gorman  | (Internal)                        |
|:------------------|:----------------------------------|
| Mary Ryan         | (Internal)                        |
| Dr. Irene Murtagh | <a name="_goback1"></a>(External) |

**TIME ALLOWED:		2 hours + (10 mins reading time)**  

**INSTRUCTIONS:		1.**	Answer All Questions

2. Question 1 carries 40 Marks
2. All other questions carry equal marks (30 Marks   

`	`each)

2. Indicate clearly on the front of the answer book

`		`which	questions have been attempted.

**PLEASE DO NOT TURN OVER THIS PAGE UNTIL YOU ARE INSTRUCTED TO DO SO.**

The use of programmable or text storing calculators is expressly forbidden.

***There are no additional requirements for this paper.***

## Question 1 (Total Marks 40)

### Question 1 (a) [5 Marks]

The following program writes a name to the screen three times.

```java
//...
String name = "Suzanne";//JOptionPane.showInputDialog("Enter person’s name");
for(int i = 0; i < 3; i++)
    System.out.print(name);
//...
```

Example:

```output
SuzanneSuzanneSuzanne
```

Rewrite the code and modify it so that it will print the name 15 times and

prints one name on each line:-

Example:

```output
Suzanne
Suzanne
Suzanne
```

#### Question 1 (a) Answer


```java
//...
String name = "Suzanne";//JOptionPane.showInputDialog("Enter person’s name");
int limit = 15;
for(int number = 0; number < limit; number++)
    System.out.println(name);
//...
```

### Question 1 (b) [4 Marks]

In Java define what is meant by an arithmetic operator.

#### Question 1 (b) Answer

An arithmetic operator is a mathematical function that takes two operands and performs a calculation on them. The standard arithmetic operators are addition, subtraction, multiplication, and division.

### Question 1 (c) [4 Marks]

What will be the output from the following Java program

```java
class Increment 
{
    public static void main(String args[])
    {
        int var1 = 1 + 5; 
        int var2 = var1 / 4;
        int var3 = 1 + 5;
        int var4 = var3 % 4;
        System.out.print(var2 + " " + var4);
    }
}
```

#### Question 1 (c) Answer

`int var1 = 1 + 5` results in `var1` being assigned the value `6`.
`int var2 = var1 / 4` results in `var2` being assigned the value `1` because `var1 / 4` is integer division. Integer division truncates the decimal part of the result.
`int var3 = 1 + 5` results in `var3` being assigned the value `6`.
`int var4 = var3 % 4` results in `var4` being assigned the value `2` because `var3 % 4` is the remainder of the division of `var3` by `4`.
`System.out.print(var2 + " " + var4)` prints `1 2` because `var2 + " " + var4` concatenates the values of `var2` and `var4` with a space between them.

```output
1 2
```

### Question 1 (d) [4 Marks]

What is the syntax of if/else statement?

#### Question 1 (d) Answer

The syntax of an if/else statement is as follows:

```java
//...
if (condition == true) {
    // code to execute if the condition is true
} else {
    // code to execute if the condition is false
}
//...
```

### Question 1 (e) [8 Marks]

Explain your understanding of the following code:

```java
//...
switch(letter)
{
    case 'a':
        System.out.println("Vowel");  
        break;  
    case 'e':   
        System.out.println("Vowel");  
        break;  
    case 'i':   
        System.out.println("Vowel");  
        break;  
    case 'o':   
        System.out.println("Vowel");  
        break;  
    case 'u':   
        System.out.println("Vowel");  
        break;  
    case 'A':   
        System.out.println("Vowel");  
        break;  
    case 'E':   
        System.out.println("Vowel");  
        break;  
    case 'I':   
        System.out.println("Vowel");  
        break;  
    case 'O':   
        System.out.println("Vowel");  
        break;  
    case 'U':   
        System.out.println("Vowel");  
        break;  
    default:   
        System.out.println("Consonant");
}
//...
```

#### Question 1 (e) Answer

The code is a switch statement that checks the value of the variable `letter`. If `letter` is equal to any of the characters `'a'`, `'e'`, `'i'`, `'o'`, `'u'`, `'A'`, `'E'`, `'I'`, `'O'`, or `'U'`, then the code prints "Vowel". If `letter` is not equal to any of those characters, then the code prints "Consonant".

### Question 1 (f) [3 Marks]

Referring to the code below, what will be the output of the following for loop?

```java
//...
for(int i=0; i < 10;  i++)
    System.out.println(i * i);
//...
```

#### Question 1 (f) Answer

```output
0
1
4
9
16
25
36
49
64
81
```

### Question 1 (g) [4 Marks]

What are nested loops?

#### Question 1 (g) Answer

Nested loops are loops that are contained within another loop. The inner loop is executed for each iteration of the outer loop.

### Question 1 (h) [8 Marks]

Write a nested for loop to achieve the following output.

```out
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

#### Question 1 (h) Answer

```java
//...
for (int lineNumber = 1; lineNumber <= 5; lineNumber++) {
    for (int number = 1; number <= lineNumber; number++) {
        System.out.print(number + " ");
    }
    System.out.println();
}
//..
```

## Question 2 (Total Marks 30)

### Question 2(a) [12 Marks]

Tax is charged as a percentage of your income. The percentage that you pay depends on the amount of your income. The first part of your income, up to a certain amount, is taxed at 20%.

The standard rate cut-off point for a single person is €35,300 and is taxed at the standard rate, (20%)

The remainder of your income is taxed at the *higher rate of tax*, 40% in 2019.

A single taxpayer who earns €40,000 a year will have their tax calculated as follows:

The standard rate band for a single taxpayer is €35,300.

This means that the first €35,300 is taxed at the standard rate of tax, 20%, and the remainder (€4,700) is taxed at the higher rate of tax, 40%.

| Calculation    | Amount |
|:---------------|-------:|
| €35,300 x 20%  | €7,060 |
| €4,700 x 40%   | €1,880 |
| Total          | €8,940 |

You are required to write a program that inputs the **income** for a single person from the keyboard.

Your program must then calculate and displays the **tax** due on that **income**.

#### Question 2(a) Answer

#### Question 2(b) [8 Marks]

Modify the program from part **(a)** so that the user can enter several**income** amounts and get the **tax** due on each.

The user can stop the program by entering 0 for **income**

### Question 3 (Total Marks 30)

### Question 3(a) [8 Marks]

A carbon footprint is historically defined as the total emissions caused by an individual, event, organization, or product, expressed as carbon dioxide equivalent.

You are required to write a program that calculates the CO2 emissions in pounds for your household motor vehicle using the formula given below:

### Question 3(b) [14 Marks]

Firstly, you must enter the **model\_of \_car** (ie Opel Insignia), the  **number\_of\_miles** driven by the motorist per week and the fuel efficiency **(mpg)** of that vehicle **(miles travelled per gallon  ie** **53.3mpg)**

**Formula:**  

**CO<sub>2</sub> emissions in pounds =** ((number of miles driven per week × weeks in a year) / fuel efficiency per vehicle(miles travelled per gallon) × pounds of CO<sub>2</sub> emitted per gallon × emissions of greenhouse gases other than CO<sub>2</sub>  **where :**

Pounds of CO<sub>2</sub> emitted per gallon = 19.4  
Emissions of greenhouse gases other than CO<sub>2</sub> = (100 / 95)

### Question 3(c) [8 Marks]

Your program must display the model of car along with the CO2 emissions for that vehicle formatted to 1 place of decimal

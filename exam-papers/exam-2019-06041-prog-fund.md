## ![](Aspose.Words.1986235a-77b1-4b97-9ec4-b6a3cecb24b7.001.jpeg)





prog06041-prog-fund

# **LIMERICK INSTITUTE OF TECHNOLOGY**

**WINTER** **EXAMINATIONS** **2019/2020**


**MODULE:**			PROG06041-Prog Fund
### **PROGRAMME(S):**	

|LC\_KISYM\_KMY|Bachelor of Science (Honours) Internet Systems Development|
| :- | :- |
|LC\_KISYM\_JMY|Bachelor of Science Internet Systems Development|
|LC\_KISYM\_IMY|Higher Certificate in Science Internet Systems Development|
|LC\_KIDMM\_KMY|Bachelor of Science (Honours) Interactive Digital Media|
|||
**YEAR OF STUDY:**		1

**EXAMINER(S):**

|Suzanne O Gorman|(Internal)|
| :- | :- |
|Mary Ryan|(Internal)|
|Dr. Irene Murtagh|<a name="_goback1"></a>(External)|


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


**….**

**….**
### **Q 1 (b)	[4 Marks]**

In Java define what is meant by an arithmetic operator.

### **Q 1 (c)	 [4 Marks]**
**									

What will be the output from the following Java program

|<p>1. **class increment** </p><p>2. `    `**{**</p><p>3. `        `**public static void main(String args[])**</p><p>4. `        `**{**</p><p>5. `            `**int var1 = 1 + 5;** </p><p>6. `            `**int var2 = var1 / 4;**</p><p>7. `            `**int var3 = 1 + 5;**</p><p>8. `            `**int var4 = var3 % 4;**</p><p>9. `            `**System.out.print(var2 + " " + var4);**</p><p>10. `         `**}**</p>|
| - |
### **Q 1 (d)	 [4 Marks]**

What is the syntax of if/else statement?

**									
### **Q 1 (e)	 [8 Marks]**

**Explain your understanding of the following code:**

|<p>`    `**switch**(letter)  </p><p>`   `{  </p><p>`        `**case** 'a':   </p><p>`            `System.out.println("Vowel");  </p><p>`            `**break**;  </p><p>`        `**case** 'e':   </p><p>`            `System.out.println("Vowel");  </p><p>`            `**break**;  </p><p>`        `**case** 'i':   </p><p>`            `System.out.println("Vowel");  </p><p>`            `**break**;  </p><p>`        `**case** 'o':   </p><p>`            `System.out.println("Vowel");  </p><p>`            `**break**;  </p><p>`        `**case** 'u':   </p><p>`            `System.out.println("Vowel");  </p><p>`            `**break**;  </p><p>`        `**case** 'A':   </p><p>`            `System.out.println("Vowel");  </p><p>`            `**break**;  </p><p>`        `**case** 'E':   </p><p>`            `System.out.println("Vowel");  </p><p>`            `**break**;  </p><p>`        `**case** 'I':   </p><p>`            `System.out.println("Vowel");  </p><p>`            `**break**;  </p><p>`        `**case** 'O':   </p><p>`            `System.out.println("Vowel");  </p><p>`            `**break**;  </p><p>`        `**case** 'U':   </p><p>`            `System.out.println("Vowel");  </p><p>`           `**break**;  </p><p>`        `**default**:   </p><p>`            `System.out.println("Consonant");  </p>|
| :- |

### **Q 1 (f)**	**[3 Marks]**

Referring to the code below, what will be the output of the following for loop?


for(int i=0; i < 10;  i++)


System.out.println(i \* i);


**Q 1 (g) 									    [4 Marks]**

What are nested loops?



**Q 1 (h)								              [8 Marks]**


Write a nested for loop to achieve the following output.

1

1 2

1 2 3

1 2 3 4

1 2 3 4 5
**


**[End of Question 1]**
##
##



## ***QUESTION 2	[TOTAL MARKS: 30]***
### **Q 2(a)**	

Tax is charged as a percentage of your income. The percentage that you pay depends on the amount of your income. The first part of your income, up to a certain amount, is taxed at 20%.

The standard rate cut-off point for a single person is €35,300 and is taxed at the standard rate, (20%)

The remainder of your income is taxed at the *higher rate of tax*, 40% in 2019.

|<p>For example:</p><p>A single taxpayer who earns €40,000 a year will have their tax calculated as follows:</p><p>The standard rate band for a single taxpayer is €35,300.</p><p><br>This means that the first €35,300 is taxed at the standard rate of tax, 20%, and the</p><p>` `remainder (€4,700) is taxed at the higher rate of tax, 40%.</p><p><br>€35,300 x 20% = €7,060</p><p><br>€4,700 x 40% =    €1,880<br>Total = €8,940</p>|
| :- |

You are required to write a program that inputs the **income** for a single person from the keyboard. 

`										    `**[8 Marks]**

Your program must then calculate and displays the **tax** due on that **income**.

`										  `**[12 Marks]**










### **Q 2(b)	[8 Marks]**

Modify the program from part **(a)** so that the user can enter several **income**

amounts and get the **tax** due on each. 

The user can stop the program by entering 0 for **income**

**[End of Question 2]**
## ***QUESTION 3	[TOTAL MARKS: 30]***
###
### **Q 3**	
### A carbon footprint is historically defined as the total emissions caused by an individual, event, organization, or product, expressed as carbon dioxide equivalent. 

### You are required to write a program that calculates the CO2 emissions in pounds for your household motor vehicle using the formula given below:
`										  `**[8 Marks]**

Firstly, you must enter the **model\_of \_car** (ie Opel Insignia), the  **number\_of\_miles** driven by the motorist per week and the fuel efficiency **(mpg)** of that vehicle **(miles travelled per gallon  ie** **53.3mpg)** 						

`  										 `**[14 Marks]**

**Formula:**
### **CO<sub>2</sub> emissions in pounds =** ((number of miles driven per week × weeks in a year) / fuel efficiency per vehicle(miles travelled per gallon) × pounds of CO<sub>2</sub> emitted per gallon × emissions of greenhouse gases other than CO<sub>2</sub>
### **where :**
###
### Pounds of CO<sub>2</sub> emitted per gallon = 19.4
###
### Emissions of greenhouse gases other than CO<sub>2</sub> = (100 / 95)

**Your program must display the model of car along with the CO2 emmissions for that vehicle formatted to 1 place of decimal**				

` 										   `**[8 Marks]**
###
###			
##
##
## ***[End of Question 3]***





***[END OF EXAM]***
-------------------

PROG06041 – Prog Fund

Winter Examinations 2019/2020				 Page 7 of 7



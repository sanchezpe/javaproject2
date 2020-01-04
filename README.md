# Programming Project #2

## The Data
Hospitals are rated in a variety of ways. One of these is mortality rates for a number of serious conditions. The file "hospitalMortality.txt contains mortality statistics for a large numfer of hospitals from around the United States for 5 serious conditions. The codes for these conditions and their definitions are listed below:
- MORT_30_AMI --> Acute Myocardial Infarction (AMI) 30Day Mortality Rate 
- MORT_30_COPD --> Death rate for chronic obstructive pulmonary disease (COPD) patients 
- MORT_30_HF --> Heart failure (HF) 30Day Mortality Rate
- MORT_30_PN --> Pneumonia (PN) 30Day Mortality Rate
- MORT_30_STK --> Death rate for stroke patients

The organization of the file “hospitalMortality.txt” is as follows:
```
hospital-code<space>condition-code<space>mortiality-score
hospital-code<space>condition-code<space>mortiality-score
hospital-code<space>condition-code<space>mortiality-score
...
hospital-code<space>condition-code<space>mortiality-score
<the end of the file (eof)>
```
where *hospital-code* is a nonnegative  integer; hospitals are given codes in increasing sequential order, starting with zero, throughout the file
*condition-code*  is one of the 5 codes given above
*mortality-score* is a floating point number; a valid score is a nonnegative
number, a negative 1 (1) indicates that there was not enough data to calculate a score

## Program Description
Write an object oriented Java program that, when run, will allow the user to select
to display the following information for any of the 5 listed mortality conditions.
1. the number of valid (value above 1) mortality scores
2. the maximum valid (value above 1) mortality score
3. the minimum valid (value above 1) mortality score
4. a list of the hospitals with the maximum valid mortality score
5. a list of the hospitals with the minimum valid mortality score
6. the mean (average) valid mortality score
7. all high risk hospitals; high risk is defined as being in the top 25% of mortality scores
8.  all low risk hospitals; low risk is defined as being in the bottom 25% of mortality scores

## Project Requirements
**1. Create the  project and place the data file in its folder.**
**2. Model a mortality rating in a class.**
A mortality rating consists of the state information hospital code, the condition code and the mortality score. The state values may not be changed once the mortality rating instance object is created, but they will need to be individually retrieved. In your project, create and test a new Java class that models a a mortality rating. Note: This class can be written in less than 40 lines of code, including blank lines between methods and end of code block lines. 

**Requirement**: No output or user input is allowed in this class, only passing of arguments into constructors and returns from methods are allowed. 

*Tip*: Create and instance object of the mortality rating class and test each constructor and method until you are satisfied that it works correctly.

**3. Model a mortality rating list in a class.**
A mortality rating list consists of a data structure containing the mortality ratings instance objects, plus methods that, passed a condition code, return information gleaned from the list. The categories of information that the class will return from these methods include the valid number of mortality scores that match the condition code
- the largest valid mortality score of scores that match the condition code
- the smallest valid mortality score of scores that match the condition code
- a string containing the hospital codes of hospitals that match the largest valid mortality score of scores that that match the condition code
- a string containing the hospital codes of hospitals that match the smallest valid mortality score of scores that that match the condition code
- the mean (average) valid mortality score of the matching condition code
- a string containing the hospital codes of all high risk hospitals of the matching condition code
- a string containing the hospital codes of all low risk hospitals of the matching condition code

**Note**: This class is substantially longer than the previous class and will require 3 to 4 times more code.

**Requirement:** There is to be no user I/O within the mortality rating list class.

**Requirement:** The data structure within the class that contains the mortality ratings is required to be a
private instance object of type `java.util.ArrayList<mortalityratingclass>`.

*Tip:* Pass the file name of the file containing the mortality information to the constructor of this class and load all information into the `java.util.ArrayList<mortalityratingclass>` instance object.

*Tip:* Create and instance object of the mortality rating list class and test each constructor and method until you are satisfied that it works correctly.

**4. Using an instance object of the mortality rating list class, write the code that satisfies the requirements as given in the program description.**
This code must
- create an instance object of the mortality rating list class and load the data from the file named by the user.
- present a menu of options until the user elects to halt the program.
- act upon the user's choices by calling the necessary methods of the mortality rating list class instance object and displaying the information returned.

## Output of an Example Run

	1 – Acute Myocardial Infarction
	2 – Chronic Obstructive Pulmonary Disease
	3 – Heart Failure
	4 – Pneumonia
	5 – Stroke
	0 – Exit Program
	Enter choice: 2

	1 – number of mortality scores
	2 – maximum mortality score
	3 – minimum mortality score
	4 – hospitals with the maximum mortality score
	5 – hospitals with the minimum mortality score
	6 – average mortality score
	7 – high risk hospitals
	8 – low risk hospitals
	Enter choice: 1

	3685 valid scores for Chronic Obstructive Pulmonary Disease
	___

	1 – Acute Myocardial Infarction
	2 – Chronic Obstructive Pulmonary Disease
	3 – Heart Failure
	4 – Pneumonia
	5 – Stroke
	0 – Exit Program
	Enter choice: 4

	1 – number of mortality scores
	2 – maximum mortality score
	3 – minimum mortality score
	4 – hospitals with the maximum mortality score
	5 – hospitals with the minimum mortality score
	6 – average mortality score
	7 – high risk hospitals
	8 – low risk hospitals
	Enter choice: 7

	High Risk Hospitals for Pneumonia:
	6 75 239 244 247 252 290 391 448 504 587 970 1033 1246 1277 1400 1450 1515 1531 1733 2128 2296 2389 2436 2592 2731 3019 3034 3186 3275 3285 3354 3663 3865 4087 4417 4431
	___

	1 – Acute Myocardial Infarction
	2 – Chronic Obstructive Pulmonary Disease
	3 – Heart Failure
	4 – Pneumonia
	5 – Stroke
	0 – Exit Program
	Enter choice: 4

	1 – number of mortality scores
	2 – maximum mortality score
	3 – minimum mortality score
	4 – hospitals with the maximum mortality score
	5 – hospitals with the minimum mortality score
	6 – average mortality score
	7 – high risk hospitals
	8 – low risk hospitals
	Enter choice: 8

	Low Risk Hospitals for Pneumonia:
	31 138 148 153 168 195 277 278 281 319 341 350 357 369 372 374 376 380 381 383 392 399 411 429 444 451 454 469 478 491 493 508 509 514 529 542 544 556 579 619 623 643 644 667 686 694 706 717 729 744 759 766 774 780 802 856 878 894 897 1128 1129 1131 1142 1151 1152 1154 1171 1192 1200 1204 1210 1219 1223 1225 1278 1304 1321 1415 1428 1437 1558 1589 1639 1653 1783 1848 1868 1891 1914 1916 1918 1925 1929 1931 1939 1958 1980 1986 1987 1988 1991 1994 2014 2018 2027 2039 2044 2046 2052 2055 2065 2080 2095 2174 2187 2370 2377 2382 2405 2413 2425 2428 2429 2478 2599 2652 2657 2689 2700 2710 2715 2723 2728 2729 2791 2809 2811 2824 2829 2838 2868 2875 2889 2908 2933 2982 3001 3017 3018 3022 3073 3136 3191 3200 3212 3229 3273 3294 3331 3359 3366 3431 3441 3475 3476 3500 3545 3558 3563 3566 3568 3576 3579 3585 3595 3602 3610 3613 3740 3783 3901 3907 3941 3946 3947 3958 3985 3989 4000 4007 4042 4045 4068 4081 4116 4125 4131 4160 4387 4400 4439 4497 4514 4565 4594 4722 4737
	___

	1 – Acute Myocardial Infarction
	2 – Chronic Obstructive Pulmonary Disease
	3 – Heart Failure
	4 – Pneumonia
	5 – Stroke
	0 – Exit Program
	Enter choice: 4

	1 – number of mortality scores
	2 – maximum mortality score
	3 – minimum mortality score
	4 – hospitals with the maximum mortality score
	5 – hospitals with the minimum mortality score
	6 – average mortality score
	7 – high risk hospitals
	8 – low risk hospitals
	Enter choice: 6

	Average score for Pneumonia: 12.0
	____

	1 – Acute Myocardial Infarction
	2 – Chronic Obstructive Pulmonary Disease
	3 – Heart Failure
	4 – Pneumonia
	5 – Stroke
	0 – Exit Program
	Enter choice: 0
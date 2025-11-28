# TANDEMLOOP-ASSESSMENT-TEJASREE

# Coding Test Solutions – Java

This repository contains solutions to the four problems provided in the coding test.  
All programs are written in **Java**, and each problem is solved in a separate file as required.

## 📌 Problem-1: Calculator Using Class

A simple calculator implemented using a Java class.  
It performs the following operations:

- Addition (`add`)
- Subtraction (`sub`)
- Multiplication (`mul`)
- Division (`div`)

**Inputs:**  
- `a` → double  
- `b` → double  
- `operation` → string  

## 📌 Problem-2: Generate Odd Number Series

With an integer input `a`, the program prints the first `a` odd numbers.

Example:
- Input: `4`  
  Output: `1, 3, 5, 7`

## 📌 Problem-3: Odd Series Based on Largest Odd ≤ a

The output follows this rule:

- If `a` is **odd** → print odd numbers from 1 to `a`
- If `a` is **even** → print odd numbers from 1 to `a - 1`

Examples:

| Input | Output |
|-------|---------|
| 1 | 1 |
| 2 | 1 |
| 3 | 1, 3, 5 |
| 4 | 1, 3, 5 |
| 5 | 1, 3, 5, 7, 9 |
| 6 | 1, 3, 5, 7, 9 |


## 📌 Problem-4: Count Multiples of 1–9

Given a list of integers, count how many numbers are divisible by each digit from `1` to `9`.

Example input:
[1,2,8,9,12,46,76,82,15,20,30]
Output:
{1=11, 2=8, 3=4, 4=4, 5=3, 6=2, 7=0, 8=1, 9=1}

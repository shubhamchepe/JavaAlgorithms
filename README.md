# 📘 Java Algorithm Practice

Welcome to my Java Algorithm Practice repository! This project is a collection of algorithm implementations and data structure exercises written in Java. It's designed for interview preparation, skill development, and showcasing clean, modular Java code.

---

## 📂 Project Structure

JavaAlgorithms/
├── src/
│ ├── Main.java
│ └── PracticeOne/
│ ├── SwapTwoNumbers.java
│ ├── BinarySearch.java
│ └── ...
├── README.md


---

## 🚀 Algorithms Implemented

| Category             | Algorithm / Problem             | Description                                     |
|----------------------|----------------------------------|-------------------------------------------------|
| 🔁 Basics            | Swap Two Numbers                | Swap variables using temp and without temp      |
| 🔍 Search Algorithms | Binary Search                   | Efficient search in sorted arrays               |
| 🔢 Sorting Algorithms| Bubble Sort, Quick Sort         | Classic sorting techniques                      |
| 🧠 Recursion         | Factorial, Fibonacci            | Recursive thinking and backtracking practice    |
| 🧰 Data Structures   | Stack, Queue, LinkedList        | Core implementations from scratch               |
| 📊 Dynamic Programming | Fibonacci (DP), 0/1 Knapsack  | Memoization and tabulation techniques           |

> ✅ Each file contains a self-contained implementation with comments for clarity.

---

## 🧪 Sample Code Example

```java
// src/PracticeOne/BinarySearch.java
package PracticeOne;

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}

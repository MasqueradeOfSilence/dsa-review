# dsa-review
reviewing and recoding common DS&amp;A

## Our Source Material
- [Programiz: Data Structures and Algorithms](https://www.programiz.com/dsa)

## Objectives
- Be able to Explain, Walk Through, Implement, Test, Runtime Analyze, and Space Analyze the following data structures:
  - (list here from Programiz, and link an MD for each that is within this repo TODO)

## Q&A
- What is the definition of an algorithm? 
  - An **algorithm** is a series of actions taken in order to execute a task. 
  - It takes *in* input, and *produces* output. 
- What is the definition of a data structure? 
  - A **data structure** is an abstract container that houses and organizes data. 
- What is the difference between a linear and non-linear data structure?
  - A linear data structure is one in which data is structured in a sequential order, similar to a line. 
  - In non-linear data structures, data is not sequential. Instead, it is either hierarchical (tree-like) or associative (map-like). 
- What is asymptotic analysis?
  - It is defined as the study of how an algorithm's performance changes based on the size of the input.
  - Define Big-O Notation:
    - Big-O Notation is the upper-bound, AKA worst-case analysis of an algorithm. 
  - Define Omega Notation (Ω):
    - Omega Notation represents the lower bound, AKA best-case analysis of an algorithm. 
  - Define Theta Notation (Θ):
    - Theta Notation represents the average-case analysis of an algorithm. We can visualize two lines on either side of 
     the function, an upper and lower bound, which the function graph will eventually settle between (though it may go 
     above/below at first, since it's more about what it settles into.)
- What is the master theorem? 
  - The master theorem describes the complexity of divide-and-conquer algorithms. 
    - A divide and conquer algorithm is an algorithm that can be solved by dividing it into multiple subproblems, 
     solving each, and combining the result.
  - The end result of the master theorem is the algorithm's Big-O.
    - It does this by solving 3 questions:
      1. How many subproblems?
      2. How big is each subproblem?
      3. How much work is there to combine?
  - Mathematical Definition:
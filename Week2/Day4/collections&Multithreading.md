1. What is the Java Collections Framework? Explain its advantages.

    =>

       Java Collections Framework (JCF) is a set of classes and interfaces provided in Java to store, manage, and manipulate groups of objects. It includes structures like List, Set, Queue,

       and Map, along with algorithms such as sorting and searching.

    Advantages:

        Reusability: Need not to write own data structures.

        Consistency: All collection classes follow a common interface, making them easy to learn and use.

        Performance: Collections are optimized for better speed and memory usage.

        Built-in Algorithms: Sorting, searching, and shuffling are available through utility classes like Collections.

        Flexibility: Can store different types of data and switch from one collection type to another easily.


3. List the differences between Vector, ArrayList, LinkedList, and HashSet.
   
    =>
   
     Vector:

          Vector is a legacy class in Java that was introduced in the earlier versions of Java. It stores elements in a dynamic array and can grow or shrink as needed. The main

          characteristic of Vector is that it is synchronized, which means it is thread-safe and can be safely used in multi-threaded environments. However, because of synchronization,

          Vector is comparatively slower than other collection classes like ArrayList.

      ArrayList:
   
          ArrayList is one of the most commonly used classes in the Collections Framework. It also uses a dynamic array internally to store elements. ArrayList is not synchronized,

          which makes it faster than Vector when working in a single-threaded environment. It preserves the insertion order and allows duplicates.

      LinkedList:

          LinkedList is a list implementation that uses a doubly linked list internally. Each node contains references to both the previous and next node. Unlike ArrayList, LinkedList does

          not need shifting when inserting or removing elements, so insertion and deletion operations are faster, especially in the middle of the list.

      HashSet:

          HashSet is a collection class that implements the Set interface and stores elements in a hash table. HashSet does not allow duplicate elements and does not maintain any insertion

          order. The internal hashing mechanism helps in achieving very fast lookup, insertion, and removal operations. It is commonly used when the goal is to maintain a collection of

          unique elements and order does not matter.

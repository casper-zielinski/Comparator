# Comparator Exercise (Java SDK)

## StringIgnoreCaseComparator

- Description  

> Comparing two Strings but ignoring the Case. so when sorting a String Array, it does not matter if it's Uppercase or Lowercase, but if it comes Alhpabetically before or after.

- Reflection Questions:

  - Why is the Comparator an interface and not a class?  
  A: Because it has Methods that are meant to be overriden. The Comparator is designed to define comparison logic. It being an interface makes it more flexible as well, you can implement Comparator and extend a class.
  - What would be the effects when implementing Comparator instead of Comparator\<String>\?  
  A: Working with raw types instead of a exact type (String). With this the Compiler can't check which types are being compared. You are able to pass more types than a String, but that can result in a ClassCastException Error.

## CharacterUpperAfterLowerComparator

- Description  

> Compares two Character values and checks, if they are Numeric, lowercase Alphabetic or uppercase Alphabetic. In the ASCII Table the Uppercase Letters are before the Uppercase and Numbers are before both Letters. Using this Comparator it is possible to sort the Characters from Lowecase -> Uppercase -> Digits and still sorting the individual Letters and Numbers in correct Order.
>Example:  
 ``Character[] chars = {'b', '2', 'M', 'n', '4', 'B', 'N', 'm'};``  
> Sorted with CharacterUpperAfterLowerComparator:  
 *[b, m, n, B, M, N, 2, 4]*

- Reflection Questions:
  - Why does implements Comparator\<char> not work?
  A: char is a primitive Type and Java generics only work with reference Types like Character for example.
  - Could you implement a comparator for emojis in Java?
  A: Yes, because there is an existing Character.isEmoji\<and other>()Method. Using this Method, it is possible to also sort emojis using that Comparator.

## ByLastWordComparator

- Description
>

- Reflection Questions:
  - When you try the example solution on the following array, why is the resulting order differ from the example above?
  - above: Before: ``String[] fruits = { "banana", "apple", "green apple", "cherry", "yellow banana", "red cherry" };``  
  After: ``[apple, green apple, banana, yellow banana, cherry, red cherry]``
  - following example:  
  Before: ``String[] fruits = { "apple", "green apple", "yellow banana", "red cherry", "cherry", "banana" };`` After: ``?``

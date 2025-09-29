[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=20786993)
# unit-2-4-assignment

## Git Config
```
git config user.name "yourUser"
git config user.email "yourEmail"
```

## Compiling and Running Java Code
```
javac FileName.java
java FileName
```

## Problem 1 - LastFirstN
Createa a method named `lastFirstN` to take two string inputs, `s1` and `s2` as well as an `int` input represented as `n`.

After it takes the three inputs, it should return a string that is made up of the last `n` letters of `s1` and the first `n` letters of `s2`.

Assume that `n` is between 0 and the length of the shorter string.

$$ 0 \leq n \leq \min(\verb|s1.length()|,\ \verb|s2.length()|) $$

Utlize user input, and test your method in the `main()` method to make sure it works as intended.

Sample run
```
Sample inputs:
cream
butter
3

Output:
eambut
```

```java
public static void lastFirstN(String s1, String s2, int n)
{

}
```

## Problem 2 - stringManip
Write a void method named `stringManip` that takes in two strings as input, and prints the following:
* The first string in all upper case,
* The second string with only its first letter to upper case, with the rest being lower case

The `String` methods `toUpperCase()` and `toLowerCase()` will be useful here.  Note that these methods do not change the string variables themselves, so you'll have to either reassign the upper/lower case versions to the original strings, or store them in separate variables.

In other words, this code does nothing.
```java
String s = new String("hello");
s.toUpperCase();
System.out.println(s);  // I get "hello"
```

But this code will give me the proper upper case version of my word.
```java
String s = new String("hello");
String s2 = s.toUpperCase();  // option 1
s = s.toUpperCase();  // option 2
```

```java
public static void stringManip(String s1, String s2)
{

}
```

## Problem 3 - removeStr
Write a method named `removeStr` that takes in two Strings as input:
* The first, `s1`, is a word, phrase, or sentence
* The second, `s2`, is a substring of `s1`.

The method will remove the first instance of `s2` from `s1`, and return the new String with `s2` removed from it.

**Sample Run**
```
Sample Inputs:
badaboom
ada

Sample Output:
bboom  // the substring "ada" has been removed
```

Assume that `s2` will always be found at least one time in `s1`.

```java
public static String removeStr(String s1, String s2)
{
  String output = null;
  return output;
}
```

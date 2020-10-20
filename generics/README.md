# Java Generics

- POC to learn how Generics works

### Overview of Generics

- Generics are a facility of generic programming that were added to the Java programming language in 2004 within version 5.
- They were designed to extend Java's type system to allow "a type or method to operate on objects of various types while providing compile-time type safety"
- Increase code **reusability**
- Avoid ClassCastException using Object type
- Only can be used on instances, not on static context
- Primitive types cannot be used to initiate a generic type, only Wrappers
- The Java convention to name type parameters is single, uppercase letters

### Class Type Parameters

- Type Parameters provide class a parameter, to let the compiler check the **type** at runtime
- Generic class can extends generic classes and implements generic interfaces 
- Generic class can extends a non-generic class
- Generic class can implements a non-generic interface
- Non-generic class can implements generic interfaces (only if the type parameter is a non generic interface)
- Non-generic class can extends generic classes (only if the type parameter is a non generic class)

### Raw Types
- Raw Type is a generic class without type argument/parameters
- Is **NOT** type-safe
- Avoid using raw types, compiler will not raise compile-time exception if a raw-type collection had more than 1 type
- Raw-type were retained to maintain compatibility with older versions of Java

### Multiple Type Parameters
- You can pass as many type parameters as you want to a class
- For example, HashMap receives 2 type parameters, a key and a value

### Bounded Type Parameters
- Bounded type parameters forces the generic class to follow some rules like extending some other class
- Just like class bounded type parameters, method bounded type parameters forces the received generic class to follow some rules like extending some other class

### Method Type Parameters
- To turn a method on generic method, is necessary to put type parameter between angle brackets before de return type

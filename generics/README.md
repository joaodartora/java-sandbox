# Java Generics

- POC to learn how Generics works

### Generic Types

- Type Parameters provide class a parameter, to let the compiler check the type at runtime
- Avoid ClassCastException using Object type
- Increase code reusability
- Only can be used on instances, not on static context
- Primitive types cannot be used to initiate a generic type, only Wrappers

- Generic class can extends generic classes and implements generic interface 
- Non-generic class can implements generic interfaces (only if the type parameter is a non generic interface)
- Non-generic class can extends generic classes (only if the type parameter is a non generic class)

- Generic class can extends a non-generic class
- Generic class can implements a non-generic interface


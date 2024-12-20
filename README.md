# Scala Name Conflicts and Method Access Errors

This repository demonstrates a common Scala error related to name conflicts and method access issues.  The error typically manifests as a compiler error indicating that a method is not found within a class, even when it appears to be correctly defined.  The example provided illustrates this error and shows a potential solution.

## Error Description
The error commonly appears as `value myMethod is not a member of MyClass`.  The root cause often involves a name clash with another definition or a problem within the class's definition that obscures method accessibility.

## Potential Causes
* **Name Clashes:** An improperly named variable or function within the scope could shadow the `myMethod` function, leading to the compiler not finding the intended method.
* **Class Definition Issues:** Errors in the class definition (e.g., incorrect access modifiers or inheritance problems) could hinder method visibility.

## Reproducing the Error
The `bug.scala` file contains code that reproduces the error. Uncommenting the relevant lines will trigger the compilation error.
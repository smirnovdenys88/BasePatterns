# BasePatterns

Design patterns are typical solutions to common problems
in software design. Each pattern is like a blueprint
that you can customize to solve a particular
design problem in your code.

Design patterns differ by their complexity, level of detail and scale of applicability to the entire system being designed. I like the analogy to road construction: you can make an intersection safer by either installing some traffic lights or building an entire multi-level interchange with underground passages for pedestrians.

In addition, all patterns can be categorized by their intent, or purpose. This book covers three main groups of patterns:

**Creational** patterns provide object creation mechanisms that increase flexibility and reuse of existing code.

`Singleton` is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

`Factory Method` is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

`Abstract Factory` is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

`Builder` is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

`Prototype` is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

**Structural** patterns explain how to assemble objects and classes into larger structures, while keeping the structures flexible and efficient.

**Behavioral** patterns take care of effective communication and the assignment of responsibilities between objects.
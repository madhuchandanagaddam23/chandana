7)How does Garbage Collection work in JVM? 
In Java, memory is allocated in the Heap when you create objects using new.
Once an object is no longer reachable (no variable or reference is pointing to it), it becomes eligible for Garbage Collection.
Garbage Collector (GC) is part of the JVM Execution Engine that reclaims this unused memory automatically.
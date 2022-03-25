# Oblig 4
##### https://hiof.instructure.com/courses/5104/assignments/25734

### Oppgave 1.1
#### Exceptions:
In java we have three main types of exceptions: Checked- (compiletime), unchecked- (runtime) and error-exceptions. Checked-exceptions are exceptions that we as developers should be able to expect and Java should be able to handle by either catching it and doing something about it, or simply throwing it. These exceptions are a common occurance and can for example occur when you try to access a non-existent file, which throws a FileNotFoundException. 

Unchecked exceptions are on the other hand errors in the logic of the code, which you not necessarily can expect and occurs because we have done something wrong. Unchecked-exceptions can will occur if you try to access an element in an array which is out of bounds or if you try to divide by zero.

The last exceptions, error-exceptions, are more severe exceptions which we are developers, or Java is often not able to handle. Error-exceptions can also be way more unpredictable than the two above. Examples of errors can be memory leaks in your program, the JVM running out of memory, no more disk space, stack overflow errors etc.


### Oppgave 1.2
![UML Diagram](https://github.com/Brannstroom/2022V-Programmering_2/blob/main/oblig4/uml_diagram.png?raw=true)

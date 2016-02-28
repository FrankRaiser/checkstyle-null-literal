# checkstyle-null-literal
A CheckStyle plugin to flag `null` keyword usage.

## Usage

Building the plugin jar is as simple as:
```
mvn package
```

The resulting `checkbugs-null-literal-<version>.jar` is then found in the `target` folder. Simply add it to the classpath for your checkstyle runs and extend your configuration `.xml` file to include the following check:
```
<module name="de.frankraiser.checkstyle.NullLiteralCheck"/>
```

## Bug Pattern	

This detector plugin constitutes an experiment in ultimately eliminating explicit `null` occurrences from your Java source code. 
Generally, with Java 8's `java.util.Optional` there is little to no need for writing `null` in your own code. 

Since Java is .. well Java, there are exceptions when you still cannot avoid it. In those cases you may have to ignore the findings.
However, as far as I am aware, these exceptions are limited to a single use-case: 3rd-party library calls, where a method argument is
explicitly required to be `null` for the desired invocation semantics. Yes, it sounds as horrible as it is, so with a bit of luck you're
able to run this detector to remove all remaining occurrences from your code base and ensure they remain absent in the future.
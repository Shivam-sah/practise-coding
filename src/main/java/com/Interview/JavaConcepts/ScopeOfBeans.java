package com.Interview.JavaConcepts;

public class ScopeOfBeans {
	
	
	/*
	 * Component Scanning:
Beans are automatically detected and registered by using annotations like @Component, @Service, @Repository, and @Controller.
Java Configuration:
Beans are explicitly defined and registered using Java classes annotated with @Configuration and methods annotated with @Bean.



Types Of Beans

1. Singleton : 	Only one instance of the spring bean will be created for the spring container. This is the default spring bean scope.
2. Prototype :  A new instance will be created every time the bean is requested from the spring container.
3. Request	 :	This is same as prototype scope, however it’s meant to be used for web applications. A new instance of the bean will be created for each HTTP request.
4. Session	 :	A new bean will be created for each HTTP session by the container.
5. Global Session	


We can change the scope of the bean using @Scope(value=" ") annotation.

The bean life cycle refers to when & how the bean is instantiated, what action it performs until it lives, and when & how it is destroyed.
Bean life cycle is managed by the spring container. When we run the program then, first of all, the spring container gets started.After that,
the container creates the instance of a bean as per the request, and then dependencies are injected. And finally,
the bean is destroyed when the spring container is closed. Therefore, if we want to execute some code on the bean instantiation and just
after closing the spring container, then we can write that code inside the custom init() method and the destroy() method.


Using Annotation(@PostConstruct and @Predestroy)

1. we need to annotate init() method by @PostConstruct annotation and destroy() method by @PreDestroy annotation.
2. Now, we need to configure the spring XML file spring.xml and define the bean.
3. Finally, we need to create a driver class to run this bean.

By Using XML

1.  Firstly, we need to create a bean HelloWorld.java in this case and write the init() and destroy() methods in the class.
2.  Now, we need to configure the spring XML file spring.xml and need to register the init() and destroy() methods in it.
3.  Finally, we need to create a driver class to run this bean.
	 */

}

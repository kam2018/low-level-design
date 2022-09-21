# low-level-design
Low level design		
![image](https://user-images.githubusercontent.com/87467083/191457160-4e5d68b1-9bfd-4255-b707-1d04999408c9.png)

	Ø Singleton Design Patter(Creational)
		a. Private constructor to restrict instantiation of the class from other classes.
		b. Private static variable of the same class that is the only instance of the class.
		c. Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.
	In further sections, we will learn different approaches of Singleton pattern implementation and design concerns with the implementation.
			i. Eager initialization
			private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
			
			ii. Static block initialization
			Same as Eager initialization only difference is that we get option to handle exception.
			
			private static StaticBlockSingleton instance;
    
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
			
			iii. Lazy Initialization
			public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
			
			iv. Thread Safe Singleton
			public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
			
			Its very costly to avoid this double-locking system can be used.
			
			public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
    if(instance == null){
        synchronized (ThreadSafeSingleton.class) {
            if(instance == null){
                instance = new ThreadSafeSingleton();
            }
        }
    }
    return instance;
}
			
			v. Bill Pugh Singleton Implementation
			public class BillPughSingleton {
			private BillPughSingleton(){}
    
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}	`
			
			Notice the private inner static class that contains the instance of the singleton class. When the singleton class is loaded, SingletonHelper class is not loaded into memory and only when someone calls the getInstance method, this class gets loaded and creates the Singleton class instance. This is the most widely used approach for Singleton class as it doesn’t require synchronization.
			
			vi. Using Reflection to destroy Singleton Pattern
			    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
			
			When you run the above test class, you will notice that hashCode of both the instances is not same that destroys the singleton pattern.
			
			vii. Enum Singleton
			To overcome this situation with Reflection, Joshua Bloch suggests the use of Enum to implement Singleton design pattern as Java ensures that any enum value is instantiated only once in a Java program. Since Java Enum values are globally accessible, so is the singleton. The drawback is that the enum type is somewhat inflexible; for example, it does not allow lazy initialization.
			
			viii. Serialization and Singleton
			Sometimes in distributed systems, we need to implement Serializable interface in Singleton class so that we can store its state in the file system and retrieve it at a later point of time.
			
			The problem with serialized singleton class is that whenever we deserialize it, it will create a new instance of the class.
			
			So it destroys the singleton pattern, to overcome this scenario all we need to do it provide the implementation of readResolve() method.
			
			protected Object readResolve() {
    return getInstance();
}
			
	Java Singleton Design Pattern Best Practices with Examples | DigitalOcean
	Ø Builder(Creational)
	Creating an object step by step and a method to finally get the object instance.
	
		a. Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time, the type of arguments are same and from client side its hard to maintain the order of the argument.
		b. Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL.
		c. If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.
		
		
		
		
		
		
		
	Builder Design Pattern in Java | DigitalOcean
	
	Ø Factory/Abstract Factory(Creational)
	Abstract Factory pattern is almost similar to Factory Pattern except the fact that its more like factory of factories.
	
	In factory design pattern in java, you will notice that we have a single Factory class. This factory class returns different subclasses based on the input provided and factory class uses if-else or switch statement to achieve this. In the Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class. Then an Abstract Factory class that will return the sub-class based on the input factory class. At first, it seems confusing but once you see the implementation, it’s really easy to grasp and understand the minor difference between Factory and Abstract Factory pattern. Like our factory pattern post, we will use the same superclass and sub-classes.


	Ø Strategy(Behavioural)
	Strategy pattern is also known as Policy Pattern. We define multiple algorithms and let client application pass the algorithm to be used as a parameter. One of the best example of strategy pattern is Collections.sort() method that takes Comparator parameter. Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways
	
	
	
	
	Screen clipping taken: 14-08-2022 13:18
	
	
	
	
	
	
	
	Screen clipping taken: 14-08-2022 13:19
	
	
	
	
	Ø Observable(Behavioural)
	Observer Pattern is one of the behavioural design pattern. Observer design pattern is useful when you are interested in the state of an object and want to get notified whenever there is any change. In observer pattern, the object that watch on the state of another object are called Observer and the object that is being watched is called Subject
	
	When a user subscribe a YouTube channel, he/she should get any change in channel content and he/she get notified once a new video is uploaded.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Observer Design Pattern in Java | DigitalOcean
	
	Ø Composite(Structural)
	The intent of a composite is to “compose” objects into tree structures to represent part-whole hierarchies. It allows you to have a tree structure and ask each node in the tree structure to perform a task.
	
	Compose objects into tree structure to represent part-whole hierarchies. Composite lets client treat individual objects and compositions of objects uniformly
	
		○ Composite design pattern is one of the  structural design patterns
		○ Composite and individual object is treated uniformly
		○ There are 2 types of objects Composite object and Leaf object.
		○ Composite Object : it is a object which contains other object
		○ Leaf Object : it is a single object
		○ Data can be represented as tree structure
	
	Examples:
		a. File System in window. (Its tree structure, Folder is having multiple folder and files).
		
		
		
		b. A Song Group is combination of Song Group and multiple songs.
	
	
	
	
	
	
	
	
	Screen clipping taken: 08-09-2022 20:41
	
	
	
	
	Screen clipping taken: 08-09-2022 20:41
	
	
	
	
	Screen clipping taken: 08-09-2022 20:42
	
	
	
	
	Screen clipping taken: 08-09-2022 20:43
	
	
	
	
	Screen clipping taken: 08-09-2022 20:43
	
	
	
	Ø Command Pattern(Behavioural)
	Command Pattern is used to implement lose coupling in a request-response model.
	
	Command pattern is a data driven design pattern and falls under behavioral pattern category. A request is wrapped under an object(Buy request wrapped in BuyStock class Object) as command and passed to invoker object. Invoker object (Broker class) looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command.
	
	A class Broker is created which acts as an invoker object. It can take and place orders.
	Broker object uses command pattern to identify which object will execute which command based on the type of command
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Screen clipping taken: 09-08-2022 23:41
	
	
	
	
	
	
	
	
	
	Ø Chain of responsibility(Behavioural)
	Java chain of responsibility design pattern comes under behavioral design patterns. As the name suggest chain of responsibility design pattern a request will be send to the chain of objects. The request will be handled by first object and if it is not able to handle that request, request will be send to next object in the chain and so on.
	
	
	
	
	Screen clipping taken: 14-08-2022 13:42
	
	
	
	
	Screen clipping taken: 14-08-2022 13:42
	
	
	
	
	Screen clipping taken: 14-08-2022 13:43
	
	
	
	
	Screen clipping taken: 14-08-2022 13:44
	
	
	
	
	Screen clipping taken: 14-08-2022 13:44
	
	
	
	
	Screen clipping taken: 14-08-2022 13:45
	
	Ø Façade(Structural)
	Facade means the exterior of a building that faces onto a street, a deceptive outward appearance.
	
	Facade encapsulates a complex subsystem behind a simple interface. It hides much of the complexity and makes the subsystem easy to use.
	
	
	
	
	Screen clipping taken: 14-08-2022 20:58
	
	The above diagram represent a legacy application to start a car. And below steps are needed for this.
	
	airFlowController.takeAir() 
	fuelInjector.on() 
	fuelInjector.inject() 
	starter.start() 
	coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP) 
	coolingController.run() 
	catalyticConverter.on()
	
	Similarly, stopping the engine also requires quite a few steps:
	
	fuelInjector.off()
catalyticConverter.off()
coolingController.cool(MAX_ALLOWED_TEMP)
coolingController.stop()
airFlowController.off()
	
	A facade is just what we need here. We'll hide all the complexity in two methods: startEngine() and stopEngine().
	
	
	
	
	From client we just need 2 lines of code to start and stop car.
	facade.startEngine();
	facade.stopEngine();
	
	
	Ø Proxy(Structural)
	The Proxy pattern allows us to create an intermediary that acts as an interface to another resource, while also hiding the underlying complexity of the component.
	
	Its provide substitute for another object and control access to the object, allowing you to perform something before or after request reaches to original object.
	
	In internet service in between client and internet service, an intermediate proxy server is being used to perform below task:
		a.  Firewall
		b. Filtering
		c. Cashing
		d. Protecting private security
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Ø Adaptor
	The Adapter Pattern Explained and Implemented in Java | Structural Design Patterns | Geekific
	
	
	Ø Decorator(Structural)
	The decorator design pattern allows us to dynamically add functionality and behaviour to an object without affecting the behaviour of other existing objects in the same class. 
	
	We use inheritance to extend the behaviour of the class. This takes place at compile time, and all of the instances of that class get the extended behaviour .
	
	Decorator design patterns allow us to add functionality to an object (not the class) at runtime, and we can apply this customized functionality to an individual object based on our requirement and choice.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
![image](https://user-images.githubusercontent.com/87467083/191457455-8c350cbf-e213-40c2-8cc0-6fe3a24faf7b.png)



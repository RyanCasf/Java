package br.com.ryan.generic.wildcard;

public class Box<T> 
{
    private T t;

    public static void main(String[] args) 
    {
       Box<Integer> integerBox = new Box<Integer>();
       Box<String> stringBox = new Box<String>();

       integerBox.add(Integer.valueOf(10));
       stringBox.add(String.valueOf("Hello World"));

       System.out.printf("Integer Value: %d", integerBox.get());
       System.out.printf("\nString Value: %s", stringBox.get());
    }
    
    public void add(T t) 
    {
      this.t = t;
    }

    public T get() 
    {
      return t;
    }
}
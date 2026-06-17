package encapsulation;

public class Test {
    public static void main(String[] args) {
        Demo x= new Demo();
        x.deposit(100);
        x.withdraw(50);
    }

}


// oops concept in which we will hide the data members of class from other classes by making them private
//and we provide public method the through that other classes can access the variables
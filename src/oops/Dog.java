package oops;

public class Dog {

    String dogName;
    int dogAge;
    float dogHeight;

    public Dog(String dogName, int dogAge, float dogHeight) {

        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogHeight = dogHeight;
    }

    @Override
    public String toString() {
        return "Dog[dogName=" + dogName + "\t" + "dogAge=" + dogAge + "\t" + "dogHeight=" + dogHeight + "]";
    }
}

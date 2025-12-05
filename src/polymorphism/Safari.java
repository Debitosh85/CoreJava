package polymorphism;
class WildAnimal {
  public void roam() {
    System.out.println("Wild Animal Roaming");
  }
}

class Elephants extends WildAnimal {

  @Override
  public void roam() {
    System.out.println("Elephant Roaming");
  }

  public void roar() {
    System.out.println("Elephant Raoring wannnn.......");
  }
}

class Tigers extends WildAnimal {
  
  @Override
  public void roam() {
    System.out.println("Tiger roaming in the Jungle");
  }

  public void roar() {
    System.out.println("Tiger Roaring Hun..............");
  }
}

public class Safari {
  public static void main(String[] args) {
    WildAnimal w = new Elephants();
    activity(w);

  //  WildAnimal s = new Tigers();
   // activity(s);
  }
  
  public static void activity(WildAnimal animal) {
    Elephants e = (Elephants) animal;
   // Tigers t = (Tigers) animal;

    e.roam();
    e.roar();

    //t.roam();
    //t.roar();
  }

}

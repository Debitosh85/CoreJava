package polymorphism;

class Animals {
  public void roam() {
    System.out.println("Generic animal Roaming");
  }
}

class Lions extends Animals {
  @Override
  public void roam() {
    System.out.println("Lion is Roaming");
  }
}

class Dogs extends Animals {
  
  @Override
  public void roam() {
    System.out.println("Dog is Roaming");
  }
}

public class Zoo {
  public static void main(String[] args) {
    Animals a = null;
    a = new Lions();
    animalRoam(a);

    a = new Dogs();
    animalRoam(a);
  }

  public static void animalRoam(Animals animal) {
    animal.roam();
  }

}

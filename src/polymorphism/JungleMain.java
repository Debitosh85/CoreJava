package polymorphism;

abstract class Species {
  public abstract void checkUp();
}
class Rihnous extends Species {
  protected String name;
  public Rihnous(String name) {
    this.name = name;
  }
  @Override
  public void checkUp() {
    System.out.println(name+"Rihnous going for Checkup");
  }
}

class Giraff extends Species {
  protected String name;

  public Giraff(String name) {
    this.name = name;
  }
  @Override
  public void checkUp() {
    System.out.println(name + "Giraff going for CheckUp");
  }
}
class HippoPotamos extends Species {
  protected String name;
  public HippoPotamos(String name) {
    this.name = name;
  }
  @Override
  public void checkUp() {
    System.out.println(name+"HippoPotamos going for CheckUP");
  }
}
public class JungleMain {
  public static void main(String[] args) {
    Rihnous[] r = { new Rihnous("Jumbo"), new Rihnous("Browny") };
    Giraff[] g = { new Giraff("Herculase"), new Giraff("Atlas") };
    HippoPotamos[] h = { new HippoPotamos("John"), new HippoPotamos("Max") };
    animalsCheckUpCamp(r);
    System.out.println("=====================");
    animalsCheckUpCamp(g);
    System.out.println("=====================");
    animalsCheckUpCamp(h);
  }
  public static void animalsCheckUpCamp(Species ...species) {
    for (Species s : species) {
      s.checkUp();
    }
  }
}

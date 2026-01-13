package deb.Int_erface;

non-sealed class Car implements Movable {

  @Override
  public void move() {
    System.out.println("Speed of the Car:" + SPEED);
    System.out.println("Going with this" + SPEED + "Breaking the Road Safety rule");
  }
}



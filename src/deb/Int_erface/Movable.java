package deb.Int_erface;

sealed interface Movable permits Car {

  public static  final int  SPEED = 100;
  public void move();

}

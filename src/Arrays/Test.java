package Arrays;
class Test {
  public static void main(String[] args) {

    String[] str2 = { "India", "Hindustan","Norway","Denmark","America","BraZil"};
    int i = 0;
    do {
      System.out.println(str2[i]);
      i++;
    } while (i<=str2.length-1);

    System.out.println("----------------------------");

    String[] str1 = new String[5];
    str1[0] = "Java";
    str1[1] = "Oracle";
    str1[2] = "AdvJava";
    str1[3] = "Spring";
    str1[4] = "SpringBoot";
    for (String str : str1) {
      System.out.println(str);
    }
  }
  }
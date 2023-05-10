import java.util.ArrayList;

public class testing {
  public static void main(String[] args) {
    ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("Hello");
    myList.add(42);
    myList.add(new testing());
  }
}
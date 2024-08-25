import java.util.*;
class hello{
public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
  String name=sc.nextLine();
  double score=sc.nextInt();
  sc.nextLine();
  String department=sc.nextLine();
  System.out.println("my name is "+name);
  System.out.println("my score is "+score/10);
  System.out.println("my dep is "+department);
}
}
}
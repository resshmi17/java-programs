class stack1 {
  int arr[]=new int[5];
  int top=-1;
  void push(int data){
    if(isFull()){
      System.err.println();
    }
    else
    arr[++top]=data;
  }
}
void show(){
  for(int i=top;i>=0;i--){
    System.err.println(arr[i]+" ");
    System.err.println();
  }
}
boolean isFull(){
  return top==arr.length-1;
}
public class stack{
  public static void main(String args[]){
  stack1 obj=new stack1();
  obj.push(10);
  obj.push(20);
  obj.push(30);
  obj.show();
  obj.push(40);
  obj.push(15);
  obj.show();
  obj.push(20);

}
}



class queue{
  int rear=0;
  int arr[]=new int[5];
  void enqueue(int data){
  arr[rear]=data;
  rear++;
}
void show(){
  for(int i=0;i<rear;i++){
    System.out.println(arr[i]+" ");
  }
  System.out.println();
}
void dequeue(){
  for(int i=0;i<rear;i++){
    arr[i]=arr[i+1];
  }
  rear--;
}
int size(){
  return rear;
}
int peek(){
  return arr[0];
}
boolean isEmpty(){
  return rear<0;
}
public class que {
  public static void main(String[] args) {
    queue obj=new queue();
    obj.enqueue(10);
    obj.enqueue(20);
    obj.enqueue(30);
    obj.show();
    obj.dequeue();
    obj.show();

  }
}
}

import java.util.Arrays;

class MaxHeapModel{
int []heap;int maxsize;int cursize;
MaxHeapModel(int maxsize){
  this.maxsize=maxsize;
  this.cursize=0;
  heap=new int[maxsize];
}
void insert(int data){
  heap[cursize]=data;
  int current=cursize;
  while(heap[current]>heap[getParentPos(current)]){
    swap(current,getParentPos(current));
    current=getParentPos(current);
  }cursize++;
}
int getParentPos(int pos){
  return(pos-1)/2;
}
  void swap(int fpos,int spos){
    int temp;
    temp=heap[fpos];
    heap[fpos]=heap[spos];
    heap[spos]=temp;
  }
  void print()
  {
    System.out.println(Arrays.toString(heap));
  }
  int poll(){
    int popped=heap[0];
    heap[0]=heap[--cursize];
    heapify(0);
    return popped;
  }
  int getLCPos(int pos){
    return (2*pos)+2;
  }
  int getRCPos(int pos){
    return (2*pos)+2;
  }
  Boolean isLeaf(int pos){
    if(pos>(cursize/2)&&pos<=cursize){
      return true;
    }
    return false;
  }
  void heapify(int pos){
  }
}
public class hehe{
  public static void main(String[] args) {
    MaxHeapModel obj=new MaxHeapModel(50);
    obj.insert(10);
    obj.insert(20);
    obj.insert(20);
    obj.insert(20);
    obj.insert(20);
    obj.print();
    obj.poll();
    obj.print();


  }
}
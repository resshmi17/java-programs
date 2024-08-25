class stackm<T>{
int top=-1;
Object[] arr=new Object[5];
void push(T data)
{
if(isFull())
{
System.out.println("stack full");
}
else
{
arr[++top]=data;
}
}
void show()
{
for(int i=top;i>=0;i--)
{
System.out.println(arr[i]+" ");
System.out.println();
}
}
boolean isFull()
{
return top==arr.length-1;
}
}
public class copy 
{
public static void main(String[] args) 
{
stackm <Integer> obj=new stackm <>();  
obj.push(10);
obj.push(20);
obj.show();
stackm <String> obj1=new stackm <>();
obj1.push("a");
obj1.show();
}
}

#include <stdio.h>

int main()
{
 
        int a=11, b=22, c;
         
        c = a + b + a++ + b++ + ++a + ++b;
         
    printf("%d",a);
    printf("%d",b);
    printf("%d",c);
    
}

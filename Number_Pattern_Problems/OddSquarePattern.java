public class OddSquarepattern 
{
public static void main(String[] args)
{
int n=4;
int i=1;
while(i<=n)
{
int j=n;
int x= 2*i-1;
while(j>=i)
{
System.out.print(x);
x=x+2;
j--;
}        
System.out.println();
i++;          
}
}
}

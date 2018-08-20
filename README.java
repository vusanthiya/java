class Palindrome
{
  public static void main(String args[])
  {
    int n=121,a,b=0,temp;
    temp=a;
    while(n>0)
    {
      a=n%10;
      b=(b*10)+a;
      n=n/10;
     }
    if(temp==b)
    {
      System.out.println("yes");
    }
    else
    {
      System.out.println("no");
     }
    }
  }

public class Main{
    public static void main(String[] args) {
        int num=10,c=0,f=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            c++;
            if(c>2)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        System.out.print("not prime");
        else
        System.out.print("prime");
    }
}

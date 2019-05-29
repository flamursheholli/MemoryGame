public class RandomNumbers
{
private int n;
private int[] ran;
public RandomNumbers(int n)
{
this.n=n;
ran=new int[n];
}
public void nr(){
for(int i=0;i<n;i++)
{ran[i]=(int)(Math.random()*n);
rand(i);

}
}
public void rand(int r)
{for(int j=0;j<r;j++)
{
if(ran[j]==ran[r]){ran[r]=(int)(Math.random()*n);rand(r);}
}

}
public int[] randomat()
{nr();

return ran;

}
 
}

import javax.swing.*;
import java.awt.*;
public class Kontrolleri{
public static void main(String[]args)
{


int sh = 2;
int rr = 4;
//numri i rreshtave ose numri i shtyllave dhe duhet te jete numer qift dhe rreshtat*shtyllat duhet te jene te plotpjestueshme me 4
int n=sh*rr;

RandomNumbers obj=new RandomNumbers(n);
Color[] c=new Color[n];
int[] rn;
rn=obj.randomat();
char[] ch=new char[n];
char[] perf=new char[n];
Color[] pf=new Color[n];
ch[0]='A';
for(int i=1;i<n;i++)
{if(i<n/4){ch[i]=(char)(ch[0]+i);}
else if(i>=n/4 && i<n/2){ch[i]=ch[i-n/4];}
else{ch[i]=ch[i-n/2];}}
for(int i=0;i<n;i++)
{if(i>=n/2){c[i]=Color.green;}
else{c[i]=Color.red;}}

for(int i=0;i<n;i++){perf[i]=ch[rn[i]];pf[i]=c[rn[i]];}
MemoryGame aft=new MemoryGame(pf,perf,sh,rr,130,300,20,20,40);
}

}
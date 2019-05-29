import javax.swing.*;
import java.awt.*;
import java.util.*;
public class MemoryGame extends JPanel{
 private int nr1=-1;
 private int nr2=-1;
 private int fillim=0;
 private int shuma =0;
 private static Color[] perf;
  private static Color[] a;
  private char[] c;
  private int rr;
  private int sh;
  private char[] ch;
  private int size;
  private int distanca;
  private int wboxsize;
  private int piket=0;
  private int counter=0;
    private int hboxsize;
    private int w;
    private int h;
public MemoryGame(Color[] a,char[] c,int rr,int sh,int w,int h,int distanca,int wboxsize,int hboxsize)
{if((rr%2!=0&&sh%2!=0)||((rr*sh)%4!=0)){System.out.println("Numri i rreshtave ose shtyllave duhet te jete qift dhe prodhimi i plotpjestueshem me 4");System.exit(0);}

char[] ch=new char[rr*sh];
Color[] af=new Color[rr*sh];
for(int i=0;i<rr*sh;i++)
{af[i]=Color.white;
ch[i]='?';}
perf=af;
this.ch=ch;
this.a=a;this.c=c;
JFrame obj = new JFrame();
obj.getContentPane().add(this);
obj.setSize(w,h);
obj.setTitle("Titulli");
obj.setVisible(true);
this.rr=rr;
this.sh=sh;
this.wboxsize=wboxsize;
this.hboxsize=hboxsize;
this.distanca=distanca;
this.w=w;
this.h=h;
}
//public void ngjyrat(Color[] a)
//{for(int i=0;i<4;i++){a[i]=a[i];};
//repaint();
//}
public void or()
{
kontrolla();
if(counter==((rr*sh)/2)){System.out.println("Ju keni humbur : "+piket +" pike");System.exit(0);}
if(fillim==0){fillim=1;repaint();}
else{Scanner in = new Scanner(System.in);
if(in==null){repaint();}
if(nr1==-1){
nr1= in.nextInt();
if(nr1<0||nr1>=rr*sh||ch[nr1]!='?'){nr1=-1;or();}
perf[nr1]=a[nr1];ch[nr1]=c[nr1];repaint();}
else if(nr1!=-1&&nr2==-1)
{nr2= in.nextInt();
if(nr2<0||nr2>=rr*sh||ch[nr2]!='?'){nr2=-1;or();}
perf[nr2]=a[nr2];ch[nr2]=c[nr2];repaint();}
}
}
//qele();
public void kontrolla(){
if(nr1!=-1&&nr2!=-1&&nr1!=nr2){
if((perf[nr1]==perf[nr2])&& (ch[nr1]==ch[nr2])){counter=counter+1;repaint();}
else{piket=piket+10;perf[nr1]=Color.white;
perf[nr2]=Color.white;ch[nr1]='?';ch[nr2]='?';}nr1=-1;nr2=-1;}
}


//public void qele()
//{String s=JOptionPane.showInputDialog("cilen me qel");
//nr2=Integer.parseInt(s);
//repaint();
//}
public void paintComponent(Graphics g)
{int wi=0;
int hi=0;

or();


g.setColor(Color.pink);
g.fillRect(0,0,w,h);
for(int i=0;i<rr*sh;i++){
g.setColor(perf[i]);
if(i%rr==0){wi=0;hi=hi+1;}else{wi=i%rr;}
g.fillRect(20+(distanca+wboxsize)*wi,20+(hboxsize+distanca)*(hi-1),wboxsize,hboxsize);
g.setColor(Color.black);
g.drawRect(20+(wboxsize+distanca)*wi,20+(hboxsize+distanca)*(hi-1),wboxsize,hboxsize);
g.drawString(""+i,20+(wboxsize+distanca)*wi+wboxsize/2,20+(hboxsize+distanca)*(hi-1));
g.drawString(""+ch[i],20+(wboxsize+distanca)*wi+(wboxsize/2),20+(hboxsize+distanca)*(hi-1)+hboxsize/2+5);}
}


}
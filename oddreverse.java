import java.util.*;
class oddreverse
{
public static void main(String[] args)
{
Scanner  s = new Scanner(System.in);
int N = s.nextInt();
boolean printed=false;
while(N>0)
{
if(N%2!=0)
{
System.out.print(N);
printed=true;
}}
if(!printed)
{
System.out.print("-1");
}}}
class jagged 
{
public static void main(String al[])
{
int a[] []=new int[4] [];
int i,j;
for(i=0;i<4;i++)
{
a[i]=new int[i+1];
for(j=0;j<a[i].length;j++)
{
a[i][j]=j+1;
}
}
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
System.out.print(a[i][j]);
}
System.out.println();
}
}
}
import java.util.Scanner;
public class MArray
{
  public static void main(String args[]){
  int a[][],b[][],c[][],i,j,k;
  a=new int[3][3];
  b=new int[3][3];
  c=new int[3][3];
   Scanner input=new Scanner(System.in);
    System.out.println("enter the elements of first matrix");
    for(i=0;i<3;i++){
      for(j=0;j<3;j++){
        a[i][j]=input.nextInt();
      }
    }
    System.out.println("enter the elements of second matrix");
    for(i=0;i<3;i++){
      for(j=0;j<3;j++){
          b[i][j]=input.nextInt();
        }
      }
    for(i=0;i<3;i++){
      for(j=0;j<3;j++){
        for(k=0;k<3;k++){
          c[i][j]=c[i][j]+a[i][k]*b[k][j];
        }
      }
    }
    System.out.println("multiplication result...");
    for(i=0;i<3;i++){
      for(j=0;j<3;j++){
        System.out.print(c[i][j]+"\t");
      }
      System.out.println();
    }
  }
}


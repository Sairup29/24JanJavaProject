package logicalPrograms;

import java.util.Arrays;

public class ArrayPrograms {

    public static void main(String[] args) {
//===================================================
// find duplicate elements from array**

//        int a[]= {1,2,3,1,4,3};
//        int count=0;
//
//        for(int i=0; i<=a.length-1; i++)
//        {
//            for(int j=i+1; j<=a.length-1; j++)
//            {
//                if (a[i]==a[j])
//                {
//                    System.out.println(a[i]);
//                    count++;
//                }
//            }
//        }
//
//        System.out.println(count);

// ====================================================
// sort given array in ascending or descending order**

//        int a[]={10,30,20,50,15,5};

//        Arrays.sort(a);

//         for(int i=0; i<=a.length-1; i++)
//         {
//            for (int j=i+1; j<=a.length-1; j++)
//            {
//                if(a[i]>a[j])   //<
//                {
//                   int temp=a[i];
//                   a[i]=a[j];
//                   a[j]=temp;
//                }
//            }
//         }
//
//        for (int k=0; k<=a.length-1; k++)
//        {
//            System.out.print(a[k]+" ");
//        }


//========================================================================
// find the unique number from array

//        int a[]= {1,2,3,1,4,3};
//         int count=0;
//        for(int i=0; i<=a.length-1; i++)
//        {
//            for(int j=i+1; j<=a.length-1; j++)
//            {
//                if (a[i]==a[j])
//                {
//                   a[i]=-1;
//                   a[j]=-1;
//
//                }
//            }
//        }
//
//        for(int i=0; i<=a.length-1; i++)
//        {
//            if(a[i]!=-1)
//            {
//                System.out.println(a[i]);
//                count++;
//            }
//        }
//        System.out.println(count);

//======================================================
    // reverse the array using new array

//        int a[]={10,20,30,40,50};
//
//        int b[]=new int[a.length];
//       b[0]=a[4]; //a.length-1
//       b[1]=a[3];  //a.length-i-1
//       b[2]=a[2];
//       b[3]=a[1];
//       b[4]=a[0];
//
//   for(int i=0; i<=b.length-1; i++)
//   {
//       b[i]=a[a.length-1-i];
//   }
//
//   for (int i=0; i<=b.length-1;i++)
//   {
//       System.out.println(b[i]);
//   }

//======================================================
//reverse the array without using new array

//        int a[]={10,20,30,40,50};
//
//        for (int i=0; i<=(a.length-1)/2;i++)
//        {
//            int temp=a[i];
//            a[i]=a[a.length-1-i];
//            a[a.length-1-i]=temp;
//
//
//        }
//
//        for (int i=0; i<=a.length-1;i++)
//        {
//            System.out.println(a[i]);
//        }
//--------------------------------------------------

     int a[]={24,56,45,64,56};  //**

 int i=0;
int j=a.length-1;

while(i<j)
{   int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
    i++;
    j--;
}

for(int k=0; k<=a.length-1; k++)
{
    System.out.println(a[k]);
}







































































































































































































































































    }
}

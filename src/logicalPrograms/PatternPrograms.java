package logicalPrograms;

public class PatternPrograms {
    public static void main(String[] args) {

        //1===========================================

//        *
//        **
//        ***
//        ****

//        int row=4;
//        int star=1;
//                        //4
//        for(int i=1; i<=row; i++)
//        {                   //1
//            for(int j=1; j<=star; j++)
//            {
//                System.out.print("*");   //*  //**  //***  //****
//            }
//            System.out.println();
//            star++;  //2  //4
//        }

     //2=========================================================================

//      ****
//      ***
//      **
//      *

//       int row=4;
//       int star=4;
//
//       for(int i=1; i<=row; i++)
//       {
//           for(int j=1; j<=star ;j++)
//           {
//               System.out.print("*");
//           }
//           System.out.println();
//           star--;
//       }

//3===========================================================================

//         *
//        **
//       ***
//      ****


//        int row =4;
//        int space=3;
//        int star=1;
//
//        for(int i=1; i<=row; i++)
//        {
//            for(int j=1; j<=space; j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=1; k<=star; k++)
//            {
//                System.out.print("*");
//            }
//
//            System.out.println();
//            star++;
//            space--;
//        }

//===================4=========================================

//        ****
//         ***
//          **
//           *

//      int row=4;
//      int space=0;
//      int star=4;
//
//
//      for(int i=1; i<=row; i++)
//      {
//          for(int j=1; j<=space; j++)
//          {
//              System.out.print(" ");
//          }
//          for(int k=1; k<=star; k++)
//          {
//              System.out.print("*");
//          }
//          System.out.println();
//          star--;
//          space++;
//      }

//===========================5===============================

//        ****
//        ***
//        **
//        *
//        **
//        ***
//        ****

//       int row=7;
//       int star=4;
//
//         for (int i=1; i<=row; i++)
//         {
//             for(int j=1; j<=star; j++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//             if (i<4)
//             {
//                 star--;
//             }
//             else {
//                 star++;
//             }
//         }

//==========================================================

//           *
//          ***
//         *****
//        *******

//        int row=4;
//        int space=3;
//        int star=1;
//
//        for(int i=1; i<=row; i++)
//        {
//            for(int j=1; j<=space; j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=1; k<=star; k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//
//            star=star+2;
//            space--;
//        }
//=========6=========================================================

//          *******
//           *****
//            ***
//             *


//   int row=4;
//   int space=0;
//   int star=7;
//
//   for (int i=1; i<=row; i++)
//   {
//       for (int j = 1; j <= space; j++)
//       {
//           System.out.print(" ");
//       }
//
//       for(int k = 1; k <= star; k++)
//       {
//           System.out.print("*");
//       }
//       System.out.println();
//       star=star-2;
//       space++;
//
//   }

//============7================================================

//           *
//          * *
//         * * *
//        * * * *

//        int row =4;
//        int space=3;
//        int star=1;
//
//        for(int i=1; i<=row; i++)
//        {
//            for (int j=1; j<=space; j++)
//            {
//                System.out.print(" ");
//            }
//            for (int k=1; k<=star; k++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//            star++;
//            space--;
//
//        }

       // ====================================================================
//           *
//          * *
//         * * *
//        * * * *
//         * * *
//          * *
//           *


//        int row =7;
//        int space=3;
//        int star=1;
//
//        for (int i=1; i<=row; i++)
//        {
//            for (int j=1; j<=space; j++)
//            {
//                System.out.print(" ");
//            }
//            for (int k=1; k<=star; k++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//            if(i<4)
//            {
//                star++;
//                space--;
//            }
//            else
//            {
//                star--;
//                space++;
//            }
//        }

//========================================================
//        *
//       ***
//      *****
//     *******
//      *****
//       ***
//        *


//        int row=7;
//        int space=3;
//        int star=1;
//
//        for(int i=1; i<=row; i++)
//        {
//            for (int j = 1; j <= space; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= star; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//            if(i<4)
//            {
//                space--;
//                star=star+2;
//            }
//            else
//            {
//                space++;
//                star=star-2;
//            }
//
//        }

//============================================================



//*       *
//**     **
//***   ***
//**** ****
//***   ***
//**     **
//*       *

// int row=7;
// int star=1;
// int space=7;
// int star1=1;


// for (int i=1; i<=row; i++)
// {
//     for (int j=1; j<=star; j++)
//     {
//         System.out.print("*");
//     }
//     for (int l=1; l<=space; l++)
//     {
//         System.out.print(" ");
//     }
//     for (int k=1; k<=star1; k++)
//     {
//         System.out.print("*");
//     }
//     System.out.println();
//     if (i<4)
//     {
//         star++;
//         space=space-2;
//         star1++;
//     }
//     else
//     {
//         star--;
//         space=space+2;
//         star1--;
//     }
// }


//=================================================================================// 12345
// 1234
// 123
// 12
// 1
//                int row = 4;
//                int num=4;
//
//                for(int i =1; i<=row; i++)
//                {
//                    for (int j=1; j<=num; j++)
//                    {
//                        System.out.print(j);
//                    }
//                    System.out.println();
//                    num--;
//                }


   //===============================================================
//        55555
//        5555
//        555
//        55
//        5

//        int row = 5;
//        int num=5;
//
//        for(int i =1; i<=row; i++)
//        {
//            for (int j=1; j<=num; j++)
//            {
//                System.out.print(5);
//            }
//            System.out.println();
//            num--;
//        }

//======================================================================

//        55555
//        4444
//        333
//        22
//        1


//        int row = 5;
//        int num=5;
//
//        for(int i =1; i<=row; i++)
//        {
//            for (int j=1; j<=num; j++)
//            {
//                System.out.print(num);
//            }
//            System.out.println();
//            num--;
//        }

//========================================================================
        //ABCD
        //ABC
        //AB
        //A

        int row =4;
        int num=4;
        int letter='A';

        for (int i=0; i<=row; i++)
        {
            for (int j=0; j<=num; j++)
            {
                System.out.print(letter);
            }
            System.out.println();
            num--;
            letter--;
        }






























            }
        }



















































































































































































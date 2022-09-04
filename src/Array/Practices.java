package Array;

public class Practices {
    public static void main(String[] args) {
//SINGLE DIMENSIONAL ARRAY

//Declare an array with size 5
        int a [] = new int[5];
//Storing & inserting values in the indexes
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;
//Declare any array without specifying the size

        int b[]={7,5,7,8,6,4,2,5,9,8};

//Length of any array
        System.out.println(b.length);
//Read specific value of array with index number

        System.out.println(b[7]);
//Read all value of array

        for (int i =0;i<b.length;i++){
            System.out.println(b[i]);
        }

        for(int i:a){
            System.out.println(i);
        }

// TWO DIMENSIONAL ARRAY
//Declare an array

        int c[][]= new int[3][2];
//Storing & inserting values in the indexes
        c[0][0]=100;
        c[0][1]=200;
        c[1][0]=300;
        c[1][1]=400;
        c[2][0]=500;
        c[2][1]=600;
//Declare any array without specifying the size

        int d[][]={{100,200,5,5},{300,400,6,8},{500,600,5,6}};
//Length of any array

        System.out.println("The number of rows: "+d.length);
        System.out.println("The number of columns: "+d[1].length);

//Read all value of array
        for(int i=0;i<d.length;i++){
            for(int j =0;j<d[i].length;j++){
                System.out.println(d[i][j]);
            }
        }
        int e[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for(int i[]:e){
            for(int j:i){
                System.out.println(j);
            }
        }
    }
}

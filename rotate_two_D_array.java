import java.util.Scanner;
public class rotate_two_D_array {
    public static void main(String[] args) {
        Rotate1 o=new Rotate1();
        o.insert();

    }
} 
class Rotate1{
    int []arr;
    int p, row, column;
    public void insert(){
        System.out.println("Enter the number of row");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        System.out.println("Enter the number of column");
        column=sc.nextInt();
        System.out.println("Enter the element in the matrix");
        arr=new int[row*column];
        for (int i = 0; i <row*column ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("How many do you want to shift");
        int k=sc.nextInt();
        System.out.println("Actual matrix");
        traverse();
        rotate(k);
        System.out.println("After preforming the operation");
        traverse();
    }
    public void rotate(int k){
        {
            p = row * column - 1;
            for (int j = 0; j < k; j++) {
                int temp = arr[p];
                for (int i = p - 1; i >= 0; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[0] = temp;
            }
        }
    }
    public void traverse(){
        int k=0;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                System.out.print(arr[k]+" ");
                k+=1;
            }
            System.out.println();
        }
    }
}

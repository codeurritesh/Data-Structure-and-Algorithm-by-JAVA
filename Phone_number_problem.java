import java.util.Scanner;

public class Phone_number_problem{
    static String covert(String[] s) {
        String str1 = "";
        for (int i = 0; i < s.length; i++) {
            int j=i;
            if (s[i].equals("double")) {
                str1 += given(s, j + 1);
                str1 += given(s, j + 1);
                i++;
            }
            else if(s[i].equals("triple")){
                str1 += given(s, j + 1);
                str1 += given(s, j + 1);
                str1 += given(s, j + 1);
                i++;
            }
            else{
            str1 +=given(s,i);
            }
        }
        return str1;
    }

    static String given(String[] s, int i) {
        if (s[i].equals("zero")) {
            return "0";
        } else if (s[i].equals("one")) {
            return "1";
        } else if (s[i].equals("two")) {
            return "2";
        } else if (s[i].equals("three")) {
            return "3";
        } else if (s[i].equals("four")) {
            return "4";
        } else if (s[i].equals("five")) {
            return "5";
        } else if (s[i].equals("six")) {
            return "6";
        } else if (s[i].equals("seven")) {
            return "7";
        } else if (s[i].equals("eight")) {
            return "8";
        } else if (s[i].equals("nine")) {
            return "9";
        }
        return "0";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s[] = str.split(" ");
        String st=covert(s);
        System.out.println(st);

    }
}

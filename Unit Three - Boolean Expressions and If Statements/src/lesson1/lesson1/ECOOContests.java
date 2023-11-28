package lesson1;

public class ECOOContests {
    public static void main(String[] args) {
        frame2010(3,4,1,2);
        square2011("CANADA");
    }

    private static void square2011(String str) {
        String result = " ";
        for (int i = 0; i < str.length(); i++) {
            String temp = str.substring(i, i + 1);
            result += temp + " ";
        }
        String bResult = "";
        for (int i = str.length(); i >= 0; i--) {
            String temp;
            if (i == str.length()){
                temp = str.substring(i);
            } else {
                temp = str.substring(i, i + 1);
            }
            bResult += temp + " ";
        }

        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 1; j++){
                System.out.print("*");
            }
            for (int j = 0; j < 1; j++){
                System.out.print(result);
            }
            for (int j = 0; j < 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < str.length(); i++){
            for (int j = 0; j < 1; j++){
                System.out.print(str.charAt((str.length()-1)-i)+" ");
            }
            for (int j = 0; j < str.length(); j++){
                System.out.print("* ");
            }
            for (int j = 0; j < 1; j++){
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }

        for (int i = 0; i < 1; i++){
            for (int j = 0; j < 1; j++){
                System.out.print("*");
            }
            for (int j = 0; j < 1; j++){
                System.out.print(bResult);
            }
            for (int j = 0; j < 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void frame2010(int m, int n, int p, int q){
        int rowL = n+p+p+q+q;
        for (int i = 0; i < q; i++){
            for (int frame = 0; frame < rowL; frame++){
                System.out.print("#");
            }
            System.out.println();
        }
        for (int i = 0; i < p; i++){
            for (int j = 0; j < q; j++){
                System.out.print("#");
            }
            for (int k = 0; k < p+n+p; k++){
                System.out.print("+");
            }
            for (int j = 0; j < q; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        for (int i = 0; i<m; i++){
            for (int j = 0; j < q; j++){
                System.out.print("#");
            }
            for (int k = 0; k < p; k++){
                System.out.print("+");
            }
            for (int l = 0; l < n; l++){
                System.out.print(".");
            }
            for (int k = 0; k < p; k++){
                System.out.print("+");
            }
            for (int j = 0; j < q; j++){
                System.out.print("#");
            }
            System.out.println();
            
        }
        for (int i = 0; i < p; i++){
            for (int j = 0; j < q; j++){
                System.out.print("#");
            }
            for (int k = 0; k < p+n+p; k++){
                System.out.print("+");
            }
            for (int j = 0; j < q; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        for (int i = 0; i < q; i++){
            for (int frame = 0; frame < rowL; frame++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

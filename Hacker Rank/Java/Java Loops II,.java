public class hacker_rank_1 {
    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int test_case = sc.nextInt();

        for(int j = 0; j< test_case; j++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            for(int i =0; i < n; i++){
                int result = (int) (sum +  (Math.pow(2, i)* b));
                sum = result;
                System.out.print(result+ " ");
            }
            System.out.println();
        }
    }
}

public class Arrays {
    public static void main(String[] args) {
        // int nums[] = { 1, 2, 3, 4 };
        // System.out.println(nums[0]);
        // nums[0] = 6;
        // System.out.println(nums[0]);

        int num[] = new int[4];
        num[0] = 7;
        num[1] = 17;
        num[2] = 37;
        num[3] = 27;
        System.out.println(num);

        for(int i=0;i<4;i++){
        System.out.print(num[i]+" ");
        }

        int nums[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
        nums[i][j] = (int) (Math.random() * 10);
        }
        }

        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
        System.out.print(nums[i][j] + " ");
        }
        System.out.println();
        }

        // int nums[][] = new int[3][];

        nums[0] = new int[2];
        nums[1] = new int[3];
        nums[2] = new int[4];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int)(Math.random()*10);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }




    }

}

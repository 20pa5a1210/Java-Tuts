class Anu {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= n / 2; j++) {
                if ((j == 0 || j == n / 2) && i != 0 ||
                        i == 0 && j != 0 && j != n / 2 ||
                        i == n / 2)

                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
        System.out.println("        ");
        int height = 5;

        int i, j, counter = 0;
        for (i = 0; i < height; i++) {
            System.out.printf("*");
            for (j = 0; j <= height; j++) {
                if (j == height)
                    System.out.printf("*");
                else if (j == counter)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            counter++;
            System.out.printf("\n");
        }
        int i1, j1;
        int height1 = 6;
        for (i1 = 0; i1 < height1; i1++) {
            if (i1 != 0 && i1 != height1)
                System.out.printf("*");
            else
                System.out.printf(" ");
            for (j1 = 0; j1 < height1; j1++) {
                if (((i1 == height1 - 1)
                        && j1 >= 0
                        && j1 < height1 - 1))
                    System.out.printf("*");
                else if (j1 == height1 - 1 && i1 != 0
                        && i != height - 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }
}
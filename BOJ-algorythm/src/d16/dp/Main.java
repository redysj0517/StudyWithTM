package d16.dp;

public class Main {
 
    public static void main(String[] args) {
        int[][] data = new int[50][50];
 
        int x = -1;
        int y = 0;
        int count = 1;
        int size = 5;
        int type = 0;
        while (size > 0) {
            for (int i = 0; i < size; i++) {
                switch (type) {
                case 0: // RIGHT
                    x++;
                    break;
                case 1: // DOWN
                    y++;
                    break;
                case 2: // LEFT
                    x--;
                    break;
                case 3: // UP
                    y--;
                    break;
                }
                data[y][x] = count;
                count++;
            }
            if (type == 0 || type == 2)
                size--;
            type++;
            if (type > 3)
                type = 0;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (data[i][j] < 10)
                    System.out.print(" " + data[i][j] + " ");
                else
                    System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}



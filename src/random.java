public class random {
    public static void main(String[] arg) {
        int[] sorta = new int[10];
        for (int i=0;i<10;i++) {
            sorta[i] = (int)(Math.random() * 10);
        }
        boolean complete = false;
        int temp;
        while(!complete) {
            complete = true;
            for (int i = 0; i < sorta.length - 1; i++) {
                if (sorta[i] > sorta[i+1]) {
                    temp = sorta[i];
                    sorta[i] = sorta[i+1];
                    sorta[i+1] = temp;
                    complete = false;
                }
            }
        }

                for (int i : sorta) {
                    System.out.println(i);
                }
        }
    }

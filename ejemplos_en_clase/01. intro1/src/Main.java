public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenidos a JAVA");
        System.out.print("I will print on the same line.");
        System.out.print("I will print on the same line.");

        String name = "John";
        int myNum = 15;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;

        System.out.println(name);
        System.out.println("Hello " + name);
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myNum+myFloatNum);

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());


        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));

        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }

        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        // Outputs "Good evening."

        int xtime = 16;
        if (xtime < 10) {
            System.out.println("Good morning.");
        } else if (xtime < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        // Outputs "Good evening."

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        // Outputs "Thursday" (day 4)

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }


        for ( i = 0; i < 5; i++) {
            System.out.println(i);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String Q : cars) {
            System.out.println(Q);
        }

        System.out.println(cars.length);
        int[] VmyNum = {10, 20, 30, 40};
        System.out.println(VmyNum.length);

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]); // Outputs 7
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

        for (i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

    }

}

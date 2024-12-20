import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
        System.out.println("Hello and welcome to the number games !");
        int[] array = {1, 2, 3};
        System.out.println("Please enter the number you would like to play: ");
        System.out.println("num can be 0 1 2 ");

        int num = scanner.nextInt();
        int choice = array[num];

            if (choice == 1) {
                System.out.print("NO game, wish you merry Christmas ! ");
              }

            else if (choice == 2) {
                // Welcome message for the game
                // The user inputs the total number of heads and legs.
                System.out.print("Please enter the total number of heads: ");
                int totalHeads = scanner.nextInt();

                System.out.print("Please enter total number of legs: ");
                int totalLegs = scanner.nextInt();

                // Count chickens and rabbits
                int chickens = (4 * totalHeads - totalLegs) / 2;
                int rabbits = totalHeads - chickens;

                // Determine whether there is a joint understanding
                if (chickens >= 0 && rabbits >= 0 && 2 * chickens + 4 * rabbits == totalLegs) {
                    System.out.println("Number of chickens: " + chickens);
                    System.out.println("Number of rabbits: " + rabbits);
                } else {
                    System.out.println("The number of heads and legs entered does not match the actual situation and cannot be answered.");
               return; }

            } else if (choice == 3) {
                Random random = new Random();
                int[] targetNumbers = new int[5];
                for (int i = 0; i < 5; i++) {
                    targetNumbers[i] = random.nextInt(100);  // 生成0到99的随机数作为要猜的数字
                }
                int guessCount = 0;
                boolean[] guessedCorrectly = new boolean[5];
                while (true) {
                    System.out.println("input your choice（five number in all，they are separated from space）：");
                    String input = scanner.nextLine();
                    String[] inputNumbers = input.split(" ");
                    if (inputNumbers.length!= 5) {
                        System.out.println("wrong，repeat！");
                        continue;
                    }
                    guessCount++;
                    boolean allGuessed = true;
                    for (int i = 0; i < 5; i++) {
                        int guessedNumber = Integer.parseInt(inputNumbers[i]);
                        if (guessedNumber == targetNumbers[i]) {
                            guessedCorrectly[i] = true;
                        } else {
                            allGuessed = false;
                        }
                    }
                    if (allGuessed) {
                        System.out.println("congratulations，you try " + guessCount + " times。");
                        break;
                    } else {
                        System.out.println("defeat，try again 已猜次数：" + guessCount);
                    }
                }
            }
        }
                }



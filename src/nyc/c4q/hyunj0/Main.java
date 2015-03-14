package nyc.c4q.hyunj0;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How well do you know the NYC Subway?! You have a few attempts to prove you are a NYC subway rider");

        int numOfTries = 4;

        while (numOfTries > 1) {
            System.out.println("How much is a single ride MetroCard? You have " + numOfTries + " tries.");
            float metroCard = input.nextFloat();

            while (metroCard == 2.50) {

                System.out.println("Did you know MTA is raising the fares yet again. Here's the current priced $2.50 single ride for you. Enter Times Square - 42nd Street");

                System.out.println("Times Square 42nd Street has many subway lines. Choose one of them to start your journey.");

                String subwayLine = input.next();
                String trainColorQuestion = "What color is your subway line? ";

                while (subwayLine.equalsIgnoreCase("A") || subwayLine.equalsIgnoreCase("C") || subwayLine.equalsIgnoreCase("E")) {
                    System.out.print(trainColorQuestion);
                    String trainColor = input.next();
                    if (trainColor.equalsIgnoreCase("blue")) {
                        System.out.println("Awesome, let's ride the trains.");
                        System.exit(0);
                    } else {
                        System.out.println("Try again!");
                        numOfTries -= 1;
                        continue;
                    }
                }

                while (subwayLine.equalsIgnoreCase("N") || subwayLine.equalsIgnoreCase("Q") || subwayLine.equalsIgnoreCase("R")) {
                    System.out.print(trainColorQuestion);
                    String trainColor = input.next();
                    if (trainColor.equalsIgnoreCase("yellow")) {
                        System.out.println("Awesome, let's ride the trains.");
                        System.exit(0);
                    } else {
                        System.out.println("Try again!");
                        numOfTries -= 1;
                        continue;
                    }
                }

                while (subwayLine.equalsIgnoreCase("S")) {
                    System.out.print(trainColorQuestion);
                    String trainColor = input.next();
                    if (trainColor.equalsIgnoreCase("gray")) {
                        System.out.println("Awesome, let's ride the trains.");
                        System.exit(0);
                    } else {
                        System.out.println("Try again!");
                        numOfTries -= 1;
                        continue;
                    }
                }

                while (subwayLine.equals("1") || subwayLine.equals("2") || subwayLine.equals("3")) {
                    System.out.print(trainColorQuestion);
                    String trainColor = input.next();
                    if (trainColor.equalsIgnoreCase("red")) {
                        System.out.println("Awesome, let's ride the trains.");
                        System.exit(0);
                    } else {
                        System.out.println("Try again!");
                        numOfTries -= 1;
                        continue;
                    }
                }

                while (subwayLine.equals("7")) {
                    System.out.print(trainColorQuestion);
                    String trainColor = input.next();
                    if (trainColor.equalsIgnoreCase("purple")) {
                        System.out.println("Awesome, let's ride the trains.");
                        System.exit(0);
                    } else {
                        System.out.println("Try again!");
                        numOfTries -= 1;
                        continue;
                    }
                }
            }

            while (metroCard != 2.50) {
                System.out.println("Are you a tourist? (yes/no)");
                String response = input.next();
                if (response.equalsIgnoreCase("yes")) {
                    System.out.println("Okay, you don't know the city. Buy a map and try again!!");
                    numOfTries -= 1;
                    break;
                } else if (response.equalsIgnoreCase("no")) {
                    System.out.println("Don't worry fellow New Yorkers! Take out your phones, google, and try again");
                    numOfTries -= 1;
                    break;
                } else {
                    System.out.println("It's a yes or no question!!");
                    numOfTries -= 1;
                    break;
                }
            }
        }

        while (numOfTries == 1) {
            System.out.println("How much is a single ride MetroCard? You have " + numOfTries + " tries.");
            float metroCard = input.nextFloat();

            while (metroCard == 2.50) {

                System.out.println("Did you know MTA is raising the fares yet again. Here's the current priced $2.50 single ride for you. Enter Times Square - 42nd Street");

                System.out.println("Times Square 42nd Street has many subway lines. Choose one of them to start your journey.");

                String subwayLine = input.next();
                String trainColorQuestion = "What color is your subway line? ";

                while (subwayLine.equalsIgnoreCase("A") || subwayLine.equalsIgnoreCase("C") || subwayLine.equalsIgnoreCase("E")) {
                    System.out.print(trainColorQuestion);
                    String trainColor = input.next();
                    if (trainColor.equalsIgnoreCase("blue")) {
                        System.out.println("Awesome, let's ride the trains.");
                        System.exit(0);
                    } else {
                        System.out.println("Try again!");
                        numOfTries -= 1;
                        continue;
                    }
                }

                while (subwayLine.equalsIgnoreCase("N") || subwayLine.equalsIgnoreCase("Q") || subwayLine.equalsIgnoreCase("R")) {
                    System.out.print(trainColorQuestion);
                    String trainColor = input.next();
                    if (trainColor.equalsIgnoreCase("yellow")) {
                        System.out.println("Awesome, let's ride the trains.");
                        System.exit(0);
                    } else {
                        System.out.println("Try again!");
                        numOfTries -= 1;
                        continue;
                    }
                }

                while (subwayLine.equalsIgnoreCase("S")) {
                    System.out.print(trainColorQuestion);
                    String trainColor = input.next();
                    if (trainColor.equalsIgnoreCase("gray")) {
                        System.out.println("Awesome, let's ride the trains.");
                        System.exit(0);
                    } else {
                        System.out.println("Try again!");
                        numOfTries -= 1;
                        continue;
                    }
                }

                while (subwayLine.equals("1") || subwayLine.equals("2") || subwayLine.equals("3")) {
                    System.out.print(trainColorQuestion);
                    String trainColor = input.next();
                    if (trainColor.equalsIgnoreCase("red")) {
                        System.out.println("Awesome, let's ride the trains.");
                        System.exit(0);
                    } else {
                        System.out.println("Try again!");
                        numOfTries -= 1;
                        continue;
                    }
                }

                while (subwayLine.equals("7")) {
                    System.out.print(trainColorQuestion);
                    String trainColor = input.next();
                    if (trainColor.equalsIgnoreCase("purple")) {
                        System.out.println("Awesome, let's ride the trains.");
                        System.exit(0);
                    } else {
                        System.out.println("Try again!");
                        numOfTries -= 1;
                        continue;
                    }
                }
            }

            while (metroCard != 2.50) {
                System.out.println("Are you a tourist? (yes/no)");
                String response = input.next();
                if (response.equalsIgnoreCase("yes")) {
                    System.out.println("Okay, you don't know the city. Sorry!");
                    System.exit(0);
                } else if (response.equalsIgnoreCase("no")) {
                    System.out.println("You're not a New Yorker! How could you possibly not know one of the busiest station complex of NYC?!");
                    System.exit(0);
                } else {
                    System.out.println("It's a yes or no question!! But, you're out of luck!");
                    System.exit(0);
                }
            }
        }

        while (numOfTries == 0) {
            System.out.println("You are a subway savvy pal! Good Job!");
        }
    }
}



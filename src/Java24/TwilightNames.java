package Java24;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

public class TwilightNames {
    //take in keyboard input
    //take in text file based on keyboard input
    //find section based on male or female input
    //count lines until next >
    //pick random value within that range
    //reset to beginning of that section
    //go forward based on the number picked, print that line
    public static String name(int input) throws IOException {
        Scanner key = new Scanner(System.in);
        System.out.print("Male or Female Name: ");
        String gender = key.next();
        boolean male;
        if (gender.equals("Male")) {
            male = true;
        } else {
            male = false;
        }
        if (input == 1) {
            RandomAccessFile elven = new RandomAccessFile("src/java24/TwilightNamesElven", "rw");
            String text = elven.readLine();
            boolean found = false;
            while (!found) {
                if (male) {
                    if (text.equals(">Male")) {
                        found = true;
                    }
                } else {
                    if (text.equals(">Female")) {
                        found = true;
                    }
                }
                text = elven.readLine();
            }
            //now to begin counting
            found = false;
            int number = 0;
            while (!found) {
                text = elven.readLine();
                if (text.equals(">")) {
                    found = true;
                } else {
                    number++;
                }
            } //counting is finished, now randomly select and go back through and select
            Random random = new Random();
            int randomNumber = random.nextInt(number);
            elven.seek(0);
            text = elven.readLine();
            System.err.println(text);
            found = false;
            while (!found) {
                if (male) {
                    if (text.equals(">Male")) {
                        found = true;
                    }
                } else {
                    if (text.equals(">Female")) {
                        found = true;
                    }
                }
                text = elven.readLine();
                System.err.println(text);
            } //now increment line based on the random number
            int find = randomNumber;
            while (find != 0) {
                text = elven.readLine();
                System.err.println(text + " " + find);
                find--;
            }
            if (found) {
                return ("Success - Elven" + text + number + randomNumber);
            }
            return "ERROR - ELVEN";
        }
        if (input == 2) {
            RandomAccessFile human = new RandomAccessFile("src/java24/TwilightNamesHuman", "rw");
            String text = human.readLine();
            boolean found = false;
            while (!found) {
                if (male) {
                    if (text.equals(">Male")) {
                        found = true;
                    }
                } else {
                    if (text.equals(">Female")) {
                        found = true;
                    }
                }
                text = human.readLine();
            }
            //now to begin counting
            found = false;
            int number = 0;
            while (!found) {
                text = human.readLine();
                if (text.equals(">")) {
                    found = true;
                } else {
                    number++;
                }
            } //counting is finished, now randomly select and go back through and select
            Random random = new Random();
            int randomNumber = random.nextInt(number);
            human.seek(0);
            text = human.readLine();
            found = false;
            while (!found) {
                if (male) {
                    if (text.equals(">Male")) {
                        found = true;
                    }
                } else {
                    if (text.equals(">Female")) {
                        found = true;
                    }
                }
                text = human.readLine();
            } //now increment line based on the random number
            int find = randomNumber;
            while (find != 0) {
                text = human.readLine();
                find--;
            }
            if (found) {
                return ("Success - Human - " + text);
            }
            return "ERROR - Human";
        }
        if (input == 3) {
            RandomAccessFile fae = new RandomAccessFile("src/java24/TwilightNamesFae", "rw");
            String text = fae.readLine();
            boolean found = false;
            while (!found) {
                if (male) {
                    if (text.equals(">Male")) {
                        found = true;
                    }
                } else {
                    if (text.equals(">Female")) {
                        found = true;
                    }
                }
                text = fae.readLine();
            }
            //now to begin counting
            found = false;
            int number = 0;
            while (!found) {
                text = fae.readLine();
                if (text.equals(">")) {
                    found = true;
                } else {
                    number++;
                }
            } //counting is finished, now randomly select and go back through and select
            Random random = new Random();
            int randomNumber = random.nextInt(number);
            fae.seek(0);
            text = fae.readLine();
            found = false;
            while (!found) {
                if (male) {
                    if (text.equals(">Male")) {
                        found = true;
                    }
                } else {
                    if (text.equals(">Female")) {
                        found = true;
                    }
                }
                text = fae.readLine();
            } //now increment line based on the random number
            int find = randomNumber;
            while (find != 0) {
                text = fae.readLine();
                find--;
            }
            if (found) {
                return ("Success - Fae - " + text);
            }
            return "ERROR - Fae";
        }
        if (input == 4) {
            RandomAccessFile magical = new RandomAccessFile("src/java24/TwilightNamesMagical", "rw");
            String text = magical.readLine();
            boolean found = false;
            while (!found) {
                if (male) {
                    if (text.equals(">Male")) {
                        found = true;
                    }
                } else {
                    if (text.equals(">Female")) {
                        found = true;
                    }
                }
                text = magical.readLine();
            }
            //now to begin counting
            found = false;
            int number = 0;
            while (!found) {
                text = magical.readLine();
                if (text.equals(">")) {
                    found = true;
                } else {
                    number++;
                }
            } //counting is finished, now randomly select and go back through and select
            Random random = new Random();
            int randomNumber = random.nextInt(number);
            magical.seek(0);
            text = magical.readLine();
            found = false;
            while (!found) {
                if (male) {
                    if (text.equals(">Male")) {
                        found = true;
                    }
                } else {
                    if (text.equals(">Female")) {
                        found = true;
                    }
                }
                text = magical.readLine();
            } //now increment line based on the random number
            int find = randomNumber;
            while (find != 0) {
                text = magical.readLine();
                find--;
            }
            if (found) {
                return ("Success - Magical - " + text);
            }
            return "ERROR - Magical";
        } else {
            return "ERROR - UNKNOWN";
        }
    }
    public static String input(String race) throws IOException {
        if (race.equals("Elven")) {
            String name = name(1);
            return name;
        }
        if (race.equals("Human")) {
            String name = name(2);
            return name;
        }
        if (race.equals("Fae")) {
            String name = name(3);
            return name;
        }
        if (race.equals("Magical")) {
            String name = name(4);
            return name;
        } else {
            System.out.print("Incorrect Input, Try again: ");
            Scanner key = new Scanner(System.in);
            String retry = key.next();
            String name = input(retry);
            return name;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter one of the following races - Elven, Human, Fae, Magical: ");
        String race = key.next();
        String name = input(race);
        System.out.println("Name Chosen: " + name);
    }
}


package Java24;


import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author <Jonathan.Poalses>
 */
public class BIDMASParse {
    
    public static char[] b(char[] input) {
        int length = input.length;
        StringBuilder output = new StringBuilder();
        String newOut = "";
        for (int a = 0; a < length; a++) {
            if (input[a] != '(') {
            output.append(input[a]);
            } else if (input[a] == '(') {
                    a++;
                for (;input[a] != ')';a++) {
                    newOut = (newOut + input[a]);
                }
                newOut = ('$' + newOut + '@');
                float parsed = parse(newOut);
                output.append(parsed).append('@');
                a++;
            }
        }
        return output.toString().toCharArray();
    }
    public static char[] i(char[] input) {
        boolean mineDone = false;
        int length = input.length;
        StringBuilder output = new StringBuilder();
        for (int a = 0; a < length; a++) {
            if (input[a] == '*' || input[a] == '+' || input[a] == '-' || input[a] == '/') {
            output.append(prevNum(input, a)).append(input[a]);
            mineDone = false;
            } else if (input [a] == '^' && !mineDone) {
                output.append(prevNum(input, a) / nextNum(input, a));
                mineDone = true;
                boolean symFound = false;
                while (!symFound) {
                a++;
                if (input[a] == '*' || input[a] == '+' || input[a] == '-' || input[a] == '/') {
                output.append(input[a]);
                symFound = true;
                mineDone = false;
                } else if (input[a] == '@') {
                    break;
                }
                }
            } else if (input[a] == '@' && !mineDone) {
            output.append(prevNum(input, a));
                break;
            } else if (input[a] == '@' && mineDone) {
                break;
            }
        }
        output = new StringBuilder(('$' + output.toString() + '@'));
        char[] arrayOutput = output.toString().toCharArray();
        if (mineDone) {
            arrayOutput = i(arrayOutput);
        }
        return arrayOutput;
    }
    public static char[] d(char[] input) {
        boolean mineDone = false;
        int length = input.length;
        StringBuilder output = new StringBuilder();
        for (int a = 0; a < length; a++) {
            if (input[a] == '*' || input[a] == '+' || input[a] == '-' || input[a] == '^') {
            output.append(prevNum(input, a)).append(input[a]);
            mineDone = false;
            } else if (input [a] == '/' && !mineDone) {
                output.append(prevNum(input, a) / nextNum(input, a));
                mineDone = true;
                boolean symFound = false;
                while (!symFound) {
                a++;
                if (input[a] == '*' || input[a] == '+' || input[a] == '-' || input[a] == '^') {
                output.append(input[a]);
                symFound = true;
                mineDone = false;
                } else if (input[a] == '@') {
                    break;
                }
                }
            } else if (input[a] == '@' && !mineDone) {
            output.append(prevNum(input, a));
                break;
            } else if (input[a] == '@' && mineDone) {
                break;
            }
        }
        output = new StringBuilder(('$' + output.toString() + '@'));
        char[] arrayOutput = output.toString().toCharArray();
        if (mineDone) {
            arrayOutput = d(arrayOutput);
        }
        return arrayOutput;
    }
    public static char[] m(char[] input) {
        boolean mineDone = false;
        int length = input.length;
        StringBuilder output = new StringBuilder();
        for (int a = 0; a < length; a++) {
            if (input[a] == '/' || input[a] == '+' || input[a] == '-' || input[a] == '^') {
            output.append(prevNum(input, a)).append(input[a]);
            mineDone = false;
            } else if (input [a] == '*' && !mineDone) {
                output.append(prevNum(input, a) * nextNum(input, a));
                mineDone = true;
                boolean symFound = false;
                while (!symFound) {
                a++;
                if (input[a] == '/' || input[a] == '+' || input[a] == '-' || input[a] == '^') {
                output.append(input[a]);
                symFound = true;
                mineDone = false;
                } else if (input[a] == '@') {
                    break;
                }
                }
            } else if (input[a] == '@' && !mineDone) {
            output.append(prevNum(input, a));
                break;
            } else if (input[a] == '@' && mineDone) {
                break;
            }
        }
        output = new StringBuilder(('$' + output.toString() + '@'));
        char[] arrayOutput = output.toString().toCharArray();
        if (mineDone) {
            arrayOutput = m(arrayOutput);
        }
        return arrayOutput;
    }
    public static char[] a(char[] input) {
        boolean mineDone = false;
        int length = input.length;
        StringBuilder output = new StringBuilder();
        for (int a = 0; a < length; a++) {
            if (input[a] == '*' || input[a] == '/' || input[a] == '-' || input[a] == '^') {
            output.append(prevNum(input, a)).append(input[a]);
            mineDone = false;
            } else if (input [a] == '+' && !mineDone) {
                output.append(prevNum(input, a) + nextNum(input, a));
                mineDone = true;
                boolean endFound = false;
                while (!endFound) {
                a++;
                if (input[a] == '*' || input[a] == '/' || input[a] == '-' || input[a] == '^' || input[a] == '+') {
                output.append(input[a]);
                output.append(nextNum(input, a));
                } else if (input[a] == '@') {
                    endFound = true;
                }
                }
            } else if (input[a] == '@') {
            output.append(prevNum(input, a));
                break;
            }
        }
        output = new StringBuilder(('$' + output.toString() + '@'));
        char[] arrayOutput = output.toString().toCharArray();
        if (mineDone) {
            arrayOutput = a(arrayOutput);
        }
        return arrayOutput;
    }
    public static char[] s(char[] input) {
        boolean mineDone = false;
        int length = input.length;
        boolean negative = false;
        StringBuilder output = new StringBuilder();
        for (int a = 1; a < length; a++) {
            if (input[a] == '*' || input[a] == '+' || input[a] == '/' || input[a] == '^') {
                if (input[a-1] != '$' || input[a-1] != '+' || input[a-1] != '/' || input[a-1] != '^' || input[a-1] != '*') {
            output.append(prevNum(input, a)).append(input[a]);
            mineDone = false;
                }
            } else if (input[a] == '-' && !mineDone) {
                if (input[a-1] == '*' || input[a-1] == '/' || input[a-1] == '-' || input[a-1] == '+' || input[a-1] == '$') {
                    negative = true;
                }
                if (negative && input[a-1] != '$') {
                output.append((prevNum(input, a) * -1) - nextNum(input, a));
                    mineDone = true;
                } else if (input[a-1] != '$') {
                output.append(prevNum(input, a) - nextNum(input, a));
                    mineDone = true;
                } else if (input[a-1] == '$' && negative) {
                    output.append('-');
                    output.append(nextNum(input, a));
                }
                boolean symFound = false;
                while (!symFound) {
                a++;
                if (input[a] == '*' || input[a] == '+' || input[a] == '/' || input[a] == '^') {
                output.append(input[a]);
                symFound = true;
                mineDone = false;
                } else if (input[a] == '@') {
                    break;
                }
                }
            } else if (input[a] == '@' && !mineDone) {
            output.append(prevNum(input, a));
                break;
            } else if (input[a] == '@' && mineDone) {
                break;
            }
        }
        output = new StringBuilder(('$' + output.toString() + '@'));
        char[] arrayOutput = output.toString().toCharArray();
        if (mineDone) {
            arrayOutput = s(arrayOutput);
        }
        return arrayOutput;
    }
    public static float nextNum(char[] input, int pos) {
        int length = input.length;
        StringBuilder output = new StringBuilder();
        pos++;
        int startPos = pos;
        for (;input[pos] >= 48 && input[pos] <= 57 || input[pos] == '.';) {
            output.append(input[pos]);
            if (startPos != pos && input[pos] == '*' || input[pos] == '+' || input[pos] == '/' || input[pos] == '^' || input[pos] == '/' || input[pos] == '$') {
                break;
            } else if (startPos == pos && input[pos] == '-' ) {
                output.append('-');
            }
            pos++;
        }
        return Float.parseFloat(output.toString());
    }
    public static float prevNum(char[] input, int pos) {
        int length = input.length;
        StringBuilder output = new StringBuilder();
        String output2 = "";
        pos--;
        while (input[pos] >= 48 && input[pos] <= 57 || input[pos] == '.') {
            output.append(input[pos]);
            pos--;
        }
            if (input[pos] == '-') {
                if (input[pos-1] == '*' || input[pos-1] == '+' || input[pos-1] == '/' || input[pos-1] == '^' || input[pos-1] == '/' || input[pos-1] == '-') {
                    output.append('-');
                }
            }
        char[] process = output.toString().toCharArray();
        for (int a = 0; a < process.length; a++) {
            output2 = output2 + process[(process.length) - 1 - a];
        }
        return Float.parseFloat(output2);
    }
    public static float parse(String mainInput) {
        mainInput = ('$' + mainInput + '@');
        char[] preput = mainInput.toCharArray();
        String inputS = "";
        for (int a = 0; a < preput.length; a++) {
            if (preput[a] == ' ') {
            } else {
                inputS = inputS + preput[a];
            }
        }
        char[] input = inputS.toCharArray();
        char[] process = b(input);
        process = i(process);
        process = d(process);
        process = m(process);
        process = a(process);
        process = s(process);
        String resultS = "";
        for (int a = 0; a < process.length; a++) {
            if (process[a] != '$' && process[a] != '@') {
            resultS = (resultS + process[a]);
            }
        }
        float result = Float.parseFloat(resultS);
        return result;
    }
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner in = new Scanner(new FileReader("src/java24/test.in"));
        Scanner exp = new Scanner(new FileReader("src/java24/test.exp"));
        System.out.println("Enter maths: ");
        try (PrintWriter writer = new PrintWriter("src/java24/test.out", "UTF-8")) {
            for (int a = 16; a > 0; a--) {
                String input = in.nextLine();
                float result = parse(input);
                writer.println(result);
            }
        }
        Scanner out = new Scanner(new FileReader("src/java24/test.out"));

        for (int a = 0; a < 16; a++) {
            String expected = exp.nextLine();
            String output = out.nextLine();
            boolean check = Objects.equals(expected, output);
            if (check) {
                System.out.printf("Line : %02d is : OK\n", a+1);
            } else {
                System.out.printf("Line : %02d is : BAD\n", a+1);
            }
        }
    }
}

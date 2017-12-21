
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

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
        String output = "";
        String newOut = "";
        for (int a = 0; a < length; a++) {
            if (input[a] != '(') {
            output = (output + input[a]);
            } else if (input[a] == '(') {
                    a++;
                for (;input[a] != ')';a++) {
                    newOut = (newOut + input[a]);
                }
                newOut = ('$' + newOut + '@');
                float parsed = parse(newOut);
                output = (output + parsed);
                a++;
            }
        }
        return output.toCharArray();
    }
    public static char[] i(char[] input) {
        boolean mineDone = false;
        int length = input.length;
        String output = "";
        for (int a = 0; a < length; a++) {
            if (input[a] == '*' || input[a] == '+' || input[a] == '-' || input[a] == '/') {
            output = (output + prevNum(input, a) + input[a]);
            mineDone = false;
            } else if (input [a] == '^' && !mineDone) {
                output = (output + (prevNum(input, a) / nextNum(input, a)));
                mineDone = true;
                boolean symFound = false;
                while (!symFound) {
                a++;
                if (input[a] == '*' || input[a] == '+' || input[a] == '-' || input[a] == '/') {
                output = (output + input[a]);
                symFound = true;
                mineDone = false;
                } else if (input[a] == '@') {
                    break;
                }
                }
            } else if (input[a] == '@' && !mineDone) {
            output = (output + prevNum(input, a));
                break;
            } else if (input[a] == '@' && mineDone) {
                break;
            }
        }
        output = ('$' + output + '@');
        char[] arrayOutput = output.toCharArray();
        if (mineDone) {
            arrayOutput = i(arrayOutput);
        }
        return arrayOutput;
    }
    public static char[] d(char[] input) {
        boolean mineDone = false;
        int length = input.length;
        String output = "";
        for (int a = 0; a < length; a++) {
            if (input[a] == '*' || input[a] == '+' || input[a] == '-' || input[a] == '^') {
            output = (output + prevNum(input, a) + input[a]);
            mineDone = false;
            } else if (input [a] == '/' && !mineDone) {
                output = (output + (prevNum(input, a) / nextNum(input, a)));
                mineDone = true;
                boolean symFound = false;
                while (!symFound) {
                a++;
                if (input[a] == '*' || input[a] == '+' || input[a] == '-' || input[a] == '^') {
                output = (output + input[a]);
                symFound = true;
                mineDone = false;
                } else if (input[a] == '@') {
                    break;
                }
                }
            } else if (input[a] == '@' && !mineDone) {
            output = (output + prevNum(input, a));
                break;
            } else if (input[a] == '@' && mineDone) {
                break;
            }
        }
        output = ('$' + output + '@');
        char[] arrayOutput = output.toCharArray();
        if (mineDone) {
            arrayOutput = d(arrayOutput);
        }
        return arrayOutput;
    }
    public static char[] m(char[] input) {
        boolean mineDone = false;
        int length = input.length;
        String output = "";
        for (int a = 0; a < length; a++) {
            if (input[a] == '/' || input[a] == '+' || input[a] == '-' || input[a] == '^') {
            output = (output + prevNum(input, a) + input[a]);
            mineDone = false;
            } else if (input [a] == '*' && !mineDone) {
                output = (output + (prevNum(input, a) * nextNum(input, a)));
                mineDone = true;
                boolean symFound = false;
                while (!symFound) {
                a++;
                if (input[a] == '/' || input[a] == '+' || input[a] == '-' || input[a] == '^') {
                output = (output + input[a]);
                symFound = true;
                mineDone = false;
                } else if (input[a] == '@') {
                    break;
                }
                }
            } else if (input[a] == '@' && !mineDone) {
            output = (output + prevNum(input, a));
                break;
            } else if (input[a] == '@' && mineDone) {
                break;
            }
        }
        output = ('$' + output + '@');
        char[] arrayOutput = output.toCharArray();
        if (mineDone) {
            arrayOutput = m(arrayOutput);
        }
        return arrayOutput;
    }
    public static char[] a(char[] input) {
        boolean mineDone = false;
        int length = input.length;
        String output = "";
        for (int a = 0; a < length; a++) {
            if (input[a] == '*' || input[a] == '/' || input[a] == '-' || input[a] == '^') {
            output = (output + prevNum(input, a) + input[a]);
            mineDone = false;
            } else if (input [a] == '+' && !mineDone) {
                output = (output + (prevNum(input, a) + nextNum(input, a)));
                mineDone = true;
                boolean symFound = false;
                while (!symFound) {
                a++;
                if (input[a] == '*' || input[a] == '/' || input[a] == '-' || input[a] == '^') {
                output = (output + input[a]);
                symFound = true;
                mineDone = false;
                } else if (input[a] == '@') {
                    break;
                }
                }
            } else if (input[a] == '@' && !mineDone) {
            output = (output + prevNum(input, a));
                break;
            } else if (input[a] == '@' && mineDone) {
                break;
            }
        }
        output = ('$' + output + '@');
        char[] arrayOutput = output.toCharArray();
        if (mineDone) {
            arrayOutput = a(arrayOutput);
        }
        return arrayOutput;
    }
    public static char[] s(char[] input) {
        boolean mineDone = false;
        int length = input.length;
        String output = "";
        for (int a = 0; a < length; a++) {
            if (input[a] == '*' || input[a] == '+' || input[a] == '/' || input[a] == '^') {
            output = (output + prevNum(input, a) + input[a]);
            mineDone = false;
            } else if (input [a] == '-' && !mineDone) {
                output = (output + (prevNum(input, a) - nextNum(input, a)));
                mineDone = true;
                boolean symFound = false;
                while (!symFound) {
                a++;
                if (input[a] == '*' || input[a] == '+' || input[a] == '/' || input[a] == '^') {
                output = (output + input[a]);
                symFound = true;
                mineDone = false;
                } else if (input[a] == '@') {
                    break;
                }
                }
            } else if (input[a] == '@' && !mineDone) {
            output = (output + prevNum(input, a));
                break;
            } else if (input[a] == '@' && mineDone) {
                break;
            }
        }
        output = ('$' + output + '@');
        char[] arrayOutput = output.toCharArray();
        if (mineDone) {
            arrayOutput = s(arrayOutput);
        }
        return arrayOutput;
    }
    public static float nextNum(char[] input, int pos) {
        int length = input.length;
        String output = "";
        pos++;
        for (;input[pos] >= 48 && input[pos] <= 57 || input[pos] == '.';) {
            output = output + input[pos];
            if (input[pos] == '*' || input[pos] == '+' || input[pos] == '/' || input[pos] == '^' || input[pos] == '/' || input[pos] == '$') {
                break;
            }
            pos++;
        }
        return Float.parseFloat(output);
    }
    public static float prevNum(char[] input, int pos) {
        int length = input.length;
        String output = "";
        String output2 = "";
        pos--;
        for (;input[pos] >= 48 && input[pos] <= 57 || input[pos] == '.';) {
            output = output + input[pos];
            if (input[pos] == '*' || input[pos] == '+' || input[pos] == '/' || input[pos] == '^' || input[pos] == '/' || input[pos] == '$') {
                break;
            }
            pos--;
        }
        char[] process = output.toCharArray();
        for (int a = 0; a < process.length; a++) {
            output2 = output2 + process[(process.length) - 1 - a];
        }
        return Float.parseFloat(output2);
    }
    public static float parse(String mainInput) {
        mainInput = ('$' + mainInput + '@');
        char[] input = mainInput.toCharArray();
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
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter maths: ");
        String input = in.nextLine();
        float result = parse(input);
        System.out.println(result);
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] tmp = str.toCharArray();
        int count = 0;
        int i = 0;
        while(i != tmp.length) {
            if(tmp[i] == 'c' || tmp[i] == 'd' || tmp[i] == 'l' || tmp[i] == 'n' || tmp[i] == 's' || tmp[i] == 'z') {
                switch(tmp[i]) {
                    case('c'):
                    case('s'):
                    case('z'):
                        count++;
                        i++;
                        if(i < tmp.length && (tmp[i] == '=' || tmp[i] == '-')) {
                            i++;
                        }
                        break;
                    case('d'):
                        count++;
                        i++;
                        if(i < tmp.length && tmp[i] == 'z') {
                            i++;
                            if(i < tmp.length && tmp[i] == '=') {
                                i++;
                            } else {
                                count++;
                            }
                        } else if(i < tmp.length && tmp[i] == '-') {
                            i++;
                        }
                        break;
                    case('l'):
                    case('n'):
                        count++;
                        i++;
                        if(i < tmp.length && tmp[i] == 'j') {
                            i++;
                        }
                        break;
                    default:
                        break;
                }
            }
            else if (tmp[i] >= 'a' && tmp[i] <= 'z') {
                count++;
                i++;
            }
            else {
                i++;
            }
        }
        System.out.println(count);
    }
}
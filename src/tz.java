import java.util.Objects;
import java.util.Scanner;

public class tz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        in = probel(in);
        try {
            in = calc(in);
            System.out.println(in);
        } catch (NumberFormatException error){
            System.out.println("Формат введенных данных не одинаковый");
        }

    }

    public static String calc(String input) {
        String[] result;
        int a = 0;
        if (input.contains("1")||input.contains("2")||input.contains("3")||input.contains("4")||input.contains("5")||input.contains("6")||input.contains("7")||input.contains("8")||input.contains("9")||input.contains("10")) {
            if (input.contains("+")) {
                result = input.split("\\+");
                if (Integer.parseInt(result[0]) <=10 && Integer.parseInt(result[0]) > 0 && Integer.parseInt(result[1]) <= 10 && Integer.parseInt(result[1]) > 0){
                    a = Integer.parseInt(result[0]) + Integer.parseInt(result[1]);
                    input = Integer.toString(a);
                } else {
                    System.out.println("Введение значения больше 10 или меньше 1");
                }
            } else if (input.contains("-")) {
                result = input.split("-");
                if (((Integer.parseInt(result[0]) <=10) && (Integer.parseInt(result[0]) > 0)) && ((Integer.parseInt(result[1]) <= 10) && (Integer.parseInt(result[1]) > 0))){
                    a = Integer.parseInt(result[0]) - Integer.parseInt(result[1]);
                    input = Integer.toString(a);
                } else {
                    System.out.println("Введение значения больше 10 или меньше 1");
                }
            } else if (input.contains("*")) {
                result = input.split("\\*");
                if (Integer.parseInt(result[0]) <=10 && Integer.parseInt(result[0]) > 0 && Integer.parseInt(result[1]) <= 10 && Integer.parseInt(result[1]) > 0){
                    a = Integer.parseInt(result[0]) * Integer.parseInt(result[1]);
                    input = Integer.toString(a);
                } else {
                    System.out.println("Введение значения больше 10 или меньше 1");
                }
            } else if (input.contains("/")) {
                result = input.split("/");
                if (Integer.parseInt(result[0]) <=10 && Integer.parseInt(result[0]) > 0 && Integer.parseInt(result[1]) <= 10 && Integer.parseInt(result[1]) > 0){
                    a = Integer.parseInt(result[0]) / Integer.parseInt(result[1]);
                    input = Integer.toString(a);
                } else {
                    System.out.println("Введение значения больше 10 или меньше 1");
                }
            } else {
                System.out.println("На данный момент невозможно вычислить");
            }
//        } else if (input.contains("[I,II,III,IV,V,VI,VII,VIII,IX,X]")) {
          } else if (input.contains("I")||input.contains("II")||input.contains("III")||input.contains("IV")||input.contains("V")||input.contains("VI")||input.contains("VII")||input.contains("VIII")||input.contains("IX")||input.contains("X")) {
            if (input.contains("+")) {
                result = input.split("\\+");
                rim(result);
                if (Integer.parseInt(result[0]) <=10 && Integer.parseInt(result[0]) > 0 && Integer.parseInt(result[1]) <= 10 && Integer.parseInt(result[1]) > 0){
                    a = Integer.parseInt(result[0]) + Integer.parseInt(result[1]);
                    input = Integer.toString(a);
                    input = arab(input);
                } else {
                    System.out.println("Введение значения больше 10 или меньше 1");
                }
            } else if (input.contains("-")) {
                result = input.split("-");
                rim(result);
                if (Integer.parseInt(result[0]) <=10 && Integer.parseInt(result[0]) > 0 && Integer.parseInt(result[1]) <= 10 && Integer.parseInt(result[1]) > 0){
                    a = Math.abs(Integer.parseInt(result[0]) - Integer.parseInt(result[1]));
                    input = Integer.toString(a);
                    input = arab(input);
                } else {
                    System.out.println("Введение значения больше 10 или меньше 1");
                }
            } else if (input.contains("*")) {
                result = input.split("\\*");
                rim(result);
                if (Integer.parseInt(result[0]) <=10 && Integer.parseInt(result[0]) > 0 && Integer.parseInt(result[1]) <= 10 && Integer.parseInt(result[1]) > 0){
                    a = Integer.parseInt(result[0]) * Integer.parseInt(result[1]);
                    input = Integer.toString(a);
                    input = arab(input);
                } else {
                    System.out.println("Введение значения больше 10 или меньше 1");
                }
            } else if (input.contains("/")) {
                result = input.split("/");
                rim(result);
                if (Integer.parseInt(result[0]) <=10 && Integer.parseInt(result[0]) > 0 && Integer.parseInt(result[1]) <= 10 && Integer.parseInt(result[1]) > 0){
                    a = Integer.parseInt(result[0]) / Integer.parseInt(result[1]);
                    if (a >= 1){
                        input = Integer.toString(a);
                        input = arab(input);
                    } else {
                       // System.out.println("Результат вычисления римских цифр меньше 1");
                        input = "Результат вычисления римских цифр меньше 1";
                    }
                } else {
                    System.out.println("Введение значения больше 10 или меньше 1");
                }
            } else {
                System.out.println("На данный момент невозможно вычислить");
            }
        }
        return input;
    }

    public static String probel(String prob) {
        return prob = prob.replace(" ", "");
    }

    public static void rim(String[] rim) {
        for (int i = 0; i < rim.length; i++) {
            if (Objects.equals(rim[i], "I")) {
                rim[i] = "1";
            } else if (Objects.equals(rim[i], "II")) {
                rim[i] = "2";
            } else if (Objects.equals(rim[i], "III")) {
                rim[i] = "3";
            } else if (Objects.equals(rim[i], "IV")) {
                rim[i] = "4";
            } else if (Objects.equals(rim[i], "V")) {
                rim[i] = "5";
            } else if (Objects.equals(rim[i], "VI")) {
                rim[i] = "6";
            } else if (Objects.equals(rim[i], "VII")) {
                rim[i] = "7";
            } else if (Objects.equals(rim[i], "VIII")) {
                rim[i] = "8";
            } else if (Objects.equals(rim[i], "IX")) {
                rim[i] = "9";
            } else if (Objects.equals(rim[i], "X")) {
                rim[i] = "10";
            }
        }
    }

    public static String arab(String arab) {
        if (Objects.equals(arab, "1")) {
            arab = "I";
        } else if (Objects.equals(arab, "2")) {
            arab = "II";
        } else if (Objects.equals(arab, "3")) {
            arab = "III";
        } else if (Objects.equals(arab, "4")) {
            arab = "IV";
        } else if (Objects.equals(arab, "5")) {
            arab = "V";
        } else if (Objects.equals(arab, "6")) {
            arab = "VI";
        } else if (Objects.equals(arab, "7")) {
            arab = "VII";
        } else if (Objects.equals(arab, "8")) {
            arab = "VIII";
        } else if (Objects.equals(arab, "9")) {
            arab = "IX";
        } else if (Objects.equals(arab, "10")) {
            arab = "X";
        } else if (Objects.equals(arab, "11")) {
            arab = "XI";
        } else if (Objects.equals(arab, "12")) {
            arab = "XII";
        } else if (Objects.equals(arab, "13")) {
            arab = "XIII";
        } else if (Objects.equals(arab, "14")) {
            arab = "XIV";
        } else if (Objects.equals(arab, "15")) {
            arab = "XV";
        } else if (Objects.equals(arab, "16")) {
            arab = "XVI";
        } else if (Objects.equals(arab, "17")) {
            arab = "XVII";
        } else if (Objects.equals(arab, "18")) {
            arab = "XVIII";
        } else if (Objects.equals(arab, "19")) {
            arab = "XIX";
        } else if (Objects.equals(arab, "20")) {
            arab = "XX";
        } else if (Objects.equals(arab, "21")) {
            arab = "XXI";
        } else if (Objects.equals(arab, "22")) {
            arab = "XXII";
        } else if (Objects.equals(arab, "23")) {
            arab = "XXIII";
        } else if (Objects.equals(arab, "24")) {
            arab = "XXIV";
        } else if (Objects.equals(arab, "25")) {
            arab = "XXV";
        } else if (Objects.equals(arab, "26")) {
            arab = "XXVI";
        } else if (Objects.equals(arab, "27")) {
            arab = "XXVII";
        } else if (Objects.equals(arab, "28")) {
            arab = "XXVIII";
        } else if (Objects.equals(arab, "29")) {
            arab = "XXIX";
        } else if (Objects.equals(arab, "30")) {
            arab = "XXX";
        } else if (Objects.equals(arab, "31")) {
            arab = "XXXI";
        } else if (Objects.equals(arab, "32")) {
            arab = "XXXII";
        } else if (Objects.equals(arab, "33")) {
            arab = "XXXIII";
        } else if (Objects.equals(arab, "34")) {
            arab = "XXXIV";
        } else if (Objects.equals(arab, "35")) {
            arab = "XXXV";
        } else if (Objects.equals(arab, "36")) {
            arab = "XXXVI";
        } else if (Objects.equals(arab, "37")) {
            arab = "XXXVII";
        } else if (Objects.equals(arab, "38")) {
            arab = "XXXVIII";
        } else if (Objects.equals(arab, "39")) {
            arab = "XXXIX";
        } else if (Objects.equals(arab, "40")) {
            arab = "XL";
        } else if (Objects.equals(arab, "41")) {
            arab = "XLI";
        } else if (Objects.equals(arab, "42")) {
            arab = "XLII";
        } else if (Objects.equals(arab, "43")) {
            arab = "XLIII";
        } else if (Objects.equals(arab, "44")) {
            arab = "XLIV";
        } else if (Objects.equals(arab, "45")) {
            arab = "XLV";
        } else if (Objects.equals(arab, "46")) {
            arab = "XLVI";
        } else if (Objects.equals(arab, "47")) {
            arab = "XLVII";
        } else if (Objects.equals(arab, "48")) {
            arab = "XLVIII";
        } else if (Objects.equals(arab, "49")) {
            arab = "XLIX";
        } else if (Objects.equals(arab, "50")) {
            arab = "L";
        } else if (Objects.equals(arab, "51")) {
            arab = "LI";
        } else if (Objects.equals(arab, "52")) {
            arab = "LII";
        } else if (Objects.equals(arab, "53")) {
            arab = "LIII";
        } else if (Objects.equals(arab, "54")) {
            arab = "LIV";
        } else if (Objects.equals(arab, "55")) {
            arab = "LV";
        } else if (Objects.equals(arab, "56")) {
            arab = "LVI";
        } else if (Objects.equals(arab, "57")) {
            arab = "LVII";
        } else if (Objects.equals(arab, "58")) {
            arab = "LVIII";
        } else if (Objects.equals(arab, "59")) {
            arab = "LIX";
        } else if (Objects.equals(arab, "60")) {
            arab = "LX";
        } else if (Objects.equals(arab, "61")) {
            arab = "LXI";
        } else if (Objects.equals(arab, "62")) {
            arab = "LXII";
        } else if (Objects.equals(arab, "63")) {
            arab = "LXIII";
        } else if (Objects.equals(arab, "64")) {
            arab = "LXIV";
        } else if (Objects.equals(arab, "65")) {
            arab = "LXV";
        } else if (Objects.equals(arab, "66")) {
            arab = "LXVI";
        } else if (Objects.equals(arab, "67")) {
            arab = "LXVII";
        } else if (Objects.equals(arab, "68")) {
            arab = "LXVIII";
        } else if (Objects.equals(arab, "69")) {
            arab = "LXIX";
        } else if (Objects.equals(arab, "70")) {
            arab = "LXX";
        } else if (Objects.equals(arab, "71")) {
            arab = "LXXI";
        } else if (Objects.equals(arab, "72")) {
            arab = "LXXII";
        } else if (Objects.equals(arab, "73")) {
            arab = "LXXIII";
        } else if (Objects.equals(arab, "74")) {
            arab = "LXXIV";
        } else if (Objects.equals(arab, "75")) {
            arab = "LXXV";
        } else if (Objects.equals(arab, "76")) {
            arab = "LXXVI";
        } else if (Objects.equals(arab, "77")) {
            arab = "LXXVII";
        } else if (Objects.equals(arab, "78")) {
            arab = "LXXVIII";
        } else if (Objects.equals(arab, "79")) {
            arab = "LXXIX";
        } else if (Objects.equals(arab, "80")) {
            arab = "LXXX";
        } else if (Objects.equals(arab, "81")) {
            arab = "LXXXI";
        } else if (Objects.equals(arab, "82")) {
            arab = "LXXXII";
        } else if (Objects.equals(arab, "83")) {
            arab = "LXXXIII";
        } else if (Objects.equals(arab, "84")) {
            arab = "LXXXIV";
        } else if (Objects.equals(arab, "85")) {
            arab = "LXXXV";
        } else if (Objects.equals(arab, "86")) {
            arab = "LXXXVI";
        } else if (Objects.equals(arab, "87")) {
            arab = "LXXXVII";
        } else if (Objects.equals(arab, "88")) {
            arab = "LXXXVIII";
        } else if (Objects.equals(arab, "89")) {
            arab = "LXXXIX";
        } else if (Objects.equals(arab, "90")) {
            arab = "XC";
        } else if (Objects.equals(arab, "91")) {
            arab = "XCI";
        } else if (Objects.equals(arab, "92")) {
            arab = "XCII";
        } else if (Objects.equals(arab, "93")) {
            arab = "XCIII";
        } else if (Objects.equals(arab, "94")) {
            arab = "XCIV";
        } else if (Objects.equals(arab, "95")) {
            arab = "XCV";
        } else if (Objects.equals(arab, "96")) {
            arab = "XCVI";
        } else if (Objects.equals(arab, "97")) {
            arab = "XCVII";
        } else if (Objects.equals(arab, "98")) {
            arab = "XCVIII";
        } else if (Objects.equals(arab, "99")) {
            arab = "XCIX";
        } else if (Objects.equals(arab, "100")) {
            arab = "C";
        }
         return arab;

    }
}
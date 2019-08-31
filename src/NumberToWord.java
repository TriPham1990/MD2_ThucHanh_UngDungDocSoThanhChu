import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số cần đọc : ");

        int number = scanner.nextInt();


        if(number < 10){

            System.out.println(numbersOneDigit(number));


        } else if (number < 100){

            System.out.println(numbersTwoDigit(number));

        } else if (number < 1000){

            System.out.println(numbersThreeDigit(number));

        } else if (number < 10000) {

            System.out.println(numbersFourDigit(number));

        }
    }

    public static String numbersOneDigit(int number) {

        String[] numbersOneDigitList = {"không","một","hai","ba","bốn","năm","sáu","bảy","tám","chín"};


        return numbersOneDigitList[number];

    }
    public static String numbersTwoDigit(int number){

        int modNumber = number % 10;
        int headNumber = number / 10;

        if(number < 20){

            if( modNumber == 0){

                return "mười";


            } else {

                return "mười " + numbersOneDigit(modNumber);

            }

        } else {

            if(modNumber != 0){

                if(modNumber != 5){

                    return numbersOneDigit(headNumber) + " mươi " + numbersOneDigit(modNumber);

                } else {

                    return numbersOneDigit(headNumber) + " mươi lăm ";

                }

            } else {

                return numbersOneDigit(headNumber) + " mươi";

            }

        }


    }
    public static String numbersThreeDigit(int number){

        int modNumber = number % 100;
        int headNumber = number /100;

        if(modNumber == 0){

            return numbersOneDigit(headNumber) + " trăm ";

        } else {

            return numbersOneDigit(headNumber) + " trăm " + numbersTwoDigit(modNumber);

        }

    }
    public static String numbersFourDigit(int number){
        int headNumber = number / 1000;
        int modNumber = number % 1000;

        if (modNumber == 0){

            return numbersOneDigit(headNumber) + " nghìn";

        } else {

            if(modNumber < 100){

                return numbersOneDigit(headNumber) + " nghìn không trăm " + numbersTwoDigit(modNumber);

            } else {

                return numbersOneDigit(headNumber) + " nghìn " + numbersThreeDigit(modNumber);

            }

        }

    }

}

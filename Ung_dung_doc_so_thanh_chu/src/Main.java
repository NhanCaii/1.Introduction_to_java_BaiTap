import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên không âm (tối đa 3 chữ số): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Số không hợp lệ. Vui lòng nhập số nguyên không âm có tối đa 3 chữ số.");
        } else {
            String result = docSoBangChu(number);
            System.out.println(result);
        }

        scanner.close();
    }

    public static String docSoBangChu(int number) {
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        int hundred = number / 100;
        int ten = (number % 100) / 10;
        int unit = number % 10;

        String result = "";

        if (hundred > 0) {
            result += units[hundred] + " hundred ";
        }

        if (ten == 1) {
            result += teens[unit] + " ";
        } else {
            if (ten > 1) {
                result += tens[ten] + " ";
            }
            if (unit > 0) {
                result += units[unit] + " ";
            }
        }

        return result.trim(); // Xóa dấu cách ở đầu và cuối chuỗi (nếu có).
    }
}

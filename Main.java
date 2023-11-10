import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for(var i=0;i < 2; i++) {
            System.out.println("i=" + i);

            // キーボードから身長と体重を入力
            Scanner scanner = new Scanner(System.in);
            System.out.print("身長（メートル単位）を入力してください: ");
            double height = scanner.nextDouble();

            System.out.print("体重（キログラム単位）を入力してください: ");
            double weight = scanner.nextDouble();

            // BMIを計算
            double bmi = calculateBMI(height, weight);

            // 結果を表示
            System.out.println("BMIは " + bmi + " です。");

            // BMIの分類を表示
            displayBMIClassification(bmi);
        }
    }

    // BMIを計算するメソッド
    private static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    // BMIの分類を表示するメソッド
    private static void displayBMIClassification(double bmi) {
        System.out.print("BMIの分類: ");
        if (bmi < 18.5) {
            System.out.println("低体重");
        } else if (bmi < 25) {
            System.out.println("普通体重");
        } else if (bmi < 30) {
            System.out.println("肥満（1度）");
        } else if (bmi < 35) {
            System.out.println("肥満（2度）");
        } else if (bmi < 40) {
            System.out.println("肥満（3度）");
        } else {
            System.out.println("肥満（4度）");
        }
    }
}

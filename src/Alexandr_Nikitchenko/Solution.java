package Alexandr_Nikitchenko;
/*
Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //Ввод данных с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader.readLine();

        //Преобразуем строку ы число
        int m = Integer.parseInt(s);
        int n = Integer.parseInt(s1);

        // Рисуем прямоугольник с помощью цикла for
        for(int i = 0; i < m; i++){
            for(int k = 0; k < n; k++){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}

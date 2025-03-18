package org.example;

public class Calc {

    public static int run(String exp) {

        System.out.println("exp 1 : " + exp);

        exp = exp.replace("- ", "+ -");

        // boolean Plus = exp.contains("+"); // contain : 감싸다

        System.out.println("exp 2 : " + exp);

        boolean plus = exp.contains("+");
        boolean multi = exp.contains("*");

        String[] bits = null;

        if (plus) {
            bits = exp.split(" \\+ ");
        } else if (multi) {
            bits = exp.split(" \\* ");
        }

        int sum = 0;

        for (int i = 0; i < bits.length; i++) { 
            // bits의 길이가 i보다 클떄까지 i가 1씩 늘어나는 걸 반복
           if (plus) {
               sum += Integer.parseInt(bits[i]);
           } else if (multi) {
            sum *= Integer.parseInt(bits[i]); }
            // 그래서 그 배열만큼 sum에 추가
        }

        return sum;

        // throw new RuntimeException("실행 불가");
    }

}

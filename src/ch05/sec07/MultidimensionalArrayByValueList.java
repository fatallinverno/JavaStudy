package ch05.sec07;

/*
 * 장제목 : 5-7 다차원 배열
 * 작석일 : 2024.04.23
 *
 * 배열 항목에는 또 다른 배열이 대입될 수 있는데, 이러한 배열을 다차원 배열이라고 부른다.
 * */

public class MultidimensionalArrayByValueList {
    public static void main(String[] args) {
        //2차원 배열 생성
        int[][] socres = {{80, 90, 96}, {76, 88}};

        //배열의 길이
        System.out.println("1차원 배열 길이(반의 수) : " + socres.length);
        System.out.println("2차원 배열 길이(첫 번째 반의 학생 수) : " + socres[0].length);
        System.out.println("2차원 배열 길이(두 번째 반의 학생 수) : " + socres[1].length);

        //첫 번째 반의 세 번째 학생의 점수 읽기
        System.out.println("scores[0][2] : " + socres[0][2]);

        //두 번째 반의 두 번째 학생의 점수 읽기
        System.out.println("scores[1][1] : " + socres[1][1]);

        //첫 번째 반의 평균 점수 구하기
        int class1Sum = 0;
        for (int i = 0; i < socres[0].length; i++) {
            class1Sum += socres[0][i];
        }
        double class1Avg = (double) class1Sum / socres[0].length;
        System.out.println("첫 번째 반의 평균 점수 : " + class1Avg);

        //두 번째 반의 평균 점수 구하기
        int class2Sum = 0;
        for (int i = 0; i < socres[1].length; i++) {
            class2Sum += socres[1][i];
        }
        double class2Avg = (double) class2Sum / socres[1].length;
        System.out.println("두 번째 반의 평균 점수 : " + class2Avg);

        //전체 학생의 평균 점수 구하기
        int totalStudent = 0;
        int totalSum = 0;
        for (int i = 0; i < socres.length; i++) {
            totalStudent += socres[i].length;
            for (int j = 0; j < socres[i].length; j++) {
                totalSum += socres[i][j];
            }
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("전체 학생의 평균 점수 : " + totalAvg);
    }
}

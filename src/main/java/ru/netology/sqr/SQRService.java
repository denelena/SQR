package ru.netology.sqr;

public class SQRService {
    public int getSquareRootCount(int rangeLowerBorder, int rangeUpperBorder) {
        int foundCount = 0;
        for (int sqrCandidate = 10; sqrCandidate < 100; sqrCandidate++) {
            int squared = sqrCandidate * sqrCandidate;
            // проверяем, годится ли этот кандидат, попадает ли в диапазон
            if (squared >= rangeLowerBorder && squared <= rangeUpperBorder) {
                foundCount++; //таки попал, увеличим количество найденных
            }
        }
        return foundCount;
    }
}

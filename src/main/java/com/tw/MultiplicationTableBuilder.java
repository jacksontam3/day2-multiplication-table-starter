package com.tw;

public class MultiplicationTableBuilder {
    public boolean isInRange(int number) {
        return number > 0 && number <= 1000;
    }

    public boolean isStarterNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStarterNotBiggerThanEnd(start, end);
    }

    public String generateExpression(int start, int end) {
        return start + "*" + end + "=" + start * end;
    }
}

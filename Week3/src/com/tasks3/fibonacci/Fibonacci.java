package com.tasks3.fibonacci;

public class Fibonacci {
    // ������� ����� Գ������� �� �������, ��������� ��������� � �������
    // ���� ����� �� ������� ���������� �������� -1
    public long getNumber(int position) {
        if (position <= 0) {
            return -1;
        }

        if (position == 1 || position == 2) {
            return 1;
        } else {
            long n1 = getNumber(position - 1);
            long n2 = getNumber(position - 2);
            return n1 + n2;
        }
    }
}

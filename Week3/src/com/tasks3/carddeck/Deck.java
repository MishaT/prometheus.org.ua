package com.tasks3.carddeck;
public class Deck {

    // ������� ������ � ����������� �������
    public void shuffle() {
    }

    /*
     * * ������������� ������ �� ������� �� ���������� ������� ����������:
     * �������� �� ����� � ����� HEARTS, ���� DIAMONDS, CLUBS, SPADES ���
     * ����� ���� ������� ���������: Ace,King,Queen,Jack,10,9,8,7,6 ���������
     * HEARTS Ace HEARTS King HEARTS Queen HEARTS Jack HEARTS 10 HEARTS 9 HEARTS
     * 8 HEARTS 7 HEARTS 6 � ��� ��� ��� DIAMONDS, CLUBS, SPADES
     */
    public void order() {
    }

    // ������� true � ������� ���� � ����� �� ������� �����
    public boolean hasNext() {
        return false;
    }

    // "�����" ���� ����� � ������, ���� ���� ������ �� 36 ���� ������� null
    // ����� ���������� � "�������" ������. ��������� ������ ������ �������
    // SPADES 6 ����
    // SPADES 7, ..., CLUBS 6, ..., CLUBS Ace � ��� ��� �� HEARTS Ace
    public Card drawOne() {
        return null;
    }
}

package hw;

import static org.junit.Assert.*;
import org.junit.Test;

import hw.FirstSteps.Cat;

//����� ����� ��� ������
public class CatTest {
@Test
public void testCat1() {
	// ��������� @Test ������� �������� ��������� ��� �� ���� ��� ��������� ����� �������. � ������ ���������� ����������� ����� ������� ������ ����� �������.
Cat cat = new Cat("Pushok"); //�������� ��������� ������ Cat
assertEquals("Pushok", cat.toString()); // ���������� ����������� ����� � ��������� ���������� ��������� � ���������    
}
@Test
public void testCat2() {
Cat cat = new Cat("Markiz");
assertEquals("Markiz", cat.toString());
}
@Test
public void testCat3() {
Cat cat = new Cat("Murka");
assertEquals("Murka", cat.toString());
}
}

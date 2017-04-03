package hw;

import static org.junit.Assert.*;
import org.junit.Test;

import hw.FirstSteps.Cat;

//новый класс для тестов
public class CatTest {
@Test
public void testCat1() {
	// аннотация @Test говорит сборщику выполнить это до того как программа будет собрана. В случае неудачного прохождения теста процесс сборки будет прерван.
Cat cat = new Cat("Pushok"); //создадим экземпляр класса Cat
assertEquals("Pushok", cat.toString()); // вызывается тестируемый метод и сверяется полученный результат с ожидаемым    
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

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age;
      this.result = result;
   
  }

  @Parameterized.Parameters // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][] {
        { 17, false},
        { 18, true},
        { 9, false},
        { 21, true},
       
        
        // Заполни массив тестовыми данными и ожидаемым результатом
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	// Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(age);
        boolean actual = isAdult;
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Возраст", result, isAdult);
	}
}
























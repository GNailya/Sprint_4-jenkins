import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestParamNameCart {
    private final String name;
    private final boolean expected;

    public TestParamNameCart(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] getName() {
        return new Object[][] {
                { "Test Tester", true},
                { "Тимоти Шаламе", true},
                { null, false},//не может быть равной нулю
                { "", false},//не может быть пустая строка
                { "      ", false},//не может состоять только из пробелов
                { "Ти", false},//не должно быть меньше 3х символов
                { " ТимотиШаламе", false},//нельзя вставить пробел вначале
                { "ТимотиШаламе ", false},//нельзя вставить пробел вконце
                { "Тимоти  Шаламе", false},//не должно быть более 1го пробела
                { "Тимоти Шаламешаламел", false},// не должно быть более 19 символов ??????????
                {"ТимотиШаламе", false},// должен быть пробел между именем и фамилией
        };
}
    @Test
    public void testParameterized() {
        Account account = new Account(name);
        boolean actual = (account.checkNameToEmboss());
        assertEquals(expected,actual);

    }}

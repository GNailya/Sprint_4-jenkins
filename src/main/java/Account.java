public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

             //Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             //Если строка удовлетворяет условиям, метод возвращает true, иначе — false.

    public boolean checkNameToEmboss() {
        if (
                name != null
                        && !name.isBlank()
                        && name.matches("^(?=^\\D{3,19}$)([A-Za-zА-Яа-я]+\\s[A-Za-zА-Яа-я]+)$")
        ) {
            System.out.println("Строка соответствует");
            return true;
        } else {
            System.out.println("Строка не соответствует");
            return false;

        }


    }
}

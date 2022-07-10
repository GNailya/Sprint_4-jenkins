public class Praktikum {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Нужен хотябы один параметр");
            return;
        }

        for (String arg : args) {
            Account account = new Account(arg);
            account.checkNameToEmboss();
        }
    }
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */

    }



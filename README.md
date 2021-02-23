# **Application to open mail, authorize, search letters and send reply**

Instructions:

1. clone project from GitHub or download zip.
2. unpack file
3. to check it by using your data, should change it in environment variables
4. choose RUN_TYPE (remote or local), its environment variables, too
5. run test

result:

1. mail.ru will be open
2. will be entered your login and psswd
3. search letters panel will be open
4. will find authomatically person you're looking for
5. send reply to found person
6. mail will content msg "Добрый день, найдено letters писем", where letters is amount of found letters

Description:
used Java, Selenium Webdriver; using Selenium Webdriver browser opens, authorization, entry profile and search for
letters. using interface and Selenium Webdriver write reply letter with msg
"Добрый день, найдено letters писем"
everything works like tests

used:

1. Java 8
2. Selenium GRID
3. pattern Page Object
4. Allure
5. Maven
6. Junit

# **Приложение для открытия странички, авторизации, поиска писем и отправки ответного письма**

Инструкция:

1. Клонировать проект с GitHub 1.2 Скачать архив с проектом

2. Распаковать архив
3. Переобозначить environment variables, так указан пароль
4. Переобозначить environment variables, так указан RUN_TYPE
5. Запустить тест

Результат:

1. откроется сайт mail.ru
2. будет введен логин и пароль
3. откроется панель поиска писем
4. автоматически отправлен ответное письмо
5. сообщение будет содержать текст:"Добрый день, найдено letters писем"
   где letters - количество найденных писем

Описание:
Использована Java,библиотека Selenium Webdriver; С помощью Selenium открывается браузер, открывается mail.ru, происходит
авторизация, заходит на почту; С помощью Selenium определить, сколько нашлось писем; С помощью Selenium и интерфейса
почты автоматически пишется и отправляется письмо, в тексте которого указать найденное в шаге 3 количество писем.
Указать тему письма "Тестовое задание. Фамилия"
Оформлены эти действия в виде теста.

Использовались следующие технологии:

1. Selenium GRID
2. паттерн проектирования Page Object
3. отчеты о пройденных тестах через Allure
4. Java 8
5. Maven
6. Junit

Дополнение:
по пункту с отчетами через Allure, плагин запустился, mvn clean test проходит, mvn allure:serve проходит, но папка
создается в корне проекта, а не в target

Автор:
Гордеева Ольга

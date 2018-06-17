#language: ru
Функционал: Страхование

  Сценарий: Заявка на Страхование

    Когда выбран пункт меню "Страхование"
    И выбран вид страхования "Путешествия и покупки"

    Когда выбран пункт меню1 "Страхование"
    И выбран вид страхования1 "Путешествия и покупки"

    И заголовок страницы равен "Страхование путешественников"

    Когда выполнено нажатие на кнопку Оформить онлайн
    Тогда переход на другую вкладку

    Когда выполнен выбор суммы Минимальная
    Тогда выполнено нажатие на кнопку Оформить

    Когда заполняются поля:
      |Застрахованные: Фамилия|Ivanov|
      |Застрахованные: Имя|Ivan|
      |Застрахованные: Дата рождения|05.05.1990|

    Тогда значения полей равны:
      |Застрахованные: Фамилия|Ivanov|
      |Застрахованные: Имя|Ivan|
      |Застрахованные: Дата рождения|05.05.1990|



  Сценарий: Заявка на Страхование негативный

  Когда выбран пункт меню "Страхование"
  И выбран вид страхования "Путешествия и покупки"

    Когда выбран пункт меню1 "Страхование"
    И выбран вид страхования1 "Путешествия и покупки"

    И заголовок страницы равен "Страхование путешественников"

  Когда выполнено нажатие на кнопку Оформить онлайн
    Тогда переход на другую вкладку

    Когда выполнен выбор суммы Минимальная
    Тогда выполнено нажатие на кнопку Оформить

  Когда заполняются поля:
    |Застрахованные: Фамилия|Ivanov|
    |Застрахованные: Имя|Ivan|
    |Застрахованные: Дата рождения|05.05.1990|
    |Фамилия|Петров|
    |Имя|Сергей|
    |Отчество|Иванович|
    |Дата рождения|10.06.2012|
    |Серия паспорта|5010|
    |Номер паспорта|215316|
    |Дата выдачи|10.06.2011|
    |Место выдачи|ОУФМС РОССИИ УВД ПО ЦЕНТРАЛЬНОМУ АДМИНИСТРАТИВНОМУ ОКРУГУ ГОРОД МОСКВА|

  Тогда значения полей равны:
    |Застрахованные: Фамилия|Ivanov|
    |Застрахованные: Имя|Ivan|
    |Застрахованные: Дата рождения|05.05.1990|
    |Фамилия|Петров|
    |Имя|Сергей|
    |Отчество|Иванович|
    |Дата рождения|10.06.2012|
    |Серия паспорта|5010|
    |Номер паспорта|215316|
    |Дата выдачи|10.06.2011|
    |Место выдачи|ОУФМС РОССИИ УВД ПО ЦЕНТРАЛЬНОМУ АДМИНИСТРАТИВНОМУ ОКРУГУ ГОРОД МОСКВА|

    Тогда выполнено нажатие на кнопку Продолжить

### Пояснення вибору системи збирання
Командою було обрану систему збирання Gradle, чому так?
* DSL розмітка замість XML (менше стрічок коду займає)
* Декларативний стиль
* Автокомпліт .kts файлів
* Зрозумілий синтаксис
* Непотрібно компілювати проект, щоб отримати результат оновлення, достатьньо збілдити градл
* Демон + інкрементальна збірка = перевикористання тасок 

### Опис проекту
Онлайн система для кінотеатру:
- список фільмів, сеансів
- додатково: рейтинги фільми серед користувачів
- різні рівні доступу: адміністратор, користувач
  
Для адміністратору:
- додавання фільмів, сеансів
- зміна розкладу сеансів тощо

Для користувача:
- замовлення квитків, отримання чеку
- меню замовлення: вибір місць для конкретного сеансу
- кошик з усіма замовленнями

Додатково:
- оцінювання фільму
- історія замовлень


### Log4j2 чи Logback
* Logback - стандартно використовується в Spring

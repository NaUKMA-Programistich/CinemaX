# Cinema X

### Lab 5
- Підняти брокера JMS додатково можна Kafka
  - activemq
- Створити API мікросервісу через повідомлення JMS додатково можна Kafka
  - film-service/FilmJmsController
  - JmsListener listens to queue, receives messages and calls methods, returns data to another queue
- Інтегрувати 2 сервіси через створений API та брокера через point-to-point та pub/sub механізми
  - app/FilmJmsService <—> film-service/FilmJmsController point-to-point communication
  - app/FilmController <— film-service/FilmServiceImpl pub/sub information about film changes 
- Додати фільтрацію Message-ів
  - film-service/FilmJmsController filters messages and does methods according to message type
- Для налаштування використати свої сервіси та брокер(можна і вбудований)
  - Aforementioned services and activemq, added to k8s

### Lab 4 TODO:
- [x] Створити контролери у мікросервісах, якщо їх ще немає(мінімум 3 повинно бути)
- [x] Використати для них mime типи (мінімум 3 різні):
- - [x] файл (JPEG image у media service)
- - [x] json
- - [x] html
- [ ] Створити та використати в операціях мікросервісів синхронні та асинхронні виклики до REST API
- [ ] Забезпечити аутентифікацію та авторизацію для викликів між сервісами
- [x] Створити тести для Rest API. Покрити в тестах всі особливості вказані вище


### [Пояснення до Lab 3 (k8s)](minikube-docs.md)


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

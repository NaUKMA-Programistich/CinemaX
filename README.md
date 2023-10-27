# Cinema X
### Lab 07
1) Обрати систему візуалізації та розгорнути(Grafana, Kibana тощо)
    - Kibana
2) Взяти систему збирання й обробки даних(Prometheus, Elasticsearch тощо)
    - Elasticsearch
3) Під'єднати їх до своїх мікросервісних застосунків та отримати дані з візуалізацією
    - Filebeat + ELK (Elasticsearch-Logstash-Kibana)


    - Need to have ELK up to receive data
    - Added Filebeat to k8s.yaml (log transfer)
    - Filebeat sends logs to port 5044 (default logstash port for filebeat, 
        port 50000 if send by tcp)
    - Kibana visual available at localhost:5601

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

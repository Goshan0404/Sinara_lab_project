**SpringBootApplication** указывает конфиг класс, 
который декларирует бины и тригерит авто-конфигурацию и скнинг компонентов.
Эквивалента анотациям: @SpringBootConfiguration, @EnableAutoConfiguration and @ComponentSca

**Параметры**

- *exclude* - исключает авто-конфиг классы
- *excludeName* - тоже самое, токо перечисление строками
- *nameGenerator* - указывает BeanNameGenerator класс, будет использоваться для именования обнаруженных компонентов в контейнере Spring.
- *proxyBeanMethods* - указывает будет ли Bean проксироваться, чтобы обеспечить поведение жиз.цикл.
- *scanBasePackageClasses* - указывает классы в нужных пакетах для сканирования компонентов
- *scanBasePackages* - указывает пакеты для скинрования компонентов
---
[Источник](https://docs.spring.io/spring-boot/api/java/org/springframework/boot/autoconfigure/SpringBootApplication.html)

Преподаватель: Дмитрий Рогожников 

Чернихов Георгий Павлович
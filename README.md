Задание:
1. Перенесите классы и зависимости из предыдущей задачи (PP_3_1_2).
2. Создайте класс Role и свяжите User с ролями так, чтобы юзер мог иметь несколько ролей.
3. Имплементируйте модели Role и User интерфейсами GrantedAuthority и UserDetails соответственно. Измените настройку секьюрности с inMemory на userDetailService.
4. Все CRUD-операции и страницы для них должны быть доступны только пользователю с ролью admin по url: /admin/.
5. Пользователь с ролью user должен иметь доступ только к своей домашней странице /user, где выводятся его данные. Доступ к этой странице должен быть только у пользователей с ролью user и admin. Не забывайте про несколько ролей у пользователя!
6. Настройте logout с любой страницы с использованием возможностей thymeleaf.
7. Настройте LoginSuccessHandler так, чтобы админа после аутентификации направляло на страницу /admin, а юзера на его страницу /user.

После запуска приложения перейти по адресу http://localhost:8080/ 

Пользователь с ролью 'user' - Username: user , Password: user.
![image](https://github.com/NikitaVolkov01/PP_3_1_3-Spring-Boot-MVC-Security/assets/63566223/36e2bb9b-0461-4e05-ab88-602584509b7a)

Пользователь с ролью 'admin' - Username: admin , Password: admin.
![image](https://github.com/NikitaVolkov01/PP_3_1_3-Spring-Boot-MVC-Security/assets/63566223/86a3fb80-19ab-4331-a230-627f228387b3)

Пользователь с ролью 'adminuser' - Username: adminuser , Password: adminuser
![image](https://github.com/NikitaVolkov01/PP_3_1_3-Spring-Boot-MVC-Security/assets/63566223/f07b06f6-ca24-4f35-8a23-cd2beef47ba3)


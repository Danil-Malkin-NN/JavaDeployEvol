````bash
mvn clean
````

````bash
mvn install
````

Отправляем наш архив на целевую машину. **_user_name_** заменить на имя вашего пользователя host на ip вашей машине
````bash
scp -P 49022 ./target/deploy-0.0.1-SNAPSHOT.jar user_name@host:/home/dvmalkin/
````

После подключения к удалённой машине и перейдя в папку указанную при передаче данных. Можем запустить наш код.
на машине должна быть установлена java нужной проекту версии. 
````bash
java -jar ./target/deploy-0.0.1-SNAPSHOT.jar
````
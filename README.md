# db-migration-flyway
Integrating Flyway migration of MySQL database with Spring Boot

 You will need:
- IntelliJ IDEA (recommended)
- Docker
- Local MySQL server (optional)

How to run:
- Open terminal and navigate to where you want to clone the repository.
- Type: <code>git clone https://github.com/ttheconjuring/db-migration-flyway.git</code>
- Run MySQL server with user 'root' and password '1234' (Use either local server or containerize one)
- Create an empty database called "flyway_migration".
- Open the project folder with IntelliJ, then type: <code>mvn install</code> or <code>./mvnw install</code>
- You can uncomment the code from the DemoApplication.java
- Stop the running MySQL server
- Start Docker and type: <code>docker-compose up</code>

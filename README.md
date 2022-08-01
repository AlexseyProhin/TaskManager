# TaskManager
3. описать сущности для БД. Описывай в java классах (https://www.baeldung.com/jpa-entities). Сущности (в скобках, примерные поля):
 - Epic (id, name, description, idTeam, startDatePlan, endDatePlan, startDateFact, endDateFact)
 - Task (id, name, description, status, idEpic, idTeammate, startDatePlan, endDatePlan, startDateFact, endDateFact, priority)
 - Team (id, name)
 - Teammate(id, firstName, lastName, dateOfBirth, position, idTeam)
3.1 Инициализировать базу данных в автоматическом режиме, на основе описанных сущностей (https://www.baeldung.com/spring-data-jpa-generate-db-schema)
3.2 Написать sql скрипты предзаполняющие базу данных

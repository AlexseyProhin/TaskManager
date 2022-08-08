INSERT INTO community.team VALUES (4,'Ducks');
INSERT INTO community.team VALUES (5,'Foxs');
INSERT INTO community.teammate VALUES (4,'08-08-2021','Bigbob','CEO',4);
INSERT INTO community.teammate VALUES (5,'08-08-2021','Gary','Manager',5);
INSERT INTO person.bdexample VALUES (4,'example',4,'4');
INSERT INTO person.bdexample VALUES (5,'example',5,'6');
INSERT INTO headtopic.epic VALUES (5,'Create task','08-08-2022','07-08-2022',
                                   '11-11-2011','Task','05-08-2022','08-07-2022',
                                   4,4);
INSERT INTO headtopic.epic VALUES (6,'task','08-08-2022','07-08-2022',
                                   '11-11-2011','Task','05-08-2022','08-07-2022',
                                   5,4);

INSERT INTO task_team.task (id, description, end_date_fact, end_date_plan, headtipic_name, priority, start_date_fact, start_date_plan, status, id_epic_id, id_teammate_id) VALUES (4,'String','20-07-2022','21-07-2022','Create task','LOW','18-07-2022','05-08-2022','LOW',5,4);
INSERT INTO task_team.task (id, description, end_date_fact, end_date_plan, headtipic_name, priority, start_date_fact, start_date_plan, status, id_epic_id, id_teammate_id) VALUES (5,'refactoring','20-07-2022','21-07-2022','Create task','LOW','18-07-2022','05-08-2022','LOW',6,5);
INSERT INTO public.epic_tasks (epic_id, tasks_id) VALUES (5,4);
INSERT INTO public.epic_tasks (epic_id, tasks_id) VALUES (6,5);





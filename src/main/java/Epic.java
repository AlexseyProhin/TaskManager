import javax.persistence.*;
import java.util.Date;

@Entity//определил сущность, по умолчанию совпадает с именем класса
@Table(name="EPIC", schema="HEADTOPIC")//название столбца
public class Epic {
    @Id//определяем первичный ключ
    @GeneratedValue(strategy= GenerationType.AUTO)// 4 стратегии генирации, может быть AUTO, TABLE, SEQUENCE или IDENTITY:
    private Long id;
    @Column(name="HEADTIPIC_NAME",length = 30, nullable=false, unique=false)// длина,допускает ли столбец значение null или нет,указывает, является ли столбец уникальным
    private String name;

    private  String description;

    private  int idTeam;

    private Date startDatePlan;

    private Date endtDatePlan;

    private Date startDateFact;

    private Date endDateFact;
  //  Epic (id, name, description, idTeam, startDatePlan, endDatePlan, startDateFact, endDateFact)
}

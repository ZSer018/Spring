package b_db_relation.many_to_many;

import b_db_relation.many_to_many.entity.Child;
import b_db_relation.many_to_many.entity.Section;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml").
                addAnnotatedClass(Child.class).
                addAnnotatedClass(Section.class).
                buildSessionFactory();

        try (Session session = sessionFactory.getCurrentSession()){
            //TODO создаем детей :)
          /*  Child child = new Child("Боря", 12);
            Child child2 = new Child("Антон", 11);
            Child child3 = new Child("Егор", 7);
            Child child4 = new Child("Сергей", 8);
            Child child5 = new Child("Анна", 8);
            Child child6 = new Child("Света", 9);
            Child child7 = new Child("Катя", 11);
            Child child8 = new Child("Лиза", 11);
            Child child9 = new Child("Дима", 12);
            Child child10 = new Child("Саша", 12);
            Child child11 = new Child("Маша", 9);
            Child child12 = new Child("Соня", 7);
            Child child13 = new Child("Оксана", 8);
            Child child14 = new Child("Дарья", 9);


            //TODO создаем секции
            Section footSection = new Section("Футбол");
            Section shSection = new Section("Шахматы");
            Section baletSection = new Section("Балет");
            Section musicSection = new Section("Музыка");


            //TODO добавляем детей в секции
            shSection.addChildToSection(child14);
            baletSection.addChildToSection(child14);
            musicSection.addChildToSection(child14);
            //----
            shSection.addChildToSection(child13);
            musicSection.addChildToSection(child13);
            //----
            musicSection.addChildToSection(child12);
            //----
            baletSection.addChildToSection(child11);
            //----
            shSection.addChildToSection(child10);
            baletSection.addChildToSection(child10);
            //----
            footSection.addChildToSection(child);
            //----
            footSection.addChildToSection(child9);
            shSection.addChildToSection(child9);
            baletSection.addChildToSection(child9);
            //----
            footSection.addChildToSection(child4);
            musicSection.addChildToSection(child4);
            //----
            footSection.addChildToSection(child2);
            baletSection.addChildToSection(child2);
            shSection.addChildToSection(child2);
            musicSection.addChildToSection(child2);
            //----
            shSection.addChildToSection(child3);
            musicSection.addChildToSection(child3);
            //----
            shSection.addChildToSection(child6);
            baletSection.addChildToSection(child6);
            musicSection.addChildToSection(child6);
            //----
            shSection.addChildToSection(child8);
            musicSection.addChildToSection(child8);
            //----
            baletSection.addChildToSection(child5);
            musicSection.addChildToSection(child5);
            //----
            baletSection.addChildToSection(child7);
            musicSection.addChildToSection(child7);




            //TODO записываем секции в базу
            session.beginTransaction();

            session.persist(baletSection);
            session.persist(shSection);
            session.persist(musicSection);
            session.persist(footSection);

            session.getTransaction().commit();*/



            //TODO получение записи из базы
            //TODO не по ID
/*            session.beginTransaction();
            List<Child> children = session.createQuery("from Child where age <= 9").getResultList();
            children.forEach(System.out::println);
            session.getTransaction().commit();*/
            //TODO по ID
            /*session.beginTransaction();
            Child child = session.get(Child.class, 1);
            System.out.println(child);
            session.getTransaction().commit();*/

            //TODO удаление секции
/*            session.beginTransaction();
            Section section =  session.get(Section.class, 1);
            session.delete(section);
            session.getTransaction().commit();*/

            //TODO удаление ребенка
            session.beginTransaction();
            Child child =  session.get(Child.class, 1);
            session.delete(child);
            session.getTransaction().commit();



        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }


    }

}

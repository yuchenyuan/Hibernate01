import com.ycy.po.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.Serializable;
import java.util.List;

/**
 * @author YuCy
 * @create 2019-11-20-10:08
 */
public class Test {
    @org.junit.Test
    public void test(){
        //1.获取SessionFactory 会话工厂
        SessionFactory  sessionFactory=
                new Configuration().configure().buildSessionFactory();
        //2.生产会话 通过opensession 获取session对象
        Session session=sessionFactory.openSession();
        //3.开启一个事务
        Transaction transaction = session.beginTransaction();

        //执行查询（查询单条语句）get（要查询的实体类型，参数）
        Student student1=session.get(Student.class,1);
        System.out.println("student="+student1);
        //执行查询（查询单条数据） hql语句
        String hql1="from Student where id=?";
        String hql2="from Student where id=:id";
        Query query=session.createQuery("from Student where id=3");
        Object o=query.uniqueResult();//只针对于 已经知道只有一条语句时才使用
        System.out.println("o="+o);
        System.out.println("sdsd545");
        //查询全部
        Query query1=session.createQuery("from com.ycy.po.Student");
        List<Student>list=query1.list();
        for (Student stu:list){
            System.out.println("stu="+stu);
        }
        /*transaction.commit();//提交事务
        session.close();//关闭session
        session=sessionFactory.openSession();
        transaction=session.beginTransaction();*/
        //执行查询 get(要查询的类型，参数)
        Student student = session.get(Student.class, 1);
        System.out.println("student="+student);
    }
    /**
     *
     * 增加操作
     * */
    @org.junit.Test
    public void testInsert() {

    }
    /**
     * 删除
     * */
    @org.junit.Test
    public void testDelete(){

    }
    /**
     * 修改
     * */
    @org.junit.Test
    public void testUpdate(){

    }

}

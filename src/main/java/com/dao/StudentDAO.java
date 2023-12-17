package com.dao;

import com.entity.Student;
import com.exception.StudentEXception;
import com.utility.Utilities;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutionException;

public class StudentDAO {

    SessionFactory sessionFactory = Utilities.createConnection();
//   store student
    public String store(Student student){
        Session session = sessionFactory.openSession();
        int studentId;
        Transaction transaction = null;
        try(session){
             transaction = session.beginTransaction();
           studentId  = (int) session.save(student);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null ){
                transaction.rollback();
            }
            e.printStackTrace();
            return "Error occurring while adding student "+ e.getMessage();
        }
        return "Student added successfully with ID:- " + studentId;
    }

//get student by id
    public Student show(int id){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        Student student = null;
        try(session){
            transaction = session.beginTransaction();
            student = session.get(Student.class,id);
            if(student == null){
                throw new StudentEXception(404,"Student not found.");
            }
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
        return student;
    }
//    update student
    public Student update(int id, Student student){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        Student student1=null;
        try(session){
            transaction = session.beginTransaction();
             student1 = session.get(Student.class,id);
            if(student1 != null) {
                student1.setName(student.getName());
                session.update(student1);
                transaction.commit();
            }else {
                throw new StudentEXception(404, "Student not found.");
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            }
        return  student;
        }

//        get all student
    public List<Student> index(){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        List<Student> students = null;
        try(session) {
//            using hql to retrieve all the student
            String hql = "FROM Student";
            Query<Student> query = session.createQuery(hql, Student.class);

            if (query == null) {
                throw new StudentEXception(404, "Student not found.");
            }
            return query.list();
        }catch (Exception e){
            e.printStackTrace();
        }
        return  students;
    }

//    delete student by id
    public String destroy(int id){
        boolean isRemoved = false;
        String output = "";
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try(session){
           transaction = session.beginTransaction();
            Student student = session.get(com.entity.Student.class, id);

            if(student != null){
            session.remove(student);
           transaction.commit();
            isRemoved = true;

            }else{
                throw  new StudentEXception(404,"Student not found.");
            }
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();

        }
       if(isRemoved) output = "Student deleted successfully.";
       return  output;
    }
}

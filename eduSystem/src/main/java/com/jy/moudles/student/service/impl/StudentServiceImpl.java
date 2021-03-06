package com.jy.moudles.student.service.impl;

import com.jy.common.excelUtil.ExportExcel;
import com.jy.common.persistence.interceptor.LoginInterceptor;
import com.jy.common.utils.UUIDUtil;
import com.jy.moudles.classroom.dao.ClassroomDao;
import com.jy.moudles.classroom.entity.Classroom;
import com.jy.moudles.school.dao.SchoolDao;
import com.jy.moudles.school.entity.School;
import com.jy.moudles.score.entity.Score;
import com.jy.moudles.student.dao.StudentDao;
import com.jy.moudles.student.entity.Student;
import com.jy.moudles.student.service.StudentService;
import com.jy.moudles.user.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * student业务实现类
 * 创建人：1
 * 创建时间：2017-11-29
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentdao;
    @Autowired
    private ClassroomDao classroomDao;
    @Autowired
    private SchoolDao schoolDao;

    @Override
    public void insertStudent(Student student) {
        student.setId(UUIDUtil.get32UUID());
        studentdao.insertStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentdao.updateStudent(student);
    }

    @Override
    public Student getStudentById(String id) {
        return studentdao.getStudentById(id);
    }

    @Override
    public Student getStudentByIdNew(String id) {
        return studentdao.getStudentByIdNew(id);
    }

    @Override
    public Student getStudentByStuNo(String sno, String orgId) {
        return studentdao.getStudentByStuNo(sno, orgId);
    }

    @Override
    public List<Student> queryStudentsFilter(Map<String, Object> filter) {
        return studentdao.queryStudentsFilter(filter);
    }

    @Override
    public void deleteStudentById(String id) {
        studentdao.deleteStudentById(id);
    }

    @Override
    public void deleteStudents(List<String> ids) {
        studentdao.deleteStudents(ids);
    }

    @Override
    public void insertStudents(List<ArrayList<String>> students) {

        User user = LoginInterceptor.getCurrentUser();
        List<Student> studentList = new ArrayList<>();
        School school = schoolDao.getSchoolByOrgId(user.getOrgId());
        for (ArrayList<String> arrayList : students) {
            Student student = new Student();
            String grade, classroom, classroomName;

            student.setStudentName(arrayList.get(1));

            if (StringUtils.isNotEmpty(arrayList.get(2))) {
                if ("男".equals(arrayList.get(2))) {
                    student.setStudentSex(1);
                }
                if ("女".equals(arrayList.get(2))) {
                    student.setStudentSex(0);
                }
            }
            student.setStudentNo(arrayList.get(3));
            student.setStudentAge(Integer.valueOf(arrayList.get(4)));

            grade = arrayList.get(5);
            classroom = arrayList.get(6);
            classroomName = grade + "(" + classroom + ")班";
            Classroom classroomByName = classroomDao.getClassroomByName(classroomName, user.getOrgId());
            student.setClassroomId(classroomByName.getId());

            student.setStudentContact(arrayList.get(7));
            student.setStudentContactMobile(arrayList.get(8));
            student.setSchoolId(school.getId());
            student.setOrgId(user.getOrgId());
            student.setCreateUser(user.getUserName());
            student.setCreateDate(new Date());
            student.setUpdateUser(user.getCreateUser());
            student.setUpdateDate(new Date());
            student.setId(UUIDUtil.get32UUID());
            studentList.add(student);

        }
        studentdao.insertStudents(studentList);
    }

    @Override
    public void getStudentLists(HttpServletResponse response, Map<String, Object> filter) {
        List<Student> students = studentdao.queryStudentsFilter(filter);
        ExportExcel excel = new ExportExcel("学生名单列表", Student.class);
        excel.setDataList(students);
        try {
            excel.write(response, "Student.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insertStudentsNew(List<Student> students) {
        studentdao.insertStudents(students);
    }

    @Override
    public void insertScores(List<Score> score) {
        studentdao.insertScores(score);
    }

}


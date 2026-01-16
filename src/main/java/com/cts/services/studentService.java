package com.cts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.cts.Model.StudentInfo;
import com.cts.Repository.IstudentRepo;

@Service
public class studentService {

    @Autowired
    private IstudentRepo studentrepo;

    @Autowired
    private MongoTemplate mongoTemplate;   

    public StudentInfo Registration(StudentInfo studentinfo) {
        return studentrepo.save(studentinfo);
    }

    public List<StudentInfo> GetAllStudent() {
        return studentrepo.findAll();
    }

    public StudentInfo UpdateStudent(String id, StudentInfo studentinfo) {
        StudentInfo student =
                studentrepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        student.setName(studentinfo.getName());
        student.setCit(studentinfo.getCit());
        student.setCourse(studentinfo.getCourse());
        student.setFees(studentinfo.getFees());

        return studentrepo.save(student);
    }

    public String deletestudent(String id) {
        studentrepo.deleteById(id);
        return "delete Successfully";
    }

   
    public Page<StudentInfo> search(
            String name,
            String cit,
            String course,
            Integer fees,
            int page,
            int size) {

        Query query = new Query();

        if (name != null && !name.isEmpty()) {
            query.addCriteria(Criteria.where("name").regex(name, "i"));
        }

        if (cit != null && !cit.isEmpty()) {
            query.addCriteria(Criteria.where("cit").regex(cit, "i"));
        }

        if (course != null && !course.isEmpty()) {
            query.addCriteria(Criteria.where("course").regex(course, "i"));
        }

        if (fees != null) {
            query.addCriteria(Criteria.where("fees").is(fees));
        }

        Pageable pageable = PageRequest.of(page, size);
        query.with(pageable);

        List<StudentInfo> students =
                mongoTemplate.find(query, StudentInfo.class);

        long total =
                mongoTemplate.count(
                        Query.of(query).limit(0).skip(0),
                        StudentInfo.class
                );

        return new PageImpl<>(students, pageable, total);
    }
}

# Write your MySQL query statement below
SELECT stud.student_id,
       stud.student_name,
       subj.subject_name, 
       count(exam.subject_name) AS attended_exams
  FROM Students stud
      CROSS JOIN Subjects subj
      LEFT JOIN Examinations exam
          ON stud.student_id = exam.student_id
         AND subj.subject_name = exam.subject_name
 GROUP BY stud.student_id,
          stud.student_name,
          subj.subject_name
 ORDER BY stud.student_id,
          subj.subject_name;
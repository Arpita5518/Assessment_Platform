package com.nucleusteq.asessmentPlatform.entities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuizTest {

    Quiz quiz;

    @BeforeEach
    void init() {
        quiz = new Quiz();
    }

    @Test
    void testGettersAndSetters() {
        assertEquals(0, quiz.getQuizId());
        assertEquals(null, quiz.getTitle());
        assertEquals(null, quiz.getDescription());
        assertEquals(0, quiz.getQuizTimer());

        quiz.setQuizId(1);
        quiz.setTitle("mcq1");
        quiz.setDescription("contains java based mcq");
        quiz.setQuizTimer(45);

        assertEquals(1, quiz.getQuizId());
        assertEquals("mcq1", quiz.getTitle());
        assertEquals("contains java based mcq", quiz.getDescription());
        assertEquals(45, quiz.getQuizTimer());

    }

    @Test
    void testDefaultConstructor() {
        Quiz quiz = new Quiz();
        assertEquals(0, quiz.getQuizId());
        assertEquals(null, quiz.getTitle());
        assertEquals(null, quiz.getDescription());
        assertEquals(0, quiz.getQuizTimer());

    }

    @Test
    public void testCategoryGetterAndSetter() {
        Category category = new Category(1, "Java", "Java Category");
        quiz.setCategory(category);
        Category newCategory = quiz.getCategory();

        assertNotNull(newCategory);
        assertEquals(1, newCategory.getCategoryId());
        assertEquals("Java", newCategory.getTitle());
        assertEquals("Java Category", newCategory.getDescription());
    }

    @Test
    void testParameterisedConstructor() {
        Quiz newQuiz = new Quiz(1, "mcq1", "contains java based mcq", 45);//changed here
        assertEquals(1, newQuiz.getQuizId());
        assertEquals("mcq1", newQuiz.getTitle());
        assertEquals("contains java based mcq", newQuiz.getDescription());
        assertEquals(45, newQuiz.getQuizTimer());
    }
    
    @Test
    public void testGetAndSetQuestion() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(1,"QuesName1","option1","option2","option3","option4","answer"));
        questions.add(new Question(2,"QuesName2","option1","option2","option3","option4","answer"));
        quiz.setQuestion(questions);
        List<Question> result = quiz.getQuestion();
        assertNotNull(result);
        assertEquals(questions.size(), result.size());
    }
}



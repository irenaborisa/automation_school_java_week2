package edu.ctco.school.exercise2;

/**
 * Does field 'i' of Class Exercise2 be inherited to Class SubExercise2 in the below code?
 *
 * What are the options in this particular case?
 * Ans. int i must be public or protected
 */
class Exercise2 {
    protected int i = 2;
}

class SubExercise2 extends Exercise2 {

    int myVar = i;

}
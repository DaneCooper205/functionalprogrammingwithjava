package programming;

import java.util.List;

public class FP01Exercises {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
	
		// printOddNumbersInListFunctional(numbers);
		 
		 List<String> courses = List.of( "Spring", "Spring Boot", "API", "Microservices",
				 	"AWS", "PCF", "Azure", "Docker", "Kubernetes");
		 
		// printAllCourses(courses );
		// printCoursesContainingSpring(courses);
		 
		// printCourseswithTitleLongerThanParam( courses , 3);
		 
		 printCoursesNameLength(courses );
		 
		 
		 printCubesofOddNumbersInListFunctional(numbers);
		 
		 
	}

	private static void printAllCourses(List<String> courses ) {
		courses.stream()
		.forEach(System.out::println);
	}
	
	private static void printCoursesContainingSpring(List<String> courses ) {
		courses.stream()
		.filter( course->course.contains("Spring"))
		.forEach(System.out::println);
	}

	
	private static void printCoursesNameLength (List<String> courses ) {
		courses.stream()
		.map(course->course +" : " +course.length() )
		.forEach(System.out::println);
	}
	
	private static void printCourseswithTitleLongerThanParam(List<String> courses , int i) {
		courses.stream()
		.filter( course->course.length()>i)
		.forEach(System.out::println);
	}
	

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream().filter(number->number%2==1)
		.forEach(System.out::println);
	}
	
	private static void printCubesofOddNumbersInListFunctional(List<Integer> numbers) {

		numbers.stream().filter(number->number%2==1)
		.map(number->number*number*number)
		.forEach(System.out::println);
	}
	
	

}

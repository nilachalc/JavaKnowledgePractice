package annotationdemo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

@CustomAnno(customAnnoDescriptor = "Specific desrcription.", val = 25)
public class AnnotationTest {
	private void methodOne(Integer val) {
		System.out.println("This is test method." + val);
	}
	public static void main(String[] args) {
		Class<AnnotationTest> annotationTestDetails = AnnotationTest.class;
		try {
			System.out.println("From private method :");
			new AnnotationTest().methodOne(5);
			Method methodDetails = annotationTestDetails.getDeclaredMethod("methodOne", Integer.class);
			System.out.println("Number of Params of " + methodDetails.getName() + "	:	" + methodDetails.getParameterCount());
			
			List<Annotation> annotationList = Arrays.asList(annotationTestDetails.getAnnotations());
			annotationList.stream().forEach(anno -> System.out.println(anno.toString()));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
}
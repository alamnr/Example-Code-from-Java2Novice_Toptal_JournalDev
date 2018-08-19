package com.singleton.TDD_Behavior;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnoOne{
     
    String key();
    String value();
}
 
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnoTwo{
     
    int count();
}

public class MyMultipleAnns {
	
	@Deprecated
    public void showDeprecatedMessage(){
        System.out.println("This method is marked as deprecated");
    }

	@MyAnnoTwo(count=20)
    @MyAnnoOne(key="site", value="java2novice.com")
    public void myAnnotationTestMethod(){
         
        try {
            Class<? extends MyMultipleAnns> cls = this.getClass();
            Method mth = cls.getMethod("myAnnotationTestMethod");
            Annotation[] anns = mth.getAnnotations();
            for(Annotation an:anns){
                System.out.println(an);
            }
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
     
    public static void main(String a[]){
         
        MyMultipleAnns mat = new MyMultipleAnns();
        mat.myAnnotationTestMethod();
        mat.showDeprecatedMessage();
    }
}

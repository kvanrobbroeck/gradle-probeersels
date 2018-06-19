package be.vdab.annotations;

import java.lang.annotation.Annotation;

class AnnotationsDemo {
    // Override
    // Deprecated
    // SuppressWarnings

    public static void main(String[] args) {
        Cat c = new Cat();

        boolean cool = isThisACoolClass(c);
        if(cool) {
            System.out.println("CAT IS COOL");
        } else {
            System.out.println("CAT IS LAME");
        }

        fun("Hello", "World");
    }

    /**
     * Example of deprecated annotation
     */
    @Deprecated
    private static void fun(String... values) {
        String[] proof = values;
    }

    private static boolean isThisACoolClass(Cat c) {
        Annotation[] a = c.getClass().getAnnotations();
        if(a.length == 0) {
            return false;
        }
        Class<? extends Annotation> at = a[0].annotationType();

        return at.equals(Cool.class);
    }

}

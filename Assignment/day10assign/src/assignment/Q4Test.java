//write a switch statement with variable type Object and explore the concept Pattern Matcher from JAva 21
package assignment;

class Q4Test {

    public static void main(String[] args) {

        Object obj = 100;

        switch (obj) {

            case Integer i ->
                System.out.println("Integer = " + i);

            case String s ->
                System.out.println("String = " + s);

            case Double d ->
                System.out.println("Double = " + d);

            case Boolean b ->
                System.out.println("Boolean = " + b);

            default ->
                System.out.println("Unknown Type");
        }
    }
}

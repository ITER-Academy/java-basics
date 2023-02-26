package section3.lesson17;

public class Example3 {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("World");
        System.out.println(stringBuilder.toString());

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World");
        System.out.println(stringBuffer.toString());
    }
}

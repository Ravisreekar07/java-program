public class StringMethodsDemo {
    public static void main(String[] args) {

        String str = "Hello World";
        String str2 = "hello world";

        // 1. charAt()
        System.out.println(str.charAt(1)); // e

        // 2. codePointAt()
        System.out.println(str.codePointAt(1)); // 101

        // 3. codePointBefore()
        System.out.println(str.codePointBefore(2)); // 101

        // 4. codePointCount()
        System.out.println(str.codePointCount(0, 5)); // 5

        // 5. compareTo()
        System.out.println(str.compareTo("Hello"));

        // 6. compareToIgnoreCase()
        System.out.println(str.compareToIgnoreCase(str2));

        // 7. concat()
        System.out.println(str.concat(" Java"));

        // 8. contains()
        System.out.println(str.contains("World"));

        // 9. contentEquals()
        System.out.println(str.contentEquals("Hello World"));

        // 10. copyValueOf()
        char[] arr = {'J','A','V','A'};
        System.out.println(String.copyValueOf(arr));

        // 11. endsWith()
        System.out.println(str.endsWith("World"));

        // 12. equals()
        System.out.println(str.equals("Hello World"));

        // 13. equalsIgnoreCase()
        System.out.println(str.equalsIgnoreCase(str2));

        // 14. format()
        System.out.println(String.format("Age = %d", 20));

        // 15. getBytes()
        byte[] bytes = str.getBytes();
        System.out.println(bytes[0]);

        // 16. getChars()
        char[] ch = new char[5];
        str.getChars(0, 5, ch, 0);
        System.out.println(ch);

        // 17. hashCode()
        System.out.println(str.hashCode());

        // 18. indexOf()
        System.out.println(str.indexOf("World"));

        // 19. intern()
        System.out.println(str.intern());

        // 20. isEmpty()
        System.out.println("".isEmpty());

        // 21. join()
        System.out.println(String.join("-", "Java", "Python", "C"));

        // 22. lastIndexOf()
        System.out.println("Java Java".lastIndexOf("Java"));

        // 23. length()
        System.out.println(str.length());

        // 24. matches()
        System.out.println("123".matches("[0-9]+"));

        // 25. offsetByCodePoints()
        System.out.println(str.offsetByCodePoints(0, 4));

        // 26. regionMatches()
        System.out.println(str.regionMatches(6, "World", 0, 5));

        // 27. replace()
        System.out.println(str.replace("World", "Java"));

        // 28. replaceAll()
        System.out.println("a1b2c3".replaceAll("[0-9]", "*"));

        // 29. replaceFirst()
        System.out.println("cat dog cat".replaceFirst("cat", "lion"));

        // 30. split()
        String[] words = str.split(" ");
        System.out.println(words[0]);

        // 31. startsWith()
        System.out.println(str.startsWith("Hello"));

        // 32. subSequence()
        System.out.println(str.subSequence(0, 5));

        // 33. substring()
        System.out.println(str.substring(6));

        // 34. toCharArray()
        char[] chars = str.toCharArray();
        System.out.println(chars[0]);

        // 35. toLowerCase()
        System.out.println(str.toLowerCase());

        // 36. toString()
        System.out.println(str.toString());

        // 37. toUpperCase()
        System.out.println(str.toUpperCase());

        // 38. trim()
        System.out.println("   Java   ".trim());

        // 39. valueOf()
        System.out.println(String.valueOf(1234));
    }
}

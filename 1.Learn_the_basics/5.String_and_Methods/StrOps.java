public class StrOps { 
    public static void main(String[] args){
        String str1 = "в области программирования веб-приложения язык Java занимает первое место.";
        String str2 = new String(str1);
        String str3 = "Строки в Java крайне эффективны.";
        int result, idx;
        char ch;

        System.out.println("Длина str1: " + str1.length());
        // Отображение str1 посимвольно.
        for(int i = 0; i < str1.length(); i++) 
            System.out.println(str1.charAt(i)); // charAt метод  обращается к конкретному символу строки
        System.out.println();

        if(str1.equals(str2)) // метод equal сравнивает последовательность симоволов
            System.out.println("str1 равна str2");
        else 
            System.out.println("str1 не равна srt2");

        if(str1.equals(str3)) 
            System.out.println("str1 равна str3");
        else 
            System.out.println("str1 не равна str3");
        
        result = str1.compareTo(str3); // метод  compareTo() по количеству символов.
        if (result == 0)
            System.out.println("str1 равны str3");
        else if (result < 0)
            System.out.println("str1 меньше str3");
        else if (result > 0) 
            System.out.println("str1 больше str3");
    }
}
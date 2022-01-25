package lesson2;

public class StringUtils {


//1-модификатор доступа (одно из 4х видов слов
    //которое регулирует область видемости данного метода)
    //public _ доступен внутри всего проекта
    // _____ - доступен внутри текушего покета
    // protected - доступен внутри пакета и класса наследникам
    // private - доступ внутри текушего класса
    //2 - static (или пишем или нет)
    //3 - возврашаем тип (int, String, Date, ...) или voit если нечего не возврашаются
    //4 -  название метода
    //5 - входящие параметры


    public static int countGlassFromText(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'o'
                    || text.charAt(i) == 'i' || text.charAt(i) == 'e'
                    || text.charAt(i) == 'y' || text.charAt(i) == 'u') {
            }
        }


        return count;
    }


    public static void printTextByWords(String text) {
        text = text.replace(",", "");
        text = text.replace(".", "");
        text = text.replace("!", "");
        text = text.replace(";", "");
        text = text.replace(":", "");
        text = text.replace(">", "");
        text = text.replace("?", "");


        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }


    }

    public static void coding(String textByCoding){
        String alfavit = "abcdefghijklmnopqrstuvwxyz";
        String alfavitUpper;
        String result = "";
        for (int i = 0 ; i < textByCoding.length();i++){
            int index = alfavit.indexOf(textByCoding.charAt(i));
            if(index >= 0){
                result = result + alfavit.charAt(index + 1);
            }else {
                result = result + textByCoding.charAt(i);
            }
        }

    }






}





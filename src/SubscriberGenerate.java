public class SubscriberGenerate {

    public static Subscriber[] generateSubArray() {
        Subscriber[] array = new Subscriber[10];
        array[0] = new Subscriber(1, "Чернявска", "Юна", "Київ", "+38 093 001 00 01",
                1, 101.25, 23, 17, 6);
        array[1] = new Subscriber(2, "Червоноштан", "Анастасия", "Одеса", "+38 093 001 00 02",
                2, 250, 43, 25, 5);
        array[2] = new Subscriber(3, "Михайлюк", "Дмитро", "Київ", "+38 093 001 00 03",
                3, 187, 34, 56, 5);
        array[3] = new Subscriber(4, "Верба", "Наталя", "Одеса", "+38 093 001 00 04",
                4, -5, 56, 34, 4);
        array[4] = new Subscriber(5, "Ткачено", "Іван", "Дніпро","+38 093 001 00 04",
                5, -70, 92,0,7);
        array[5] = new Subscriber (6, "Ткач", "Іва", "Дніпро","+38 093 001 00 05",
                52, 123, 56,4,7);
        array[6] = new Subscriber (7, "Данилов", "Микола", "Львів","+38 093 001 00 06",
                33, 203, 23,4,7);
        array[7] = new Subscriber (8, "Онищенко", "Любов", "Черкаси","+38 093 001 00 08",
                52, 67, 87,0,7);
        array[8] = new Subscriber (9, "Старова", "Іванна", "Дніпро","+38 093 001 00 09",
                52, 123, 96,0,7);
        array[9] = new Subscriber (10, "Мішина", "Іва", "Дніпро","+38 093 001 00 10",
                976, 567, 36,0,7);

        return array;

    }

}

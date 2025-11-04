public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor(181, Gender.MALE, "Igor", "Leonov");
        Actor actor2 = new Actor(161, Gender.FEMALE, "Yana", "Shirokova");
        Actor actor3 = new Actor(177, Gender.MALE, "Ivan", "Ivanov");
        Director director1 = new Director(180, Gender.MALE, "Alex", "Petrov", 15);
        Director director2 = new Director(191, Gender.FEMALE, "Ekaterina", "Molotova", 13);
        MusicAuthor musicAuthor = new MusicAuthor(182, Gender.MALE, "Шастакович", "Илья", 42);
        Choreographer choreographer = new Choreographer(167, Gender.FEMALE, "Волочкова", "Ирина", 100);

        MusicalShow musicalShow = new MusicalShow("Обычный", 123, director2, musicAuthor, "qwrwegfsagkoilondsaglndmsagllsa");
        Opera opera = new Opera("Опера", 311, director1, musicAuthor, "agfsdagsadgdsag", 233);
        Ballet ballet = new Ballet("Балет", 532, director1, musicAuthor, "ngakjsnglksdnglsa", choreographer);

        musicalShow.addNewActor(actor1);
        musicalShow.addNewActor(actor2);
        musicalShow.addNewActor(actor3);

        opera.addNewActor(actor2);
        opera.addNewActor(actor3);

        ballet.addNewActor(actor1);

        musicalShow.printActors();
        opera.printActors();
        ballet.printActors();

        opera.replaceActor(actor3, actor1);

        opera.printActors();

        ballet.replaceActor(actor2, actor3);

        opera.printLibrettoText();
        ballet.printLibrettoText();
        System.out.println(director1);
        System.out.println(choreographer);
        System.out.println(musicAuthor);


    }
}

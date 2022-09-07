public class Main {
    public static void main (String[] args) {
        Student student = new Aspirant ();

        Student Nikita  = new Student();
        Nikita.firstName = "Danil";
        Nikita.lastName = "Ivanov";
        Nikita.group = "PKS-419";
        Nikita.averageMark = 5.0;

        Aspirant Miki = new Aspirant ();
        Miki.firstName = "Liza";
        Miki.lastName = "Kuertova";
        Miki.group = "ISP-221";
        Miki.averageMark = 4.5;

        Student[] all = {Nikita, Miki};

        for (int i = 0; i < all.length ;i++){
            all [i].getScholarship ();
        }
    }
}

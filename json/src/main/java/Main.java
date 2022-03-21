public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "3888 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "12345678";
        post.surname = "Иванович";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

    }


}

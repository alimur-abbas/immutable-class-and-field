public class Main {
    public static void main(String[] args) {
        ImmutableStudent immutableStudent = new ImmutableStudent("Ali","Ali123");
        System.out.println(immutableStudent);
        System.out.println( immutableStudent.getPassword());
        System.out.println( immutableStudent.getUsername());
        PartialImmutable partialImmutable = new PartialImmutable("Ali-Abbas","Ali1234");
        partialImmutable.setFirstName("Alimur");
        System.out.println(partialImmutable);
        ImmutableUsingBuilder immutableUsingBuilder = new ImmutableUsingBuilder
                .StudentBuilder("Saroj","pqr1234").build();

        System.out.println(immutableUsingBuilder);


    }
}

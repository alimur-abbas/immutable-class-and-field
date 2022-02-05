import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        ImmutableStudent immutableStudent = new ImmutableStudent("Ali","Ali123", address);
//        System.out.println(immutableStudent);
//        System.out.println( immutableStudent.getPassword());
//        System.out.println( immutableStudent.getUsername());
//        PartialImmutable partialImmutable = new PartialImmutable("Ali-Abbas","Ali1234");
//        partialImmutable.setFirstName("Alimur");
//        System.out.println(partialImmutable);
//        ImmutableUsingBuilder immutableUsingBuilder = new ImmutableUsingBuilder
//                .StudentBuilder("Saroj","pqr1234").build();
//
//        System.out.println(immutableUsingBuilder);
        ArrayList<Address> addresses = new ArrayList<>();
        addresses.add(new Address("Abc","mno","bpt"));
        addresses.add(new Address("Abcd","mnop","bptk"));

        ImmutableStudent immutableStudent = new ImmutableStudent("Ali","Ali123",addresses);
        System.out.println(immutableStudent);
        ArrayList<Address> arrayList = immutableStudent.getAddress();
//        arrayList.add(new Address("qwer","tyu","op"));
        arrayList.remove(0);

//        ImmutableStudent immutableStudent1 = new ImmutableStudent("xyz","xyz098" ,new Address("Abc","mno","bpt"));
//        System.out.println(immutableStudent1);
//        Address address= immutableStudent1.getAddress();
//        System.out.println(address);
//        address.setSecondLine("ppp");
//        System.out.println(immutableStudent1);


    }
}

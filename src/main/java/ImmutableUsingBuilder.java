

public class ImmutableUsingBuilder {
    private final String username;
    private final String password;
    private String firstName;
    private String lastname;
    private String email;


    private ImmutableUsingBuilder(StudentBuilder studentBuilder) {
        this.username =studentBuilder.username;
        this.password = studentBuilder.password;
        this.firstName = studentBuilder.firstName;
        this.lastname = studentBuilder.lastname;
        this.email = studentBuilder.email;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "ImmutableUsingBuilder{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class StudentBuilder{
        private final String username;
        private final String password;
        private String firstName;
        private String lastname;
        private String email;


        public StudentBuilder(String username, String password) {
            this.username = username;
            this.password = password;
        }
        public StudentBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public StudentBuilder lastname(String lastname){
            this.lastname = lastname;
            return this;
        }
        public StudentBuilder email(String email){
            this.email = email;
            return this;
        }
        public ImmutableUsingBuilder build(){
            return new ImmutableUsingBuilder(this);
        }

    }
}

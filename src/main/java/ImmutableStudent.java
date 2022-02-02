public final class ImmutableStudent {
    private final String username;
    private final String password;

    public ImmutableStudent(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "ImmutableStudent{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

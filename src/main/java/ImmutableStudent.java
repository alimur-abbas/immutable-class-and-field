import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableStudent {
    private final String username;
    private final String password;
    private final ArrayList<Address> addressList;


    public ArrayList<Address> getAddress()  {
        return (ArrayList<Address>) Collections.unmodifiableCollection(addressList);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public ImmutableStudent(String username, String password,  ArrayList<Address> addressList) {
        this.username = username;
        this.password = password;
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "ImmutableStudent{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address=" + addressList +
                '}';
    }
}

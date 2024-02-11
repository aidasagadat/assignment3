import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Ramen{
    private String name;
    private int id;
    Connection connection;
    private int price;
    private boolean available;
    public Ramen() throws SQLException {
             connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "1234");
    }
    public Ramen(int id, String name, int price) throws SQLException {
        this();
        setId(id);
        setName(name);
        setPrice(price);
    }
    public void setId(int id) {
        this.id=id;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void add() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO orders (id,name,price) VALUES (?, ?, ?)");
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setInt(3, price);
        preparedStatement.executeUpdate();


    }
}

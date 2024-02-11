import java.sql.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "1234");
            Statement statement = cn.createStatement();
            String table = "CREATE TABLE IF NOT EXISTS Buldak " +
                    "(id INTEGER NOT NULL PRIMARY KEY, " +
                    "name VARCHAR(255) NOT NULL, " +
                    "price INTEGER NOT NULL, " +
                    "available BOOLEAN NOT NULL);" +
                    "CREATE TABLE IF NOT EXISTS Samyang " +
                    "(id INTEGER NOT NULL PRIMARY KEY, " +
                    "name VARCHAR(255) NOT NULL, " +
                    "price INTEGER NOT NULL, " +
                    "available BOOLEAN NOT NULL);" +
                    "CREATE TABLE IF NOT EXISTS Seafood " +
                    "(id INTEGER NOT NULL PRIMARY KEY, " +
                    "name VARCHAR(255) NOT NULL, " +
                    "price INTEGER  NOT NULL, " +
                    "available BOOLEAN NOT NULL);" +
                    "CREATE TABLE IF NOT EXISTS Kimchi " +
                    "(id INTEGER NOT NULL PRIMARY KEY, " +
                    "name VARCHAR(255) NOT NULL, " +
                    "price INTEGER NOT NULL, " +
                    "available BOOLEAN NOT NULL);" +
                    "CREATE TABLE IF NOT EXISTS Neogur " +
                    "(id INTEGER NOT NULL PRIMARY KEY, " +
                    "name VARCHAR(255) NOT NULL, " +
                    "price INTEGER NOT NULL, " +
                    "available BOOLEAN NOT NULL);" +
                    "CREATE TABLE IF NOT EXISTS orders " +
                    "(id INTEGER NOT NULL PRIMARY KEY, " +
                    "name VARCHAR(255) NOT NULL, " +
                    "price INTEGER NOT NULL);";
            statement.executeUpdate(table);
            statement.close();
            cn.close();
        } catch (SQLException e) {}

        System.out.println("Welcome to Ramen Shop Management System!");
        while (true) {
                System.out.println("Menu:");
                System.out.println("Add");
                System.out.println("Update product");
                System.out.println("Print");
                System.out.println("Sell a product");
                System.out.println("Delete a product");
                String choice = scanner.nextLine();
        }
    }
}
# **IO Project**

___


## Table Of Content

- ##### Project Purpose
- ##### Maintenance/Aims
- ##### Java Practices Covered
- ##### Code Examples
___

## Project Purpose
> The purpose of this project was to create a program which can read and write data from a CSV onto a database. Furthermore, the program must implement a DAO in order to be able to Create,Read,Update,Delete records within the database.
___

## Maintenance/Aims
> This project is still going to be edited and modified. My next step was to create the UI and then move onto creating threads which I will aim to achieve in future developments.
___

## Java Practices Covered
- DAO
- Testing
- SOLID Principles
- Regex
- MVC Design Pattern

## Code Examples
```Java
public static void duplicateDetection(ArrayList<Employee>records, ArrayList<Employee>special){
    HashSet<Employee> set= new HashSet<Employee>(records);
    ArrayList<Employee> originalRec = new ArrayList<Employee>(set);
    records.clear();
    records.addAll(originalRec);
}
```
>The code above is an extract of one of my classes where I used HashSet in order to extract duplicates within my ArrayList.

```Java
if (!(id >= 0)) res = false;
if (!prefix.matches("^[A-Z][a-z]{1,5}[.]$")) res = false;
if (!fName.matches(("^[A-Z][-a-zA-Z]+$"))) res = false;
if (!mName.matches("[A-Z]")) res = false;
if (!lName.matches("^[A-Z][-a-zA-Z]+$")) res = false;
if (!gen.matches(("^[F|M]$"))) res = false;
if (!email.matches("^(.+)@(.+)$")) res = false;
if (!(salary >= 0)) res = false;
```
> The code above is how I used regex in order to validate the data that is being passed into the records.

```Java
private static void CreateDB(Statement statement) throws SQLException {
            statement.executeUpdate("DROP TABLE IF EXISTS Records");
            statement.executeUpdate(
                    "CREATE TABLE \"Records\" (\n" +
                    "\t\"Emp_ID\"\t INTEGER NOT NULL,\n" +
                    "\t\"NAME_PREFIX\"\t TEXT NOT NULL,\n" +
                    "\t\"FIRST_NAME\"\t TEXT NOT NULL,\n" +
                    "\t\"MID_INITIAL\"\t TEXT NOT NULL,\n" +
                    "\t\"LAST_NAME\"\tTEXT NOT NULL,\n" +
                    "\t\"GENDER\"\tTEXT NOT NULL,\n" +
                    "\t\"EMAIL\"\tTEXT NOT NULL,\n" +
                    "\t\"DOB\"\t DATE NOT NULL,\n" +
                    "\t\"DOJ\"\t DATE NOT NULL,\n" +
                    "\t\"SALARY\"\t INTEGER NOT NULL,\n" +
                    "\t PRIMARY KEY(\"Emp_ID\")\n"+")");
    }
    private static void AddData(PreparedStatement preparedStatement, ArrayList<Employee> records) throws SQLException {
            preparedStatement.setInt(1, records.get(1).getEmpID());
            preparedStatement.setString(2, records.get(1).getNamePrefix());
            preparedStatement.setString(3, records.get(1).getfName());
            preparedStatement.setString(4, records.get(1).getMiddleInitial());
            preparedStatement.setString(5, records.get(1).getlName());
            preparedStatement.setString(6, records.get(1).getGender());
            preparedStatement.setString(7, records.get(1).getEmail());
            preparedStatement.setDate(8, records.get(1).getDob());
            preparedStatement.setDate(9, records.get(1).getDoj());
            preparedStatement.setInt(10, records.get(1).getSalary());
            preparedStatement.execute();
            preparedStatement.close();

    }
```
> This is how I created my table on SQLite and read the data into the new Table.
>
> The table is dropped if it exists from before and a new table is created each time the code runs.
>
```Java
PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO Records(Emp_ID, NAME_PREFIX, FIRST_NAME, MID_INITIAL, LAST_NAME, GENDER, EMAIL, DOB, DOJ, SALARY)" + "VALUES(?,?,?,?,?,?,?,?,?,?)");

```
> The prepared statement is utilised in order to simplify the code and complexity of adding new records.

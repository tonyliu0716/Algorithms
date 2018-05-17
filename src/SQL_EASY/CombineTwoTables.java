package SQL_EASY;

/**
 * Created by tao on 5/17/18.
 * Table: Person

 +-------------+---------+
 | Column Name | Type    |
 +-------------+---------+
 | PersonId    | int     |
 | FirstName   | varchar |
 | LastName    | varchar |
 +-------------+---------+
 PersonId is the primary key column for this table.
 Table: Address

 +-------------+---------+
 | Column Name | Type    |
 +-------------+---------+
 | AddressId   | int     |
 | PersonId    | int     |
 | City        | varchar |
 | State       | varchar |
 +-------------+---------+
 AddressId is the primary key column for this table.


 Write a SQL query for a report that provides the following information for each person in the Person table,
 regardless if there is an address for each of those people:

 FirstName, LastName, City, State
 */


// SQL: select p.firstname, p.lastname, a.city, a.state from Person p left join Address a on p.personid = a.personid;


# STEP 6: add a command and a page to execute a transaction.
1. copy TransactionServlet.java included in this directory to /src/main/java/edu/calpoly/csc365/example1/controller/.
2. copy transaction.jsp included in this directory to /src/main/webapp/.
3. Add a link to the transaction page in the body after the link to the customers page in index.jsp.
```
<p><a href="./transaction">create a transaction</a></p>
```
4. You need the following tables in your database. If the table of column names do not match, change the code in the classes in the dao and entity packages. The tables need to be populated with some data to sucessfully run this example.
```
CREATE TABLE `CreditCard` (
  `card_number` int NOT NULL AUTO_INCREMENT,
  `type` enum('Visa','Master Card','American Express','Discover') NOT NULL,
  `limit` double DEFAULT NULL,
  `balance` double(10,2) DEFAULT '0.00',
  `active` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`card_number`)
);
CREATE TABLE `Vendor` (
  `vid` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`vid`)
);
CREATE TABLE `Ownership` (
  `owner_id` int NOT NULL,
  `card_number` int NOT NULL,
  `current` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`owner_id`,`card_number`),
  KEY `card_number` (`card_number`),
  CONSTRAINT `Ownership_ibfk_1` FOREIGN KEY (`card_number`) REFERENCES `CreditCard` (`card_number`)
);
CREATE TABLE `Transaction` (
  `tid` int NOT NULL AUTO_INCREMENT,
  `cid` int NOT NULL,
  `card_number` int NOT NULL,
  `vid` int NOT NULL,
  `amount` double(10,2) NOT NULL,
  `tdate` date NOT NULL,
  PRIMARY KEY (`tid`),
  KEY `cid` (`cid`),
  KEY `card_number` (`card_number`),
  KEY `vid` (`vid`),
  CONSTRAINT `Transaction_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `Customer` (`id`),
  CONSTRAINT `Transaction_ibfk_2` FOREIGN KEY (`card_number`) REFERENCES `CreditCard` (`card_number`),
  CONSTRAINT `Transaction_ibfk_3` FOREIGN KEY (`vid`) REFERENCES `Vendor` (`vid`)
);
CREATE TABLE `Payment` (
  `pid` int NOT NULL AUTO_INCREMENT,
  `card_number` int NOT NULL,
  `amount` double(10,2) NOT NULL,
  `pdate` date NOT NULL,
  PRIMARY KEY (`pid`),
  KEY `card_number` (`card_number`),
  CONSTRAINT `Payment_ibfk_1` FOREIGN KEY (`card_number`) REFERENCES `CreditCard` (`card_number`)
);
```
5. build and run the project.
6. go to http://localhost:8080/{app_name}/transaction
7. input customer id, card number, vendor id, date, and amount.
8. click submit.
9. If the transaction succeeds, a new tuple should be inserted to the Transaction table.
10. You can add more SQL statements in the TransactionDaoImpl.java, and bundle multiple SQL statements as one transaction.

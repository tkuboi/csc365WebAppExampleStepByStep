#STEP 6: add a command and a page to execute a transaction.
1. copy TransactionServlet.java included in this directory to /src/main/java/edu/calpoly/csc365/example1/controller/.
2. copy transaction.jsp included in this directory to /src/main/webapp/.
3. build and run the project.
4. go to http://localhost:8080/{app_name}/transaction
5. input customer id, card number, vendor id, date, and amount.
6. click submit.
7. If the transaction succeeds, a new tuple should be inserted to the Transaction table.
8. You can add more SQL statements in the TransactionDaoImpl.java, and bundle multiple SQL statements as one transaction.

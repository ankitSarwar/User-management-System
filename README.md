   # User-management-System 

## Framework -  **Spring boot**   ,   language - **java**

## Data Flow-
          * controller, model, repositry, service this packages create.
          * using @Autowired create object of perticular class.
          *first @Autowired TodoServices class and @Service is added.
          *after service packages Todoservice class Autowired with TodoDao class which is present in repositry.
          *and last model package which have ToDo class has all attributes -
                                                      1.UserId
                                                      2.Name
                                                      3.UserName
                                                      4.Address
                                                      5.Phone Number
  
  
## Controller-
                1.controller have all end point to call api.
                2.controller Autowired with TodoService class which is present in service class.
                3. we call get,put,push,delete using annotation
  
  ## service-
              1.service have bussiness logic.
              2.todoservice class Autowired with TodoDao.
              3. we create method-addMyuser,getUserBasedOnId,removeUserId,updateTodoStatusByUser in service class which has proper working.
   
 ##  repositry-
               1. in this we have TodoList ArrayList whic store data in ToDo formate.
               2.using TodoDao contructor we add one todo object when we call TodoDao class .
               3.in this we have -getTodosFromDataSource,save,remove,update implementation.
     
 ## model-
           1. model package has ToDo class.
           2. which ToDo class have all atrributes that we want .
           
   
  ## Summary-
           * In this project i have add todo object using postmapping
           * using getmapping i get all data of the list,
           * using delete mapping i delete a one todo object.
           * using putmapping i have change address using userId.
           3. ToDo class has all geters and setters of its properties and also constructor is call when ToDo ArrayList call.
  
 
 
 ## DataStructure used-
            * equal method used when putMapping and deleteMapping used .
            * using if condition i checked userid is equal to .getuserid present in databases and change or get or delete them.
     
               
  

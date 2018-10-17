# spring-boot-mongodb
Spring Boot RestFull application with MongoDB.

## Steps to run the project
1. Download The Project
2. Go to the project folder
3. Run following command

      mvn eclipse:eclipse

      mvn clean compile

      mvn spring-boot:run
      
### Create Users Service
Request Type - GET 
Request URL :
http://localhost:8888/users/create?userId=bhupeshpadiyar@gmail.com&userName=Bhupesh SIngh Padiyar&password=welcome1&role=Admin

Response - 
{
    "user": {
        "id": "5bc6aebb99af53197c230297",
        "userId": "bhupesh@gmail.com",
        "userName": "Bhupesh SIngh Padiyar",
        "password": "welcome1",
        "role": "Admin",
        "createdDate": "2018-10-17T03:38:35.675+0000",
        "updateDate": null
    },
    "message": "User created successfully",
    "status": "1"
}

### Read User By Id Service
Request Type - GET 
Request URL :
http://localhost:8888/users/read?id=5bc6aebb99af53197c230297

Response: 
{
    "message": "User found successfully",
    "user": {
        "id": "5bc6aebb99af53197c230297",
        "userId": "bhupesh@gmail.com",
        "userName": "Bhupesh SIngh Padiyar",
        "password": "welcome1",
        "role": "Admin",
        "createdDate": "2018-10-17T03:38:35.675+0000",
        "updateDate": null
    },
    "status": "1"
}

### Read User All Users Service
Request Type - GET 
Request URL :

http://localhost:8888/users/read-all

Response: 

{
    "message": "Users found successfully",
    "users": [
        {
            "id": "5bc6aebb99af53197c230297",
            "userId": "bhupes@gmail.com",
            "userName": "Bhupesh SIngh Padiyar",
            "password": "welcome1",
            "role": "Admin",
            "createdDate": "2018-10-17T03:38:35.675+0000",
            "updateDate": null
        },
        {
            "id": "5bc6b38199af5309d029d54b",
            "userId": "ram@gmail.com",
            "userName": "Ram",
            "password": "welcome2",
            "role": "User",
            "createdDate": "2018-10-17T03:58:57.214+0000",
            "updateDate": null
        }
    ],
    "status": "1"
}

### Delete an User Service
Request Type - GET 
Request URL :

http://localhost:8888/users/delete?id=5bc6b38199af5309d029d54b

Response: 
{
    "message": "User deleted successfully",
    "status": "1"
}

### SpringObjectChaining

This open source project is for one of StackOverflow question : https://stackoverflow.com/questions/72205128/create-different-instances-of-a-class-chain-based-on-a-field-in-the-input-reques


### How to Test:

1. Create sample json request something like :
    { "id": 1,
      "name" : "Ashish",
      "requestType" : "requestTypeB"
    }
    
 2. Check-out code & run it on local, it should run on default port 8080.
 3. Use any Web client or curl & hit `POST` request something like:
 
![image](https://user-images.githubusercontent.com/35179165/169320312-ceefa6a5-58a1-4cd1-9439-b780856a57f1.png)

4. Check application log output on console , you will see same object chain got created.
5. Replace `requestType` with  `requestTypeA` & you will get different chain of instance.

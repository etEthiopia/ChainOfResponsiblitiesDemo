What is Chain of Responsibility Pattern

    Chain of responsibility pattern is used to achieve loose coupling in software design where a request from the client is passed to a chain of objects to process them.

Components

    1. Chain

    2. ChainA

    3. ChainB

    4. ChainC

    5. ChainOfResponsibilityExample


1. Chain

   It holds the "next" Handler

   message(String msg, int priority)
   if the priority is less than Threshold it is handled

   writeMessage its an abstract method get invoked when the priority <= Threshold


2. ChainA

   It is a handler based on the abstract Class "Chain" and make writeMessage() actually write a message


3. ChainB

   It is another handler based on the abstract Class "Chain" and make writeMessage() actually write a message


4. ChainC

   It is a third handler based on the abstract Class "Chain" and make writeMessage() actually write a message


5. ChainOfResponsibilityExample

   It creates a chain since any handler is only allowed to know its next order.
   Each chain has a setNext method with the new handler as the parameter.

   The main method just calls the createchain method and display the chain messages.

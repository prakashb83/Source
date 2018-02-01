
package com.librarymanagement.admin;

import com.librarymanagement.bean.LibraryBean;

public class Administrator {
       public LibraryBean search_book(String topicname) {
    	   String result="Fail";
    	   LibraryBean libraryBean=new LibraryBean();
    	   libraryBean.setTopic(topicname);
    	   if(topicname.equals("Java")) {
    		   libraryBean.setBook1("The Java Language Specification ");
    		   libraryBean.setAuthor1("Gilad Bracha, James Gosling, Guy Steele");
    		   libraryBean.setPlace1("QA 200.86.j5");
    		   
    		   libraryBean.setBook2("Problem Solving with Java");
    		   libraryBean.setAuthor2("Elliot Koffman");
    		   libraryBean.setPlace2("QA 200.86.j13");
    		   
    		   libraryBean.setBook3("Objects, abstraction, data structures and design using Java");
    		   libraryBean.setAuthor3("Elliot Koffman");
    		   libraryBean.setPlace3("QA 200.86.j28");
    		   
    		   libraryBean.setBook4("Thinking in Java");
    		   libraryBean.setAuthor4("Bruce Eckel");
    		   libraryBean.setPlace4("QA 200.86.j51");
    		   
    		   libraryBean.setBook5("Head First Java");
    		   libraryBean.setAuthor5("Kathy Sierra, Bert Bates");
    		   libraryBean.setPlace5("QA 200.86.j56");
    	   }
    	   
    	   else if(topicname.equals("Python")) {
    		   libraryBean.setBook1("Python for Data Analysis");
    		   libraryBean.setAuthor1("Wes McKinney");
    		   libraryBean.setPlace1("QA 180.55.p1");
    		   
    		   libraryBean.setBook2("Dive Into Python");
    		   libraryBean.setAuthor2("Mark Pilgrim ");
    		   libraryBean.setPlace2("QA 180.55.p7");
    		   
    		   libraryBean.setBook3("Learning Python");
    		   libraryBean.setAuthor3("Mark Lutz");
    		   libraryBean.setPlace3("QA 180.55.p10");
    		   
    		   libraryBean.setBook4("Foundations of Python Network Programming");
    		   libraryBean.setAuthor4("John Goerzen");
    		   libraryBean.setPlace4("QA 180.55.p25");
    		   
    		   libraryBean.setBook5("Think Python");
    		   libraryBean.setAuthor5("Allen B. Downey");
    		   libraryBean.setPlace5("QA 180.55.p31");
    	   }
    	   
    	   else if(topicname.equals("JavaScript")) {
    		   libraryBean.setBook1("JavaScript and JQuery: Interactive Front-End Web Development");
    		   libraryBean.setAuthor1("Jon Duckett");
    		   libraryBean.setPlace1("QA 220.13.JS3");
    		   
    		   libraryBean.setBook2("Eloquent JavaScript: A Modern Introduction to Programming");
    		   libraryBean.setAuthor2("Marijn Haverbeke");
    		   libraryBean.setPlace2("QA 220.13.JS5");
    		   
    		   libraryBean.setBook3("JavaScript: The Definitive Guide");
    		   libraryBean.setAuthor3("David Flanagan");
    		   libraryBean.setPlace3("QA 220.13.JS6");
    		   
    		   libraryBean.setBook4("Learn JavaScript VISUALLY");
    		   libraryBean.setAuthor4("Ivelin Demirov");
    		   libraryBean.setPlace4("QA 220.13.JS12");
    		   
    		   libraryBean.setBook5("A Smarter Way to Learn JavaScript: The new approach that uses technology to cut your effort in half");
    		   libraryBean.setAuthor5("Mark Myers");
    		   libraryBean.setPlace5("QA 220.13.JS18");
    	   }
    	   
    	   else if(topicname.equals("SQL")) {
    		   libraryBean.setBook1("Head First SQL");
    		   libraryBean.setAuthor1("Lynn Beighley");
    		   libraryBean.setPlace1("QA 10.3.s1");
    		   
    		   libraryBean.setBook2("SQL: QuickStart Guide The Simplified Beginners Guide To SQL");
    		   libraryBean.setAuthor2("ClydeBank Technology");
    		   libraryBean.setPlace2("QA 10.3.s2");
    		   
    		   libraryBean.setBook3("SQL: The Ultimate Beginners Guide: Learn SQL Today");
    		   libraryBean.setAuthor3("Steve Tale");
    		   libraryBean.setPlace3("QA 10.3.s4");
    		   
    		   libraryBean.setBook4("Learning SQL");
    		   libraryBean.setAuthor4("Alan Beaulieu");
    		   libraryBean.setPlace4("QA 10.3.s41");
    		   
    		   libraryBean.setBook5("Sams Teach Yourself SQL in 10 Minutes");
    		   libraryBean.setAuthor5("Ben Forta");
    		   libraryBean.setPlace5("QA 10.3.s69");
    	   }
    	   
    	   else if(topicname.equals("PHP")) {
    		   libraryBean.setBook1("The Joy of PHP Programming: A Beginners Guide");
    		   libraryBean.setAuthor1("Alan Forbes");
    		   libraryBean.setPlace1("QA 151.20.p2");
    		   
    		   libraryBean.setBook2("PHP & MySQL Novice to Ninja");
    		   libraryBean.setAuthor2("Kevin Yank");
    		   libraryBean.setPlace2("QA 151.20.p8");
    		   
    		   libraryBean.setBook3("Head First PHP & MySQL");
    		   libraryBean.setAuthor3("Lynn Beighley & Michael Morrison");
    		   libraryBean.setPlace3("QA 151.20.p12");
    		   
    		   libraryBean.setBook4("Learning PHP, MySQL, JavaScript, and CSS: A Step-by-Step Guide to Creating Dynamic Websites");
    		   libraryBean.setAuthor4("Robin Nixon");
    		   libraryBean.setPlace4("QA 151.20.p14");
    		   
    		   libraryBean.setBook5("PHP & MySQL Web Development");
    		   libraryBean.setAuthor5("Luke Welling & Laura Thompson");
    		   libraryBean.setPlace5("QA 151.20.p16");
    	   }
    	   
    	   return libraryBean;
       }
}

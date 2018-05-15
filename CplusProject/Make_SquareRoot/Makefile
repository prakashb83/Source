CC=g++
CFLAGS=-c -Wall

# Standard all target
all: Squareroot

Squareroot : Squarerootfunc.o test.o main.o

main.o: main.cpp
	  $(CC) $(CFLAGS) main.cpp
	  
Squarerootfunc.o: Squarerootfunc.cpp
	  $(CC) $(CFLAGS) Squarerootfunc.cpp
	 
test.o: test.cpp
	  $(CC) $(CFLAGS) test.cpp
	  
#clean: 
#	rm -rf *o Squareroot
	
	



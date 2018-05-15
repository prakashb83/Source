CC=g++
CFLAGS=-c -Wall

# Standard all target
all: Squareroot

Squareroot : Squarerootfunc.o test.o main.o

main.o: main.cpp
	  $(CC) $(CFLAGS) src/main.cpp
	  
Squarerootfunc.o: Squarerootfunc.cpp
	  $(CC) $(CFLAGS) src/Squarerootfunc.cpp
	 
test.o: test.cpp
	  $(CC) $(CFLAGS) src/test.cpp
	  
#clean: 
#	rm -rf *o Squareroot
	
	



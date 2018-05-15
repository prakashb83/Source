CC=g++
CFLAGS=-c -Wall
CFLAG = $(CPPSTD) -Wall -g -DLINUX -DSYSTEM_TYPE_LINUX -fPIC 

SRCS = $(wildcard ./*.cpp)

OBJS = $(SRCS:.cpp=.o)
# Standard all target
all: Squareroot

Squareroot : Squarerootfunc.o test.o main.o execute

main.o: src/main.cpp
	  $(CC) $(CFLAGS) src/main.cpp
	  
Squarerootfunc.o: src/Squarerootfunc.cpp
	  $(CC) $(CFLAGS) src/Squarerootfunc.cpp
	 
test.o: src/test.cpp
	  $(CC) $(CFLAGS) src/test.cpp

execute: main.o
	$(CC) $(CFLAG)  -o SquareRootPackage/executable main.o 
	
#testexecute: test.o
#	$(CC) $(CFLAG)  -o Utest test.o 

#clean: 
#	rm -rf *o Squareroot
	
	



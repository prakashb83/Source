CC = g++
CPPSTD=-std=c++11

CFLAGS = $(CPPSTD) -Wall -g -DLINUX -DSYSTEM_TYPE_LINUX -fPIC 

SRCS = $(wildcard ./src/*.cpp)

OBJS = $(SRCS:.cpp=.o)

MAIN = libgwacore

.PHONY: clean

all:    $(MAIN)
	 @echo  

$(MAIN):$(OBJS) 
	$(CC) $(CFLAGS)  -o executable $(OBJS) 

#for creating .so  ==> $(CC) $(CFLAGS) $(INCLUDES) -shared -o ../out(MAIN).so.1 $(OBJS) $(LIBS)
# this is a suffix replacement rule for building .o's from .c's
# it uses automatic variables $<: the name of the prerequisite of
# the rule(a .c file) and $@: the name of the target of the rule (a .o file) 
# (see the gnu make manual section about automatic variables)
.cpp.o:
	$(CC) $(CFLAGS) -c $<  -o $@

clean:
	$(RM) src/*.o *~ ../out/$(MAIN).so.*



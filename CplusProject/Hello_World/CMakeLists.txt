cmake_minimum_required(VERSION 2.8.9)
project(HelloWorld)
set(CMAKE_BUILD_TYPE Release)
set(CMAKE_LIBRARY_OUTPUT_DIRECTORY HelloWorldPackage)
set(CMAKE_ARCHIVE_OUTPUT_DIRECTORY HelloWorldPackage)
set(CMAKE_RUNTIME_OUTPUT_DIRCTORY HelloWorldPackage)
#Bring the headers, such as Student.h into the project
include_directories(include Package)

#However, the file(GLOB...) allows for wildcard additions:
file(GLOB SOURCES "src/*.cpp")

#Generate the shared library from the sources
add_library(HelloWorldS SHARED ${SOURCES})

#Generate the static library from the sources
add_library(HelloWorldA STATIC ${SOURCES})

#Set the location for library installation -- i.e., /usr/lib in this case
# not really necessary in this example. Use "sudo make install" to apply
install(TARGETS HelloWorldS DESTINATION /usr/lib)

install(TARGETS HelloWorldA DESTINATION /usr/lib)

add_executable(HelloWorldPackage/executable src/test.cpp)

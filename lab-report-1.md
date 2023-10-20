# Lab Report 1

# `cd` Command
### no arguments
**working directory**: "/home"
```bash
[user@sahara ~]$ cd
[user@sahara ~]$
```
It changes the directory to the home directory (~).
This was not an error.
### with path to directory
**working directory**: "/home"
```bash
[user@sahara ~]$ cd lecture1
[user@sahara ~/lecture1]$ 
```
It goes into the directory that is given as input.
This was not an error.
### with path to file
**working directory**: "/home"
```bash
[user@sahara ~]$ cd lecture1/README
bash: cd: lecture1/README: Not a directory
[user@sahara ~]$ 
```
It prints out a an error message telling me that I did not give it a directory.
This was an error.

# `ls` Command
### no arguments
**working directory**: "/home"
```bash
[user@sahara ~]$ ls
lecture1
```
It prints out files located in the current directory.
This was not an error.

### with path to directory
**working directory**: "/home"
```bash
[user@sahara ~]$ ls lecture1
Hello.class  Hello.java  messages  README
```
It prints out all the files and directories located in the given directory.
This was not an error.

### with path to file
**working directory**: "/home"
```bash
[user@sahara ~]$ ls lecture1/README
lecture1/README
```
It prints out the filepath of the file given.
This was not an error.

# `cat` Command

### no arguments
**working directory**: "/home"
```bash
[user@sahara ~]$ cat
Hello
Hello
^C
```
It reads from standard input and prints what it gets to the terminal. I type out "Hello" and it prints "Hello" when I press enter. CTRL-C exits the command and brings me back to terminal input.
This was not an error.

### with path to directory
**working directory**: "/home"
```bash
[user@sahara ~]$ cat lecture1
cat: lecture1: Is a directory
```
It prints out an error message telling me that the file given was a directory.
This was an error.

### with path to file
**working directory**: "/home"
```bash
[user@sahara ~]$ cat lecture1/README
To use this program:

javac Hello.java
java Hello messages/en-us.txt
```
It prints out the contents of the file given as input.
This was not an error.

![image](lab1.jpg)

😭

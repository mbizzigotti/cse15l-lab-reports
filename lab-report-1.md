# `cd` Command
### no arguments
```bash
[user@sahara ~]$ cd
[user@sahara ~]$
```
It changes the directory to the home directory (~).
### with path to directory
```bash
[user@sahara ~]$ cd lecture1
[user@sahara ~/lecture1]$ 
```
It goes into the directory that is given as input.
### with path to file
```bash
[user@sahara ~]$ cd lecture1/README
bash: cd: lecture1/README: Not a directory
[user@sahara ~]$ 
```
It prints out a an error message telling me that I did not give it a directory.

# `ls` Command
### no arguments
```bash
[user@sahara ~]$ ls
lecture1
```
It prints out files located in the current directory.

### with path to directory
```bash
[user@sahara ~]$ ls lecture1
Hello.class  Hello.java  messages  README
```
It prints out all the files located in the given directory.

### with path to file
```bash
[user@sahara ~]$ ls lecture1/README
lecture1/README
```
It prints out the name of the file given.

# `cat` Command

### no arguments
```bash
[user@sahara ~]$ cat
^C
```
It does not seem to do anything, and I have to CTRL-C to get back to terminal input.

### with path to directory
```bash
[user@sahara ~]$ cat lecture1
cat: lecture1: Is a directory
```
It prints out an error message telling me that the file given was a directory.

### with path to file
```bash
[user@sahara ~]$ cat lecture1/README
To use this program:

javac Hello.java
java Hello messages/en-us.txt
```
It prints out the contents of the file given as input.

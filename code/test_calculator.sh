#!/bin/bash

# Compile the Java code
javac Calculator.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Compilation successful."

    # Run tests
    echo -e "\nRunning Test 1:"
    echo "4 + 9" | java Calculator

    echo -e "\nRunning Test 2:"
    echo "16 sqrt" | java Calculator

    echo -e "\nRunning Test 3 (negative square root):"
    echo "-25 sqrt" | java Calculator

    # Clean up compiled files
    rm Calculator.class

else
    echo "Compilation failed. Please fix the compilation errors before running tests."
fi

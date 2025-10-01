## Composite Pattern Example: File System

## Overview
This project demonstrates the Composite design pattern in Java with a file system example. The Composite pattern lets clients treat individual objects and compositions of objects uniformly by representing part-whole hierarchies.

Here, both `File` and `Folder` implement the `FileSystemComponent` interface, enabling files and folders (which can contain files or other folders) to be treated as components.

## Structure
- **FileSystemComponent** (Interface):
Declares methods `showDetails(String indent)` to display component information and `getSize()` to get the component size.

- **File** (Leaf):
Represents a file with a name and size. Implements FileSystemComponent, showing details and returning its size.

- **Folder** (Composite):
Represents a folder that can contain multiple FileSystemComponent children (files or subfolders). Implements methods to add children, show details recursively, and compute total size.

-  **Main**:
Demonstrates creating a file system with folders and files, displaying the hierarchy and total size.

## Workflow Example
1. Create a root folder.
2. Create subfolders like "docs" and "pics".
3. Add files to these folders.
4. Add subfolders to the root folder.
5. Display the entire folder structure with indentation.
6. Calculate and display the total size of all files recursively.

## How to Run
1. Ensure Java (JDK 8 or later) is installed.
2. Place all .java files together.
3. Compile the files with:
    `javac *.java`
4. Run the main class:
    `java Main`

## Output
-- Composite Pattern: File System Demo --
+ Folder: root
  + Folder: docs
    - File: resume.pdf (120KB)
    - File: coverletter.docx (30KB)
  + Folder: pics
    - File: vacation.jpg (2048KB)
Total size: 2198KB
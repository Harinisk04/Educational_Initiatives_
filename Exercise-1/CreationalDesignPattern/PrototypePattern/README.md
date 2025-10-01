## Prototype Pattern Example: Document Cloning

## Overview
This project demonstrates the Prototype design pattern in Java using a document cloning example. The Prototype pattern enables creating new objects by copying existing prototype instances, helping to save costly or time-intensive object creation.

In this example, documents like WordDocument and PdfDocument implement a `DocumentPrototype` interface that declares a `clone()` method, enabling objects to create copies of themselves. This is useful when clients want to generate many similar objects with slight variations quickly by cloning a template.

## Structure
- **DocumentPrototype** (Interface):
Declares the `clone()` method and other document-related methods like `setContent()`, `getContent()`, and `getType()`.

- **WordDocument, PdfDocument** (Concrete Prototypes):
Implement the `DocumentPrototype` interface by defining how to clone themselves and maintaining document content and type.

- **Main**:
Demonstrates cloning a `WordDocument` template and modifying the cloned instance independently of the original. The original and cloned documents have distinct contents and states.

## Workflow Example
1. Create a WordDocument template with initial content.
2. Clone the template to create a new document instance.
3. Modify the clone’s content without affecting the original.
4. Print both documents’ type and content to show they are independent.

## How to Run
1. Ensure Java (JDK 8 or later) is installed.
2. Place all .java files together.
3. Compile the files with:
    `javac *.java`
4. Run the main class:
    `java Main`

## Output
-- Prototype Pattern: Document Cloning Demo --
Original type: Word(InvoiceTemplate), content:
Customer: XYZ
Amount: $1000
Cloned type: Word(InvoiceTemplate), content:
Customer: XYZ
Amount: $1000
Note: cloned copy
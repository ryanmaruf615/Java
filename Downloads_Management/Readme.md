# Downloads Management

A Java application for managing and organizing your downloads efficiently.

## Features

- Track downloaded files
- Organize files by type, date, or custom tags
- Search and filter downloads
- Simple and intuitive user interface

## Requirements

- Java 17 or higher

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/ryanmaruf615/Java/tree/main/Downloads_Management
    ```
2. Navigate to the project directory:
    ```bash
    cd Downloads_Management
    ```

## How to Compile and Run

You can compile and run the project using the command line:

1. Compile the Java source files:
    ```bash
    javac -d bin src/*.java
    ```
2. Run the application:
    ```bash
    java -cp bin Main
    ```
   Replace `Main` with the actual main class name if different.

Alternatively, you can use your preferred IDE to build and run the project.

### Alternative Compilation and Run Commands

If your source files are organized in packages, use:
```bash
javac -d out src\main\Java\com\core\*.java src\main\Java\com\app\App.java
java -cp out com.app.App
```

## Common Commands

- **Compile all source files:**
    ```bash
    javac -d bin src/*.java
    ```
- **Run the main class:**
    ```bash
    java -cp bin Main
    ```
- **Clean compiled files:**
    ```bash
    rm -rf bin/*
    ```
- **List downloaded files (example command if supported):**
    ```bash
    java -cp bin Main --list
    ```

## Usage

- Launch the application.
- Add, organize, and search your downloads.

## Contributing

Contributions are welcome! Please open issues or submit pull requests.

## License

This project is licensed under the MIT License.
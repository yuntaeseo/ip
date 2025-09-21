# Jinwoo ChatBot

> *"I alone level up!"* - A task management chatbot inspired by Sung Jin-Woo from Solo Leveling.

Jinwoo is a powerful personal task manager that helps you organize your daily activities through an intuitive chat interface. Whether you're managing simple todos, tracking deadlines, or scheduling events, Jinwoo has got you covered!

## ✨ Features

- **📝 Todo Management**: Create and track simple tasks
- **⏰ Deadline Tracking**: Set tasks with specific due dates  
- **📅 Event Scheduling**: Manage events with start and end times
- **✅ Task Status**: Mark tasks as complete or incomplete
- **🔍 Smart Search**: Find tasks by keywords
- **↩️ Undo Support**: Undo your last action
- **💾 Auto-Save**: Your tasks are automatically saved
- **🖥️ Dual Interface**: Available as both GUI and CLI

## 🚀 Quick Start

### Download & Run
1. Download the latest `jinwoo.jar` from the releases
2. Double-click the JAR file or run: `java -jar jinwoo.jar`

### Build from Source
**Prerequisites**: JDK 17 or higher

```bash
# Clone the repository
git clone https://github.com/yuntaeseo/ip.git
cd ip

# Build and run
./gradlew run

# Or build a JAR file
./gradlew shadowJar
# JAR will be created at build/libs/jinwoo.jar
```

## 📖 Usage Examples

### Adding Tasks
```
todo Buy groceries
deadline Submit assignment /by 2024-12-25
event Team meeting /from 2024-12-20 /to 2024-12-20
```

### Managing Tasks  
```
list                    # View all tasks
mark 1                  # Mark task 1 as complete
unmark 1                # Mark task 1 as incomplete
delete 2                # Delete task 2
find groceries          # Search for tasks containing "groceries"
undo                    # Undo last action
bye                     # Exit the application
```

## 🛠️ Development Setup

### IntelliJ IDEA Setup

**Prerequisites**: JDK 17, latest IntelliJ IDEA

1. Open IntelliJ (close any existing projects via `File` > `Close Project`)
2. Click `Open` and select the project directory
3. Accept default prompts if any appear
4. Configure project SDK:
   - Go to `File` > `Project Structure` > `Project`
   - Set **Project SDK** to JDK 17
   - Set **Project language level** to `SDK default`

**⚠️ Important**: Keep the `src\main\java` folder structure intact as it's required by Gradle and other build tools.

### Building & Testing
```bash
# Run tests
./gradlew test

# Check code style
./gradlew checkstyleMain

# Build JAR
./gradlew shadowJar
```

## 📁 Project Structure
```
src/
├── main/java/jinwoo/
│   ├── Jinwoo.java          # Main application class
│   ├── command/             # Command implementations
│   ├── tasks/               # Task types (Todo, Deadline, Event)
│   ├── gui/                 # JavaFX GUI components
│   ├── storage/             # File I/O operations
│   └── util/                # Utility classes
└── test/                    # Unit tests
```

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request. For major changes, please open an issue first to discuss what you would like to change.

## 📄 License

This project is part of the CS2103T Software Engineering module.

---

For detailed usage instructions, see the [User Guide](docs/README.md).

# Jinwoo User Guide

Welcome to Jinwoo, your personal task management companion! This guide will help you master all of Jinwoo's features.

![Jinwoo ChatBot](../src/main/resources/images/Sungjinwoo.png)

## Table of Contents
1. [Getting Started](#getting-started)
2. [Task Types](#task-types)
3. [Commands Reference](#commands-reference)
4. [Advanced Features](#advanced-features)
5. [Tips & Tricks](#tips--tricks)

---

## Getting Started

When you first launch Jinwoo, you'll be greeted with a clean interface. Simply type your commands in the input field and press Enter to interact with Jinwoo.

### Basic Workflow
1. **Add tasks** using `todo`, `deadline`, or `event` commands
2. **View tasks** with the `list` command
3. **Mark tasks** as complete with `mark <number>`
4. **Search tasks** using `find <keyword>`
5. **Delete tasks** with `delete <number>`

---

## Task Types

### 📝 Todo Tasks
Simple tasks without any time constraints.

**Format**: `todo <description>`

**Example**: 
```
todo Buy groceries
```
**Output**: 
```
Got it. I've added this task:
 [T][ ] Buy groceries
Now you have 1 tasks in the list.
```

### ⏰ Deadline Tasks
Tasks that need to be completed by a specific date.

**Format**: `deadline <description> /by <date>`

**Date format**: `YYYY-MM-DD`

**Example**: 
```
deadline Submit assignment /by 2024-12-25
```
**Output**: 
```
Got it. I've added this task:
 [D][ ] Submit assignment (by: Dec 25 2024)
Now you have 2 tasks in the list.
```

### 📅 Event Tasks
Tasks that occur during a specific time period.

**Format**: `event <description> /from <start-date> /to <end-date>`

**Date format**: `YYYY-MM-DD`

**Example**: 
```
event Team meeting /from 2024-12-20 /to 2024-12-20
```
**Output**: 
```
Got it. I've added this task:
 [E][ ] Team meeting (from: Dec 20 2024 to: Dec 20 2024)
Now you have 3 tasks in the list.
```

---

## Commands Reference

### Adding Tasks

| Command | Purpose | Example |
|---------|---------|---------|
| `todo <description>` | Add a simple task | `todo Read book` |
| `deadline <description> /by <date>` | Add task with deadline | `deadline Project /by 2024-12-31` |
| `event <description> /from <date> /to <date>` | Add time-bound event | `event Conference /from 2024-12-01 /to 2024-12-03` |

### Managing Tasks

| Command | Purpose | Example |
|---------|---------|---------|
| `list` | Show all tasks | `list` |
| `mark <number>` | Mark task as complete | `mark 1` |
| `unmark <number>` | Mark task as incomplete | `unmark 1` |
| `delete <number>` | Remove a task | `delete 2` |

### Finding Tasks

| Command | Purpose | Example |
|---------|---------|---------|
| `find <keyword>` | Search tasks by keyword | `find meeting` |

### Other Commands

| Command | Purpose | Example |
|---------|---------|---------|
| `undo` | Undo last action | `undo` |
| `bye` | Exit the application | `bye` |

---

## Advanced Features

### 🔍 Smart Search
Use the `find` command to locate tasks containing specific keywords:

```
find meeting
```
This will show all tasks that contain the word "meeting" in their description.

### ↩️ Undo Functionality
Made a mistake? Use the `undo` command to reverse your last action:

```
undo
```
This will restore the previous state of your task list.

### 💾 Automatic Saving
Your tasks are automatically saved after every change. When you restart Jinwoo, all your tasks will be restored exactly as you left them.

### 📊 Task Status Icons
- `[T]` - Todo task
- `[D]` - Deadline task  
- `[E]` - Event task
- `[X]` - Completed task
- `[ ]` - Pending task

---

## Tips & Tricks

### 💡 Pro Tips

1. **Use descriptive task names**: Instead of "meeting", use "Team standup meeting"
2. **Leverage search**: Use `find` to quickly locate specific tasks
3. **Keep deadlines realistic**: Set achievable deadlines to stay motivated
4. **Regular cleanup**: Use `delete` to remove completed or outdated tasks

### ⚠️ Common Mistakes

1. **Wrong date format**: Always use `YYYY-MM-DD` format for dates
2. **Missing task numbers**: Remember that task numbers start from 1
3. **Empty descriptions**: Task descriptions cannot be empty
4. **Incomplete commands**: Make sure to include all required parameters

### 🔧 Troubleshooting

| Problem | Solution |
|---------|----------|
| "task number is not in list" | Check your task list with `list` and use valid numbers |
| "Invalid date" | Use the correct format: `YYYY-MM-DD` |
| "description cannot be empty" | Provide a meaningful task description |
| "No tasks found" | Your search didn't match any tasks |

---

## Example Session

Here's a complete example of using Jinwoo:

```
> todo Buy Christmas gifts
Got it. I've added this task:
 [T][ ] Buy Christmas gifts
Now you have 1 tasks in the list.

> deadline Finish project /by 2024-12-20
Got it. I've added this task:
 [D][ ] Finish project (by: Dec 20 2024)
Now you have 2 tasks in the list.

> event Holiday party /from 2024-12-25 /to 2024-12-25
Got it. I've added this task:
 [E][ ] Holiday party (from: Dec 25 2024 to: Dec 25 2024)
Now you have 3 tasks in the list.

> list
Here are the tasks in your list:
1. [T][ ] Buy Christmas gifts
2. [D][ ] Finish project (by: Dec 20 2024)
3. [E][ ] Holiday party (from: Dec 25 2024 to: Dec 25 2024)

> mark 1
Nice! I've marked this task as done:
 [T][X] Buy Christmas gifts

> find project
Here are the matching tasks in your list:
1. [D][ ] Finish project (by: Dec 20 2024)

> bye
Bye. Hope to see you again soon!
```

---

**Need more help?** Check the main [README](../README.md) for setup instructions and development information.
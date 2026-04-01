# Web Technology Assignment

**Subject:** Web Technology  
**Assignment:** Assignment 1 (Web Technology)  
**Deadline:** 01-04-2026

## Objective

This project demonstrates:

1. Basic web development using HTML, CSS, and JavaScript.
2. JavaBeans concepts, including:
  - Simple Bean
  - BeanInfo
  - Bound Property
  - Constrained Property
3. Version control workflow using Git and GitHub.

## Repository

- **Repository Name:** `web-tech-assignment`
- **GitHub URL:** <https://github.com/md4n4s28/web-tech-assignment>
- **Branch Used:** `main`

## Folder Structure

```text
web-tech-assignment/
|
|-- web/
|   |-- index.html
|   |-- style.css
|   |-- script.js
|
|-- java/
|   |-- beans/
|   |   |-- Person.java
|   |   |-- BeansDemo.java
|   |
|   |-- beaninfo/
|   |   |-- Person.java
|   |   |-- PersonBeanInfo.java
|   |   |-- BeanInfoDemo.java
|   |
|   |-- bound/
|   |   |-- Person.java
|   |   |-- BoundPropertyDemo.java
|   |
|   |-- constrained/
|       |-- Person.java
|       |-- ConstrainedPropertyDemo.java
```

## Part 1: Git Setup (Mandatory)

Completed:

1. GitHub account is used.
2. Repository `web-tech-assignment` is created on GitHub.
3. Repository is cloned to local system.
4. Project work is version-controlled and pushed to GitHub.

## Part 2: Project Structure

Completed:

1. `web/` folder contains `index.html`, `style.css`, and `script.js`.
2. `java/` folder contains `beans/`, `beaninfo/`, `bound/`, and `constrained/`.

## Part 3: Web Development Task

### 1) HTML (`web/index.html`)

Implemented:

1. Proper HTML5 document structure (`<!DOCTYPE html>`, `html`, `head`, `body`).
2. Responsive meta tag (`viewport`) included.
3. A form with:
  - Text input (`name`)
  - Email input (`email`)
  - Submit button
4. A result/message paragraph with `aria-live="polite"` for feedback.

### 2) CSS (`web/style.css`)

Implemented:

1. Color palette using CSS variables.
2. Centered card-style layout with spacing and shadow.
3. Input and button styling with hover/focus states.
4. Validation message styling for success and error states.

### 3) JavaScript (`web/script.js`)

Implemented:

1. Form submit event handling.
2. Prevent default submit for custom validation.
3. Name validation (minimum length).
4. Email validation using regex pattern.
5. Dynamic success/error messages shown in UI.
6. Form reset on successful submission.

### 4) Integration

Completed:

1. `style.css` is linked in `index.html`.
2. `script.js` is linked in `index.html`.
3. Web page runs correctly in a browser.

## Part 4: JavaBeans Implementation

### 1) `beans/` (Simple JavaBean)

Files:

- `java/beans/Person.java`
- `java/beans/BeansDemo.java`

Implemented in `Person`:

1. Private properties (`name`, `age`).
2. Public getter and setter methods.
3. Default constructor.
4. `Serializable` implementation.

Testing:

`BeansDemo` creates a bean object, sets values, and prints the object.

### 2) `beaninfo/` (BeanInfo)

Files:

- `java/beaninfo/Person.java`
- `java/beaninfo/PersonBeanInfo.java`
- `java/beaninfo/BeanInfoDemo.java`

Implemented:

1. Custom BeanInfo class extending `SimpleBeanInfo`.
2. `PropertyDescriptor` for `name` and `age`.
3. Overridden `getPropertyDescriptors()` method.

Testing:

`BeanInfoDemo` prints property names and types from descriptors.

### 3) `bound/` (Bound Property)

Files:

- `java/bound/Person.java`
- `java/bound/BoundPropertyDemo.java`

Implemented:

1. `PropertyChangeSupport` object.
2. Listener registration/removal methods.
3. `firePropertyChange()` call inside setter.

Testing:

`BoundPropertyDemo` attaches a `PropertyChangeListener` and prints changes when property updates.

### 4) `constrained/` (Constrained Property)

Files:

- `java/constrained/Person.java`
- `java/constrained/ConstrainedPropertyDemo.java`

Implemented:

1. `VetoableChangeSupport` usage.
2. `VetoableChangeListener` registration/removal methods.
3. Throws `PropertyVetoException` when rule fails.
4. Rule implemented: age cannot be less than 18.

Testing:

`ConstrainedPropertyDemo`:

1. Successfully sets a valid age.
2. Blocks invalid age update with clear message.

## Part 5: Compilation and Execution

### Prerequisites

1. Java JDK installed.
2. PowerShell terminal (or equivalent terminal).

### Run Web Part

From project root:

```powershell
cd web
start index.html
```

### Compile Java Programs

From project root:

```powershell
cd java
javac (Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })
```

### Run Java Main Classes

From `java` folder:

```powershell
java beans.BeansDemo
java beaninfo.BeanInfoDemo
java bound.BoundPropertyDemo
java constrained.ConstrainedPropertyDemo
```

## Sample Console Output

```text
=== beans.BeansDemo ===
Simple JavaBean demo:
Person{name='Anas', age=22}

=== beaninfo.BeanInfoDemo ===
BeanInfo demo (property descriptors):
- name (type: String)
- age (type: int)

=== bound.BoundPropertyDemo ===
Bound property changed: name from '' to 'anas111'
Bound property changed: name from 'anas111' to 'anas222'

=== constrained.ConstrainedPropertyDemo ===
Age updated to: 25
Constrained property update blocked: Age cannot be less than 18.
```
---
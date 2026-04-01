# web-tech-assignment

This repository contains:

- A basic web project in `web/` with HTML, CSS, and JavaScript integration.
- JavaBeans examples in `java/` for:
  - Simple bean
  - BeanInfo
  - Bound property
  - Constrained property

## Structure

- `web/index.html`
- `web/style.css`
- `web/script.js`
- `java/beans/`
- `java/beaninfo/`
- `java/bound/`
- `java/constrained/`

## How to Run (For Instructor)

1. Open the webpage:

```powershell
cd web
start index.html
```

2. Compile all Java files (from repository root):

```powershell
cd java
javac (Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })
```

3. Run each JavaBeans demo (from `java` folder):

```powershell
java beans.BeansDemo
java beaninfo.BeanInfoDemo
java bound.BoundPropertyDemo
java constrained.ConstrainedPropertyDemo
```

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

## Run Web Page

Open `web/index.html` in any browser.

## Compile Java

From repository root:

```bash
cd java
javac beans/*.java beaninfo/*.java bound/*.java constrained/*.java
```

## Run Java Main Classes

From `java` directory:

```bash
java beans.BeansDemo
java beaninfo.BeanInfoDemo
java bound.BoundPropertyDemo
java constrained.ConstrainedPropertyDemo
```

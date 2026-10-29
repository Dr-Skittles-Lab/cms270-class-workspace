# CMS 270 Class Workspace

Your one place for this semester's in-class examples and homework. It runs in your browser with **GitHub Codespaces**, so you don't need to install Java or an IDE on your own computer.

(Your final project gets its own separate repository later in the semester.)

## 1. Make your own copy

Do this once. Skip it if you've already made your copy.

1. Sign in to GitHub. (Free account. If you haven't yet, apply for the [GitHub Student Developer Pack](https://education.github.com/pack); it raises your monthly Codespaces hours.)
2. Click the green **Use this template** button → **Create a new repository**.
3. Name it `cms270-workspace`, choose **Private**, and click **Create repository**.
4. Make sure you're on **your** copy now (the page shows `your-username/cms270-workspace`) before going on.

## 2. Open your Codespace

1. On **your copy's** GitHub page, click the green **Code** button.
2. Choose the **Codespaces** tab, then **Create codespace on main**.
3. Wait for setup to finish. The first time takes about 5 minutes; reopening the same codespace later takes under a minute. Java needs another minute or two after that to load (watch for "Java: Ready" in the bottom status bar).
4. Open `src/main/java/examples/week01/mon/Hello.java` and click **Run** above `main`. If you see `Hello, CMS 270!` in the terminal, you're all set.

To come back later, go to [github.com/codespaces](https://github.com/codespaces) and open the **same** codespace. Don't create a new one each class.

> Codespaces stop after 30 minutes of inactivity, and your free hours are limited. When you're done, **commit and push** your work, then stop the codespace from github.com/codespaces.

## 3. Where things go

```
src/main/java/
  examples/week01/ ... week15/   code from class, one folder per week
    mon/ wed/                    split by class day
  hw1/ hw2/ hw3/ hw4/            your homework solutions
  scratch/                       try things out; nothing here is graded
src/test/java/
  hw1/ hw2/ hw3/ hw4/            the provided JUnit tests for each HW
  examples/                      any tests from class examples
```

### The package line

Every Java file must start with a `package` line that matches its folder:

| File is in | First line must be |
| --- | --- |
| `src/main/java/examples/week03/mon/` | `package examples.week03.mon;` |
| `src/main/java/examples/week03/wed/` | `package examples.week03.wed;` |
| `src/main/java/hw2/` | `package hw2;` |
| `src/test/java/hw2/` | `package hw2;` |
| `src/main/java/scratch/` | `package scratch;` |

If you get it wrong, VS Code underlines it in red. Click the line, press `Ctrl+.` (`Cmd+.` on Mac), and choose **Change package declaration**.

## 4. Copying in-class examples

**Typing or pasting code:** right-click the class day's folder (for example `examples/week03/wed`) → **New File...** → name it after the class (`Dog.java` for `public class Dog`). Paste the code, then fix the `package` line.

**Uploading a file you downloaded:** drag the `.java` file from your computer onto the class day's folder in the VS Code file explorer. Then check its `package` line.

Every class with a `main` method gets a **Run** link above `main`. Click it to run that program.

## 5. Doing homework

1. Download the HW starter files and test files from Canvas.
2. Drag your solution/starter files into `src/main/java/hwN/` and the test files into `src/test/java/hwN/`.
3. Write your code in `src/main/java/hwN/`. **Don't edit the provided tests**; you're graded against the originals.
4. Run the tests:
   - Click the **Testing** icon (the flask) in the left sidebar. Expand `hwN` and click ▶ next to it.
   - Or click the green ▶ next to any single test.
   - Or Command Palette (`Ctrl+Shift+P` / `Cmd+Shift+P`) → **Tasks: Run Test Task** → **Run tests for one HW**.
   - Or in the terminal: `mvn test -Dtest='hw1.**'` (change the number).
5. A failing test shows what it expected and what your code returned. Click the test name to jump to it.

### Submitting to Canvas

Right-click a file (or a whole `hwN` folder) in the file explorer and choose **Download...**. Then upload it to Canvas. For a folder, zip it on your computer first.

## 6. Running Swing (GUI) examples

A codespace has no screen of its own, so windows open on a small virtual desktop that you view in a browser tab.

1. Open the **Ports** tab (next to Terminal at the bottom). Find **GUI Desktop** on port **6080**.
2. Hover over the address and click the globe icon (**Open in Browser**).
3. Click **Connect**. The password is `vscode`.
4. Run your program in VS Code, then switch to the desktop tab to see the window.

## 7. Save your work (commit and push)

1. Click the **Source Control** icon in the left sidebar (the branching lines).
2. Type a short message, like `Week 4 examples` or `HW2 Shape classes`.
3. Click **Commit**, then **Sync Changes**.

Or in the terminal:

```bash
git add .
git commit -m "Describe what you changed"
git push
```

Do this at the end of every class and every homework session.

## Troubleshooting

| Problem | Fix |
| --- | --- |
| Red squiggles everywhere right after opening | Java is still loading. Wait for "Java: Ready" in the bottom status bar. |
| "The declared package does not match the expected package" | Fix the `package` line (see section 3). |
| "The public type Dog must be defined in its own file" | The file name must match the public class name exactly, including capitals: `Dog.java`. |
| Two files in different weeks or days both called `Dog.java` | That's fine, as long as each has its own folder's `package` line. |
| A broken file in one week stops another week from running | Every file in the workspace has to compile. Fix the error, or comment the broken code out with `/* ... */` for now. |
| No **Run** link above `main` | Check the `package` line and that `main` is exactly `public static void main(String[] args)`. |
| No **Run** link, or a popup says "You don't have an extension for debugging Java" (common on a brand-new codespace) | Click **Cancel** on the popup (don't install anything). Command Palette (`Ctrl+Shift+P` / `Cmd+Shift+P`) → **Developer: Reload Window**. |
| Tests don't show in the Testing sidebar | Test files must be in `src/test/java/...` with the right `package` line. Try Command Palette → **Java: Clean Java Language Server Workspace**. |
| `HeadlessException` when running a GUI | Open a **new** terminal and run again. If it persists, Command Palette → **Codespaces: Rebuild Container**. |

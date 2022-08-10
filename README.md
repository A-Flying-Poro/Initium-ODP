# Initium-ODP
This project allows people to contribute to the parts of Initium that are open source.

# Requirements
* **Java Development Kit (JDK) 8**
    * Any vendors acceptable, [Eclipse AdoptOpenJDK](https://adoptium.net/temurin/releases/?version=8) available if you need one.
* **Integrated Development Environment (IDE)**
    * [IntelliJ Community Edition](https://www.jetbrains.com/idea/) **(Recommended)**
    * [Eclipse](https://www.eclipse.org/)
    * Any other IDE that you prefer
* **Git**
    * Pre-installed on **macOS** and **Linux**
    * [Git for Windows](https://gitforwindows.org/)
* **Git GUI** (optional, but easier for workflow)
    * [GitHub Desktop](https://desktop.github.com/)
    * [SourceTree](https://www.sourcetreeapp.com/)
    * [TortoiseGit](https://tortoisegit.org/)

# How to get your development environment setup
It's possible to get things working using a different IDE and other different variations (like JDK version), but I'll try to give you precise instructions for getting things working the way I know how.

**Please let me know if anything doesn't work for you so I can update the documentation!**

## Download and install JDK 1.8
(Only if you don't already have it)
You should be able to find what you need here:
http://www.oracle.com/technetwork/java/javase/downloads/java-archive-downloads-javase7-521261.html
You’ll want to download the “Java SE Development Kit 7u80” (It’s possible that you’ll be prompted to create an Oracle account)

## Get this GIT repo onto your system
I personally use Github Desktop. You can download that here:
https://desktop.github.com/

Before you clone the repo, create a fork of this project in GitHub (you will then create an upstream repo to link back to the root).

Open Github Desktop, hitting File -> Clone a repository (Ctrl + Shift + O) and select **yourUsername**/Initium-ODP. Be sure to set the path where you want files locally downloaded below.

There may or may not be a pop-up here asking how you plan to use the fork, if there is, select 'To contribute to the parent project'.
If there is not, or you picked the other option(s), do as follows:
Go to Repository -> Repository Settings on Github Desktop, then go to Fork behavior, be sure to have "To contribute to the parent repository" selected.
This creates an upstream to the original repo that you forked.

Open a command line in the project Directory once you have cloned it, and make sure the command lines directory is in the project
Run the submodule update command for git - git submodule update --init --recursive

You should now be able to open the project in whichever IDE you prefer using, I personally use Intellij.



Command line setup is a lot easier, but requires a Git installation (ie: git-for-windows.github.io).
In command line, navigate to the directory you want to download the clone to, and type the following commands:

```
git clone https://github.com/*username*/initium-odp.git
git submodule update --init --recursive
git remote add upstream https://github.com/Emperorlou/initium-odp.git
```

That's it.


## Import Initium-ODP as a gradle project into your IDE of choice
A simple way to do so with Intellij is selecting the root folder, the folder that contains all the modules / Initium-ODP, and open as Intellij Project.
You may be prompted to trust the project, you should *hopefully* trust the project.


## Improve this documentation
If there was ANYTHING that didn't work as expected, please update this documentation to reflect that and how to solve the issue. THANKS!


# [My Personal Website](https://kalaiz.github.io/)
![Status](https://img.shields.io/badge/status-viewable-green)

## Table of Content:
- [Description](#-description)
- [Tools Used](#%EF%B8%8F-tools-used)
- [Reflection](#%EF%B8%8F-reflection)
- [References](#-references)
- [Installation](#%EF%B8%8F-installation)

### 📜 Description:
A simple personal website built using Kotlin. The challenge is to write majority of HTML, CSS and JS code in Kotlin. 

Everytime the project is built in the IDE, a screenshot of the webpage is taken with the help of my python script (uses Selenium)  and Gradle. The screenshots are being used as a [social media preview](https://css-tricks.com/essential-meta-tags-social-media/). 

<p align="center">
<img src="/resources/website_overview.gif"/> 
</p>

### 🛠️ Tools Used:
- Kotlin based React, CSS and Styled [Wrapper](https://github.com/JetBrains/kotlin-wrappers) 
- Kotlin: Delegate Properties, lambda functions, Standard Higher order functions, Class References
- Python: Made a script to screenshot the webpage and save it for social media preview
- Selenium and Chrome webdriver to get screenshot
- Gradle: Execute the screenshot script and to put compiled webpage resources in a suitable directory
- Chrome: For Viewing and Debugging
- [Hex Color Tool](https://codepen.io/sosuke/pen/Pjoqqp): Convert Image color to a certain color 


### ✍️ [Reflection](/resources/reflection.md)


### 🔖 References:
- In understanding Kotlin Styled API - The [official documentation](https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-styled) on Github.
- Adapted CSS [Theme](https://codepen.io/d3vsh4/pen/LMYLYp) and converted into Kotlin.
- [Hex Color Tool](https://codepen.io/sosuke/pen/Pjoqqp): Used to to produce filter attribute values, which convert a black color to a certain color. 
- Used an unofficial python based Selenium [documentation](https://selenium-python.readthedocs.io/).
- Gradle Task `runScreenshotScript`: Based on this Extension Function provided in this [answer](https://stackoverflow.com/a/41495542/11200630), which runs a process via kotlin ( So to run the python script from a command line perspective). This answer uses `ProcessBuilder` API from Java such that the subprocess I/O (outputs and errors in my case) source or destination will be the [same as those of the current process](https://docs.oracle.com/javase/7/docs/api/java/lang/ProcessBuilder.Redirect.html#INHERIT). 



### ⚙️ Installation:
- If you want to just see the website, click on the title or the link in the description.
- If you want to play around with the codebase:
    - If you don't have python selenium package `pip3 install selenium`
    - If you don't have a chrome webdrive, download [one](https://chromedriver.chromium.org/downloads) and add it to your `PATH`. Alternatively you could use the file path to the chrome webdrive binary in the python script, instead of adding it to your `PATH`.
    - To open the project in an IDE(I used Intellij), open the root level folder `project` as the Project.
    - For running the website locally via the IDE, have a look at this [documentation](https://kotlinlang.org/docs/tutorials/javascript/setting-up.html).


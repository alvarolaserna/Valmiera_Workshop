# Valmiera_Workshop

## Start new repository on GitHub:

First go to your github account. In the right upper corner you have a + button, if you click on it you will have the option
to create a New Repository. Choose Name. Make it Private, and Initialize with Readme.

Now you are ready to clone the repository.

## Clone and Start new project in Intellij IDEA

Go to github repository and click on clone or download. Copy the url and now open one Terminal.

In terminal navigate to your preferred folder, or create a new one:

    mkdir AutomationJava
Navigate:

    cd AutomationJava
Now you can clone the newly created repository:

    git clone https://url.com
Open Intellij and choose to create a new project. Choose maven and then choose the folder where the repository is held:
    
    ~/AutomationJava/NewRepository
Choose a name for the repo, and optionally groupId. Finish


## Start Project

Now you have all set to start writing the pom.xml with its dependencies and plugins. You can use the pom.xml from this project. 
JUST COPY THE `<build>`, `<repositories>` and `<dependencies>` TAGS (and its contents).

Now you are all set to create a project with Cucumber and TestUI.

First create the resources folder under `src/test` and under this, a new folder which will hold the feature files called features `src/test/resources/features`

create your first feature file like `simple.feature`.

Now create the three following packages under src/test/java `stepDefinitions`, `testRunners` and `screens`.

Under testRunners, create the first class `TestRunner` and add the following code:

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src/test/resources/features"},
            glue = "stepDefinitions",
            plugin = {"pretty", "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"}
    )
    public class TestRunner {
    }
Import all the necessary libraries in the file.

Now you can start creating your step definitions that you write in the features file. Take care that when you click `option+enter` (`control+enter` windows) 
You create the step definition under stepDefinitions package, and also, choose java, not java 8 as preferred language.